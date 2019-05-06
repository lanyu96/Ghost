package com.zhou.ghost.ui.bean;

import java.io.Serializable;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2019/1/7 20:24
 * @Description:
 */
public class PigCount implements Serializable {
    private String FCOUNT;

    public String getCount() {
        return FCOUNT;
    }

    public void setCount(String FCOUNT) {
        this.FCOUNT = FCOUNT;
    }
}
