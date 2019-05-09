package com.zhou.ghost.ui.view.tool;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;

import com.zhou.ghost.R;
import com.zhou.ghost.ui.presenter.tool.QRCodePresenterImpl;
import com.zhou.ghost.ui.view.base.BaseActivity;

public class QRCodeViewActivity extends BaseActivity<QRCodePresenterImpl> implements QRCodeView {

    private ImageView scanIv;

    @Override
    public QRCodePresenterImpl initPresent() {
        return new QRCodePresenterImpl();
    }

    @Override
    public void initView() {
        setContentView(R.layout.act_tool_qr_code_scan);
        scanIv = findViewById(R.id.act_tool_qr_code_scan_iv);

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

                break;
        }
    }
}
