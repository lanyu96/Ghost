package com.zhou.ghost.ui.bean;

import java.io.Serializable;

/**
 * @Auther: zhou
 * @Date: 2018/10/24 17:41
 * @Description:
 */
public class BatchFile implements Serializable {
    private String field_name;
    private String createTime;
    private String pigVarieties_name;
    private String deletedStatus;
    private String batchStatus;
    private String creator_number;
    private String remark;
    private String lastUpdateTime;
    private String lastUpdateUser_name;
    private String enableTime;
    private String weakQty;
    private String id;
    private String allDeathQty;
    private String description;
    private String baseStatus;
    private String auditor_number;
    private String regnm_name;
    private String regnm_id;
    private String feeder_name;
    private String dr;
    private String handler_number;
    private String handler_name;
    private String pk_vtype_name;
    private String pk_vtype_number;
    private String pk_vtype_id;
    private String entrys_id;
    private String incnt;
    private String lastUpdateUser_number;
    private String batcheck;
    private String entrys_seq;
    private String number;
    private String field_id;
    private String pigfarm_name;
    private String disableTime;
    private String allSellQty;
    private String days;
    private String auditor_name;
    private String isSeedPig;
    private String genct;
    private String creator_name;
    private String Fivouchered;
    private String bizDate;
    private String allOutQty;
    private String costObject_name;
    private boolean isSelect;

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }

    public String getRegnm_id() {
        return regnm_id;
    }

    public void setRegnm_id(String regnm_id) {
        this.regnm_id = regnm_id;
    }

    public String getPk_vtype_number() {
        return pk_vtype_number;
    }

    public void setPk_vtype_number(String pk_vtype_number) {
        this.pk_vtype_number = pk_vtype_number;
    }

    public String getPk_vtype_id() {
        return pk_vtype_id;
    }

    public void setPk_vtype_id(String pk_vtype_id) {
        this.pk_vtype_id = pk_vtype_id;
    }

    public void setField_name(String field_name) {
        this.field_name = field_name;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setPigVarieties_name(String pigVarieties_name) {
        this.pigVarieties_name = pigVarieties_name;
    }

    public void setDeletedStatus(String deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
    }

    public void setCreator_number(String creator_number) {
        this.creator_number = creator_number;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setLastUpdateUser_name(String lastUpdateUser_name) {
        this.lastUpdateUser_name = lastUpdateUser_name;
    }

    public void setEnableTime(String enableTime) {
        this.enableTime = enableTime;
    }

    public void setWeakQty(String weakQty) {
        this.weakQty = weakQty;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAllDeathQty(String allDeathQty) {
        this.allDeathQty = allDeathQty;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBaseStatus(String baseStatus) {
        this.baseStatus = baseStatus;
    }

    public void setAuditor_number(String auditor_number) {
        this.auditor_number = auditor_number;
    }

    public void setRegnm_name(String regnm_name) {
        this.regnm_name = regnm_name;
    }

    public void setFeeder_name(String feeder_name) {
        this.feeder_name = feeder_name;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }

    public void setHandler_number(String handler_number) {
        this.handler_number = handler_number;
    }

    public void setHandler_name(String handler_name) {
        this.handler_name = handler_name;
    }

    public void setPk_vtype_name(String pk_vtype_name) {
        this.pk_vtype_name = pk_vtype_name;
    }

    public void setEntrys_id(String entrys_id) {
        this.entrys_id = entrys_id;
    }

    public void setIncnt(String incnt) {
        this.incnt = incnt;
    }

    public void setLastUpdateUser_number(String lastUpdateUser_number) {
        this.lastUpdateUser_number = lastUpdateUser_number;
    }

    public void setBatcheck(String batcheck) {
        this.batcheck = batcheck;
    }

    public void setEntrys_seq(String entrys_seq) {
        this.entrys_seq = entrys_seq;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setField_id(String field_id) {
        this.field_id = field_id;
    }

    public void setPigfarm_name(String pigfarm_name) {
        this.pigfarm_name = pigfarm_name;
    }

    public void setDisableTime(String disableTime) {
        this.disableTime = disableTime;
    }

    public void setAllSellQty(String allSellQty) {
        this.allSellQty = allSellQty;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public void setAuditor_name(String auditor_name) {
        this.auditor_name = auditor_name;
    }

    public void setIsSeedPig(String isSeedPig) {
        this.isSeedPig = isSeedPig;
    }

    public void setGenct(String genct) {
        this.genct = genct;
    }

    public void setCreator_name(String creator_name) {
        this.creator_name = creator_name;
    }

    public void setFivouchered(String Fivouchered) {
        this.Fivouchered = Fivouchered;
    }

    public void setBizDate(String bizDate) {
        this.bizDate = bizDate;
    }

    public void setAllOutQty(String allOutQty) {
        this.allOutQty = allOutQty;
    }

    public void setCostObject_name(String costObject_name) {
        this.costObject_name = costObject_name;
    }

    public String getField_name() {
        return field_name;
    }

    public String getCreateTime() {
        if (createTime == null) {
            return "";
        }
        return createTime.substring(0, 10);
    }

    public String getPigVarieties_name() {
        return pigVarieties_name;
    }

    public String getDeletedStatus() {
        return deletedStatus;
    }

    public String getBatchStatus() {
        return batchStatus;
    }

    public String getCreator_number() {
        return creator_number;
    }

    public String getRemark() {
        return remark;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public String getLastUpdateUser_name() {
        return lastUpdateUser_name;
    }

    public String getEnableTime() {
        return enableTime;
    }

    public String getWeakQty() {
        if (weakQty == null) {
            return "0";
        }
        return weakQty;
    }

    public String getId() {
        return id;
    }

    public String getAllDeathQty() {
        if (allDeathQty == null) {
            return "0";
        }
        return allDeathQty;
    }

    public String getDescription() {
        return description;
    }

    public String getBaseStatus() {
        return baseStatus;
    }

    public String getAuditor_number() {
        return auditor_number;
    }

    public String getRegnm_name() {
        return regnm_name;
    }

    public String getFeeder_name() {
        return feeder_name;
    }

    public String getDr() {
        return dr;
    }

    public String getHandler_number() {
        return handler_number;
    }

    public String getHandler_name() {
        return handler_name;
    }

    public String getPk_vtype_name() {
        return pk_vtype_name;
    }

    public String getEntrys_id() {
        return entrys_id;
    }

    public String getIncnt() {
        if (incnt == null) {
            return "0";
        }
        return incnt;
    }

    public String getLastUpdateUser_number() {
        return lastUpdateUser_number;
    }

    public String getBatcheck() {
        return batcheck;
    }

    public String getEntrys_seq() {
        return entrys_seq;
    }

    public String getNumber() {
        return number;
    }

    public String getField_id() {
        return field_id;
    }

    public String getPigfarm_name() {
        return pigfarm_name;
    }

    public String getDisableTime() {
        return disableTime;
    }

    public String getAllSellQty() {
        if (allSellQty == null) {
            return "0";
        }
        return allSellQty;
    }

    public String getDays() {
        if(days!=null&&days.contains(".")){
            return days.split("\\.")[0];
        }
        return days;
    }

    public String getAuditor_name() {
        return auditor_name;
    }

    public String getIsSeedPig() {
        return isSeedPig;
    }

    public String getGenct() {
        if (genct == null) {
            return "0";
        }
        return genct;
    }

    public String getCreator_name() {
        return creator_name;
    }

    public String getFivouchered() {
        return Fivouchered;
    }

    public String getBizDate() {
        if (bizDate != null) {
            return bizDate.substring(0, 10);
        } else {
            return "";
        }
    }

    public String getAllOutQty() {
        if (allOutQty == null) {
            return "0";
        }
        return allOutQty;
    }

    public String getCostObject_name() {
        return costObject_name;
    }
}
