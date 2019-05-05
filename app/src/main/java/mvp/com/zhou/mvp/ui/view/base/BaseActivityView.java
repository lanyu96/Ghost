package mvp.com.zhou.mvp.ui.view.base;

import android.arch.lifecycle.LifecycleOwner;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/7/29 13:48
 * @Description:
 */
public interface BaseActivityView extends BaseView,LifecycleOwner,ITitleInterface {

    void showRefresh();

    void hideRefresh();


}
