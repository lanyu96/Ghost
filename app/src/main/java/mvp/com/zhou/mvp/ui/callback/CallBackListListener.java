package mvp.com.zhou.mvp.ui.callback;

import java.util.List;

/**
 * Created by Silas on 2016/10/7.
 */
public interface CallBackListListener<T> {
    void onSuccess(List<T> t);

    void onError(String error);
}
