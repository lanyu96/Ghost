package com.zhou.ghost.ui.bean;

import java.io.Serializable;

/**
 * @Auther: zhou
 * @Date: 2019/1/23 16:15
 * @Description:
 */
public class LocationNum implements Serializable {
    /**
     * num : 13
     * buildName : 公猪舍
     * buildId : 1Dg8nH1DTBqW0tkS9kfE3C3xSLc=
     */

    private int num;
    private String buildName;
    private String buildId;

    public void setNum(int num) {
        this.num = num;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public int getNum() {
        return num;
    }

    public String getBuildName() {
        return buildName;
    }

    public String getBuildId() {
        return buildId;
    }
}
