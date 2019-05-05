package mvp.com.zhou.mvp.ui.presenter.main;


import java.util.ArrayList;
import java.util.List;

import mvp.com.zhou.mvp.ui.model.main.MainHomeModel;
import mvp.com.zhou.mvp.ui.model.main.MainHomeModelImpl;
import mvp.com.zhou.mvp.ui.presenter.base.BasePresenterImpl;
import mvp.com.zhou.mvp.ui.view.main.MainHomeView;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/7/27 15:27
 * @Description:
 */
public class MainHomePresenterImpl extends BasePresenterImpl<MainHomeView, MainHomeModel> {

    private List<List> list;
//    private ArrayList<ProductTable> productList;

    @Override
    public void initData(){
        list = new ArrayList<>();
//        productList = new ArrayList<>();

    }

    @Override
    public MainHomeModel initModel() {
        return new MainHomeModelImpl();
    }





}
