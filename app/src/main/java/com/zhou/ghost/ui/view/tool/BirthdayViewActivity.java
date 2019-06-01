package com.zhou.ghost.ui.view.tool;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.zhou.ghost.MyApp;
import com.zhou.ghost.R;
import com.zhou.ghost.constant.SPConstants;
import com.zhou.ghost.ui.dialog.DateDialog;
import com.zhou.ghost.ui.dialog.DialogUtils;
import com.zhou.ghost.ui.presenter.tool.BirthdayPresenterImpl;
import com.zhou.ghost.ui.view.base.BaseActivity;

public class BirthdayViewActivity extends BaseActivity<BirthdayPresenterImpl> implements BirthdayView {

    private TextView selectDateTv;

    @Override
    public BirthdayPresenterImpl initPresent() {
        return new BirthdayPresenterImpl();
    }

    @Override
    public void initView() {
        setContentView(R.layout.act_tool_birthday_view);
        selectDateTv = findViewById(R.id.act_tool_birthday_date_tv);
    }

    @Override
    public void initEvent() {
        selectDateTv.setOnClickListener(this);

    }

    @Override
    public void initData() {

    }

    @Override
    public void onMyClick(View v) {
        switch (v.getId()) {
            case R.id.act_tool_birthday_date_tv:
               new DialogUtils().showDateSeletDialog(getContext(), "1990-01-01", new DialogUtils.OnDateClickListener() {
                   @Override
                   public void onDateClickListener(String date) {
                       MyApp.getPreferencesService().save(SPConstants.BIRTHDAY_DATE,date);
                       startActivity(new Intent(getContext(),BirthdayShowViewActivity.class));
                       finishUI();
                   }
               });
                break;
        }


    }
}
