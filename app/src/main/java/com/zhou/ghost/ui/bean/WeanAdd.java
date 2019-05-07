package com.zhou.ghost.ui.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: zhou
 * @Date: 2018/11/30 13:04
 * @Description:
 */
public class WeanAdd implements Serializable {
    private String iskfc;
    private ZrFieldBean zrField;
    private String createTime;
    private String Wncnt;
    private String WeaningDate;
    private String isAllot;
    /**
     * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
     */

    private CUBean CU;
    private String lastUpdateTime;
    /**
     * id : H4oAAAEqZqO4/eJt
     */

    private PigFarmBean pigFarm;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private LastUpdateUserBean lastUpdateUser;
    private String number;
    /**
     * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
     */

    private StorageOrgBean storageOrg;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private CreatorBean creator;
    /**
     * id : H4oAAAEqZzqdu1vk
     */

    private FieldBean field;
    /**
     * id : H4oAAAEqic8q0/c9
     */

    private FeederBean Feeder;
    private String id;
    private String Outday;
    /**
     * alias : 保存
     * value : 1
     */

    private BaseStatusBean baseStatus;
    private String Avgwt;
    private String Fivouchered;
    private String Weawt;
    private String bizDate;
    private String hasEffected;
    /**
     * alias : 未删
     * value : 0
     */

    private DrBean dr;
    private String rmark;

    public String getIsAllot() {
        return isAllot;
    }

    public void setIsAllot(String isAllot) {
        this.isAllot = isAllot;
    }

    public String getRmark() {
        return rmark;
    }

    public void setRmark(String rmark) {
        this.rmark = rmark;
    }

    public ZrFieldBean getZrField() {
        return zrField;
    }

    public void setZrField(ZrFieldBean zrField) {
        this.zrField = zrField;
    }

    /**
     * createTime : 2018-03-19 16:30:19
     * DetailedEntry : []
     * lastUpdateTime : 2018-03-19 16:31:19
     * lastUpdateUser : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * entrys : []
     * storageOrg : {"id":"bG9XO093SUyR1HcJ1HpOFcznrtQ="}
     * MPK_pigfen : {"id":"H4oAAAEqickt8Ui3"}
     * creator : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * id : H4oAAAEruonY0k8K
     * Outday : 196
     * batchParent : {"id":"H4oAAAEruogma9um"}
     * baseStatus : {"alias":"保存","value":"1"}
     * birthdate : 2017-09-04 00:00:04
     * Inpen : {"id":"H4oAAAEqicgt8Ui3"}
     * hasEffected : false
     * dr : {"alias":"未删","value":"0"}
     * Wncnt : 10
     * CU : {"id":"bG9XO093SUyR1HcJ1HpOFcznrtQ="}
     * birthParit : 1
     * pigFarm : {"id":"H4oAAAEqZqO4/eJt"}
     * sourceBillId : H4oAAAEqjgw9MGsB
     * number : DNJL2018031900031
     * Sowno : {"id":"4a05v0x2TWmmiZaR+BYG5UVA25s="}
     * field : {"id":"H4oAAAEqZzqdu1vk"}
     * batch : {"id":"H4oAAAEqjf38qPq9"}
     * column : 0
     * Avgwt : 33
     * Fivouchered : false
     * isKfc : true
     * Weawt : 330
     * bizDate : 2018-03-19 16:30:19
     * pigCompany : {"id":"bG9XO093SUyR1HcJ1HpOFcznrtQ="}
     * oldColumn : 0
     */

    private List<RecordEntriesBean> recordEntries;

    public void setIskfc(String iskfc) {
        if ("是".equals(iskfc)) {
            this.iskfc = "true";
        } else {
            this.iskfc = "false";
        }
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setWncnt(String Wncnt) {
        this.Wncnt = Wncnt;
    }

    public void setWeaningDate(String WeaningDate) {
        this.WeaningDate = WeaningDate;
    }

    public void setCU(CUBean CU) {
        this.CU = CU;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setPigFarm(PigFarmBean pigFarm) {
        this.pigFarm = pigFarm;
    }

    public void setLastUpdateUser(LastUpdateUserBean lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setStorageOrg(StorageOrgBean storageOrg) {
        this.storageOrg = storageOrg;
    }

    public void setCreator(CreatorBean creator) {
        this.creator = creator;
    }

    public void setField(FieldBean field) {
        this.field = field;
    }

    public void setFeeder(FeederBean Feeder) {
        this.Feeder = Feeder;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOutday(String Outday) {
        this.Outday = Outday;
    }

    public void setBaseStatus(BaseStatusBean baseStatus) {
        this.baseStatus = baseStatus;
    }

    public void setAvgwt(String Avgwt) {
        this.Avgwt = Avgwt;
    }

    public void setFivouchered(String Fivouchered) {
        this.Fivouchered = Fivouchered;
    }

    public void setWeawt(String Weawt) {
        this.Weawt = Weawt;
    }

    public void setBizDate(String bizDate) {
        this.bizDate = bizDate;
    }

    public void setHasEffected(String hasEffected) {
        this.hasEffected = hasEffected;
    }

    public void setDr(DrBean dr) {
        this.dr = dr;
    }

    public void setRecordEntries(List<RecordEntriesBean> recordEntries) {
        this.recordEntries = recordEntries;
    }

    public String getIskfc() {
        return iskfc;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getWncnt() {
        return Wncnt;
    }

    public String getWeaningDate() {
        return WeaningDate;
    }

    public CUBean getCU() {
        return CU;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public PigFarmBean getPigFarm() {
        return pigFarm;
    }

    public LastUpdateUserBean getLastUpdateUser() {
        return lastUpdateUser;
    }

    public String getNumber() {
        return number;
    }

    public StorageOrgBean getStorageOrg() {
        return storageOrg;
    }

    public CreatorBean getCreator() {
        return creator;
    }

    public FieldBean getField() {
        return field;
    }

    public FeederBean getFeeder() {
        return Feeder;
    }

    public String getId() {
        return id;
    }

    public String getOutday() {
        return Outday;
    }

    public BaseStatusBean getBaseStatus() {
        return baseStatus;
    }

    public String getAvgwt() {
        return Avgwt;
    }

    public String getFivouchered() {
        return Fivouchered;
    }

    public String getWeawt() {
        return Weawt;
    }

    public String getBizDate() {
        return bizDate;
    }

    public String getHasEffected() {
        return hasEffected;
    }

    public DrBean getDr() {
        return dr;
    }

    public List<RecordEntriesBean> getRecordEntries() {
        return recordEntries;
    }

    public static class ZrFieldBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class CUBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class PigFarmBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class LastUpdateUserBean {
        private String id;
        private String number;

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class StorageOrgBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class CreatorBean {
        private String id;
        private String number;

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class FieldBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class FeederBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class BaseStatusBean {
        private String alias;
        private String value;

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getAlias() {
            return alias;
        }

        public String getValue() {
            return value;
        }
    }

    public static class DrBean {
        private String alias;
        private String value;

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getAlias() {
            return alias;
        }

        public String getValue() {
            return value;
        }
    }

    public static class RecordEntriesBean {
        private String createTime;
        private String lastUpdateTime;
        /**
         * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
         */

        private LastUpdateUserBean lastUpdateUser;
        /**
         * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
         */

        private StorageOrgBean storageOrg;
        /**
         * id : H4oAAAEqickt8Ui3
         */

        private MPKPigfenBean MPK_pigfen;
        /**
         * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
         */

        private CreatorBean creator;
        private String id;
        private String Outday;
        /**
         * id : H4oAAAEruogma9um
         */

        private BatchParentBean batchParent;
        /**
         * alias : 保存
         * value : 1
         */

        private BaseStatusBean baseStatus;
        private String birthdate;
        /**
         * id : H4oAAAEqicgt8Ui3
         */

        private InpenBean Inpen;
        private String hasEffected;
        /**
         * alias : 未删
         * value : 0
         */

        private DrBean dr;
        private String Wncnt;
        /**
         * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
         */

        private CUBean CU;
        private String birthParit;
        /**
         * id : H4oAAAEqZqO4/eJt
         */

        private PigFarmBean pigFarm;
        private String sourceBillId;
        private String number;
        /**
         * id : 4a05v0x2TWmmiZaR+BYG5UVA25s=
         */

        private SownoBean Sowno;
        /**
         * id : H4oAAAEqZzqdu1vk
         */

        private FieldBean field;
        /**
         * id : H4oAAAEqjf38qPq9
         */
        private ZrFieldBean zrField;

        private BatchBean batch;
        private String column;
        private String Avgwt;
        private String Fivouchered;
        private String isKfc;
        private String Weawt;
        private String bizDate;
        /**
         * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
         */

        private PigCompanyBean pigCompany;
        private String oldColumn;
        private List<?> DetailedEntry;
        private List<?> entrys;
        private String rmark;

        public String getRmark() {
            return rmark;
        }

        public void setRmark(String rmark) {
            this.rmark = rmark;
        }

        public ZrFieldBean getZrField() {
            return zrField;
        }

        public void setZrField(ZrFieldBean zrField) {
            this.zrField = zrField;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public void setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
        }

        public void setLastUpdateUser(LastUpdateUserBean lastUpdateUser) {
            this.lastUpdateUser = lastUpdateUser;
        }

        public void setStorageOrg(StorageOrgBean storageOrg) {
            this.storageOrg = storageOrg;
        }

        public void setMPK_pigfen(MPKPigfenBean MPK_pigfen) {
            this.MPK_pigfen = MPK_pigfen;
        }

        public void setCreator(CreatorBean creator) {
            this.creator = creator;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setOutday(String Outday) {
            this.Outday = Outday;
        }

        public void setBatchParent(BatchParentBean batchParent) {
            this.batchParent = batchParent;
        }

        public void setBaseStatus(BaseStatusBean baseStatus) {
            this.baseStatus = baseStatus;
        }

        public void setBirthdate(String birthdate) {
            this.birthdate = birthdate;
        }

        public void setInpen(InpenBean Inpen) {
            this.Inpen = Inpen;
        }

        public void setHasEffected(String hasEffected) {
            this.hasEffected = hasEffected;
        }

        public void setDr(DrBean dr) {
            this.dr = dr;
        }

        public void setWncnt(String Wncnt) {
            this.Wncnt = Wncnt;
        }

        public void setCU(CUBean CU) {
            this.CU = CU;
        }

        public void setBirthParit(String birthParit) {
            this.birthParit = birthParit;
        }

        public void setPigFarm(PigFarmBean pigFarm) {
            this.pigFarm = pigFarm;
        }

        public void setSourceBillId(String sourceBillId) {
            this.sourceBillId = sourceBillId;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public void setSowno(SownoBean Sowno) {
            this.Sowno = Sowno;
        }

        public void setField(FieldBean field) {
            this.field = field;
        }

        public void setBatch(BatchBean batch) {
            this.batch = batch;
        }

        public void setColumn(String column) {
            this.column = column;
        }

        public void setAvgwt(String Avgwt) {
            this.Avgwt = Avgwt;
        }

        public void setFivouchered(String Fivouchered) {
            this.Fivouchered = Fivouchered;
        }

        public void setIsKfc(String isKfc) {
            if ("是".equals(isKfc)) {
                this.isKfc = "true";
            } else {
                this.isKfc = "false";
            }
        }

        public void setWeawt(String Weawt) {
            this.Weawt = Weawt;
        }

        public void setBizDate(String bizDate) {
            this.bizDate = bizDate;
        }

        public void setPigCompany(PigCompanyBean pigCompany) {
            this.pigCompany = pigCompany;
        }

        public void setOldColumn(String oldColumn) {
            this.oldColumn = oldColumn;
        }

        public void setDetailedEntry(List<?> DetailedEntry) {
            this.DetailedEntry = DetailedEntry;
        }

        public void setEntrys(List<?> entrys) {
            this.entrys = entrys;
        }

        public String getCreateTime() {
            return createTime;
        }

        public String getLastUpdateTime() {
            return lastUpdateTime;
        }

        public LastUpdateUserBean getLastUpdateUser() {
            return lastUpdateUser;
        }

        public StorageOrgBean getStorageOrg() {
            return storageOrg;
        }

        public MPKPigfenBean getMPK_pigfen() {
            return MPK_pigfen;
        }

        public CreatorBean getCreator() {
            return creator;
        }

        public String getId() {
            return id;
        }

        public String getOutday() {
            return Outday;
        }

        public BatchParentBean getBatchParent() {
            return batchParent;
        }

        public BaseStatusBean getBaseStatus() {
            return baseStatus;
        }

        public String getBirthdate() {
            return birthdate;
        }

        public InpenBean getInpen() {
            return Inpen;
        }

        public String getHasEffected() {
            return hasEffected;
        }

        public DrBean getDr() {
            return dr;
        }

        public String getWncnt() {
            return Wncnt;
        }

        public CUBean getCU() {
            return CU;
        }

        public String getBirthParit() {
            return birthParit;
        }

        public PigFarmBean getPigFarm() {
            return pigFarm;
        }

        public String getSourceBillId() {
            return sourceBillId;
        }

        public String getNumber() {
            return number;
        }

        public SownoBean getSowno() {
            return Sowno;
        }

        public FieldBean getField() {
            return field;
        }

        public BatchBean getBatch() {
            return batch;
        }

        public String getColumn() {
            return column;
        }

        public String getAvgwt() {
            return Avgwt;
        }

        public String getFivouchered() {
            return Fivouchered;
        }

        public String getIsKfc() {
            return isKfc;
        }

        public String getWeawt() {
            return Weawt;
        }

        public String getBizDate() {
            return bizDate;
        }

        public PigCompanyBean getPigCompany() {
            return pigCompany;
        }

        public String getOldColumn() {
            return oldColumn;
        }

        public List<?> getDetailedEntry() {
            return DetailedEntry;
        }

        public List<?> getEntrys() {
            return entrys;
        }

        public static class LastUpdateUserBean {
            private String id;
            private String number;

            public String getNumber() {
                return number;
            }

            public void setNumber(String number) {
                this.number = number;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class StorageOrgBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class MPKPigfenBean {
            private String id;
            private String name;
            private String number;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNumber() {
                return number;
            }

            public void setNumber(String number) {
                this.number = number;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class CreatorBean {
            private String id;
            private String number;

            public String getNumber() {
                return number;
            }

            public void setNumber(String number) {
                this.number = number;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class BatchParentBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class BaseStatusBean {
            private String alias;
            private String value;

            public void setAlias(String alias) {
                this.alias = alias;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public String getAlias() {
                return alias;
            }

            public String getValue() {
                return value;
            }
        }

        public static class InpenBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class DrBean {
            private String alias;
            private String value;

            public void setAlias(String alias) {
                this.alias = alias;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public String getAlias() {
                return alias;
            }

            public String getValue() {
                return value;
            }
        }

        public static class CUBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class PigFarmBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class SownoBean {
            private String id;
            private String number;
            private String state;

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getNumber() {
                return number;
            }

            public void setNumber(String number) {
                this.number = number;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class FieldBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class ZrFieldBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class BatchBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class PigCompanyBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

    }
    public static WeanAdd getNewBean(){
        WeanAdd bean = new WeanAdd();
        bean.setZrField(new ZrFieldBean());
        bean.setStorageOrg(new StorageOrgBean());
        bean.setPigFarm(new PigFarmBean());
        bean.setLastUpdateUser(new LastUpdateUserBean());
        bean.setField(new FieldBean());
        bean.setFeeder(new FeederBean());

        bean.setCU(new CUBean());
        bean.setCreator(new CreatorBean());
        bean.setBaseStatus(new BaseStatusBean());
        return bean;
    }
    public static RecordEntriesBean getNewEntry() {
        RecordEntriesBean bean = new RecordEntriesBean();
        bean.setBaseStatus(new RecordEntriesBean.BaseStatusBean());
        bean.setZrField(new RecordEntriesBean.ZrFieldBean());
        bean.setStorageOrg(new RecordEntriesBean.StorageOrgBean());
        bean.setPigFarm(new RecordEntriesBean.PigFarmBean());
        bean.setPigCompany(new RecordEntriesBean.PigCompanyBean());
        bean.setSowno(new RecordEntriesBean.SownoBean());
        bean.setMPK_pigfen(new RecordEntriesBean.MPKPigfenBean());
        bean.setLastUpdateUser(new RecordEntriesBean.LastUpdateUserBean());
        bean.setInpen(new RecordEntriesBean.InpenBean());
        bean.setField(new RecordEntriesBean.FieldBean());

        bean.setCU(new RecordEntriesBean.CUBean());
        bean.setCreator(new RecordEntriesBean.CreatorBean());
        return bean;
    }
}
