package com.zhou.ghost.ui.view.main;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.zhou.ghost.R;
import com.zhou.ghost.ui.presenter.main.MainOperatePresenterImpl;
import com.zhou.ghost.ui.view.base.BaseFragment;
import com.zhou.ghost.ui.view.tool.QRCodeViewActivity;


public class MainOperateViewFrag extends BaseFragment<MainOperatePresenterImpl> implements MainOperateView {

    private LinearLayout qrCodeScanLl;

    @Override
    public MainOperatePresenterImpl initPresent() {
        return new MainOperatePresenterImpl();
    }

    @Override
    public View setContentUI(LayoutInflater inflater, ViewGroup container) {
        View view = View.inflate(getContext(), R.layout.fragment_main_operate_view, null);
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

    @Override
    public void onDestroy() {
        super.onDestroy();

    }
}
