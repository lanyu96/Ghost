package com.zhou.ghost.ui.bean.eventbus;

/**
 * @Auther: zhou
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
