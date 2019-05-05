package mvp.com.zhou.mvp.ui.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.widget.DatePicker;

import java.util.Date;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/8/2 11:18
 * @Description:
 */
public class TimeDialog {
    /**
     * 展示日期选择框
     *
     * @param context
     * @param date
     */
    @SuppressWarnings("ResourceType")
    public Dialog showTimeSeletDialog(Context context, String date, OnDateClickListener listener) {
        if ("".equals(date)) {
            java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
            date = format.format(new Date());
        }
        String[] str = date.split("-");
       return new DatePickerDialog(context, DatePickerDialog.THEME_HOLO_LIGHT, getDatePickerListener( listener), Integer.parseInt(str[0]), Integer.parseInt(str[1]) - 1, Integer.parseInt(str[2]));
    }

    /**
     * 日期选择器点击事件
     *
     * @param listener
     * @return
     */
    private static DatePickerDialog.OnDateSetListener getDatePickerListener(final OnDateClickListener listener) {
        DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                String date = getStringDate(year, monthOfYear, dayOfMonth);
                if (listener != null) {
                    listener.onDateClickListener(date);
                }
            }
        };
        return onDateSetListener;
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

    public interface OnDateClickListener {
        void onDateClickListener(String date);
    }
}
