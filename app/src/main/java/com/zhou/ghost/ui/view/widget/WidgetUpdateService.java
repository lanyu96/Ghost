package com.zhou.ghost.ui.view.widget;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.RemoteViews;

import com.zhou.ghost.R;
import com.zhou.ghost.httputil.HttpRequest;
import com.zhou.ghost.ui.bean.weather.WeatherBean;
import com.zhou.ghost.ui.callback.CallBackListener;

import java.util.Timer;
import java.util.TimerTask;

public class WidgetUpdateService extends Service {


    private Timer timer;
    private Timer timer1;
    private TimerTask task;
    private TimerTask task1;
    private int count = 1;
    String nowWeather = "";
    long time = 2000;  //每个多久请求一次
    private PendingIntent mPi;
    private ComponentName componentName;
    private RemoteViews remoteViews;
    private AppWidgetManager manager;
    private AlarmManager alarmManager;

    public WidgetUpdateService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        componentName = new ComponentName(WidgetUpdateService.this, Widget.class);
        remoteViews = new RemoteViews(getPackageName(), R.layout.widget);
        manager = AppWidgetManager.getInstance(getApplicationContext());
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        timer = new Timer();
        timer1 = new Timer();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        long time = 5000;

        task = new TimerTask() {
            @Override
            public void run() {
                count++;
               remoteViews.setTextViewText(R.id.widget_now_temperature, "" + count + " ℃");


                remoteViews.setTextViewText(R.id.widget_now_weather_status, nowWeather);

                Log.i("ZHOUT", "桌面小控件运行+" + count);


                manager.updateAppWidget(componentName, remoteViews);
            }
        };
        timer.schedule(task, 0, 5000);

        task1 = new TimerTask() {
            @Override
            public void run() {
                //获取天气详情
                HttpRequest.getWeatherInfo("jiaozhou", new CallBackListener<WeatherBean.HeWeather6Bean>() {
                    @Override
                    public void onSuccess(WeatherBean.HeWeather6Bean heWeather6Bean) {
                        nowWeather = heWeather6Bean.getNow().getTmp();
                        Log.i("ZHOUT", "天气请求次数+1");            }

                    @Override
                    public void onError(String error) {

                    }
                });
            }
        };
        timer1.schedule(task1,0,10000);

//        //获取天气详情
//        HttpRequest.getWeatherInfo("jiaozhou", new CallBackListener<WeatherBean.HeWeather6Bean>() {
//            @Override
//            public void onSuccess(WeatherBean.HeWeather6Bean heWeather6Bean) {
//                nowWeather = heWeather6Bean.getNow().getTmp();
//                Log.i("ZHOUT", "天气请求次数+1");            }
//
//            @Override
//            public void onError(String error) {
//
//            }
//        });
//        Intent intent1 = new Intent(this, WeatherAlarmReceiver.class);
//        mPi = PendingIntent.getBroadcast(this,0,intent1,0);
//        /**
//         * int type： 闹钟的类型，常用的有5个值：AlarmManager.ELAPSED_REALTIME、 AlarmManager.ELAPSED_REALTIME_WAKEUP、AlarmManager.RTC、 AlarmManager.RTC_WAKEUP、AlarmManager.POWER_OFF_WAKEUP。
//         *
//         * AlarmManager.ELAPSED_REALTIME表示闹钟在手机睡眠状态下不可用，该状态下闹钟使用相对时间（相对于系统启动开始），状态值为3；
//         *
//         * AlarmManager.ELAPSED_REALTIME_WAKEUP表示闹钟在睡眠状态下会唤醒系统并执行提示功能，该状态下闹钟也使用相对时间，状态值为2；
//         *
//         * AlarmManager.RTC表示闹钟在睡眠状态下不可用，该状态下闹钟使用绝对时间，即当前系统时间，状态值为1；
//         *
//         * AlarmManager.RTC_WAKEUP表示闹钟在睡眠状态下会唤醒系统并执行提示功能，该状态下闹钟使用绝对时间，状态值为0；
//         *
//         * AlarmManager.POWER_OFF_WAKEUP表示闹钟在手机关机状态下也能正常进行提示功能，所以是5个状态中用的最多的状态之一，该状态下闹钟也是用绝对时间，状态值为4；不过本状态好像受SDK版本影响，某些版本并不支持；
//         */
//        manager.setRepeating(AlarmManager.ELAPSED_REALTIME,time,600000,mPi);
        return super.onStartCommand(intent, flags, startId);


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        timer.cancel();
        task.cancel();
        timer = null;
        task = null;
    }
}
