package com.zhou.ghost.ui.presenter;

import android.arch.lifecycle.LifecycleOwner;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import com.zhou.ghost.MyApp;
import com.zhou.ghost.R;
import com.zhou.ghost.constant.SPConstants;
import com.zhou.ghost.httputil.RetrofitManager;
import com.zhou.ghost.ui.bean.PigFarmInfo;
import com.zhou.ghost.ui.bean.PigFieldInfo;
import com.zhou.ghost.ui.callback.CallBackListListener;
import com.zhou.ghost.ui.callback.CallBackPositionListener;
import com.zhou.ghost.ui.dialog.DialogUtils;
import com.zhou.ghost.ui.model.LoginModel;
import com.zhou.ghost.ui.model.LoginModelImpl;
import com.zhou.ghost.ui.presenter.base.BasePresenterImpl;
import com.zhou.ghost.ui.view.LoginView;


/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/7/27 16:04
 * @Description:
 */
public class LoginPresenterImpl extends BasePresenterImpl<LoginView, LoginModel> {


    @Override
    public void initData() {

    }

    @Override
    public LoginModel initModel() {
        return new LoginModelImpl();
    }


    public void login() {
        //登陆时重置cookie
        RetrofitManager.initCookie();
        final String user;
        user = getView().getUser();

        final String pass = getView().getPassWord();
        if (isEmpty(getView().getUser())) {
            getView().showToast("用户名不能为空");
            return;
        }
        getView().showProgress(MyApp.getRes().getString(R.string.loading));
        mModel.login(getView(), user, pass, new CallBackListListener<PigFarmInfo>() {
            @Override
            public void onSuccess(List<PigFarmInfo> s) {
                getView().hideProgress();
                if (s.size() == 0) {
                    getView().showToast("此用户没有猪场");
                } else if (s.size() == 1) {//只有一个猪场
                    //保存农场
                    keepFarmInfo(s.get(0));
                } else {//有多个猪场


                    for (int i = 0; i < s.size(); i++) {
                        //判断是否已经选择过猪场，若以选择直接进去
                        if (s.get(i).getId().equals(MyApp.getPreferencesService().getValue(SPConstants.FARM_ID, ""))
                                && s.get(i).getName().equals(MyApp.getPreferencesService().getValue(SPConstants.FARM_NAME, ""))) {
                            keepFarmInfo(s.get(i));
                            return;
                        }
                    }
                    showSelectFarm(s);

                }
            }

            @Override
            public void onError(String error) {
                getView().hideProgress();
                getView().showToast(error);
            }
        });

    }


    public void initLoginInfo() {
        getView().initLoginInfo(MyApp.getPreferencesService().getValue(SPConstants.LOGIN_USER, ""), MyApp.getPreferencesService().getValue(SPConstants.LOGIN_PASSWORD, ""));
    }

    @Override
    public void onDestroy(@NotNull LifecycleOwner owner) {
        super.onDestroy(owner);
        if (mModel != null) {
            mModel = null;
        }

    }

    /**
     * 选择猪场展示
     *
     * @param pigFarms
     */

    private void showSelectFarm(final List<PigFarmInfo> pigFarms) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < pigFarms.size(); i++) {
            list.add(pigFarms.get(i).getName());
        }
        getView().showSelectDialog(list, new CallBackPositionListener() {
            @Override
            public void onSuccess(int position) {
                keepFarmInfo(pigFarms.get(position));
            }
        });

    }

    private void keepFarmInfo(PigFarmInfo info) {

        //保存农场
        mModel.keepFarmInfo(info.getName(), info.getId());
        checkFieldShow();
    }

    /**
     * 选择
     */
    public void checkFieldShow() {
        if (isEmpty(MyApp.getPreferencesService().getValue(SPConstants.FIELD_ID, ""))
                && isEmpty(MyApp.getPreferencesService().getValue(SPConstants.FIELD_NAME, ""))) {
            selectField();
        } else {
            getView().gotoMainAct();
            getView().finishUI();
        }
    }

    /**
     * 选择分厂
     */
    public void selectField() {
        getView().showProgress(MyApp.getRes().getString(R.string.loading));
        mModel.getFieldInfoFromNet(getView(), new CallBackListListener<PigFieldInfo>() {
            @Override
            public void onSuccess(List<PigFieldInfo> info) {
                getView().hideProgress();
                if (info.size() > 1) {
                    showSelectSelect(info);
                } else if (info.size() == 1) {
                    //保存分厂
                    mModel.keepFieldInfo(info.get(0).getName(), info.get(0).getId(), info.get(0).getFq2pz());
                    getView().gotoMainAct();
                    getView().finishUI();
                } else {
                    getView().showToast("未找到所属分厂");
                }

            }

            @Override
            public void onError(String error) {
                getView().hideProgress();
                getView().showToast(error);
            }
        });
    }

    /**
     * 选择猪场展示
     *
     * @param pigFields
     */

    private void showSelectSelect(final List<PigFieldInfo> pigFields) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < pigFields.size(); i++) {
            list.add(pigFields.get(i).getName());
        }
        new DialogUtils().showSelectDialog(getView().getContext(), list, new DialogUtils.OnItemClickListener() {
            @Override
            public void onItemClickListener(int position) {
                //保存分厂
                mModel.keepFieldInfo(pigFields.get(position).getName(), pigFields.get(position).getId(), pigFields.get(position).getFq2pz());
                getView().finishUI();
                getView().gotoMainAct();
            }
        });
    }

}
