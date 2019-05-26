package com.zhou.ghost.httputil;

import com.franmontiel.persistentcookiejar.ClearableCookieJar;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.zhou.ghost.BuildConfig;
import com.zhou.ghost.MyApp;
import com.zhou.ghost.utils.NetworkUtils;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * @Auther: zhou
 * @Date: 2018/11/7 9:25
 * @Description:
 */
public class RetrofitManager {
    private static final String CACHE_NAME = "retrofitcache";
    private static Retrofit retrofit = null;
    private static String url = "";

    private static ClearableCookieJar mCookieJar;

    private static Retrofit getInstance(String baseUrl) {
        url = baseUrl;
        if (retrofit == null) {
            return create();
        } else {
            return retrofit;
        }
    }

    private static Retrofit create() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        // log用拦截器
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        // 开发模式记录整个body，否则只记录基本信息如返回200，http协议版本等
        if (BuildConfig.DEBUG) {
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        } else {
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        }

        //设置缓存目录
        File cacheFile = new File(MyApp.getContext().getExternalCacheDir(), CACHE_NAME);
        //生成缓存，50M
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 50);
        //缓存拦截器
        Interceptor cacheInterceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                //网络不可用
                if (!NetworkUtils.isAvailable(MyApp.getContext())) {
                    //在请求头中加入：强制使用缓存，不访问网络
                    request = request.newBuilder()
                            .cacheControl(CacheControl.FORCE_CACHE)
                            .build();
                }
                Response response = chain.proceed(request);
                //网络可用
                if (NetworkUtils.isAvailable(MyApp.getContext())) {
                    int maxAge = 0;
                    // 有网络时 在响应头中加入：设置缓存超时时间0个小时
                    response.newBuilder()
                            .header("Cache-Control", "public, max-age=" + maxAge)
                            .removeHeader("pragma")
                            .build();
                } else {
                    // 无网络时，在响应头中加入：设置超时为4周
                    int maxStale = 60 * 60 * 24 * 28;
                    response.newBuilder()
                            .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                            .removeHeader("pragma")
                            .build();
                }
                return response;
            }
        };
        //添加cokie
        mCookieJar =
                new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(MyApp.getContext()));
        builder.addInterceptor(loggingInterceptor)
                //.addInterceptor(cacheInterceptor)
                .addInterceptor(new MyInterceptor())
                .cookieJar(mCookieJar)
                //.cache(cache)
                .connectTimeout(40, TimeUnit.SECONDS)//设置超时
                .readTimeout(40, TimeUnit.SECONDS)
                .writeTimeout(40, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true);//错误重连
        OkHttpClient client = builder.build();
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                //空异常
                .addConverterFactory(new NullOnEmptyConverterFactory())
                //设置 Json 转换器
                .addConverterFactory(GsonConverterFactory.create())
                //RxJava 适配器
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())

                .client(client)
                .build();
        return retrofit;
    }

    public static HttpService getService() {
        return getInstance(HttpContants.BASE_URL).create(HttpService.class);
    }

    public static HttpService getAppService() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        // log用拦截器
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        // 开发模式记录整个body，否则只记录基本信息如返回200，http协议版本等
//        if (BuildConfig.DEBUG) {
//            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        } else {
//            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
//        }
        builder.addInterceptor(loggingInterceptor);
        OkHttpClient client = builder.build();
        Retrofit build = new Retrofit.Builder()
                .baseUrl(HttpContants.APP_URL)
                //空异常
                .addConverterFactory(new NullOnEmptyConverterFactory())
                //设置 Json 转换器
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return build.create(HttpService.class);
    }

    /**
     * 和风天气
     * @return
     */
    public static HttpService getWeatherInfo() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        // log用拦截器
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        // 开发模式记录整个body，否则只记录基本信息如返回200，http协议版本等
        if (BuildConfig.DEBUG) {
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        } else {
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        }
        builder.addInterceptor(loggingInterceptor);
        OkHttpClient client = builder.build();
        Retrofit build = new Retrofit.Builder()
                .baseUrl(HttpContants.WEATHER_URL)
                //空异常
                .addConverterFactory(new NullOnEmptyConverterFactory())
                //设置 Json 转换器
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return build.create(HttpService.class);
    }

    public static void initCookie() {
        if (mCookieJar != null) {
            mCookieJar.clear();
        }
    }
}
