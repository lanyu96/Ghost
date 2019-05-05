package mvp.com.zhou.mvp.ui.view.base;


import android.Manifest;
import android.app.ProgressDialog;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleRegistry;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import mvp.com.zhou.mvp.MyApp;
import mvp.com.zhou.mvp.R;
import mvp.com.zhou.mvp.ui.presenter.base.BasePresenterImpl;
import mvp.com.zhou.mvp.utils.util.AndroidBug5497Workaround;
import mvp.com.zhou.mvp.utils.util.ToastUtils;


public abstract class BaseActivity<T extends BasePresenterImpl> extends FragmentActivity implements View.OnClickListener, BaseActivityView {

    protected static final String TAG = BaseActivity.class.getName();
    public ProgressDialog progressDialog;
    MyApp app;
    ToastUtils toastUtils;
    private boolean isProgressing = false;
    protected T mPresenter;
    private LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
    private long exitTime = 0;
    @Override
    public Lifecycle getLifecycle() {
        return lifecycleRegistry;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = initPresent();
        mPresenter.attachView(this);
        setTheme(R.style.blue);
        initView();
        getLifecycle().addObserver(mPresenter);//添加LifecycleObserver
        mPresenter.initData();
        initEvent();
        initData();

        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this,  new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 101);
            }
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this,  new String[]{Manifest.permission.CAMERA}, 202);
            }
        }
    }

    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        AndroidBug5497Workaround.assistActivity(this);
        //透明状态栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //透明导航栏
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);

        app = MyApp.getInstance();
        toastUtils = app.getToastUtils();
        initTitle();
       // initRefresh();
    }
    //=====================================================新增重新加载界面
    public LinearLayout common_refresh;
    private TextView tv_refresh;
    public  void initRefresh(){
        common_refresh = (LinearLayout) findViewById(R.id.ll_common_refresh);
        if(common_refresh !=null){
            tv_refresh = findViewById(R.id.tv_common_refresh);
            common_refresh.setVisibility(View.GONE);
        }
    };
    public void setRefreshClick(View.OnClickListener listener){
        if(common_refresh !=null) {
            tv_refresh.setOnClickListener(listener);
        }
    }
    public void showRefresh(){
        if(common_refresh !=null) {
            common_refresh.setVisibility(View.VISIBLE);
        }
    }
    public void hideRefresh(){
        if(common_refresh !=null) {
            common_refresh.setVisibility(View.GONE);
        }
    }
    //=====================================================

    public TextView title_txt_right;
    public TextView title_txt;
    public ImageView title_right_image;

    public void initTitle() {
        LinearLayout common_title_layout = (LinearLayout) findViewById(R.id.common_title_layout);
        if (common_title_layout != null) {
            if (setTitleText() == null) {
                common_title_layout.setVisibility(View.GONE);
                return;
            }
            title_txt = (TextView) findViewById(R.id.common_title);
            title_txt.setText(setTitleText());
            ImageView common_title_left = (ImageView) findViewById(R.id.common_title_left);
            common_title_left.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                   onBackPressed();
                }
            });
            if (setTitleLeftHide()) {
                common_title_left.setVisibility(View.GONE);
            }
            title_txt_right = (TextView) findViewById(R.id.common_title_right);
            title_txt_right.setText("" + setTitleRightText());
            if (setTitleRightText().isEmpty()) {
                title_txt_right.setVisibility(View.GONE);
            }
            title_txt_right.setOnClickListener(setTitleRightTextClickListener());

            title_right_image = (ImageView) findViewById(R.id.common_title_right_image);
            if (setTitleRightImageResource() == 0) {
                title_right_image.setVisibility(View.GONE);
                title_right_image.setOnClickListener(null);
            } else {
                title_right_image.setVisibility(View.VISIBLE);
                title_right_image.setImageResource(setTitleRightImageResource());
                title_right_image.setOnClickListener(setTitleRightImageClickListener());
            }

        }
    }

    /**
     * 绑定present
     *
     * @return
     */
    public abstract T initPresent();

    public abstract void initView();

    public abstract void initEvent();

    public abstract void initData();


    public int setTitleRightImageResource() {
        return 0;
    }


    public View.OnClickListener setTitleRightImageClickListener() {
        return null;
    }

    @Override
    protected void onResume() {

        super.onResume();
    }

    @Override
    protected void onPause() {

        super.onPause();
        if (progressDialog != null) {
            progressDialog.dismiss();
            progressDialog = null;
        }
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        if (progressDialog != null) {
            progressDialog.dismiss();
            progressDialog = null;
        }
        mPresenter.detachView();
        if (mPresenter != null) {
            mPresenter = null;
        }
    }

    public Context getContext() {
       return this;
    }

    public void finishUI() {
        if (progressDialog != null) {
            progressDialog.dismiss();
            progressDialog = null;
        }
        finish();
    }


    public void showToast(String str) {
        toastUtils.showToast(str);
    }


    public void showProgress(String msg) {
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(this);
        }
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setMessage(msg);
        progressDialog.setCancelable(true);
        try {
            progressDialog.show();
        } catch (Exception e) {

        }
        isProgressing = true;
    }


    public void showProgress(String msg, boolean flag) {
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(this);
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


    public String setTitleText() {
        return null;
    }


    public boolean setTitleLeftHide() {
        return false;
    }


    public String setTitleRightText() {
        return "";
    }


    public View.OnClickListener setTitleRightTextClickListener() {
        return null;

    }

    /**
     * 隐藏键盘
     *
     * @param editText
     */
    protected void hideInputMethod(EditText editText) {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (null != imm) {
            imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    @Override
    public void onClick(View v) {
        if (isProgressing == true) {
            showProgress(MyApp.getRes().getString(R.string.loading));
            return;
        }
        click(v);


    }

    public void click(View v) {
        //防止连续点击
        if ((System.currentTimeMillis() - exitTime) > 500) {
            onMyClick(v);
            exitTime = System.currentTimeMillis();
        }
    }


    @Override
    public void onBackPressed() {
        if (isTaskRoot()) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                // ToastUtil.makeToastInBottom("再按一次退出应用", MainMyselfActivity);
                showToast(MyApp.getRes().getString(R.string.try_again_quit));
                exitTime = System.currentTimeMillis();
                return;
            }
            finish();
//			// 清除图片缓存
//			DataCleanManager.cleanExternalCacheImage(this);
        }
        super.onBackPressed();
    }

    public String getText(TextView tv) {
        return tv.getText().toString().trim();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            View v = getCurrentFocus();
            if (isShouldHideInput(v, ev)) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                if (imm != null) {
                    assert v != null;
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                    /** here */
                    v.clearFocus();
                }
            }
            return super.dispatchTouchEvent(ev);
        }
        // 必不可少，否则所有的组件都不会有TouchEvent了
        return getWindow().superDispatchTouchEvent(ev) || onTouchEvent(ev);
    }

    public boolean isShouldHideInput(View v, MotionEvent event) {
        if (v != null && (v instanceof EditText)) {
            int[] leftTop = {0, 0};
            //获取输入框当前的location位置
            v.getLocationInWindow(leftTop);
            int left = leftTop[0];
            int top = leftTop[1];
            int bottom = top + v.getHeight();
            int right = left + v.getWidth();
            return !(event.getX() > left && event.getX() < right
                    && event.getY() > top && event.getY() < bottom);
        }
        return false;
    }

}
