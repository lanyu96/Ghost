package mvp.com.zhou.mvp.ui.bean;

import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/10/24 13:32
 * @Description:
 */
public class CategoryBt {
    private LinearLayout ll;
    private TextView name;

    public CategoryBt() {
    }

    public CategoryBt(LinearLayout ll, TextView name) {
        this.ll = ll;
        this.name = name;
    }

    public TextView getName() {
        return name;
    }

    public void setName(TextView name) {
        this.name = name;
    }


    public LinearLayout getLl() {
        return ll;
    }

    public void setLl(LinearLayout ll) {
        this.ll = ll;
    }
}
