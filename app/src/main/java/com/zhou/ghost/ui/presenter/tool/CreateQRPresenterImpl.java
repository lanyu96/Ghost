package com.zhou.ghost.ui.presenter.tool;

import com.zhou.ghost.ui.model.tool.CreateQRModel;
import com.zhou.ghost.ui.model.tool.CreateQRModelImpl;
import com.zhou.ghost.ui.presenter.base.BasePresenterImpl;
import com.zhou.ghost.ui.view.tool.CreateQRView;
import com.zhou.ghost.ui.view.tool.QRCodeView;

public class CreateQRPresenterImpl extends BasePresenterImpl<CreateQRView, CreateQRModel> {
    @Override
    public void initData() {

    }

    @Override
    public CreateQRModel initModel() {
        return new CreateQRModelImpl();
    }
}
