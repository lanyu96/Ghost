package com.zhou.ghost.ui.view.main;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import com.zhou.ghost.MyApp;
import com.zhou.ghost.R;
import com.zhou.ghost.constant.SPConstants;
import com.zhou.ghost.ui.bean.eventbus.StyleSelectMessage;
import com.zhou.ghost.ui.callback.CallBackPositionListener;
import com.zhou.ghost.ui.dialog.DialogUtils;
import com.zhou.ghost.ui.presenter.main.MainPersonPresenterImpl;
import com.zhou.ghost.ui.view.LoginViewActivity;
import com.zhou.ghost.ui.view.SplashActivity;
import com.zhou.ghost.ui.view.base.BaseFragment;
import com.zhou.ghost.utils.util.PreferencesService;


public class MainPersonViewFrag extends BaseFragment<MainPersonPresenterImpl> implements MainPersonView {

    private TextView tvPerson;
    private LinearLayout llFarm;
    private TextView tvFarm;
    private LinearLayout llFeild;
    private TextView tvFeild;

    private TextView tvLogout;
    private TextView selectStyleTv;
    private LinearLayout selectStyleLl;
    private LinearLayout getUpdate;
    private LinearLayout modify_password;

    private List<String> mList;
    private TextView styleTv;
    private PreferencesService ps;
    private TextView tvRealPerson;

    @Override
    public MainPersonPresenterImpl initPresent() {
        return new MainPersonPresenterImpl();
    }

    @Override
    public View setContentUI(LayoutInflater inflater, ViewGroup container) {
        View view = View.inflate(getContext(), R.layout.fragment_main_person_view, null);
        return view;
    }


    @Override
    public void initView() {
        tvPerson = (TextView) findViewById(R.id.tv_person_name);
        tvRealPerson = (TextView) findViewById(R.id.tv_person_real_name);

        llFarm = (LinearLayout) findViewById(R.id.ll_person_farm);
        tvFarm = (TextView) findViewById(R.id.tv_person_farm);
        llFeild = (LinearLayout) findViewById(R.id.ll_person_feild);
        tvFeild = (TextView) findViewById(R.id.tv_person_feild);
        tvLogout = (TextView) findViewById(R.id.tv_person_logout);
        selectStyleTv = (TextView) findViewById(R.id.tv_person_select_style_tv);
        selectStyleLl = (LinearLayout) findViewById(R.id.ll_person_select_style_ll);
        getUpdate = (LinearLayout) findViewById(R.id.fragment_person_get_update_ll);

        ps = MyApp.getPreferencesService();

        modify_password = (LinearLayout) findViewById(R.id.fragment_person_modify_password_ll);
        styleTv = (TextView) findViewById(R.id.tv_person_select_style_tv);

        mList = new ArrayList<>();


    }

    @Override
    public void initEvent() {
        llFarm.setOnClickListener(this);
        llFeild.setOnClickListener(this);
        tvLogout.setOnClickListener(this);
        selectStyleLl.setOnClickListener(this);
        getUpdate.setOnClickListener(this);
        modify_password.setOnClickListener(this);
    }

    @Override
    public void initData() {
        tvPerson.setText(MyApp.getPreferencesService().getValue(SPConstants.LOGIN_USER,""));
        tvFarm.setText(MyApp.getPreferencesService().getValue(SPConstants.FARM_NAME,""));
        tvFeild.setText(MyApp.getPreferencesService().getValue(SPConstants.FIELD_NAME,""));
        styleTv.setText(MyApp.getPreferencesService().getValue(SPConstants.STYLE_ID,""));
        tvRealPerson.setText(MyApp.getPreferencesService().getValue(SPConstants.USERNAME,""));
        mList.add("标准");
        mList.add("简约");
    }


    @Override
    public void onMyClick(View v) {
        switch (v.getId()){
            case R.id.ll_person_farm:
                mPresenter.getFarmInfofromNet();
                break;
            case R.id.ll_person_feild:
                mPresenter.selectField();
                break;
            case R.id.tv_person_logout:
                startActivity(new Intent(getContext(), LoginViewActivity.class));
                finishUI();
                break;
            case R.id.ll_person_select_style_ll:
                showSelectDialog(mList, new CallBackPositionListener() {
                    @Override
                    public void onSuccess(int position) {
                        switch (position) {
                            case 0:
                                styleTv.setText(mList.get(position));
                                ps.save(SPConstants.STYLE_ID,mList.get(position));
                                // 发布事件
                                EventBus.getDefault().post(new StyleSelectMessage("0"));
                                showToast("切换成功");
                                break;
                            case 1:
                                styleTv.setText(mList.get(position));
                                ps.save(SPConstants.STYLE_ID,mList.get(position));
                                // 发布事件
                                EventBus.getDefault().post(new StyleSelectMessage("1"));
                                showToast("切换成功");
                                break;
                        }
                    }
                });


                break;

                //检查更新
            case R.id.fragment_person_get_update_ll:
                new SplashActivity().upDate(getContext());
                break;
                //修改密码
            case R.id.fragment_person_modify_password_ll:
//                Intent intent = new Intent(getActivity(), ModifyPasswordViewActivity.class);
//                startActivity(intent);

                break;
        }
    }

    @Override
    public void showSelectDialog(List<String> list, final CallBackPositionListener listener) {
        new DialogUtils().showSelectDialog(getContext(), list, new DialogUtils.OnItemClickListener() {
            @Override
            public void onItemClickListener(int position) {
                listener.onSuccess(position);
            }
        });
    }

    @Override
    public void setFarm(String farm){
        tvFarm.setText(farm);
    }

    @Override
    public void setField(String field){
        tvFeild.setText(field);
    }

}
