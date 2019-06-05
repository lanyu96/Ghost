package com.zhou.ghost.ui.bean;

import java.io.Serializable;

/**
 * @Auther: zhou
 * @Date: 2019/1/7 8:40
 * @Description:
 */
public class AppInfo implements Serializable {


    /**
     * id : 110
     * address : http://47.110.9.80/lanyu/taiji/
     * version : 1.2.2
     * context : 1111
     * isAble : 1
     * createTime : 2019-06-03 21:28:52.0
     * appName : taiji.apk
     */

    private int id;
    private String address;
    private String version;
    private String context;
    private String isAble;
    private String createTime;
    private String appName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getIsAble() {
        return isAble;
    }

    public void setIsAble(String isAble) {
        this.isAble = isAble;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
