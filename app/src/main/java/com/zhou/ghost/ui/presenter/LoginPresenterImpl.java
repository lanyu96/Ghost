package com.zhou.ghost.ui.presenter;

import android.arch.lifecycle.LifecycleOwner;

import com.zhou.ghost.MyApp;
import com.zhou.ghost.constant.SPConstants;
import com.zhou.ghost.ui.model.LoginModel;
import com.zhou.ghost.ui.model.LoginModelImpl;
import com.zhou.ghost.ui.presenter.base.BasePresenterImpl;
import com.zhou.ghost.ui.view.LoginView;

import org.jetbrains.annotations.NotNull;


/**
 * @Auther: zhou
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


}
