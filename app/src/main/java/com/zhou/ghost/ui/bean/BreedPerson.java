package com.zhou.ghost.ui.bean;

import java.io.Serializable;

/**
 * @Auther: zhou
 * @Date: 2018/11/23 9:53
 * @Description:
 */
public class BreedPerson implements Serializable {
    private String id;
    private String deletedStatus;
    private Object Employee_id;
    private Object Employee_name;
    private Object Rmark;
    private String name;
    private String number;
    private String Belongzc_name;
    private String Belongzc_id;
    private String dr;

    public void setId(String id) {
        this.id = id;
    }

    public void setDeletedStatus(String deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public void setEmployee_id(Object Employee_id) {
        this.Employee_id = Employee_id;
    }

    public void setEmployee_name(Object Employee_name) {
        this.Employee_name = Employee_name;
    }

    public void setRmark(Object Rmark) {
        this.Rmark = Rmark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBelongzc_name(String Belongzc_name) {
        this.Belongzc_name = Belongzc_name;
    }

    public void setBelongzc_id(String Belongzc_id) {
        this.Belongzc_id = Belongzc_id;
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

    public Object getEmployee_id() {
        return Employee_id;
    }

    public Object getEmployee_name() {
        return Employee_name;
    }

    public Object getRmark() {
        return Rmark;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getBelongzc_name() {
        return Belongzc_name;
    }

    public String getBelongzc_id() {
        return Belongzc_id;
    }

    public String getDr() {
        return dr;
    }
}
