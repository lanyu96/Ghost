package mvp.com.zhou.mvp.ui.presenter.main;


import java.util.ArrayList;
import java.util.List;

import mvp.com.zhou.mvp.MyApp;
import mvp.com.zhou.mvp.R;
import mvp.com.zhou.mvp.constant.SPConstants;
import mvp.com.zhou.mvp.ui.bean.PigFarmInfo;
import mvp.com.zhou.mvp.ui.bean.PigFieldInfo;
import mvp.com.zhou.mvp.ui.callback.CallBackListListener;
import mvp.com.zhou.mvp.ui.callback.CallBackPositionListener;
import mvp.com.zhou.mvp.ui.dialog.DialogUtils;
import mvp.com.zhou.mvp.ui.model.main.MainPersonModel;
import mvp.com.zhou.mvp.ui.model.main.MainPersonModelImpl;
import mvp.com.zhou.mvp.ui.presenter.base.BasePresenterImpl;
import mvp.com.zhou.mvp.ui.view.main.MainPersonView;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/7/27 15:27
 * @Description:
 */
public class MainPersonPresenterImpl extends BasePresenterImpl<MainPersonView, MainPersonModel> {

    @Override
    public void initData(){
    }

    @Override
    public MainPersonModel initModel() {
        return new MainPersonModelImpl();
    }


    public void getFarmInfofromNet(){
        getView().showProgress(MyApp.getRes().getString(R.string.loading));
        mModel.getFarmInfoFromNet(getView(), new CallBackListListener<PigFarmInfo>() {
            @Override
            public void onSuccess(List<PigFarmInfo> t) {
                getView().hideProgress();
                if (t.size() == 0) {
                    getView().showToast("此用户没有猪场");
                } else if (t.size() == 1) {//只有一个猪场
                    //保存农场
                    keepFarmInfo(t.get(0));
                    getView().showToast("该用户只有一个猪场");
                } else {//有多个猪场
                    showSelectFarm(t);
                }
            }

            @Override
            public void onError(String error) {
                getView().hideProgress();
                getView().showToast(error);
            }
        });
    }
    /**
     * 选择猪场展示
     *
     * @param pigFarms
     */

    private void showSelectFarm(final List<PigFarmInfo> pigFarms) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < pigFarms.size(); i++) {
            list.add(pigFarms.get(i).getName());
        }
        getView().showSelectDialog(list, new CallBackPositionListener() {
            @Override
            public void onSuccess(int position) {
                keepFarmInfo(pigFarms.get(position));
            }
        });

    }

    private void keepFarmInfo(PigFarmInfo info){
        //保存农场
        mModel.keepFarmInfo(info.getName(), info.getId());
        getView().setFarm(info.getName());
        getView().setField(MyApp.getPreferencesService().getValue(SPConstants.FIELD_NAME,""));
        checkFieldShow();
    }
    /**
     * 选择
     */
    public void checkFieldShow() {
        if (isEmpty(MyApp.getPreferencesService().getValue(SPConstants.FIELD_ID, ""))
                && isEmpty(MyApp.getPreferencesService().getValue(SPConstants.FIELD_NAME, ""))) {
            selectField();
        }
    }

    /**
     * 选择分厂
     */
    public void selectField() {
        getView().showProgress(MyApp.getRes().getString(R.string.loading));
        mModel.getFieldInfoFromNet(getView(),new CallBackListListener<PigFieldInfo>() {
            @Override
            public void onSuccess(List<PigFieldInfo> info) {
                getView().hideProgress();
                if (info.size() > 1) {
                    showSelectSelect(info);
                } else if (info.size() == 1) {
                    //保存分厂
                    mModel.keepFieldInfo(info.get(0).getName(), info.get(0).getId(),info.get(0).getFq2pz());
                    getView().setField(info.get(0).getName());
                    getView().showToast("此猪场只有一个分场");
                } else {
                    getView().showToast("未找到所属分厂");
                }

            }

            @Override
            public void onError(String error) {
                getView().hideProgress();
                getView().showToast(error);
            }
        });
    }
    /**
     * 选择猪场展示
     *
     * @param pigFields
     */

    private void showSelectSelect(final List<PigFieldInfo> pigFields) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < pigFields.size(); i++) {
            list.add(pigFields.get(i).getName());
        }
        new DialogUtils().showSelectDialog(getView().getContext(), list, new DialogUtils.OnItemClickListener() {
            @Override
            public void onItemClickListener(int position) {
                //保存分厂
                mModel.keepFieldInfo(pigFields.get(position).getName(), pigFields.get(position).getId(),pigFields.get(position).getFq2pz());
                getView().setField(pigFields.get(position).getName());
            }
        });
    }

}
