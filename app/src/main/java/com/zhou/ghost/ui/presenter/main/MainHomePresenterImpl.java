package com.zhou.ghost.ui.presenter.main;


import java.util.ArrayList;
import java.util.List;

import com.zhou.ghost.ui.model.main.MainHomeModel;
import com.zhou.ghost.ui.model.main.MainHomeModelImpl;
import com.zhou.ghost.ui.presenter.base.BasePresenterImpl;
import com.zhou.ghost.ui.view.main.MainHomeView;

/**
 * @Auther: zhou
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
