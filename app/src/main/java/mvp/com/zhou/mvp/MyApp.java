package mvp.com.zhou.mvp;


import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.util.TypedValue;

import mvp.com.zhou.mvp.utils.util.PreferencesService;
import mvp.com.zhou.mvp.utils.util.ToastUtils;


public class MyApp extends Application {

    public static MyApp instance;
    private static String versionName;
    private static PreferencesService preferencesService;
    private static Handler mMainThreadHandler;
    private static int mMainThreadId;
    private static ToastUtils toastUtils;

    private static TypedValue typedValue ;


    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;//获取myApp单列
        preferencesService = new PreferencesService(this);//初始化sp工具类

        //主线程的Handler
        mMainThreadHandler = new Handler();

        typedValue = new TypedValue();
        /**
         * 获取主线程的线程id
         * myTid:Thread
         * myPid:Process
         * myUid:User
         */
        mMainThreadId = android.os.Process.myTid();
        toastUtils = new ToastUtils(this);//初始化toast
        initVersion();

    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }


    private void initVersion() {
        PackageManager pm = getPackageManager();

        PackageInfo pinfo;
        try {
            pinfo = pm.getPackageInfo(getPackageName(), PackageManager.GET_CONFIGURATIONS);
            versionName = pinfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static String getVersion() {
        return versionName;
    }

    public static MyApp getInstance() {
        return instance;
    }

    public static Context getContext() {
        return instance.getApplicationContext();
    }

    public static Resources getRes() {
        return getContext().getResources();
    }

    public static PreferencesService getPreferencesService() {
        if (preferencesService == null) {
            preferencesService = new PreferencesService();
        }
        return preferencesService;
    }

    public ToastUtils getToastUtils() {
        return toastUtils;
    }


    /**
     * 得到主线程里面的创建的一个hanlder
     */
    public static Handler getMainThreadHandler() {
        return mMainThreadHandler;
    }

    /**
     * 得到主线程的线程id
     */
    public static int getMainThreadId() {
        return mMainThreadId;
    }

    /**
     * 判断当前设备是手机还是平板，代码来自 Google I/O App for Android
     *
     * @param context
     * @return 平板返回 True，手机返回 False
     */
    public static boolean isPad(Context context) {
        return (context.getResources().getConfiguration().screenLayout
                & Configuration.SCREENLAYOUT_SIZE_MASK)
                >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }

    /**
     * 判断WIFI网络是否正常
     *
     * @param context
     * @return
     */
    public static boolean isWifiNetConnect(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity == null) {
            return false;
        } else {
            NetworkInfo netWrokInfo = connectivity.getActiveNetworkInfo();
            if (netWrokInfo != null && netWrokInfo.getTypeName().equals("WIFI")
                    && netWrokInfo.isAvailable()) {
                return true;
            }
        }
        return false;
    }

    /**
     * 修改原因：只有当WIFI可用认为WIFI已被打开，否则会导致提示信息误报，场景：开了wifi，但没wifi连接，而是通过gprs的情况。
     * 修改描述：增加isWifiNetConnect判断
     *
     * @return boolean
     * @author xiaolin_kang
     */
    public static boolean isWifiOpen(Context ct) {
        boolean openAndActive = false;
        WifiManager wifi = (WifiManager) ct.getSystemService(Context.WIFI_SERVICE);
        try {
            if (wifi.isWifiEnabled() && isWifiNetConnect(ct)) {
                openAndActive = true;
            } else {
                openAndActive = false;
            }
        } catch (Exception e) {
            openAndActive = false;
        }
        return openAndActive;
    }

    public static int getAttrValue(Context context, int attrResour) {
        context.getTheme().resolveAttribute(attrResour, typedValue, true);
        return typedValue.resourceId;
    }
}
