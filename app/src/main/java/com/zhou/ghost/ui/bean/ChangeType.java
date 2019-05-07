package com.zhou.ghost.ui.bean;

import java.io.Serializable;

/**
 * @Auther: zhou
 * @Date: 2018/12/4 11:10
 * @Description:
 */
public class ChangeType implements Serializable {
    private String id;
    private String deletedStatus;
    private String Sourcetype_name;
    private String Sourcetype_number;
    private String name;
    private String Targettype_name;
    private String Targettype_number;
    private String number;
    private String dr;

    public String getSourcetype_number() {
        return Sourcetype_number;
    }

    public void setSourcetype_number(String sourcetype_number) {
        Sourcetype_number = sourcetype_number;
    }

    public String getTargettype_number() {
        return Targettype_number;
    }

    public void setTargettype_number(String targettype_number) {
        Targettype_number = targettype_number;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDeletedStatus(String deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public void setSourcetype_name(String Sourcetype_name) {
        this.Sourcetype_name = Sourcetype_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTargettype_name(String Targettype_name) {
        this.Targettype_name = Targettype_name;
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

    public String getDeletedStatus() {
        return deletedStatus;
    }

    public String getSourcetype_name() {
        return Sourcetype_name;
    }

    public String getName() {
        return name;
    }

    public String getTargettype_name() {
        return Targettype_name;
    }

    public String getNumber() {
        return number;
    }

    public String getDr() {
        return dr;
    }
}
