package mvp.com.zhou.mvp.ui.view.base;


import android.app.ProgressDialog;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleRegistry;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mvp.com.zhou.mvp.MyApp;
import mvp.com.zhou.mvp.R;
import mvp.com.zhou.mvp.ui.presenter.base.BasePresenterImpl;
import mvp.com.zhou.mvp.utils.util.ToastUtils;


public abstract class BaseFragment<T extends BasePresenterImpl> extends Fragment implements View.OnClickListener, BaseFragmentView {

    ProgressDialog progressDialog;
    ToastUtils toastUtils;
    private boolean isProgressing = false;
    public View rootView;
    protected T mPresenter;
    private LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
    private long exitTime = 0;
    @Override
    public Lifecycle getLifecycle() {
        return lifecycleRegistry;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = setContentUI(inflater, container);
        } else {
            if (rootView.getParent() != null) {
                ((ViewGroup) rootView.getParent()).removeView(rootView);
            }
        }

        return rootView;
    }

    protected abstract T initPresent();

    public View findViewById(int id) {
        return rootView.findViewById(id);
    }


    public abstract View setContentUI(LayoutInflater inflater, ViewGroup container);

    public Boolean isActivitySuccess = false;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        toastUtils = MyApp.getInstance().getToastUtils();
        isActivitySuccess = true;
        isInit = false;
        if (getUserVisibleHint()) {
            isInit();
        }
    }

    @Override
    public void showToast(String str) {
        toastUtils.showToast(str);
    }

    @Override
    public void showProgress(String msg) {
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(getActivity());
        }
        progressDialog.setMessage(msg);
        progressDialog.setCancelable(true);
        progressDialog.show();
        isProgressing = true;
    }

    @Override
    public void showProgress(String msg, boolean flag) {
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(getActivity());
        }
        progressDialog.setMessage(msg);
        progressDialog.setCancelable(flag);
        progressDialog.setCanceledOnTouchOutside(flag);
        progressDialog.show();
        isProgressing = true;
    }

    @Override
    public void hideProgress() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.hide();

        }
        isProgressing = false;

    }

    @Override
    public void finishUI() {
        if (progressDialog != null) {
            progressDialog.dismiss();
            progressDialog = null;
        }

        getActivity().finish();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (progressDialog != null) {
            progressDialog.dismiss();
            progressDialog = null;
        }
        if(mPresenter!=null) {
            mPresenter.detachView();
        }
        if (mPresenter != null) {
            mPresenter = null;
        }
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public abstract void initView();

    public abstract void initEvent();

    public abstract void initData();

    private Boolean isInit = false;

    public void isInit() {
        //判断activity是否创建成功
        if (!isActivitySuccess) {
            return;
        }
        if (!isInit) {
            mPresenter = initPresent();
            mPresenter.attachView(this);
            initView();
            getLifecycle().addObserver(mPresenter);//添加LifecycleObserver
            mPresenter.initData();
            initEvent();
            initData();
            isInit = true;
        }
    }

    /**
     * fragment 可见时调用的方法，实现fragment懒加载
     *
     * @param isVisibleToUser
     */
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (getUserVisibleHint()) {
            isInit();
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
}
