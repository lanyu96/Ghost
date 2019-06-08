package com.zhou.ghost.ui.view.main;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.yzq.zxinglibrary.android.CaptureActivity;
import com.yzq.zxinglibrary.bean.ZxingConfig;
import com.yzq.zxinglibrary.common.Constant;

import org.greenrobot.eventbus.EventBus;

import com.zhou.ghost.R;
import com.zhou.ghost.httputil.HttpRequest;
import com.zhou.ghost.ui.bean.weather.WeatherBean;
import com.zhou.ghost.ui.callback.CallBackListener;
import com.zhou.ghost.ui.presenter.main.MainHomePresenterImpl;
import com.zhou.ghost.ui.view.base.BaseFragment;
import com.zhou.ghost.ui.view.base.BaseView;
import com.zhou.ghost.utils.DateTimeHelper;
import com.zhou.ghost.utils.api.WeatherAPI;
import com.zhou.ghost.utils.cleancache.CleanCacheUtil;
import com.zhou.ghost.utils.lanyu.GlideImageLoader;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;


public class MainHomeViewFrag extends BaseFragment<MainHomePresenterImpl> implements MainHomeView {


    //    private ImageView scanIv;
    private static final int REQUEST_CODE_SCAN = 1919;
    private List<String> urlStr;
    private Button refreshBtn;
    private Banner banner;


    @Override
    public MainHomePresenterImpl initPresent() {
        return new MainHomePresenterImpl();
    }

    @Override
    public View setContentUI(LayoutInflater inflater, ViewGroup container) {
        View view = View.inflate(getContext(), R.layout.fragment_main_home_view, null);
        return view;
    }

    @Override
    public void initView() {
        initBanner();
        refreshBtn = (Button) findViewById(R.id.fragment_main_home_refresh_btn);

//        HttpRequest.getWeatherInfo("jiaozhou", new CallBackListener<WeatherBean.HeWeather6Bean>() {
//            @Override
//            public void onSuccess(WeatherBean.HeWeather6Bean weatherBean) {
//                Log.i("ZHOUT", "tmp  +++++");
//            }
//
//            @Override
//            public void onError(String error) {
//
//            }
//        });
//        String weatherInfo = new WeatherAPI().getWeatherInfo();
//        Gson gson = new Gson();
//        WeatherBean weatherBean = gson.fromJson(weatherInfo, WeatherBean.class);
////        String tmp = weatherBean.getNow().getTmp();
//        Log.i("ZHOUT", "tmp  +++++"+weatherInfo);

    }

    private void initBanner() {

        banner = (Banner) findViewById(R.id.fragment_main_home_banner);
        //设置banner样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合

//        List<Integer> image = new ArrayList<>();
//        image.add(R.drawable.icon);
//        image.add(R.drawable.welcome_bg);
        urlStr = new ArrayList<>();
        urlStr.add("http://47.110.9.80:8080/lanyu/img/img1.jpg");
        urlStr.add("http://47.110.9.80:8080/lanyu/img/img2.jpg");
        urlStr.add("http://47.110.9.80:8080/lanyu/img/img3.jpg");
        urlStr.add("http://47.110.9.80:8080/lanyu/img/img4.jpg");


        banner.setImages(urlStr);

        banner.releaseBanner();
        //设置banner动画效果
        banner.setBannerAnimation(Transformer.DepthPage);
        //设置标题集合（当banner样式有显示title时）
//        List<String> titles = new ArrayList<>();
//        titles.add("图1");
//        titles.add("图2");
//        banner.setBannerTitles(null);
        //设置自动轮播，默认为true
        banner.isAutoPlay(true);
        //设置轮播时间
        banner.setDelayTime(3000);
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.CENTER);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
//        banner.update(urlStr);

    }


    @Override
    public void initEvent() {
        refreshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                urlStr.remove(0);
//                banner.setImageLoader(new GlideImageLoader());
//                urlStr.add("http://192.168.31.7:8081/lanyu/img/img4.jpg");
//                banner.update(urlStr);
//                CleanCacheUtil.clearAllCache(getContext());
                CleanCacheUtil.cleanInternalCache(getContext());

            }
        });


    }

    @Override
    public void initData() {
//

    }


    /**
     * 给字符串或者数字添加下划线
     *
     * @param str
     * @return
     */
    public Spanned underLine(String str) {
        return Html.fromHtml("<u>" + str + "</u>");


    }

    public void startScan() {
        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.CAMERA}, 202);
            return;
        }
        Intent intent = new Intent(getContext(), CaptureActivity.class);

        /*ZxingConfig是配置类
         *可以设置是否显示底部布局，闪光灯，相册，
         * 是否播放提示音  震动
         * 设置扫描框颜色等
         * 也可以不传这个参数
         * */
        ZxingConfig config = new ZxingConfig();
        config.setPlayBeep(true);//是否播放扫描声音 默认为true
        config.setShake(true);//是否震动  默认为true
        config.setDecodeBarCode(false);//是否扫描条形码 默认为true
        config.setReactColor(R.color.colorAccent);//设置扫描框四个角的颜色 默认为淡蓝色
        config.setFrameLineColor(R.color.colorAccent);//设置扫描框边框颜色 默认无色
        config.setFullScreenScan(true);//是否全屏扫描  默认为true  设为false则只会在扫描框中扫描
        intent.putExtra(Constant.INTENT_ZXING_CONFIG, config);
        startActivityForResult(intent, REQUEST_CODE_SCAN);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void onMyClick(View v) {
        switch (v.getId()) {

        }
    }
}
