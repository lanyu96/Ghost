package mvp.com.zhou.mvp.ui.presenter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import java.util.ArrayList;
import java.util.List;

import mvp.com.zhou.mvp.ui.adapter.base.FragmentAdapter;
import mvp.com.zhou.mvp.ui.model.MainModel;
import mvp.com.zhou.mvp.ui.model.MainModelImpl;
import mvp.com.zhou.mvp.ui.presenter.base.BasePresenterImpl;
import mvp.com.zhou.mvp.ui.view.MainView;
import mvp.com.zhou.mvp.ui.view.main.MainHomeViewFrag;
import mvp.com.zhou.mvp.ui.view.main.MainOperateViewFrag;
import mvp.com.zhou.mvp.ui.view.main.MainPersonViewFrag;
import mvp.com.zhou.mvp.ui.view.main.MainReportViewFrag;


/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/7/27 15:27
 * @Description:
 */
public class MainPresenterImpl extends BasePresenterImpl<MainView, MainModel> {

    private MainHomeViewFrag mMainHomeView;//主页

    private MainOperateViewFrag mMainOperateView;//操作

//    private MainOperateSecondFrag mMainOperateSecondView;//操作


    private MainReportViewFrag mMainReportView;//报表

    private MainPersonViewFrag mMainPersonView;//我的

    private FragmentAdapter fragmentAdapter;
    private List<Fragment> fragments;
    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    public void initData() {
        fragments = new ArrayList<Fragment>();


        mMainHomeView = new MainHomeViewFrag();


        mMainOperateView = new MainOperateViewFrag();
//        mMainOperateSecondView = new MainOperateSecondFrag();


        mMainReportView = new MainReportViewFrag();
        mMainPersonView = new MainPersonViewFrag();

//        //开启事务
//        manager = getView().getSupportFragmentManager();
//        transaction = manager.beginTransaction();

        fragments.add(mMainHomeView);

        fragments.add(mMainOperateView);


        fragments.add(mMainReportView);
        fragments.add(mMainPersonView);

//        fragments.add(mMainOperateSecondView);
        fragmentAdapter = new FragmentAdapter(getView().getSupportFragmentManager(), fragments);


    }


//    @SuppressLint("ResourceType")
//    public void select(String string) {
//        switch (Integer.parseInt(string)) {
//            case 0:
//                fragments.remove(1);
//                fragments.add(1, mMainOperateView);
//
//                fragmentAdapter.notifyAll();
////                fragmentAdapter.notifyDataSetChanged();
//
//                break;
//            case 1:
//                fragments.remove(1);
//                fragments.add(1, mMainOperateSecondView);
//
//                fragmentAdapter.notifyAll();
////                fragmentAdapter.notifyDataSetChanged();
//                break;
//        }
//    }


    @Override
    public MainModel initModel() {
        return new MainModelImpl();
    }

    public FragmentAdapter getFragmentAdapter() {
        return fragmentAdapter;
    }


}
