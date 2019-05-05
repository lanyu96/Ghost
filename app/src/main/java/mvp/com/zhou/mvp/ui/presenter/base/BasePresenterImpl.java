package mvp.com.zhou.mvp.ui.presenter.base;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;


import org.jetbrains.annotations.NotNull;

import java.lang.ref.WeakReference;

import mvp.com.zhou.mvp.ui.model.base.BaseModel;
import mvp.com.zhou.mvp.ui.view.base.BaseView;
import mvp.com.zhou.mvp.utils.util.Logger;


/**
 * Created by Silas on 2016/10/7.
 */
public abstract class BasePresenterImpl<T extends BaseView, V extends BaseModel> implements BasePresenter {

    public V mModel;

    public BasePresenterImpl() {
        mModel = initModel();
    }

    public abstract void initData();
    /**
     * 当内存不足释放内存
     */
    protected WeakReference<T> mViewRef; // view 的弱引用

    /**
     * bind p with v
     *
     * @param view
     */
    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

    /**
     * 获取view的方法
     *
     * @return 当前关联的view
     */
    public T getView(){
        if (mViewRef == null) {
            return null;
        }
        return mViewRef.get();
    }


    ;


    /**
     * 绑定model
     *
     * @return
     */
    public abstract V initModel();

    public boolean isEmpty(String str) {
        return str == null || ("").equals(str);
    }


    @Override
    public void onCreate(@NotNull LifecycleOwner owner) {
        Logger.i("lifecycle-----------create");
    }

    @Override
    public void onStart(@NotNull LifecycleOwner owner) {
        Logger.i("lifecycle-----------start");
    }

    @Override
    public void onResume(@NotNull LifecycleOwner owner) {
        Logger.i("lifecycle-----------resume");
    }

    @Override
    public void onPause(@NotNull LifecycleOwner owner) {
        Logger.i("lifecycle-----------pause");
    }

    @Override
    public void onDestroy(@NotNull LifecycleOwner owner) {
        if (mModel != null) {
            mModel.onDestroy();
            mModel = null;
        }
        Logger.i("lifecycle-----------destroy");
    }

    @Override
    public void onLifecycleChanged(@NotNull LifecycleOwner owner, @NotNull Lifecycle.Event event) {
        Logger.i("lifecycle-----------change");
    }
}
