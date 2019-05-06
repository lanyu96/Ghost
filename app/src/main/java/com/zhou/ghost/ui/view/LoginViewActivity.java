package com.zhou.ghost.ui.view;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.allenliu.versionchecklib.v2.AllenVersionChecker;

import java.util.List;

import mvp.com.zhou.mvp.R;
import mvp.com.zhou.mvp.ui.callback.CallBackPositionListener;
import mvp.com.zhou.mvp.ui.dialog.DialogUtils;
import mvp.com.zhou.mvp.ui.presenter.LoginPresenterImpl;
import mvp.com.zhou.mvp.ui.view.base.BaseActivity;

import static mvp.com.zhou.mvp.httputil.HttpContants.JUMPLOGIN;


public class LoginViewActivity extends BaseActivity<LoginPresenterImpl> implements LoginView {

    private Button btLogin;
    private EditText etUser;
    private EditText etPassword;


    @Override
    public LoginPresenterImpl initPresent() {
        return new LoginPresenterImpl();
    }

    @Override
    public void initView() {
        setContentView(R.layout.activity_login_view);
        btLogin =  findViewById(R.id.login_bt_login);
        etUser =  findViewById(R.id.login_et_userName);
        etPassword =  findViewById(R.id.login_et_password);


    }

    @Override
    public void initEvent() {
        btLogin.setOnClickListener(this);
    }

    @Override
    public void initData() {
        mPresenter.initLoginInfo();
//        checkUpdate();


    }

    /**
     * 检查更新,如果发现新版本则弹出发现新版本对话框
     */
//    private void checkUpdate() {
//
//        //app版本信息的url
////        String appUpdateVersionUrl = "";
////        String jsonData = OkHttp3Util.getJsonData(appUpdateVersionUrl);
//
////        JsonObject jsonObject = new JsonObject(jsonData);
//        showProgress(MyApp.getRes().getString(R.string.loading));
//        HttpRequest.getAppData(new CallBackListener<AppInfo>() {
//            @Override
//            public void onSuccess(AppInfo appInfo) {
//                hideProgress();
//                if ( LoginViewActivity.this.isFinishing()) {
//                    return;
//                }
//                //检查更新
//                String nowVersion = MyApp.getVersion();
//                //服务器端版本号
//                String newVersion = appInfo.getResult().get(0).getFversion();
//                Log.i("TEST11", newVersion);
//                //新版本App的下载地址
//                String downloadUrl = appInfo.getResult().get(0).getFaddress();
//                //版本更新提醒的标题
//                String title = getString(R.string.updateTitle);
//                //版本更新提醒的详细信息
//                String updateContent = appInfo.getResult().get(0).getFcontext().replace("##","\n");
//                Log.i("TEST111", "当前版本" + nowVersion);
//                //如果当前版本与远程最新版本不符,则调用App更新下载的方法
//                if (!nowVersion.equals(newVersion)) {
//                    AppUpdate.sendRequest(getContext(), title, updateContent, downloadUrl);
//                }
//
//
//            }
//
//            @Override
//            public void onError(String error) {
//                hideProgress();
//                if ( LoginViewActivity.this.isFinishing()) {
//                    return;
//                }
//
//            }
//        });
//
//    }

    @Override
    public void onMyClick(View v) {

        switch (v.getId()) {
            case R.id.login_bt_login://登陆按钮
                if (JUMPLOGIN) {
                    gotoMainAct();
                } else {
                    mPresenter.login();
                }

                break;

        }
    }


    @Override
    public void initLoginInfo(String user, String pass) {
        etUser.setText(user);
        etPassword.setText(pass);
    }

    @Override
    public void gotoMainAct() {
        startActivity(new Intent(this, MainViewActivity.class));
    }


    @Override
    public String getUser() {
        return getText(etUser);
    }

    @Override
    public String getPassWord() {
        return getText(etPassword);
    }


    @Override
    public boolean setTitleLeftHide() {
        return true;
    }

    @Override
    public void showSelectDialog(List<String> list, final CallBackPositionListener listener) {
        new DialogUtils().showSelectDialog(this, list, new DialogUtils.OnItemClickListener() {
            @Override
            public void onItemClickListener(int position) {
                listener.onSuccess(position);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AllenVersionChecker.getInstance().cancelAllMission(this);
    }


}
