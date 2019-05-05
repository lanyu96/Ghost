package mvp.com.zhou.mvp.utils;

import android.content.Context;

import com.allenliu.versionchecklib.v2.AllenVersionChecker;
import com.allenliu.versionchecklib.v2.builder.DownloadBuilder;
import com.allenliu.versionchecklib.v2.builder.UIData;
import com.allenliu.versionchecklib.v2.callback.ForceUpdateListener;


/**
 * @author zhou
 * @date 2019/1/6
 */
public class AppUpdate {


    private static final String TAG = "TEST111";

    public static void sendRequest(final Context context, String title, String updateContent, String downloadUrl) {

//        //请求版本和下载
//        DownloadBuilder builder = AllenVersionChecker
//                .getInstance()
//                .requestVersion()
//                .setRequestUrl("")
//                .request(new RequestVersionListener() {
//                    @Nullable
//                    @Override
//                    public UIData onRequestVersionSuccess(String result) {
//                        Log.i(TAG,"request successful");
//                        return crateUIData();
//                    }
//
//                    @Override
//                    public void onRequestVersionFailure(String message) {
//                        Toast.makeText(context, "request failed", Toast.LENGTH_SHORT).show();
//                    }
//                });
        //仅下载 , 不请求
        DownloadBuilder builder = AllenVersionChecker
                .getInstance()
                .downloadOnly(crateUIData(title,updateContent,downloadUrl));
        builder.setForceRedownload(true);
        builder.setShowDownloadingDialog(true);
        builder.setShowNotification(true);
        builder.setShowDownloadFailDialog(true);


//        强制更新
        builder.setForceUpdateListener(new ForceUpdateListener() {
            @Override
            public void onShouldForceUpdate() {
//                Toast.makeText(context, "取消下载 ", Toast.LENGTH_SHORT).show();
            }
        });

        //设置下载路径
//        builder.setDownloadAPKPath(Environment.getExternalStorageDirectory() + "/ALLEN/AllenVersionPath2/");


        builder.executeMission(context);
    }

    /**
     * 强制更新操作
     * 通常关闭整个activity所有界面，这里方便测试直接关闭当前activity
     */
//    private void forceUpdate() {
//        Toast.makeText(this, "force update handle", Toast.LENGTH_SHORT).show();
//        finish();
//    }

    /**
     * @important 使用请求版本功能，可以在这里设置downloadUrl
     * 这里可以构造UI需要显示的数据
     * UIData 内部是一个Bundle
     */
    private static UIData crateUIData(String title, String updateContent, String downloadUrl) {
        UIData uiData = UIData.create();
        uiData.setTitle(title);
        uiData.setDownloadUrl(downloadUrl);
        uiData.setContent(updateContent);
        return uiData;
    }
}
