package com.zhou.ghost.ui.bean;

import java.io.Serializable;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/10/19 16:40
 * @Description:
 */
public class PigFieldInfo implements Serializable {
    private String deletedStatus;
    private Object Rmark;
    private String Type;
    private String number;
    private Object Slwarehouse_name;
    private String id;
    private String Stockorg_name;
    private String Pigfarm_id;
    private String Grade;
    private String Sowcnt;
    private Object Sywarehouser_name;
    private String Pigfarm_name;
    private String name;
    private String Pigtype;
    private String dr;
    private String fq2pz;

    public String getFq2pz() {
        return fq2pz;
    }

    public void setFq2pz(String fq2pz) {
        this.fq2pz = fq2pz;
    }

    public String getDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(String deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public Object getRmark() {
        return Rmark;
    }

    public void setRmark(Object rmark) {
        Rmark = rmark;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Object getSlwarehouse_name() {
        return Slwarehouse_name;
    }

    public void setSlwarehouse_name(Object slwarehouse_name) {
        Slwarehouse_name = slwarehouse_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStockorg_name() {
        return Stockorg_name;
    }

    public void setStockorg_name(String stockorg_name) {
        Stockorg_name = stockorg_name;
    }

    public String getPigfarm_id() {
        return Pigfarm_id;
    }

    public void setPigfarm_id(String pigfarm_id) {
        Pigfarm_id = pigfarm_id;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public String getSowcnt() {
        return Sowcnt;
    }

    public void setSowcnt(String sowcnt) {
        Sowcnt = sowcnt;
    }

    public Object getSywarehouser_name() {
        return Sywarehouser_name;
    }

    public void setSywarehouser_name(Object sywarehouser_name) {
        Sywarehouser_name = sywarehouser_name;
    }

    public String getPigfarm_name() {
        return Pigfarm_name;
    }

    public void setPigfarm_name(String pigfarm_name) {
        Pigfarm_name = pigfarm_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPigtype() {
        return Pigtype;
    }

    public void setPigtype(String pigtype) {
        Pigtype = pigtype;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }
}
