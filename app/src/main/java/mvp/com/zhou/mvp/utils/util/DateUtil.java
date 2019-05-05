package mvp.com.zhou.mvp.utils.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by fei on 2018/3/8.
 */
public class DateUtil {

    public static int getTwoDateDays(String firstDate, String seconfDate){
        Calendar c = Calendar.getInstance();
        Date fdate = null;
        try {
            fdate = new SimpleDateFormat("yy-MM-dd").parse(firstDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(fdate);
        Date sdate = null;
        try {
            sdate = new SimpleDateFormat("yy-MM-dd").parse(seconfDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(sdate);

        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(fdate);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(sdate);
        int day1= cal1.get(Calendar.DAY_OF_YEAR);
        int day2 = cal2.get(Calendar.DAY_OF_YEAR);

        int year1 = cal1.get(Calendar.YEAR);
        int year2 = cal2.get(Calendar.YEAR);
        if(year1 != year2)   //同一年
        {
            int timeDistance = 0 ;
            for(int i = year1 ; i < year2 ; i ++)
            {
                if(i%4==0 && i%100!=0 || i%400==0)    //闰年
                {
                    timeDistance += 366;
                }
                else    //不是闰年
                {
                    timeDistance += 365;
                }
            }
            for(int i = year2 ; i < year1 ; i ++)
            {
                if(i%4==0 && i%100!=0 || i%400==0)    //闰年
                {
                    timeDistance -= 366;
                }
                else    //不是闰年
                {
                    timeDistance -= 365;
                }
            }
            return timeDistance + (day2-day1) ;
        }
        else    //不同年
        {
            System.out.println("判断day2 - day1 : " + (day2-day1));
            return day2-day1;
        }
    }
    /**
     * 将日期格式化
     *
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static String getStringDate(int year, int month, int day) {
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
     * 获得指定日期的前一天
     *
     * @param specifiedDay
     * @return
     * @throws Exception
     */
    public static String getSpecifiedDayBefore(String specifiedDay) {
//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        Date date = null;
        try {
            date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day - 1);

        String dayBefore = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
        return dayBefore;
    }

    /**
     * 获得指定日期的前几天
     *
     * @param specifiedDay
     * @return
     * @throws Exception
     */
    public static String getSpecifiedDayBefore(String specifiedDay, int days) {
//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        Date date = null;
        try {
            date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day - days);

        String dayBefore = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
        return dayBefore;
    }

    /**
     * 获得指定日期的后一天
     *
     * @param specifiedDay
     * @return
     */
    public static String getSpecifiedDayAfter(String specifiedDay) {
        Calendar c = Calendar.getInstance();
        Date date = null;
        try {
            date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day + 1);

        String dayAfter = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
        return dayAfter;
    }
    /**
     * 功能：得到当前月份月初 格式为：xxxx-yy-zz (eg: 2007-12-01)<br>
     *
     * @return String
     * @author pure
     */
    public static String thisYear() {
        Calendar localTime = Calendar.getInstance();
        int x = localTime.get(Calendar.YEAR);

        return x + "-01-01";
    }
    /**
     * 功能：得到当前月份月初 格式为：xxxx-yy-zz (eg: 2007-12-01)<br>
     *
     * @return String
     * @author pure
     */
    public static String thisMonth() {
        Calendar localTime = Calendar.getInstance();
        String strY = null;
        int x = localTime.get(Calendar.YEAR);
        int y = localTime.get(Calendar.MONTH) + 1;
        strY = y >= 10 ? String.valueOf(y) : ("0" + y);
        return x + "-" + strY + "-01";
    }

    /**
     * 功能：得到当前日期 格式为：xxxx-yy-zz (eg: 2007-12-05)<br>
     *
     * @return String
     * @author pure
     */
    public static String today() {
        Calendar localTime = Calendar.getInstance();
        String strY = null;
        String strZ = null;
        int x = localTime.get(Calendar.YEAR);
        int y = localTime.get(Calendar.MONTH) + 1;
        int z = localTime.get(Calendar.DATE);
        strY = y >= 10 ? String.valueOf(y) : ("0" + y);
        strZ = z >= 10 ? String.valueOf(z) : ("0" + z);
        return x + "-" + strY + "-" + strZ;
    }
}
