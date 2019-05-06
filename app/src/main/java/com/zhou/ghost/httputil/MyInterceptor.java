package com.zhou.ghost.httputil;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;


/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/11/6 18:03
 * @Description:
 */

public class MyInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request()
                .newBuilder()
                .addHeader("Content-Type", "application/json;charset=UTF-8")
                //.addHeader("userNum", getValueEncoded(MyApp.getPreferencesService().getValue(SPConstants.LOGIN_USER,"")))
                .build();
        return chain.proceed(request);
    }

    //由于okhttp header 中的 value 不支持 null, \n 和 中文这样的特殊字符,所以这里
//会首先替换 \n ,然后使用 okhttp 的校验方式,校验不通过的话,就返回 encode 后的字符串
    private static String getValueEncoded(String value) {
        if (value == null) return "null";
        String newValue = value.replace("\n", "");
        for (int i = 0, length = newValue.length(); i < length; i++) {
            char c = newValue.charAt(i);
            if (c <= '\u001f' || c >= '\u007f') {
                try {
                    return URLEncoder.encode(newValue, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return newValue;
    }


}
