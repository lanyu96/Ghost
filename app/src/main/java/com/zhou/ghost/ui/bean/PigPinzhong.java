package com.zhou.ghost.ui.bean;

import java.io.Serializable;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/12/21 16:53
 * @Description:
 */
public class PigPinzhong implements Serializable {
    /**
     * id : 4h7XbPvwQHKolyLLX4D1f8Vgo+o=
     * CrossLevel : 二元
     * simpleName : LY
     * deletedStatus : 启用
     * remark :
     * name : 长大
     * number : LY
     * dr : 未删
     */

    private String id;
    private String CrossLevel;
    private String simpleName;
    private String deletedStatus;
    private String remark;
    private String name;
    private String number;
    private String dr;

    public void setId(String id) {
        this.id = id;
    }

    public void setCrossLevel(String CrossLevel) {
        this.CrossLevel = CrossLevel;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public void setDeletedStatus(String deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }

    public String getId() {
        return id;
    }

    public String getCrossLevel() {
        return CrossLevel;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public String getDeletedStatus() {
        return deletedStatus;
    }

    public String getRemark() {
        return remark;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getDr() {
        return dr;
    }
}
