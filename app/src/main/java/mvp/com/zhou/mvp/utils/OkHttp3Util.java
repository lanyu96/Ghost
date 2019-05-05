package mvp.com.zhou.mvp.utils;

import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author zhou
 * @date 2019/1/6
 * 返回String 类型的 Json字符串
 */
public class OkHttp3Util {

    private static String TAG = "TESTJSON";
    private static String data = "";

    public static String getJsonData(String urlStr) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(urlStr)
                .build();
        Call call = client.newCall(request);

        try {
            Response response = call.execute();
            data = response.body().string();
            Log.i(TAG, "获取数据成功");
            Log.i(TAG, "response code =" + response.code());
            Log.i(TAG, "response body = " + data);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}
