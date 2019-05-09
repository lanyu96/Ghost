package com.zhou.ghost.ui.presenter.tool;

import com.zhou.ghost.ui.model.tool.QRCodeModel;
import com.zhou.ghost.ui.model.tool.QRCodeModelImpl;
import com.zhou.ghost.ui.presenter.base.BasePresenterImpl;
import com.zhou.ghost.ui.view.tool.QRCodeView;

public class QRCodePresenterImpl extends BasePresenterImpl<QRCodeView, QRCodeModel> {
    @Override
    public void initData() {

    }

    @Override
    public QRCodeModel initModel() {
        return new QRCodeModelImpl();
    }
}
