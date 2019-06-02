package com.zhou.ghost.utils;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTimeHelper {

    public static final String FORMAT_24 = "yyyy-MM-dd HH:mm:ss";//24小时制
    public static final String FORMAT_12 = "yyyy-MM-dd hh:mm:ss";//12小时制
    public static final String FORMAT_TEXT_24 = "yyyy年MM月dd日 HH时mm分ss秒";
    public static final String FORMAT_TEXT_12 = "yyyy年MM月dd日 hh时mm分ss秒";
    public static final String FORMAT_DAY = "yyyy-MM-dd";//显示年月日

    /**
     * 获取当前日期前一天
     * @return
     */
    public static String getDayBefore(){

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1); //得到前一天
        Date date = calendar.getTime();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
       return df.format(date);
    }
    /**
     * 将日期以指定格式输出
     * @param date - new Date()
     * @param format - "yyyy-MM-dd"
     * @return 2015-11-23
     */
    public static String formatToString(Date date, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format,Locale.CHINA);
            return sdf.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    /**
     * 将日期格式的字符串以指定格式输出
     * @param date - "2015/11/23"
     * @param format - "yyyy-MM-dd"
     * @return 2015-11-23
     */
    public static String formatToString(String date, String format) {
        try {
            Date dt = DateTimeHelper.parseStringToDate(date);
            SimpleDateFormat sdf = new SimpleDateFormat(format,Locale.CHINA);
            return sdf.format(dt);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    /**
     * 将时间戳转化为固定格式的日期字符串 （yyyy-MM-dd HH:mm:ss）
     * @param time - new Date().getTime()+""
     * @return 2015-11-23 14:05:20
     */
    public static String getStrTime(String time) {
        if (time.trim().equals("") || time == null)
            return "";
        String strTime = null;
        time = time.substring(0, 10);
        SimpleDateFormat mFormat = new SimpleDateFormat(FORMAT_24,Locale.CHINA);
        long ltime = Long.valueOf(time);
        strTime = mFormat.format(new Date(ltime * 1000L));
        return strTime;
    }
    /**
     * 将时间戳转化为指定格式日期的字符串
     * @param time - new Date().getTime()+""
     * @param format - "yyyy年MM月dd日 hh时mm分ss秒"
     * @return 2015年11月23日 02时05分36秒
     */
    public static String getStrTime(String time, String format) {
        if (time.trim().equals("") || time == null || time.equals("null"))
            return "";
        String strTime = null;
        time = time.substring(0, 10);
        SimpleDateFormat mFormat = new SimpleDateFormat(format, Locale.CHINA);
        long ltime = Long.valueOf(time);
        strTime = mFormat.format(new Date(ltime * 1000L));
        return strTime;
    }

    /**
     * 将字符串转换为时间戳
     */
    public static long getStringToLongDate(String date) {
        Date d = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            d = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d.getTime();
    }

    /**
     * 显示特定日期到当前日期具体几年，精确到小数点后 8位
     */
    public static String getNumberYears(String date) {
        String strDate ="";
        double parseDateTime = getStringToLongDate(date);
        DecimalFormat decimalFormat = new DecimalFormat("00.00000000");

        double parseDateTime1 = new Date().getTime();
        double l = parseDateTime1 - parseDateTime;
        double i = 1000.0 * 60.0 * 60.0 * 24.0 * 365.25;
        double l1 = l / i;
        String format = decimalFormat.format(l1);
        strDate = format;

        return strDate;
    }
    /**
     * 显示特定日期到当前日期具体几年
     */
    public static String getNumberYear(String date) {
        String strDate ="";
        double parseDateTime = getStringToLongDate(date);
        DecimalFormat decimalFormat = new DecimalFormat("00");

        double parseDateTime1 = new Date().getTime();
        double l = parseDateTime1 - parseDateTime;
        double i = 1000.0 * 60.0 * 60.0 * 24.0 * 365.25;
        double l1 = l / i;
        int l2 = (int)l1;
        String format = decimalFormat.format(l2);
//        if ((l1 - 0.5) >= Integer.valueOf(format)) {
////            format = String.valueOf(Integer.valueOf(format) - 1);
////        }

        strDate = format;

        return strDate;
    }

    /**
     * 显示特定日期到当前日期具体几个月
     */
    public static String getNumberMonth(String date) {
        String strDate ="";
        double parseDateTime = getStringToLongDate(date);
        DecimalFormat decimalFormat = new DecimalFormat("00");

        double parseDateTime1 = new Date().getTime();
        double l = parseDateTime1 - parseDateTime;
        double i = 1000.0 * 60.0 * 60.0 * 24.0 * 30.4375;
        double l1 = l / i;
        int l2 = (int)l1;
        String format = decimalFormat.format(l2);
        strDate = format;

        return strDate;
    }

    /**
     * 显示特定日期到当前日期具体几个周
     */
    public static String getNumberWeek(String date) {
        String strDate ="";
        double parseDateTime = getStringToLongDate(date);
        DecimalFormat decimalFormat = new DecimalFormat("00");

        double parseDateTime1 = new Date().getTime();
        double l = parseDateTime1 - parseDateTime;
        double i = 1000.0 * 60.0 * 60.0 * 24.0 * 7;
        double l1 = l / i;
        int l2 = (int)l1;
        String format = decimalFormat.format(l2);
        strDate = format;

        return strDate;
    }

    /**
     * 显示特定日期到当前日期具体天
     */
    public static String getNumberDay(String date) {
        String strDate ="";
        double parseDateTime = getStringToLongDate(date);
        DecimalFormat decimalFormat = new DecimalFormat("00");

        double parseDateTime1 = new Date().getTime();
        double l = parseDateTime1 - parseDateTime;
        double i = 1000.0 * 60.0 * 60.0 * 24.0;
        double l1 = l / i;
        int l2 = (int)l1;
        String format = decimalFormat.format(l2);
        strDate = format;

        return strDate;
    }

    /**
     * 显示特定日期到当前日期具体小时
     */
    public static String getNumberHour(String date) {
        String strDate ="";
        double parseDateTime = getStringToLongDate(date);
        DecimalFormat decimalFormat = new DecimalFormat("00");

        double parseDateTime1 = new Date().getTime();
        double l = parseDateTime1 - parseDateTime;
        double i = 1000.0 * 60.0 * 60.0;
        double l1 = l / i;
        int l2 = (int)l1;
        String format = decimalFormat.format(l2);
        strDate = format;

        return strDate;
    }

    /**
     * 显示特定日期到当前日期具体分钟
     */
    public static String getNumberMin(String date) {
        String strDate ="";
        double parseDateTime = getStringToLongDate(date);
        DecimalFormat decimalFormat = new DecimalFormat("00");

        double parseDateTime1 = new Date().getTime();
        double l = parseDateTime1 - parseDateTime;
        double i = 1000.0 * 60.0;
        double l1 = l / i;
        int l2 = (int)l1;
        String format = decimalFormat.format(l2);
        strDate = format;

        return strDate;
    }

    /**
     * 将时间time字符串转化为Date对象
     * @param strTime - 1448208000000
     * @return Mon Nov 23 00:00:00 GMT+08:00 2015
     */
    public static Date parseFormatTimeToDate(String strTime) {

        Date date = new Date();
        try{
            date.setTime(Long.parseLong(strTime));
        }
        catch(NumberFormatException nfe){
            nfe.printStackTrace();
        }

        return date;
    }

    /**
     * 获取格式化后Date字符串的Time值
     * @param dateStr 20151123 或者 2015/11/23 或者2015-11-23
     * @return 1448208000000
     * */
    public static long getParseDateTime(String dateStr){
        long daterTime = 0;
        try {
            Date dt1 = parseStringToDate(dateStr);
            daterTime = dt1.getTime();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return daterTime;
    }
    /**
     * 将未指定格式的字符串转换成日期类型
     * @param date - 20151123 或者 2015/11/23 或者2015-11-23
     * @return Mon Nov 23 00:00:00 GMT+08:00 2015
     */
    public static Date parseStringToDate(String date) throws ParseException {
        Date result = null;
        String parse = date;
        parse = parse.replaceFirst("^[0-9]{4}([^0-9]?)", "yyyy$1");
        parse = parse.replaceFirst("^[0-9]{2}([^0-9]?)", "yy$1");
        parse = parse.replaceFirst("([^0-9]?)[0-9]{1,2}([^0-9]?)", "$1MM$2");
        parse = parse.replaceFirst("([^0-9]?)[0-9]{1,2}( ?)", "$1dd$2");
        parse = parse.replaceFirst("( )[0-9]{1,2}([^0-9]?)", "$1HH$2");
        parse = parse.replaceFirst("([^0-9]?)[0-9]{1,2}([^0-9]?)", "$1mm$2");
        parse = parse.replaceFirst("([^0-9]?)[0-9]{1,2}([^0-9]?)", "$1ss$2");
        SimpleDateFormat format = new SimpleDateFormat(parse,Locale.CHINA);
        result = format.parse(date);
        return result;
    }

}
