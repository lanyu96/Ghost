package com.zhou.ghost.ui.view.tool;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.yzq.zxinglibrary.android.CaptureActivity;
import com.yzq.zxinglibrary.bean.ZxingConfig;
import com.yzq.zxinglibrary.common.Constant;
import com.zhou.ghost.R;
import com.zhou.ghost.ui.presenter.tool.QRCodePresenterImpl;
import com.zhou.ghost.ui.view.base.BaseActivity;

public class QRCodeViewActivity extends BaseActivity<QRCodePresenterImpl> implements QRCodeView {

    private ImageView scanIv;
    private static final int REQUEST_CODE_SCAN = 1919;
    private EditText scanEt;


    @Override
    public QRCodePresenterImpl initPresent() {
        return new QRCodePresenterImpl();
    }

    @Override
    public void initView() {
        setContentView(R.layout.act_tool_qr_code_scan);
        scanIv = findViewById(R.id.act_tool_qr_code_scan_iv);
        scanEt = findViewById(R.id.act_tool_qr_code_scan_tv);


    }

    @Override
    public String setTitleText() {
        return "二维码转文字工具";
    }

    @Override
    public void initEvent() {
        scanIv.setOnClickListener(this);

    }

    @Override
    public void initData() {

    }

    @Override
    public void onMyClick(View v) {
        switch (v.getId()) {
            case R.id.act_tool_qr_code_scan_iv:
                startScan();
                break;

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // 扫描二维码/条码回传
        if (requestCode == REQUEST_CODE_SCAN && resultCode == RESULT_OK) {

            if (data != null) {

                String scanStr = data.getStringExtra(Constant.CODED_CONTENT);
                scanEt.setText("扫描结果为：" + scanStr);
            }
        }

    }

    public void startScan() {
        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(QRCodeViewActivity.this, new String[]{Manifest.permission.CAMERA}, 202);
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
}
