package com.zhou.ghost.ui.bean;

/**
 * @Auther: zhou
 * @Date: 2018/11/12 16:51
 * @Description:
 */
public class EstrusRecord extends BaseRecord{
    private String Entries_essec0;
    private String createTime;
    private String Entries_pk_pigfen_name;
    private String creator_number;
    private String Entries_seq;
    private String lastUpdateTime;
    private String Entries_escn;
    private String lastUpdateUser_name;

    private String Entries_esthr0;
    private String Entries_esfrt0;
    private String Entries_canBreed;
    private String description;

    private String auditor_number;
    private String bthno_number;
    private String dr;
    private String handler_number;
    private String handler_name;
    private String rmark;
    private String lastUpdateUser_number;
    private String number;
    private String Entries_borno_id;
    private String Entries_borno_number;
    private String Entries_batch_number;
    private String auditor_name;
    private String creator_name;
    private String Fivouchered;
    private String bizDate;

    private String pk_state_name;

    private boolean isSelect;
    private String count;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getEntries_borno_id() {
        return Entries_borno_id;
    }

    public void setEntries_borno_id(String entries_borno_id) {
        Entries_borno_id = entries_borno_id;
    }

    public String getPk_state_name() {
        return pk_state_name;
    }

    public void setPk_state_name(String pk_state_name) {
        this.pk_state_name = pk_state_name;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }

    public void setEntries_essec0(String Entries_essec0) {
        this.Entries_essec0 = Entries_essec0;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setEntries_pk_pigfen_name(String Entries_pk_pigfen_name) {
        this.Entries_pk_pigfen_name = Entries_pk_pigfen_name;
    }

    public void setCreator_number(String creator_number) {
        this.creator_number = creator_number;
    }

    public void setEntries_seq(String Entries_seq) {
        this.Entries_seq = Entries_seq;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setEntries_escn(String Entries_escn) {
        this.Entries_escn = Entries_escn;
    }

    public void setLastUpdateUser_name(String lastUpdateUser_name) {
        this.lastUpdateUser_name = lastUpdateUser_name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEntries_esthr0(String Entries_esthr0) {
        this.Entries_esthr0 = Entries_esthr0;
    }

    public void setEntries_esfrt0(String Entries_esfrt0) {
        this.Entries_esfrt0 = Entries_esfrt0;
    }

    public void setEntries_canBreed(String Entries_canBreed) {
        this.Entries_canBreed = Entries_canBreed;
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

    public void setBthno_number(String bthno_number) {
        this.bthno_number = bthno_number;
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

    public void setRmark(String rmark) {
        this.rmark = rmark;
    }

    public void setLastUpdateUser_number(String lastUpdateUser_number) {
        this.lastUpdateUser_number = lastUpdateUser_number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setEntries_borno_number(String Entries_borno_number) {
        this.Entries_borno_number = Entries_borno_number;
    }

    public void setEntries_batch_number(String Entries_batch_number) {
        this.Entries_batch_number = Entries_batch_number;
    }

    public void setAuditor_name(String auditor_name) {
        this.auditor_name = auditor_name;
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

    public String getEntries_essec0() {
        if (Entries_essec0 == null) {
            return "";
        }
        return Entries_essec0.substring(0, 10);
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getEntries_pk_pigfen_name() {
        return Entries_pk_pigfen_name;
    }

    public String getCreator_number() {
        return creator_number;
    }

    public String getEntries_seq() {
        return Entries_seq;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public String getEntries_escn() {
        return Entries_escn;
    }

    public String getLastUpdateUser_name() {
        return lastUpdateUser_name;
    }

    public String getId() {
        return id;
    }

    public String getEntries_esthr0() {
        if (Entries_esthr0 == null) {
            return "";
        }
        return Entries_esthr0.substring(0, 10);
    }

    public String getEntries_esfrt0() {
        if (Entries_esfrt0 == null) {
            return "";
        }
        return Entries_esfrt0.substring(0, 10);
    }

    public String getEntries_canBreed() {
        if (Entries_canBreed != null && Entries_canBreed.equals("true")) {
            return "是";
        }
        return "否";
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

    public String getBthno_number() {
        return bthno_number;
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

    public String getRmark() {
        return rmark;
    }

    public String getLastUpdateUser_number() {
        return lastUpdateUser_number;
    }

    public String getNumber() {
        return number;
    }

    public String getEntries_borno_number() {
        return Entries_borno_number;
    }

    public String getEntries_batch_number() {
        return Entries_batch_number;
    }

    public String getAuditor_name() {
        return auditor_name;
    }

    public String getCreator_name() {
        return creator_name;
    }

    public String getFivouchered() {
        return Fivouchered;
    }

    public String getBizDate() {
        if (bizDate == null) {
            return "";
        }
        return bizDate.substring(0, 10);
    }
}
