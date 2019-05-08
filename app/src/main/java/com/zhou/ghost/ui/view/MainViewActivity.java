package com.zhou.ghost.ui.view;


import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

import com.zhou.ghost.MyApp;
import com.zhou.ghost.R;
import com.zhou.ghost.constant.SPConstants;
import com.zhou.ghost.ui.presenter.MainPresenterImpl;
import com.zhou.ghost.ui.view.base.BaseActivity;
import com.zhou.ghost.ui.view.main.MainHomeViewFrag;
import com.zhou.ghost.ui.view.main.MainOperateViewFrag;
import com.zhou.ghost.ui.view.main.MainPersonViewFrag;
import com.zhou.ghost.ui.view.main.MainReportViewFrag;
import com.zhou.ghost.utils.util.PreferencesService;

import java.util.ArrayList;

import devlight.io.library.ntb.NavigationTabBar;


public class MainViewActivity extends BaseActivity<MainPresenterImpl> implements MainView {


    private MainHomeViewFrag mainHomeViewFrag;
    private MainOperateViewFrag mainOperateViewFrag;
    private MainReportViewFrag mainReportViewFrag;
    private MainPersonViewFrag mainPersonViewFrag;
    private NavigationTabBar navigationTabBar;

    @Override
    public MainPresenterImpl initPresent() {
        return new MainPresenterImpl();
    }

    @Override
    public void initView() {
//        instance = this;
        setContentView(R.layout.activity_main_view);

    }

    @Override
    public void initEvent() {



    }

    @Override
    public void initData() {
        //实例化fragment

        mainHomeViewFrag = new MainHomeViewFrag();
        mainOperateViewFrag = new MainOperateViewFrag();
        mainReportViewFrag = new MainReportViewFrag();
        mainPersonViewFrag = new MainPersonViewFrag();
        getSupportFragmentManager().beginTransaction().add(R.id.act_main_all_fragment_fl, mainHomeViewFrag)
                .add(R.id.act_main_all_fragment_fl, mainOperateViewFrag)
                .add(R.id.act_main_all_fragment_fl,mainReportViewFrag)
                .add(R.id.act_main_all_fragment_fl,mainPersonViewFrag).commitAllowingStateLoss();
        getSupportFragmentManager().beginTransaction().show(mainHomeViewFrag)
                .hide(mainOperateViewFrag)
                .hide(mainReportViewFrag)
                .hide(mainPersonViewFrag).commitAllowingStateLoss();


        navigationTabBar = findViewById(R.id.act_main_ntb_horizontal);

        //设置底部Tab 图标的标题
        String[] titles = new String[]{"主页", "工具箱","其他", "其他"};
        ArrayList<View> views = new ArrayList<>();
        //设置每个View的不同背景
//        int[] viewBgs = new int[]{Color.RED, Color.GRAY, Color.BLUE};
        //设置底部Tab的各个图标
        int[] icons = new int[]{R.drawable.icon_home, R.drawable.icon_setting,R.drawable.icon_qita, R.drawable.icon_me};
        //用来生成各个不同选项的
        ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            models.add(
                    new NavigationTabBar.Model.Builder(
                            getResources().getDrawable(icons[i]),
                            Color.parseColor("#00000000"))
//                        .selectedIcon(getResources().getDrawable(R.drawable.ic_sixth))
                            .title(titles[i])
//                            .badgeTitle("NTB")    //角标
                            .build()
            );
            View view = new View(this);
//            view.setBackgroundColor(viewBgs[i]);
//            views.add(view);
        }
//        viewPager.setAdapter(new TabAdapter(this, views));
        navigationTabBar.setModels(models);
        navigationTabBar.setModelIndex(0);
        navigationTabBar.setOnTabBarSelectedIndexListener(new NavigationTabBar.OnTabBarSelectedIndexListener() {
            @Override
            public void onStartTabSelected(NavigationTabBar.Model model, int index) {
                switch (index) {
                    case 0:
                        getSupportFragmentManager().beginTransaction().show(mainHomeViewFrag)
                                .hide(mainPersonViewFrag)
                                .hide(mainReportViewFrag)
                                .hide(mainOperateViewFrag).commitAllowingStateLoss();
                        break;
                    case 1:
                        getSupportFragmentManager().beginTransaction().show(mainOperateViewFrag)
                                .hide(mainPersonViewFrag)
                                .hide(mainReportViewFrag)
                                .hide(mainHomeViewFrag).commitAllowingStateLoss();
                        break;
                    case 2:
                        getSupportFragmentManager().beginTransaction().show(mainReportViewFrag)
                                .hide(mainHomeViewFrag)
                                .hide(mainPersonViewFrag)
                                .hide(mainOperateViewFrag).commitAllowingStateLoss();
                        break;
                    case 3:
                        getSupportFragmentManager().beginTransaction().show(mainPersonViewFrag)
                                .hide(mainHomeViewFrag)
                                .hide(mainOperateViewFrag)
                                .hide(mainReportViewFrag)
                                .commitAllowingStateLoss();
                }

            }

            @Override
            public void onEndTabSelected(NavigationTabBar.Model model, int index) {

            }
        });
    }


    @Override
    public void click(View v) {
        onMyClick(v);
    }


    @Override
    public void onMyClick(View v) {
        switch (v.getId()) {

        }
    }

        /**
         * 初始化按钮
         */
        private void initTab () {

        }


        @Override
        protected void onDestroy () {
            super.onDestroy();
            //解注册EventBus
            if (EventBus.getDefault().isRegistered(this)) {
                EventBus.getDefault().unregister(this);
            }
        }

}
