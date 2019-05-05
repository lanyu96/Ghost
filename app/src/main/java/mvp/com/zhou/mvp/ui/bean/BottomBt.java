package mvp.com.zhou.mvp.ui.bean;

import android.content.Intent;

/**
 * Created by fei on 2017/12/21.
 */
public class BottomBt {
    private String name;
    private int img;
    private Intent mIntent;

    public Intent getIntent() {
        return mIntent;
    }

    public void setIntent(Intent intent) {
        mIntent = intent;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
