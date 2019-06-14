package com.zhou.ghost.utils.service;

import android.app.ActivityManager;
import android.content.Context;

import java.util.ArrayList;

import static android.content.Context.ACTIVITY_SERVICE;

public class ServiceUtils {
    /**
     * 判断服务是否在运行
     * @param context
     * @param serviceName
     * @return
     * 服务名称为全路径 例如com.ghost.WidgetUpdateService
     */
    public static boolean isRunService(Context context,String serviceName) {
        ActivityManager manager = (ActivityManager) context.getSystemService(ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if (serviceName.equals(service.service.getClassName())) {
                return true;
            }
        }
        return false;
    }


//        ActivityManager manager = context.getSystemService(ACTIVITY_SERVICE);
//        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
//            if ("com.example.MyService".equals(service.service.getClassName())) {
//                return true;
//            }
//        }
//        return false;
//    }
//    }


}
