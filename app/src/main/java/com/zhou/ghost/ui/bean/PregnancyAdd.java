package com.zhou.ghost.ui.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/11/28 13:50
 * @Description:
 */
public class PregnancyAdd implements Serializable {
    private String createTime;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private AuditorBean auditor;
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
    private String id;
    /**
     * id : H4oAAAEqZzqdu1vk
     */

    private FieldBean field;
    private String auditTime;
    /**
     * alias : 审核
     * value : 4
     */

    private BaseStatusBean baseStatus;
    /**
     * id : H4oAAAEqic7V7Otk
     */

    private BreederBean breeder;
    /**
     * alias : B超
     * value : b
     */

    private TulnmBean tulnm;
    private String Fivouchered;
    private String bizDate;
    private String hasEffected;
    /**
     * alias : 未删
     * value : 0
     */

    private DrBean dr;
    /**
     * createTime : 2018-02-26 15:26:26
     * auditor : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * lastUpdateTime : 2018-02-26 15:29:26
     * lastUpdateUser : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * storageOrg : {"id":"bG9XO093SUyR1HcJ1HpOFcznrtQ="}
     * sowno : {"id":"FXyT4l/WSryD/5ino8Ds10VA25s="}
     * creator : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * id : H4oAAAEqii6Ws8/M
     * pregDays : 28
     * batchParent : {"id":"H4oAAAEqii0tPa5o"}
     * auditTime : 2018-02-26 15:29:26
     * parit : 0
     * baseStatus : {"alias":"审核","value":"4"}
     * borno : {"id":"XZUXbxQDSPecDigX6YdmjUVA25s="}
     * tulnm : {"alias":"B超","value":"b"}
     * hasEffected : false
     * BreedingDate : 2017-01-31 00:00:31
     * dr : {"alias":"未删","value":"0"}
     * CU : {"id":"bG9XO093SUyR1HcJ1HpOFcznrtQ="}
     * pigFarm : {"id":"H4oAAAEqZqO4/eJt"}
     * number : RJJL2017022800011
     * sourceBillId : H4oAAAEqiiNF1vAT
     * field : {"id":"H4oAAAEqZzqdu1vk"}
     * breeder : {"id":"H4oAAAEqic7V7Otk"}
     * Fivouchered : false
     * bizDate : 2017-02-28 00:00:28
     * pigCompany : {"id":"bG9XO093SUyR1HcJ1HpOFcznrtQ="}
     * abort : {"id":"H4oAAAEi2R649BGJ"}
     */
    public static RecordEntriesBean getNewEntry() {
        RecordEntriesBean bean = new RecordEntriesBean();
        bean.setAbort(new RecordEntriesBean.AbortBean());
        bean.setAuditor(new RecordEntriesBean.AuditorBean());
        bean.setBaseStatus(new RecordEntriesBean.BaseStatusBean());
        bean.setBatchParent(new RecordEntriesBean.BatchParentBean());
        bean.setBorno(new RecordEntriesBean.BornoBean());
        bean.setBreeder(new RecordEntriesBean.BreederBean());
        bean.setCreator(new RecordEntriesBean.CreatorBean());
        bean.setCU(new RecordEntriesBean.CUBean());
        bean.setField(new RecordEntriesBean.FieldBean());
        bean.setLastUpdateUser(new RecordEntriesBean.LastUpdateUserBean());
        bean.setTulnm(new RecordEntriesBean.TulnmBean());
        bean.setStorageOrg(new RecordEntriesBean.StorageOrgBean());
        bean.setSowno(new RecordEntriesBean.SownoBean());
        bean.setPigFarm(new RecordEntriesBean.PigFarmBean());
        bean.setPigCompany(new RecordEntriesBean.PigCompanyBean());
        bean.setDr(new RecordEntriesBean.DrBean());

        return bean;
    }

    private List<RecordEntriesBean> recordEntries;

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setAuditor(AuditorBean auditor) {
        this.auditor = auditor;
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

    public void setId(String id) {
        this.id = id;
    }

    public void setField(FieldBean field) {
        this.field = field;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    public void setBaseStatus(BaseStatusBean baseStatus) {
        this.baseStatus = baseStatus;
    }

    public void setBreeder(BreederBean breeder) {
        this.breeder = breeder;
    }

    public void setTulnm(TulnmBean tulnm) {
        this.tulnm = tulnm;
    }

    public void setFivouchered(String Fivouchered) {
        this.Fivouchered = Fivouchered;
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

    public String getCreateTime() {
        return createTime;
    }

    public AuditorBean getAuditor() {
        return auditor;
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

    public String getId() {
        return id;
    }

    public FieldBean getField() {
        return field;
    }

    public String getAuditTime() {
        return auditTime;
    }

    public BaseStatusBean getBaseStatus() {
        return baseStatus;
    }

    public BreederBean getBreeder() {
        return breeder;
    }

    public TulnmBean getTulnm() {
        return tulnm;
    }

    public String getFivouchered() {
        return Fivouchered;
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



    public static class AuditorBean {
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

    public static class BreederBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class TulnmBean {
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
        /**
         * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
         */

        private AuditorBean auditor;
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
         * id : FXyT4l/WSryD/5ino8Ds10VA25s=
         */

        private SownoBean sowno;
        /**
         * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
         */

        private CreatorBean creator;
        private String id;
        private String pregDays;
        /**
         * id : H4oAAAEqii0tPa5o
         */

        private BatchParentBean batchParent;
        private String auditTime;
        private String parit;
        /**
         * alias : 审核
         * value : 4
         */

        private BaseStatusBean baseStatus;
        /**
         * id : XZUXbxQDSPecDigX6YdmjUVA25s=
         */

        private BornoBean borno;
        /**
         * alias : B超
         * value : b
         */

        private TulnmBean tulnm;
        private String hasEffected;
        private String BreedingDate;
        /**
         * alias : 未删
         * value : 0
         */

        private DrBean dr;
        /**
         * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
         */

        private CUBean CU;
        /**
         * id : H4oAAAEqZqO4/eJt
         */

        private PigFarmBean pigFarm;
        private String number;
        private String sourceBillId;
        /**
         * id : H4oAAAEqZzqdu1vk
         */

        private FieldBean field;
        /**
         * id : H4oAAAEqic7V7Otk
         */

        private BreederBean breeder;
        private String Fivouchered;
        private String bizDate;
        /**
         * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
         */

        private PigCompanyBean pigCompany;
        /**
         * id : H4oAAAEi2R649BGJ
         */

        private AbortBean abort;

        private String rmark;

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public void setAuditor(AuditorBean auditor) {
            this.auditor = auditor;
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

        public void setSowno(SownoBean sowno) {
            this.sowno = sowno;
        }

        public void setCreator(CreatorBean creator) {
            this.creator = creator;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setPregDays(String pregDays) {
            this.pregDays = pregDays;
        }

        public void setBatchParent(BatchParentBean batchParent) {
            this.batchParent = batchParent;
        }

        public void setAuditTime(String auditTime) {
            this.auditTime = auditTime;
        }

        public void setParit(String parit) {
            this.parit = parit;
        }

        public void setBaseStatus(BaseStatusBean baseStatus) {
            this.baseStatus = baseStatus;
        }

        public void setBorno(BornoBean borno) {
            this.borno = borno;
        }

        public void setTulnm(TulnmBean tulnm) {
            this.tulnm = tulnm;
        }

        public void setHasEffected(String hasEffected) {
            this.hasEffected = hasEffected;
        }

        public void setBreedingDate(String BreedingDate) {
            this.BreedingDate = BreedingDate;
        }

        public void setDr(DrBean dr) {
            this.dr = dr;
        }

        public void setCU(CUBean CU) {
            this.CU = CU;
        }

        public void setPigFarm(PigFarmBean pigFarm) {
            this.pigFarm = pigFarm;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public void setSourceBillId(String sourceBillId) {
            this.sourceBillId = sourceBillId;
        }

        public void setField(FieldBean field) {
            this.field = field;
        }

        public void setBreeder(BreederBean breeder) {
            this.breeder = breeder;
        }

        public void setFivouchered(String Fivouchered) {
            this.Fivouchered = Fivouchered;
        }

        public void setBizDate(String bizDate) {
            this.bizDate = bizDate;
        }

        public void setPigCompany(PigCompanyBean pigCompany) {
            this.pigCompany = pigCompany;
        }

        public void setAbort(AbortBean abort) {
            this.abort = abort;
        }

        public String getRmark() {
            return rmark;
        }

        public void setRmark(String rmark) {
            this.rmark = rmark;
        }

        public String getCreateTime() {
            return createTime;
        }

        public AuditorBean getAuditor() {
            return auditor;
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

        public SownoBean getSowno() {
            return sowno;
        }

        public CreatorBean getCreator() {
            return creator;
        }

        public String getId() {
            return id;
        }

        public String getPregDays() {
            return pregDays;
        }

        public BatchParentBean getBatchParent() {
            return batchParent;
        }

        public String getAuditTime() {
            return auditTime;
        }

        public String getParit() {
            return parit;
        }

        public BaseStatusBean getBaseStatus() {
            return baseStatus;
        }

        public BornoBean getBorno() {
            return borno;
        }

        public TulnmBean getTulnm() {
            return tulnm;
        }

        public String getHasEffected() {
            return hasEffected;
        }

        public String getBreedingDate() {
            return BreedingDate;
        }

        public DrBean getDr() {
            return dr;
        }

        public CUBean getCU() {
            return CU;
        }

        public PigFarmBean getPigFarm() {
            return pigFarm;
        }

        public String getNumber() {
            return number;
        }

        public String getSourceBillId() {
            return sourceBillId;
        }

        public FieldBean getField() {
            return field;
        }

        public BreederBean getBreeder() {
            return breeder;
        }

        public String getFivouchered() {
            return Fivouchered;
        }

        public String getBizDate() {
            return bizDate;
        }

        public PigCompanyBean getPigCompany() {
            return pigCompany;
        }

        public AbortBean getAbort() {
            return abort;
        }

        public static class AuditorBean {
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

        public static class SownoBean {
            private String id;
            private String number;
            private String state;
            private String location;

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
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

        public static class BornoBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class TulnmBean {
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

        public static class FieldBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class BreederBean {
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

        public static class AbortBean {
            private String id;
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }
    }
    public static PregnancyAdd getNewBean(){
        PregnancyAdd bean = new PregnancyAdd();
        bean.setTulnm(new TulnmBean());
        bean.setStorageOrg(new StorageOrgBean());
        bean.setPigFarm(new PigFarmBean());
        bean.setLastUpdateUser(new LastUpdateUserBean());
        bean.setField(new FieldBean());
        bean.setCU(new CUBean());
        bean.setCreator(new CreatorBean());
        bean.setBreeder(new BreederBean());
        bean.setBaseStatus(new BaseStatusBean());
        bean.setAuditor(new AuditorBean());
        return bean;
    }
}
