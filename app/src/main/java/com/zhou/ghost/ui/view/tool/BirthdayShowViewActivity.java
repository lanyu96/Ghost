package com.zhou.ghost.ui.view.tool;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

import com.robinhood.ticker.TickerUtils;
import com.robinhood.ticker.TickerView;
import com.zhou.ghost.MyApp;
import com.zhou.ghost.R;
import com.zhou.ghost.constant.SPConstants;
import com.zhou.ghost.ui.presenter.tool.BirthdayPresenterImpl;
import com.zhou.ghost.ui.view.base.BaseActivity;
import com.zhou.ghost.utils.DateTimeHelper;

import java.util.Timer;
import java.util.TimerTask;

public class BirthdayShowViewActivity extends BaseActivity<BirthdayPresenterImpl> implements BirthdayShowView {

    private TextView clearTv;
    private TickerView dateNumberTv;
    private Timer timer;
    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    dateNumberTv.setText(" "+DateTimeHelper.getNumberYears(MyApp.getPreferencesService().getValue(SPConstants.BIRTHDAY_DATE, ""))+" ");
                    break;
            }
            return false;
        }
    });
    //    private TextView dateNumberTv;

    @Override
    public BirthdayPresenterImpl initPresent() {
        return new BirthdayPresenterImpl();
    }

    @Override
    public void initView() {
        setContentView(R.layout.act_tool_birthday_show_view);
//        dateNumberTv = findViewById(R.id.act_tool_birthday_show_date_number_tv);
        dateNumberTv = findViewById(R.id.act_tool_birthday_show_date_number_tv);
        clearTv = findViewById(R.id.act_tool_birthday_show_date_tv);


        dateNumberTv.setCharacterLists(TickerUtils.provideNumberList());
    }

    @Override
    public void initEvent() {
        clearTv.setOnClickListener(this);
    }

    @Override
    public void initData() {

        timer = new Timer();
        //参数1:每次执行的任务代码  参数2:延时多少毫秒执行   参数3:任务间隔
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //此处写倒计时空间和判断语句
                //当满足条件后,调用cancel()方法结束当前循环
                //动态显示年龄数字
                Message message = new Message();
                message.what = 0;
                handler.sendMessage(message);
//                dateNumberTv.setText(DateTimeHelper.getNumberYears(MyApp.getPreferencesService().getValue(SPConstants.BIRTHDAY_DATE, "")));
            }
        }, 0, 1000);
    }

    @Override
    public void onMyClick(View v) {
        switch (v.getId()) {
            case R.id.act_tool_birthday_show_date_tv:
                MyApp.getPreferencesService().save(SPConstants.BIRTHDAY_DATE,"");
                startActivity(new Intent(getContext(),BirthdayViewActivity.class));
                finishUI();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        timer.cancel();
    }
}
