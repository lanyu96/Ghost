package com.zhou.ghost.ui.view.main;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhou.ghost.R;
import com.zhou.ghost.ui.callback.CallBackPositionListener;
import com.zhou.ghost.ui.dialog.DialogUtils;
import com.zhou.ghost.ui.presenter.main.MainPersonPresenterImpl;
import com.zhou.ghost.ui.view.base.BaseFragment;

import java.util.List;


public class MainPersonViewFrag extends BaseFragment<MainPersonPresenterImpl> implements MainPersonView {



    @Override
    public MainPersonPresenterImpl initPresent() {
        return new MainPersonPresenterImpl();
    }

    @Override
    public View setContentUI(LayoutInflater inflater, ViewGroup container) {
        View view = View.inflate(getContext(), R.layout.fragment_main_person_view, null);
        return view;
    }


    @Override
    public void initView() {



    }

    @Override
    public void initEvent() {

    }

    @Override
    public void initData() {


    }


    @Override
    public void onMyClick(View v) {
        switch (v.getId()){


//                //检查更新
//            case R.id.fragment_person_get_update_ll:
//                new SplashActivity().upDate(getContext());
//                break;
//                //修改密码
//            case R.id.fragment_person_modify_password_ll:
////                Intent intent = new Intent(getActivity(), ModifyPasswordViewActivity.class);
////                startActivity(intent);
//
//                break;
        }
    }

//    @Override
//    public void showSelectDialog(List<String> list, final CallBackPositionListener listener) {
//        new DialogUtils().showSelectDialog(getContext(), list, new DialogUtils.OnItemClickListener() {
//            @Override
//            public void onItemClickListener(int position) {
//                listener.onSuccess(position);
//            }
//        });
//    }



}
