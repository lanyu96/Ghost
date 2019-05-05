package mvp.com.zhou.mvp.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/11/7 9:27
 * @Description:
 */
public class NetworkUtils {
    /**
     * 获取活动网路信息
     *
     * @param context 上下文
     * @return NetworkInfo
     */
    private static NetworkInfo getActiveNetworkInfo(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo();
    }
    /**
     * 判断网络是否可用
     * <p>需添加权限 android.permission.ACCESS_NETWORK_STATE</p>
     */
    public static boolean isAvailable(Context context) {
        NetworkInfo info = getActiveNetworkInfo(context);
        return info != null && info.isAvailable();
    }

}
