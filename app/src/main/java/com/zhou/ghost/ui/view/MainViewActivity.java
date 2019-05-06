package com.zhou.ghost.ui.view;


import android.annotation.SuppressLint;
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
import com.zhou.ghost.utils.util.PreferencesService;


public class MainViewActivity extends BaseActivity<MainPresenterImpl> implements MainView {

    private LinearLayout ll_home;
    private LinearLayout ll_operate;
    private LinearLayout ll_report;
    private LinearLayout ll_person;
    private ImageView iv_home;
    private ImageView iv_operate;
    private ImageView iv_report;
    private ImageView iv_person;
    private TextView tv_home;
    private TextView tv_operate;
    private TextView tv_report;
    private TextView tv_person;

    private ViewPager vpContent;
    private Boolean newStyle;
    private PreferencesService ps;
    @SuppressLint("StaticFieldLeak")
    public static MainViewActivity instance;
    @Override
    public MainPresenterImpl initPresent() {
        return new MainPresenterImpl();
    }

    @Override
    public void initView() {
        instance = this;
        setContentView(R.layout.activity_main_view);
        vpContent = findViewById(R.id.main_vp_content);
        ll_home = findViewById(R.id.ll_main_home);
        ll_operate = findViewById(R.id.ll_main_operate);
        ll_report = findViewById(R.id.ll_main_report);
        ll_person = findViewById(R.id.ll_main_person);
        iv_home = findViewById(R.id.iv_main_home);
        iv_operate = findViewById(R.id.iv_main_operate);
        iv_report = findViewById(R.id.iv_main_report);
        iv_person = findViewById(R.id.iv_main_person);
        tv_home = findViewById(R.id.tv_main_home);
        tv_operate = findViewById(R.id.tv_main_operate);
        tv_report = findViewById(R.id.tv_main_report);
        tv_person = findViewById(R.id.tv_main_person);
    }

    @Override
    public void initEvent() {
        ll_home.setOnClickListener(this);
        ll_operate.setOnClickListener(this);
        ll_report.setOnClickListener(this);
        ll_person.setOnClickListener(this);
    }

    @Override
    public void initData() {

//        String style = MyApp.getPreferencesService().getValue(SPConstants.STYLE_ID, "");
//        if (style.equals("简约")) {
//
//            newStyle = true;
//        }else if (style.equals("标准")) {
//            newStyle = false;
//        }

        vpContent.setAdapter(mPresenter.getFragmentAdapter());
        vpContent.setOffscreenPageLimit(5);
        vpContent.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                selectTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        selectTab(1);

    }



    @Override
    public void click(View v) {
        onMyClick(v);
    }


    @Override
    public void onMyClick(View v) {
        switch (v.getId()) {
            case R.id.ll_main_home:
                selectTab(0);
                break;
            case R.id.ll_main_operate:
//                String style = MyApp.getPreferencesService().getValue(SPConstants.STYLE_ID, "");
//                if (style.equals("简约")) {
//
//                    newStyle = true;
//                }else if (style.equals("标准")) {
//                    newStyle = false;
//                }
                selectTab(1);
                break;
            case R.id.ll_main_report:
                selectTab(2);
                break;
            case R.id.ll_main_person:
                selectTab(3);
                break;
        }
    }

    /**
     * 初始化按钮
     */
    private void initTab() {
        ll_home.setBackgroundResource(R.drawable.main_tab_normal);
        ll_operate.setBackgroundResource(R.drawable.main_tab_normal);
        ll_report.setBackgroundResource(R.drawable.main_tab_normal);
        ll_person.setBackgroundResource(R.drawable.main_tab_normal);
        iv_home.setImageResource(R.drawable.homepage);
        iv_operate.setImageResource(R.drawable.setup);
        iv_report.setImageResource(R.drawable.createtask);
        iv_person.setImageResource(R.drawable.people);
        tv_home.setTextColor(MyApp.getRes().getColor(R.color.gray_deep));
        tv_operate.setTextColor(MyApp.getRes().getColor(R.color.gray_deep));
        tv_report.setTextColor(MyApp.getRes().getColor(R.color.gray_deep));
        tv_person.setTextColor(MyApp.getRes().getColor(R.color.gray_deep));
    }


    /**
     * 选中下方按钮
     *
     * @param position
     */
    @Override
    public void selectTab(int position) {
        initTab();
        if("".equals(MyApp.getPreferencesService().getValue(SPConstants.FIELD_ID,""))){
            showToast("请先选择分场");
        }
        switch (position) {
            case 0://主页
                vpContent.setCurrentItem(0, false);
                ll_home.setBackgroundResource(R.drawable.main_tab_checked);
                iv_home.setImageResource(R.drawable.homepage_fill);
                tv_home.setTextColor(MyApp.getRes().getColor(R.color.blue_deep));
                vpContent.setCurrentItem(0);
                break;
            case 1://操作

                    vpContent.setCurrentItem(1, false);
                    ll_operate.setBackgroundResource(R.drawable.main_tab_checked);
                    iv_operate.setImageResource(R.drawable.setup_fill);
                    tv_operate.setTextColor(MyApp.getRes().getColor(R.color.blue_deep));
                    vpContent.setCurrentItem(1);

                break;
            case 2://报表
                vpContent.setCurrentItem(2, false);
                ll_report.setBackgroundResource(R.drawable.main_tab_checked);
                iv_report.setImageResource(R.drawable.ic_receipt_blue_500_24dp);
                tv_report.setTextColor(MyApp.getRes().getColor(R.color.blue_deep));
                vpContent.setCurrentItem(2);
                break;
            case 3://个人信息
                vpContent.setCurrentItem(3, false);
                ll_person.setBackgroundResource(R.drawable.main_tab_checked);
                iv_person.setImageResource(R.drawable.people_fill);
                tv_person.setTextColor(MyApp.getRes().getColor(R.color.blue_deep));
                vpContent.setCurrentItem(3);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解注册EventBus
        if (EventBus.getDefault().isRegistered(this)){
            EventBus.getDefault().unregister(this);
        }
    }
}
