package mvp.com.zhou.mvp.ui.view;


import android.support.v4.app.FragmentManager;

import mvp.com.zhou.mvp.ui.view.base.BaseActivityView;


/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/7/27 15:22
 * @Description:
 */
public interface MainView extends BaseActivityView {
    FragmentManager getSupportFragmentManager();


    void selectTab(int position);
}
