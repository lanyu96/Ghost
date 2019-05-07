package com.zhou.ghost.ui.bean;

import java.io.Serializable;

/**
 * @Auther: zhou
 * @Date: 2018/10/19 11:36
 * @Description:
 */
public class PigFarmInfo implements Serializable {
    private String id;
    private String name;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
