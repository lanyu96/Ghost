package mvp.com.zhou.mvp.ui.view.main;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mvp.com.zhou.mvp.R;
import mvp.com.zhou.mvp.ui.presenter.main.MainOperatePresenterImpl;
import mvp.com.zhou.mvp.ui.view.base.BaseFragment;


public class MainOperateViewFrag extends BaseFragment<MainOperatePresenterImpl> implements MainOperateView {


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


    }

    @Override
    public void initEvent() {

    }

    @Override
    public void initData() {

    }



    @Override
    public void onMyClick(View v) {

        switch (v.getId()){

        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }
}
