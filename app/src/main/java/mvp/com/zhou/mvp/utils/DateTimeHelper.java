package mvp.com.zhou.mvp.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

}
