package com.zhou.ghost.ui.bean;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/11/13 11:05
 * @Description:
 */
public class OutCause {
    private String id;
    private String deletedStatus;
    private Object remark;
    private String name;
    private String number;
    private String property;
    private String dr;

    public void setId(String id) {
        this.id = id;
    }

    public void setDeletedStatus(String deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public void setRemark(Object remark) {
        this.remark = remark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }

    public String getId() {
        return id;
    }

    public String getDeletedStatus() {
        return deletedStatus;
    }

    public Object getRemark() {
        return remark;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getProperty() {
        return property;
    }

    public String getDr() {
        return dr;
    }
}
