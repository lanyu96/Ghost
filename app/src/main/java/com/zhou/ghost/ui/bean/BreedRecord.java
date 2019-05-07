package com.zhou.ghost.ui.bean;

/**
 * @Auther: zhou
 * @Date: 2018/11/8 15:51
 * @Description:
 */
public class BreedRecord extends BaseRecord{
    private String field_name;
    private String createTime;
    private String tgapm;
    private String xbatchId;
    private String creator_number;
    private String remark;
    private String lastUpdateTime;
    private String score;
    private String lastUpdateUser_name;

    private String boarIndno;
    private String servicetype;
    private String description;

    private String auditor_number;
    private String borno_number;
    private String feeder_name;
    private String batchParent_number;
    private String dr;
    private String handler_number;
    private String handler_name;
    private String batch_number;
    private String avefemale;
    private String tgsup;
    private String pk_pigfen_name;
    private String servicecurpt;
    private String childBirthDate;
    private String actor_name;
    private String lastUpdateUser_number;
    private String batchParent_id;
    private String pigFarm_name;
    private String number;
    private String newPk_pigfen_name;
    private String borno2_number;
    private String batch_id;
    private String sowno_number;
    private String auditor_name;
    private String ishbmale;
    private String column;
    private String temp;
    private String creator_name;
    private String Fivouchered;
    private String bizDate;
    private String qingqi;
    private String oldColumn;
    private String pzType;
    private String testborno;
    private String isPo;
    private String jyly;
    private String pk_state_name;
    private boolean isSelect;

    public String getJyly() {
        return jyly;
    }

    public void setJyly(String jyly) {
        this.jyly = jyly;
    }

    public String getPk_state_name() {
        return pk_state_name;
    }

    public void setPk_state_name(String pk_state_name) {
        this.pk_state_name = pk_state_name;
    }

    public String getIsPo() {
        if("true".equals(isPo)){
            return "是";
        }else{
            return "否";
        }
    }

    public void setIsPo(String isPo) {
        if("是".equals(isPo)){
            this.isPo = "true";
        }else{
            this.isPo = "false";
        }
        this.isPo = isPo;
    }

    public String getTestborno() {
        return testborno;
    }

    public void setTestborno(String testborno) {
        this.testborno = testborno;
    }

    public String getPzType() {
        return pzType;
    }

    public void setPzType(String pzType) {
        this.pzType = pzType;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }


    public void setField_name(String field_name) {
        this.field_name = field_name;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setTgapm(String tgapm) {
        this.tgapm = tgapm;
    }

    public void setXbatchId(String xbatchId) {
        this.xbatchId = xbatchId;
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

    public void setScore(String score) {
        this.score = score;
    }

    public void setLastUpdateUser_name(String lastUpdateUser_name) {
        this.lastUpdateUser_name = lastUpdateUser_name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBoarIndno(String boarIndno) {
        this.boarIndno = boarIndno;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype;
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

    public void setBorno_number(String borno_number) {
        this.borno_number = borno_number;
    }

    public void setFeeder_name(String feeder_name) {
        this.feeder_name = feeder_name;
    }

    public void setBatchParent_number(String batchParent_number) {
        this.batchParent_number = batchParent_number;
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

    public void setBatch_number(String batch_number) {
        this.batch_number = batch_number;
    }

    public void setAvefemale(String avefemale) {
        this.avefemale = avefemale;
    }

    public void setTgsup(String tgsup) {
        this.tgsup = tgsup;
    }

    public void setPk_pigfen_name(String pk_pigfen_name) {
        this.pk_pigfen_name = pk_pigfen_name;
    }

    public void setServicecurpt(String servicecurpt) {
        this.servicecurpt = servicecurpt;
    }

    public void setChildBirthDate(String childBirthDate) {
        this.childBirthDate = childBirthDate;
    }

    public void setActor_name(String actor_name) {
        this.actor_name = actor_name;
    }

    public void setLastUpdateUser_number(String lastUpdateUser_number) {
        this.lastUpdateUser_number = lastUpdateUser_number;
    }

    public void setBatchParent_id(String batchParent_id) {
        this.batchParent_id = batchParent_id;
    }

    public void setPigFarm_name(String pigFarm_name) {
        this.pigFarm_name = pigFarm_name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setNewPk_pigfen_name(String newPk_pigfen_name) {
        this.newPk_pigfen_name = newPk_pigfen_name;
    }

    public void setBorno2_number(String borno2_number) {
        this.borno2_number = borno2_number;
    }

    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

    public void setSowno_number(String sowno_number) {
        this.sowno_number = sowno_number;
    }

    public void setAuditor_name(String auditor_name) {
        this.auditor_name = auditor_name;
    }

    public void setIshbmale(String ishbmale) {
        this.ishbmale = ishbmale;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public void setTemp(String temp) {
        this.temp = temp;
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

    public void setQingqi(String qingqi) {
        this.qingqi = qingqi;
    }

    public void setOldColumn(String oldColumn) {
        this.oldColumn = oldColumn;
    }

    public String getField_name() {
        return field_name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getTgapm() {
        return tgapm;
    }

    public String getXbatchId() {
        return xbatchId;
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

    public String getScore() {
        return score;
    }

    public String getLastUpdateUser_name() {
        return lastUpdateUser_name;
    }

    public String getId() {
        return id;
    }

    public String getBoarIndno() {
        return boarIndno;
    }

    public String getServicetype() {
        return servicetype;
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

    public String getBorno_number() {
        return borno_number;
    }

    public String getFeeder_name() {
        return feeder_name;
    }

    public String getBatchParent_number() {
        return batchParent_number;
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

    public String getBatch_number() {
        return batch_number;
    }

    public String getAvefemale() {
        return avefemale;
    }

    public String getTgsup() {
        if("true".equals(tgsup)){
            return "是";
        }else{
            return "否";
        }
    }

    public String getPk_pigfen_name() {
        return pk_pigfen_name;
    }

    public String getServicecurpt() {
        return servicecurpt;
    }

    public String getChildBirthDate() {
        if(childBirthDate==null){
            return "";
        }
        return childBirthDate.substring(0,10);
    }

    public String getActor_name() {
        return actor_name;
    }

    public String getLastUpdateUser_number() {
        return lastUpdateUser_number;
    }

    public String getBatchParent_id() {
        return batchParent_id;
    }

    public String getPigFarm_name() {
        return pigFarm_name;
    }

    public String getNumber() {
        return number;
    }

    public String getNewPk_pigfen_name() {
        return newPk_pigfen_name;
    }

    public String getBorno2_number() {
        return borno2_number;
    }

    public String getBatch_id() {
        return batch_id;
    }

    public String getSowno_number() {
        return sowno_number;
    }

    public String getAuditor_name() {
        return auditor_name;
    }

    public String getIshbmale() {
        if("true".equals(tgsup)){
            return "是";
        }else{
            return "否";
        }
    }

    public String getColumn() {
        return column;
    }

    public String getTemp() {
        return temp;
    }

    public String getCreator_name() {
        return creator_name;
    }

    public String getFivouchered() {
        return Fivouchered;
    }

    public String getBizDate() {
        if(bizDate==null){
            return "";
        }
        return bizDate.substring(0,10);
    }

    public String getQingqi() {
        return qingqi;
    }

    public String getOldColumn() {
        return oldColumn;
    }
}
