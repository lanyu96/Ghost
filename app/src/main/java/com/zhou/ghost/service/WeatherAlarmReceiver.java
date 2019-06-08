package com.zhou.ghost.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.zhou.ghost.ui.view.widget.WidgetUpdateService;

public class WeatherAlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent startService = new Intent(context, WidgetUpdateService.class);
        context.startService(startService);
    }


    //    @Override
//    public void onReceive(Context context, Intent intent) {
//
//        Intent intent1 =
//        UIUtils.startTokenService();//可以把开启跟关闭服务的逻辑封装一下,直接调用
////        Intent i = new Intent(context, TokenService.class);
////        //启动服务
////        context.startService(i);
//    }


}
