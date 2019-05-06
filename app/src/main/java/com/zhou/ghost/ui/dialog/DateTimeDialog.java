package com.zhou.ghost.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import com.zhou.ghost.R;


/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/8/15 14:19
 * @Description:
 */
public class DateTimeDialog {
    /**
     * 展示选择列表框
     *
     * @param context
     * @param listener
     */
    public Dialog showDateTimeDialog(Context context, String dateTime, final OnDateTimeListener listener) {
        //    通过LayoutInflater来加载一个xml的布局文件作为一个View对象
        View lview = LayoutInflater.from(context).inflate(R.layout.dialog_date_time_select, null);

        final DatePicker datePicker = lview.findViewById(R.id.dp_dialog_date_time_date);
        final TimePicker timePicker = lview.findViewById(R.id.tp_dialog_date_time_time);
        TextView tvSure = lview.findViewById(R.id.tv_dialog_date_time_yes);
        TextView tvcanclel = lview.findViewById(R.id.tv_dialog_date_time_no);

        timePicker.setIs24HourView(true);
        int year = Integer.parseInt(dateTime.split(" ")[0].split("-")[0]);
        int month = Integer.parseInt(dateTime.split(" ")[0].split("-")[1])-1;
        int day = Integer.parseInt(dateTime.split(" ")[0].split("-")[2]);
        int hour = Integer.parseInt(dateTime.split(" ")[1].split(":")[0]);
        int minute = Integer.parseInt(dateTime.split(" ")[1].split(":")[1]);

        datePicker.init(year, month, day, null);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            timePicker.setHour(hour);
            timePicker.setMinute(minute);
        } else {
            timePicker.setCurrentHour(hour);
            timePicker.setCurrentMinute(minute);
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(lview);
        final Dialog dialog = builder.create();
        tvSure.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                int nowHour;
                int nowMinute;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    nowHour = timePicker.getHour();
                    nowMinute = timePicker.getMinute();
                } else {
                    nowHour = timePicker.getCurrentHour();
                    nowMinute = timePicker.getCurrentMinute();
                }
                String dateTime = getStringDate(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth()) + " " + getStringTime(nowHour, nowMinute);
                listener.onDateTimeListener(dateTime);
            }
        });
        tvcanclel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        return dialog;
    }

    /**
     * 将日期格式化
     *
     * @param year
     * @param month
     * @param day
     * @return
     */
    private static String getStringDate(int year, int month, int day) {
        String days;
        if (month + 1 < 10) {
            if (day < 10) {
                days = new StringBuffer().append(year).append("-").append("0").
                        append(month + 1).append("-").append("0").append(day).toString();
            } else {
                days = new StringBuffer().append(year).append("-").append("0").
                        append(month + 1).append("-").append(day).toString();
            }

        } else {
            if (day < 10) {
                days = new StringBuffer().append(year).append("-").
                        append(month + 1).append("-").append("0").append(day).toString();
            } else {
                days = new StringBuffer().append(year).append("-").
                        append(month + 1).append("-").append(day).toString();
            }

        }
        return days;
    }

    /**
     * 将日期格式化
     *
     * @param hour
     * @param minute
     * @return
     */
    private static String getStringTime(int hour, int minute) {
        String time;
        if (hour < 10) {
            if (minute < 10) {
                time = new StringBuffer().append("0" + hour).append(":").append("0").
                        append(minute).toString();
            } else {
                time = new StringBuffer().append("0" + hour).append(":").
                        append(minute).toString();
            }
        } else {
            if (minute < 10) {
                time = new StringBuffer().append(hour).append(":").append("0").
                        append(minute).toString();
            } else {
                time = new StringBuffer().append(hour).append(":").
                        append(minute).toString();
            }

        }
        return time;
    }

    public interface OnDateTimeListener {
        void onDateTimeListener(String dateTime);
    }
}
