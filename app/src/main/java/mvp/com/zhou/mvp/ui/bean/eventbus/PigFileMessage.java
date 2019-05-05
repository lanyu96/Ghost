package mvp.com.zhou.mvp.ui.bean.eventbus;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/10/24 15:51
 * @Description:
 */
public class PigFileMessage {

    public PigFileMessage(boolean refresh) {
        this.refresh = refresh;
    }

    private boolean refresh;

    public boolean isRefresh() {
        return refresh;
    }

    public void setRefresh(boolean refresh) {
        this.refresh = refresh;
    }
}
