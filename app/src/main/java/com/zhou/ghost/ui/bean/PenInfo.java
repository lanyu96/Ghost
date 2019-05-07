package com.zhou.ghost.ui.bean;

import java.io.Serializable;

/**
 * @Auther: zhou
 * @Date: 2018/10/24 11:16
 * @Description: 栋舍信息
 */
public class PenInfo implements Serializable {
    private String fartherorg_name;
    private String deletedStatus;
    private String xbstock_name;
    private String Rmark;
    private String Pgroup;
    private String number;
    private String levl;
    private String fartherorg_id;
    private String id;
    private String Sowcnt;
    private String name;
    private String Pigfarm_name;
    private String Ftgzzb;
    private String dr;
    private boolean isSelect = false;

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }

    public String getFartherorg_name() {
        return fartherorg_name;
    }

    public void setFartherorg_name(String fartherorg_name) {
        this.fartherorg_name = fartherorg_name;
    }

    public String getDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(String deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public String getXbstock_name() {
        return xbstock_name;
    }

    public void setXbstock_name(String xbstock_name) {
        this.xbstock_name = xbstock_name;
    }

    public String getRmark() {
        return Rmark;
    }

    public void setRmark(String rmark) {
        Rmark = rmark;
    }

    public String getPgroup() {
        return Pgroup;
    }

    public void setPgroup(String pgroup) {
        Pgroup = pgroup;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLevl() {
        return levl;
    }

    public void setLevl(String levl) {
        this.levl = levl;
    }

    public String getFartherorg_id() {
        return fartherorg_id;
    }

    public void setFartherorg_id(String fartherorg_id) {
        this.fartherorg_id = fartherorg_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSowcnt() {
        return Sowcnt;
    }

    public void setSowcnt(String sowcnt) {
        Sowcnt = sowcnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPigfarm_name() {
        return Pigfarm_name;
    }

    public void setPigfarm_name(String pigfarm_name) {
        Pigfarm_name = pigfarm_name;
    }

    public String getFtgzzb() {
        return Ftgzzb;
    }

    public void setFtgzzb(String ftgzzb) {
        Ftgzzb = ftgzzb;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }
}
