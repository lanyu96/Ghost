package com.zhou.ghost.ui.view.widget;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.widget.RemoteViews;

import com.zhou.ghost.R;
import com.zhou.ghost.httputil.HttpRequest;
import com.zhou.ghost.ui.bean.weather.WeatherBean;
import com.zhou.ghost.ui.callback.CallBackListener;
import com.zhou.ghost.utils.DateTimeHelper;

import java.util.Timer;
import java.util.TimerTask;

public class WidgetUpdateService extends Service {


    private Timer timer;
    private Timer timer1;
    private TimerTask task;
    private TimerTask task1;
    private int count = 1;
    private int httpCount = 1;
    long time = 2000;  //每个多久请求一次
    private PendingIntent mPi;
    private ComponentName componentName;
    private RemoteViews remoteViews;
    private AppWidgetManager manager;
    private AlarmManager alarmManager;
    private String loc = "jiaozhou";
    private String nowWeather1;
    private String location1;
    private String cond_txt1;

    public WidgetUpdateService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }


    //Android 8.0以上的设备会必须在五秒内运行startForeground方法
    @RequiresApi(api = Build.VERSION_CODES.O)
    private void setForegroundNotification() {
        NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        String channelId = "access_log_channel";
        NotificationChannel channel = new NotificationChannel(channelId, "channel_1",
                NotificationManager.IMPORTANCE_DEFAULT);

        nm.createNotificationChannel(channel);

        Notification notification = new Notification.Builder(this).setChannelId(channelId)
                .build();
        startForeground(1, notification);
    }


    @Override
    public void onCreate() {
        super.onCreate();
        componentName = new ComponentName(WidgetUpdateService.this, Widget.class);
        remoteViews = new RemoteViews(getPackageName(), R.layout.widget);
        manager = AppWidgetManager.getInstance(getApplicationContext());
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        //Android 8.0以上的设备会必须在五秒内运行startForeground方法

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            setForegroundNotification();
//            Notification status = new Notification.Builder(WidgetUpdateService.this).setChannelId(WidgetUpdateService.ALARM_SERVICE).build();
//            startForeground(1,status);
        }


        //休眠唤醒问题
//        PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
//        PowerManager.WakeLock wakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "");

        HttpRequest.getWeatherInfo(loc, new CallBackListener<WeatherBean.HeWeather6Bean>() {
            @Override
            public void onSuccess(WeatherBean.HeWeather6Bean heWeather6Bean) {
                nowWeather1 = heWeather6Bean.getNow().getTmp();
                location1 = heWeather6Bean.getBasic().getLocation();
                cond_txt1 = heWeather6Bean.getNow().getCond_txt();
                remoteViews.setTextViewText(R.id.widget_now_temperature, "" + nowWeather1 + "°");
                remoteViews.setTextViewText(R.id.widget_now_weather_loc, location1);
                remoteViews.setTextViewText(R.id.widget_now_weather_status, cond_txt1);
                manager.updateAppWidget(componentName, remoteViews);

            }

            @Override
            public void onError(String error) {

            }
        });

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        timer = new Timer();
        timer1 = new Timer();
        HttpRequest.getWeatherInfo(loc, new CallBackListener<WeatherBean.HeWeather6Bean>() {
            @Override
            public void onSuccess(WeatherBean.HeWeather6Bean heWeather6Bean) {
                nowWeather1 = heWeather6Bean.getNow().getTmp();
                location1 = heWeather6Bean.getBasic().getLocation();
                cond_txt1 = heWeather6Bean.getNow().getCond_txt();
                remoteViews.setTextViewText(R.id.widget_now_temperature, "" + nowWeather1 + "°");
                remoteViews.setTextViewText(R.id.widget_now_weather_loc, location1);
                remoteViews.setTextViewText(R.id.widget_now_weather_status, cond_txt1);
                manager.updateAppWidget(componentName, remoteViews);

            }

            @Override
            public void onError(String error) {

            }
        });

        //时间
        task = new TimerTask() {
            @Override
            public void run() {
                count++;
                String dayAndWeek = DateTimeHelper.getDayAndWeek();
                String hourAndMin = DateTimeHelper.getHourAndMin();
                remoteViews.setTextViewText(R.id.widget_now_time, dayAndWeek);
                remoteViews.setTextViewText(R.id.widget_now_time_clock, hourAndMin);

                String dayString = DateTimeHelper.getDayLunar();

                remoteViews.setTextViewText(R.id.widget_now_time_lunar, dayString);

                Log.i("ZHOUT", "桌面小控件运行+" + count);


                manager.updateAppWidget(componentName, remoteViews);
            }
        };
        timer.schedule(task, 0, 5000);

        task1 = new TimerTask() {
            @Override
            public void run() {
                httpCount++;
                //获取天气详情
                getWeatherInfo(loc);
                manager.updateAppWidget(componentName, remoteViews);
            }
        };
        timer1.schedule(task1, 0, 300000);
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
        flags = START_REDELIVER_INTENT;
        return super.onStartCommand(intent, flags, startId);


    }

    //天气请求
    private void getWeatherInfo(String loc) {
        HttpRequest.getWeatherInfo(loc, new CallBackListener<WeatherBean.HeWeather6Bean>() {
            @Override
            public void onSuccess(WeatherBean.HeWeather6Bean heWeather6Bean) {
                String nowWeather = heWeather6Bean.getNow().getTmp();
                String location = heWeather6Bean.getBasic().getLocation();
                String cond_txt = heWeather6Bean.getNow().getCond_txt();
                remoteViews.setTextViewText(R.id.widget_now_temperature, "" + nowWeather + "°");
                remoteViews.setTextViewText(R.id.widget_now_weather_loc, location);
                remoteViews.setTextViewText(R.id.widget_now_weather_status, cond_txt);


                Log.i("ZHOUT", "天气请求次数+"+httpCount);
            }

            @Override
            public void onError(String error) {

            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        timer.cancel();
        timer1.cancel();
        task.cancel();
        task1.cancel();
        timer = null;
        task = null;
        timer1 = null;
        task1 = null;
    }


}
