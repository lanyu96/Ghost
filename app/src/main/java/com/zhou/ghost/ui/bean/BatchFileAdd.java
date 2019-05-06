package com.zhou.ghost.ui.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/12/21 14:11
 * @Description:
 */
public class BatchFileAdd implements Serializable {
    /**
     * createTime : 2018-11-09 15:09:09
     * deletedStatus : {"alias":"启用","value":1}
     * batchStatus : {"alias":"开始","value":"START"}
     * lastUpdateTime : 2018-11-23 10:43:23
     * lastUpdateUser : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * pk_vtype : {"id":"Oscm+b5ZTROB7Ak4o85SHEeR17Y="}
     * entrys : []
     * PigEntrys : [{"id":"aKGykjglQSefmDIZRprLbEr0H38=","regnm":{"id":"8+cXxmKHTySDQZ/WFmV9rS3xSLc="},"earno":{"id":"atSGi2G1R22N+4JuXbXKtkVA25s="},"status":{"alias":"在群","value":1},"seq":"0","parent":{"id":"oZTOptPnSZ2+SbjtpgQHCb3Plts="},"sourceBillId":"+5n4nsk+T9yMyoHIi/7w2YNfKEs="},{"id":"67vixE3wQnOGv6/yQVMjNkr0H38=","regnm":{"id":"8+cXxmKHTySDQZ/WFmV9rS3xSLc="},"earno":{"id":"75cSbOKpQ9SNgLenfLnKckVA25s="},"status":{"alias":"在群","value":1},"seq":"0","parent":{"id":"oZTOptPnSZ2+SbjtpgQHCb3Plts="},"sourceBillId":"5qqt0NB2RAKnAjrqi7DnXoNfKEs="},{"id":"EQI+LS0nR9O7bg+6NxJQ6kr0H38=","regnm":{"id":"8+cXxmKHTySDQZ/WFmV9rS3xSLc="},"outBillId":"lqX0O9tHQFG/iSwDn1EYnceFqig=","earno":{"id":"mNaPy6AbSUmy61RRBDkoE0VA25s="},"status":{"alias":"已转出","value":2},"seq":"1","parent":{"id":"oZTOptPnSZ2+SbjtpgQHCb3Plts="},"sourceBillId":"VkiY26z6TPGriJyno2MieYNfKEs="},{"id":"1+uvGZPAREi+b3PeFA35rkr0H38=","regnm":{"id":"8+cXxmKHTySDQZ/WFmV9rS3xSLc="},"outBillId":"XeKGCFiNSeGDdRoDFIdgtceFqig=","earno":{"id":"Pi4c6Ni8ReeD4vKd8Db3Q0VA25s="},"status":{"alias":"已转出","value":2},"seq":"2","parent":{"id":"oZTOptPnSZ2+SbjtpgQHCb3Plts="},"sourceBillId":"VkiY26z6TPGriJyno2MieYNfKEs="},{"id":"za7Vzrg0T4i5cwa+K0oWDEr0H38=","regnm":{"id":"8+cXxmKHTySDQZ/WFmV9rS3xSLc="},"outBillId":"iND9vNc3TmGp6lQXH1Az8KaLCis=","earno":{"id":"ZiLIj7COSA2S+OcSMBoAaUVA25s="},"status":{"alias":"已转出","value":2},"seq":"3","parent":{"id":"oZTOptPnSZ2+SbjtpgQHCb3Plts="},"sourceBillId":"VkiY26z6TPGriJyno2MieYNfKEs="},{"id":"FYXPJQhPTay8ec+vZtDZk0r0H38=","regnm":{"id":"8+cXxmKHTySDQZ/WFmV9rS3xSLc="},"earno":{"id":"RE495RXRQoGDRnrc77oMAkVA25s="},"status":{"alias":"在群","value":1},"seq":"4","parent":{"id":"oZTOptPnSZ2+SbjtpgQHCb3Plts="},"sourceBillId":"NWdRXt8JRU2dVJrPa06Pj4NfKEs="},{"id":"C6shBSjqTH+aWOO1oqDdwkr0H38=","regnm":{"id":"8+cXxmKHTySDQZ/WFmV9rS3xSLc="},"earno":{"id":"H7l6gA+hQti5EEGcehQl7UVA25s="},"status":{"alias":"在群","value":1},"seq":"5","parent":{"id":"oZTOptPnSZ2+SbjtpgQHCb3Plts="},"sourceBillId":"NWdRXt8JRU2dVJrPa06Pj4NfKEs="},{"id":"wd7fMFBIT/uSZYyrUHf/sEr0H38=","regnm":{"id":"8+cXxmKHTySDQZ/WFmV9rS3xSLc="},"outBillId":"CNlcbtUISMGypWjy9LTtEMeFqig=","earno":{"id":"G66JzAnsRr29Tpdww/PyLEVA25s="},"status":{"alias":"已转出","value":2},"seq":"6","parent":{"id":"oZTOptPnSZ2+SbjtpgQHCb3Plts="},"sourceBillId":"NWdRXt8JRU2dVJrPa06Pj4NfKEs="},{"id":"48fZ51QSQyO/VTzsCfmMcEr0H38=","regnm":{"id":"8+cXxmKHTySDQZ/WFmV9rS3xSLc="},"outBillId":"E5Ac9haVRxWCypyEw4EYWceFqig=","earno":{"id":"CARVSVp+RdWAYhI+CDt2AEVA25s="},"status":{"alias":"已转出","value":2},"seq":"7","parent":{"id":"oZTOptPnSZ2+SbjtpgQHCb3Plts="},"sourceBillId":"VkiY26z6TPGriJyno2MieYNfKEs="}]
     * storageOrg : {"id":"N37XaCshS96FzlihQxyDTcznrtQ="}
     * enableTime : 2018-11-23 10:43:23
     * creator : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * weakQty : 0
     * id : oZTOptPnSZ2+SbjtpgQHCb3Plts=
     * allDeathQty : 0
     * BuildArchiveEntries : []
     * hasEffected : false
     * dr : {"alias":"未删","value":0}
     * regnm : {"id":"8+cXxmKHTySDQZ/WFmV9rS3xSLc="}
     * CU : {"id":"6Bx6kutZTvCfY7r4+YvficznrtQ="}
     * incnt : 9
     * pigFarm : {"id":"Q7OyHQGHT8Od64HCHtkQYbj94m0="}
     * batcheck : false
     * number : HBG001
     * disableTime : 2018-11-23 10:43:23
     * field : {"id":"zUK1z0aMRxKh9U98mOavup27W+Q="}
     * allSellQty : 1
     * days : 516.777778
     * isSeedPig : false
     * genct : 8
     * Fivouchered : false
     * bizDate : 2018-11-09 15:09:09
     */

    private String createTime;
    /**
     * alias : 启用
     * value : 1
     */

    private DeletedStatusBean deletedStatus;
    /**
     * alias : 开始
     * value : START
     */

    private BatchStatusBean batchStatus;
    private String lastUpdateTime;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private LastUpdateUserBean lastUpdateUser;
    /**
     * id : Oscm+b5ZTROB7Ak4o85SHEeR17Y=
     */

    private PkVtypeBean pk_vtype;
    /**
     * id : N37XaCshS96FzlihQxyDTcznrtQ=
     */

    private StorageOrgBean storageOrg;
    private String enableTime;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private CreatorBean creator;
    private String weakQty;
    private String id;
    private String allDeathQty;
    private String hasEffected;
    /**
     * alias : 未删
     * value : 0
     */

    private DrBean dr;
    /**
     * id : 8+cXxmKHTySDQZ/WFmV9rS3xSLc=
     */

    private RegnmBean regnm;
    /**
     * id : 6Bx6kutZTvCfY7r4+YvficznrtQ=
     */

    private CUBean CU;
    private String incnt;
    /**
     * id : Q7OyHQGHT8Od64HCHtkQYbj94m0=
     */

    private PigFarmBean pigFarm;
    private String batcheck;
    private String number;
    private String disableTime;
    /**
     * id : zUK1z0aMRxKh9U98mOavup27W+Q=
     */

    private FieldBean field;
    private String allSellQty;
    private String days;
    private String isSeedPig;
    private String genct;
    private String Fivouchered;
    private String bizDate;
    private List<?> entrys;
    /**
     * id : aKGykjglQSefmDIZRprLbEr0H38=
     * regnm : {"id":"8+cXxmKHTySDQZ/WFmV9rS3xSLc="}
     * earno : {"id":"atSGi2G1R22N+4JuXbXKtkVA25s="}
     * status : {"alias":"在群","value":1}
     * seq : 0
     * parent : {"id":"oZTOptPnSZ2+SbjtpgQHCb3Plts="}
     * sourceBillId : +5n4nsk+T9yMyoHIi/7w2YNfKEs=
     */

    private List<PigEntrysBean> PigEntrys;
    private List<?> BuildArchiveEntries;
    /**
     * id : R7Q69ASJT3eerm4zipCEY/yo+r0=
     */

    private BreedingBatchBean breedingBatch;
    /**
     * id : 55Pz/JjkTtuJzwzJ9bW9kMVgo+o=
     */

    private PigVarietiesBean pigVarieties;
    /**
     * id : 8DIPG97bQKuaJVJzQ74s4AgTq08=
     */

    private PigPXBean pigPX;
    /**
     * id : EmbWdBOjRQKHFjFRr4f9gCrT9z0=
     */

    private FeederBean feeder;

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setDeletedStatus(DeletedStatusBean deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public void setBatchStatus(BatchStatusBean batchStatus) {
        this.batchStatus = batchStatus;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setLastUpdateUser(LastUpdateUserBean lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public void setPk_vtype(PkVtypeBean pk_vtype) {
        this.pk_vtype = pk_vtype;
    }

    public void setStorageOrg(StorageOrgBean storageOrg) {
        this.storageOrg = storageOrg;
    }

    public void setEnableTime(String enableTime) {
        this.enableTime = enableTime;
    }

    public void setCreator(CreatorBean creator) {
        this.creator = creator;
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

    public void setHasEffected(String hasEffected) {
        this.hasEffected = hasEffected;
    }

    public void setDr(DrBean dr) {
        this.dr = dr;
    }

    public void setRegnm(RegnmBean regnm) {
        this.regnm = regnm;
    }

    public void setCU(CUBean CU) {
        this.CU = CU;
    }

    public void setIncnt(String incnt) {
        this.incnt = incnt;
    }

    public void setPigFarm(PigFarmBean pigFarm) {
        this.pigFarm = pigFarm;
    }

    public void setBatcheck(String batcheck) {
        this.batcheck = batcheck;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDisableTime(String disableTime) {
        this.disableTime = disableTime;
    }

    public void setField(FieldBean field) {
        this.field = field;
    }

    public void setAllSellQty(String allSellQty) {
        this.allSellQty = allSellQty;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public void setIsSeedPig(String isSeedPig) {
        this.isSeedPig = isSeedPig;
    }

    public void setGenct(String genct) {
        this.genct = genct;
    }

    public void setFivouchered(String Fivouchered) {
        this.Fivouchered = Fivouchered;
    }

    public void setBizDate(String bizDate) {
        this.bizDate = bizDate;
    }

    public void setEntrys(List<?> entrys) {
        this.entrys = entrys;
    }

    public void setPigEntrys(List<PigEntrysBean> PigEntrys) {
        this.PigEntrys = PigEntrys;
    }

    public void setBuildArchiveEntries(List<?> BuildArchiveEntries) {
        this.BuildArchiveEntries = BuildArchiveEntries;
    }

    public String getCreateTime() {
        return createTime;
    }

    public DeletedStatusBean getDeletedStatus() {
        return deletedStatus;
    }

    public BatchStatusBean getBatchStatus() {
        return batchStatus;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public LastUpdateUserBean getLastUpdateUser() {
        return lastUpdateUser;
    }

    public PkVtypeBean getPk_vtype() {
        return pk_vtype;
    }

    public StorageOrgBean getStorageOrg() {
        return storageOrg;
    }

    public String getEnableTime() {
        return enableTime;
    }

    public CreatorBean getCreator() {
        return creator;
    }

    public String getWeakQty() {
        return weakQty;
    }

    public String getId() {
        return id;
    }

    public String getAllDeathQty() {
        return allDeathQty;
    }

    public String getHasEffected() {
        return hasEffected;
    }

    public DrBean getDr() {
        return dr;
    }

    public RegnmBean getRegnm() {
        return regnm;
    }

    public CUBean getCU() {
        return CU;
    }

    public String getIncnt() {
        return incnt;
    }

    public PigFarmBean getPigFarm() {
        return pigFarm;
    }

    public String getBatcheck() {
        return batcheck;
    }

    public String getNumber() {
        return number;
    }

    public String getDisableTime() {
        return disableTime;
    }

    public FieldBean getField() {
        return field;
    }

    public String getAllSellQty() {
        return allSellQty;
    }

    public String getDays() {
        return days;
    }

    public String getIsSeedPig() {
        return isSeedPig;
    }

    public String getGenct() {
        return genct;
    }

    public String getFivouchered() {
        return Fivouchered;
    }

    public String getBizDate() {
        return bizDate;
    }

    public List<?> getEntrys() {
        return entrys;
    }

    public List<PigEntrysBean> getPigEntrys() {
        return PigEntrys;
    }

    public List<?> getBuildArchiveEntries() {
        return BuildArchiveEntries;
    }

    public void setBreedingBatch(BreedingBatchBean breedingBatch) {
        this.breedingBatch = breedingBatch;
    }

    public void setPigVarieties(PigVarietiesBean pigVarieties) {
        this.pigVarieties = pigVarieties;
    }

    public void setPigPX(PigPXBean pigPX) {
        this.pigPX = pigPX;
    }

    public BreedingBatchBean getBreedingBatch() {
        return breedingBatch;
    }

    public PigVarietiesBean getPigVarieties() {
        return pigVarieties;
    }

    public PigPXBean getPigPX() {
        return pigPX;
    }

    public void setFeeder(FeederBean feeder) {
        this.feeder = feeder;
    }

    public FeederBean getFeeder() {
        return feeder;
    }

    public static class DeletedStatusBean {
        private String alias;
        private int value;

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getAlias() {
            return alias;
        }

        public int getValue() {
            return value;
        }
    }

    public static class BatchStatusBean {
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

    public static class LastUpdateUserBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class PkVtypeBean {
        private String id;

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

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class DrBean {
        private String alias;
        private int value;

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getAlias() {
            return alias;
        }

        public int getValue() {
            return value;
        }
    }

    public static class RegnmBean {
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

    public static class FieldBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class PigEntrysBean {
        private String id;
        /**
         * id : 8+cXxmKHTySDQZ/WFmV9rS3xSLc=
         */

        private RegnmBean regnm;
        /**
         * id : atSGi2G1R22N+4JuXbXKtkVA25s=
         */

        private EarnoBean earno;
        /**
         * alias : 在群
         * value : 1
         */

        private StatusBean status;
        private String seq;
        /**
         * id : oZTOptPnSZ2+SbjtpgQHCb3Plts=
         */

        private ParentBean parent;
        private String sourceBillId;

        public void setId(String id) {
            this.id = id;
        }

        public void setRegnm(RegnmBean regnm) {
            this.regnm = regnm;
        }

        public void setEarno(EarnoBean earno) {
            this.earno = earno;
        }

        public void setStatus(StatusBean status) {
            this.status = status;
        }

        public void setSeq(String seq) {
            this.seq = seq;
        }

        public void setParent(ParentBean parent) {
            this.parent = parent;
        }

        public void setSourceBillId(String sourceBillId) {
            this.sourceBillId = sourceBillId;
        }

        public String getId() {
            return id;
        }

        public RegnmBean getRegnm() {
            return regnm;
        }

        public EarnoBean getEarno() {
            return earno;
        }

        public StatusBean getStatus() {
            return status;
        }

        public String getSeq() {
            return seq;
        }

        public ParentBean getParent() {
            return parent;
        }

        public String getSourceBillId() {
            return sourceBillId;
        }

        public static class RegnmBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class EarnoBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class StatusBean {
            private String alias;
            private int value;

            public void setAlias(String alias) {
                this.alias = alias;
            }

            public void setValue(int value) {
                this.value = value;
            }

            public String getAlias() {
                return alias;
            }

            public int getValue() {
                return value;
            }
        }

        public static class ParentBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }
    }

    public static class BreedingBatchBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class PigVarietiesBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class PigPXBean {
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
}
