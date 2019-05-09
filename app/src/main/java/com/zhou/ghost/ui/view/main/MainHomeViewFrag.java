package com.zhou.ghost.ui.view.main;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.yzq.zxinglibrary.android.CaptureActivity;
import com.yzq.zxinglibrary.bean.ZxingConfig;
import com.yzq.zxinglibrary.common.Constant;

import org.greenrobot.eventbus.EventBus;

import com.zhou.ghost.R;
import com.zhou.ghost.ui.presenter.main.MainHomePresenterImpl;
import com.zhou.ghost.ui.view.base.BaseFragment;
import com.zhou.ghost.ui.view.tool.QRCodeViewActivity;


public class MainHomeViewFrag extends BaseFragment<MainHomePresenterImpl> implements MainHomeView {


    //    private ImageView scanIv;
    private static final int REQUEST_CODE_SCAN = 1919;
    private LinearLayout qrCodeScanLl;

    @Override
    public MainHomePresenterImpl initPresent() {
        return new MainHomePresenterImpl();
    }

    @Override
    public View setContentUI(LayoutInflater inflater, ViewGroup container) {
        View view = View.inflate(getContext(), R.layout.fragment_main_home_second_view, null);
        return view;
    }

    @Override
    public void initView() {
        qrCodeScanLl = (LinearLayout) findViewById(R.id.fragment_tool_qr_code_scan_ll);

    }



    @Override
    public void initEvent() {
        qrCodeScanLl.setOnClickListener(this);
    }

    @Override
    public void initData() {
//

    }


    /**
     * 给字符串或者数字添加下划线
     * @param str
     * @return
     */
    public Spanned underLine(String str) {
        return Html.fromHtml("<u>" + str+"</u>");


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
            //二维码转文字
            case R.id.fragment_tool_qr_code_scan_ll:
                startActivity(new Intent(getContext(), QRCodeViewActivity.class));
                break;
        }
    }
}
