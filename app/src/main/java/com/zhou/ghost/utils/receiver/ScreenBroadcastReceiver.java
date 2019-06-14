package com.zhou.ghost.utils.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

import com.zhou.ghost.ui.view.widget.WidgetUpdateService;
import com.zhou.ghost.utils.service.ServiceUtils;

public class ScreenBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "ZHOUT";
    private boolean isRegisterReceiver = false;

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (Intent.ACTION_SCREEN_ON.equals(action)) {
            // 开屏
            Log.i(TAG, "onReceive: 1");
            boolean runService = ServiceUtils.isRunService(context, "com.zhou.ghost.ui.view.widget.WidgetUpdateService");
            if (!runService) {
                Intent startService = new Intent(context, WidgetUpdateService.class);
                context.startService(startService);
            }

        } else if (Intent.ACTION_SCREEN_OFF.equals(action)) {
            // 锁屏
            Log.i(TAG, "onReceive: 2");
        } else if (Intent.ACTION_USER_PRESENT.equals(action)) {
            // 解锁
            Log.i(TAG, "onReceive: 3");
            boolean runService = ServiceUtils.isRunService(context, "com.zhou.ghost.ui.view.widget.WidgetUpdateService");
            if (!runService) {
                Intent startService = new Intent(context, WidgetUpdateService.class);
                context.startService(startService);
            }
        }
    }

    public void registerScreenBroadcastReceiver(Context mContext) {
        if (!isRegisterReceiver) {
            isRegisterReceiver = true;
            IntentFilter filter = new IntentFilter();
            filter.addAction(Intent.ACTION_SCREEN_OFF);
            filter.addAction(Intent.ACTION_SCREEN_ON);
            filter.addAction(Intent.ACTION_USER_PRESENT);
            mContext.getApplicationContext().registerReceiver(ScreenBroadcastReceiver.this, filter);
        }
    }
//
    public void unRegisterScreenBroadcastReceiver(Context mContext) {
        if (isRegisterReceiver) {
            isRegisterReceiver = false;
            mContext.getApplicationContext().unregisterReceiver(ScreenBroadcastReceiver.this);
        }
    }
}