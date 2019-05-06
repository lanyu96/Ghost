package com.zhou.ghost.ui.view;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

import com.zhou.ghost.MyApp;
import com.zhou.ghost.R;
import com.zhou.ghost.httputil.HttpRequest;
import com.zhou.ghost.ui.bean.AppInfo;
import com.zhou.ghost.ui.callback.CallBackListener;
import com.zhou.ghost.utils.AppUpdate;

public class SplashActivity extends AppCompatActivity {

    private boolean isProgressing = false;
    private ProgressDialog progressDialog;
    private TextView startingTv;
    private int count;
    private int failCount;
    @SuppressLint("HandlerLeak")
    Handler myHandler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    startingTv.setText("正在启动.");
                    break;
                case 2:
                    startingTv.setText("正在启动..");
                    break;
                case 3:
                    startingTv.setText("正在启动...");
                    break;
                case 4:
//                    Toast.makeText(SplashActivity.this, "获取更新失败", Toast.LENGTH_LONG);
                    getUpdateFail();
                    break;
                default:

                    break;
            }
            super.handleMessage(msg);
        }//
    };
    private Timer timer;
    private Boolean isGetUpdateComplete = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_view);
        checkUpdate();
        init();
        jumpLogin();


    }

    private void init() {
        startingTv = findViewById(R.id.welcome_starting_tv);
        count = 0;
        failCount = 0;
//        Button btn = findViewById(R.id.versionchecklib_version_dialog_cancel);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(SplashActivity.this, "test1111", Toast.LENGTH_SHORT).show();
//            }
//        });

    }

    private void jumpLogin() {

        timer = new Timer();
        //参数1:每次执行的任务代码  参数2:延时多少毫秒执行   参数3:任务间隔
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //此处写倒计时空间和判断语句
                //当满足条件后,调用cancel()方法结束当前循环
//                if (isGetUpdateComplete) {
//                    cancel();
//                }
                count++;
                //如果更新拉取为返回结果,则不跳转到登录界面
                if (failCount >= 12) {
                    myHandler.obtainMessage(4).sendToTarget();
                } else if (count >= 5 && isGetUpdateComplete) {
                    count--;
                    //失败次数计数
                    failCount++;
                } else if (count == 5) {
                    Intent intent = new Intent(SplashActivity.this, LoginViewActivity.class);
                    startActivity(intent);
                    finish();
                } else if (count % 3 == 0) {
                    Message msg = new Message();
                    msg.what = 1;
                    myHandler.sendMessage(msg);
                } else if (count % 3 == 1) {
                    myHandler.obtainMessage(2).sendToTarget();
                } else if (count % 3 == 2) {
                    myHandler.obtainMessage(3).sendToTarget();
                }
            }
        }, 250, 250);
    }

    /**
     * 检查更新,如果发现新版本则弹出发现新版本对话框
     */
    private void checkUpdate() {

        //app版本信息的url
//        String appUpdateVersionUrl = "";
//        String jsonData = OkHttp3Util.getJsonData(appUpdateVersionUrl);

//        JsonObject jsonObject = new JsonObject(jsonData);
//        showProgress(MyApp.getRes().getString(R.string.loading));
//        HttpRequest.getAppData(new CallBackListener<AppInfo>() {
//            @Override
//            public void onSuccess(AppInfo appInfo) {
////                hideProgress();
//                if (SplashActivity.this.isFinishing()) {
//                    return;
//                }
//                //检查更新
//                String nowVersion = MyApp.getVersion();
//                //服务器端版本号
//                String newVersion = appInfo.getResult().get(0).getFversion();
//
//                //test
////                String newVersion = "1.0.4";
//
//                Log.i("TEST11", newVersion);
//                //新版本App的下载地址
//                String downloadUrl = appInfo.getResult().get(0).getFaddress();
//                //版本更新提醒的标题
//                String title = getString(R.string.updateTitle);
//                //版本更新提醒的详细信息
//                String updateContent = appInfo.getResult().get(0).getFcontext().replace("##", "\n");
//                Log.i("TEST111", "当前版本" + nowVersion);
//                //如果当前版本与远程最新版本不符,则调用App更新下载的方法
//                if (!nowVersion.equals(newVersion)) {
//                    isGetUpdateComplete = true;
//                    Intent intent = new Intent(SplashActivity.this, LoginViewActivity.class);
//                    startActivity(intent);
//                    finish();
//                    AppUpdate.sendRequest(SplashActivity.this, title, updateContent, downloadUrl);
//
//
//                }
//
//
//            }
//
//
//            @Override
//            public void onError(String error) {
////                hideProgress();
//                if (SplashActivity.this.isFinishing()) {
//                    return;
//                }
//                isGetUpdateComplete = true;
//                getUpdateFail();
//
//            }
//        });

    }
    /**
     * 检查更新,如果发现新版本则弹出发现新版本对话框
     */
    private  void myUpdate(final Context context) {


        HttpRequest.getAppData(new CallBackListener<AppInfo>() {
            @Override
            public void onSuccess(AppInfo appInfo) {
                hideProgress();
                if (SplashActivity.this.isFinishing()) {
                    return;
                }
                //检查更新
                String nowVersion = MyApp.getVersion();
                //服务器端版本号
                String newVersion = appInfo.getResult().get(0).getFversion();

                //test
//                String newVersion = "1.0.4";
                if (nowVersion.equals(newVersion)) {
                    hideProgress();
                    Toast.makeText(context, "已是最新版本", Toast.LENGTH_SHORT).show();
                }

                Log.i("TEST11", newVersion);
                //新版本App的下载地址
                String downloadUrl = appInfo.getResult().get(0).getFaddress();
                //版本更新提醒的标题
                String title = "发现新版本";
                //版本更新提醒的详细信息
                String updateContent = appInfo.getResult().get(0).getFcontext().replace("##", "\n");
                //如果当前版本与远程最新版本不符,则调用App更新下载的方法

                if (!nowVersion.equals(newVersion)) {
                    AppUpdate.sendRequest(context, title, updateContent, downloadUrl);
                }
            }

            @Override
            public void onError(String error) {
                hideProgress();
                if (SplashActivity.this.isFinishing()) {
                    return;
                }
                hideProgress();
                Toast.makeText(context, "获取更新失败", Toast.LENGTH_SHORT).show();
            }
        });

    }

    //App开启时 更新 错误弹窗
    private void getUpdateFail() {
        timer.cancel();
        AlertDialog.Builder builder = new AlertDialog.Builder(SplashActivity.this);
        builder.setTitle("警告");
        builder.setMessage("网络异常,请检查");
        builder.setCancelable(false);
        builder.setPositiveButton("再试一次", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                isGetUpdateComplete = false;
                count = 0;
                failCount = 0;
                checkUpdate();
                jumpLogin();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.show();


    }

    //应用中手动点击检查更新
    public void upDate(Context context){
        showProgress("正在检查更新", false, context);
        myUpdate(context);


    }

    //显示正在检查更新
    public void showProgress(String msg, boolean flag, Context context) {
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(context);
        }
        progressDialog.setMessage(msg);
        progressDialog.setCancelable(flag);
        progressDialog.setCanceledOnTouchOutside(flag);
        try {
            progressDialog.show();
        } catch (Exception e) {

        }

        isProgressing = true;
    }
    public void hideProgress() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
            progressDialog = null;
        }
        isProgressing = false;
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (timer != null) {
            timer.cancel();
        }

        myHandler.removeCallbacksAndMessages(null);
    }
}
