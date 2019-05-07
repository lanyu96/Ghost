package com.zhou.ghost.ui.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: zhou
 * @Date: 2018/12/12 10:05
 * @Description:
 */
public class OutAdd implements Serializable {
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
    private String incnt;
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
    private String id;
    private String totalCount;
    private String auditTime;
    private String parit;
    /**
     * alias : 审核
     * value : 4
     */

    private BaseStatusBean baseStatus;
    private String Fivouchered;
    private String bizDate;
    private String tgbth;
    /**
     * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
     */

    private PigCompanyBean pigCompany;
    private String hasEffected;
    /**
     * alias : 未删
     * value : 0
     */

    private DrBean dr;
    /**
     * pigtype : {"id":"H4oAAAEi2QxHkde2"}
     * buildArchive : {"id":"H4oAAAEqicwt8Ui3"}
     * bthno : {"id":"H4oAAAEqile9z5bb"}
     * earno : {"id":"tQJYyH9wTvGixuJxgztfyEVA25s="}
     * pigState : {"id":"H4oAAAEi2Q+qmIuV"}
     * weedStatus : {"alias":"未淘汰","value":"NO"}
     * parent : {"id":"H4oAAAEqjhU48VjS"}
     * isGoods : false
     * processMode : 销售
     * dayage : 756
     * id : H4oAAAEqjhZKf3LA
     * avgweight : 20
     * cn : 1
     * parit : 0
     * seq : 1
     * elimReason : {"id":"H4oAAAEi2SEwPXV3"}
     * tgbth : false
     * feeder : {"id":"H4oAAAEqic8q0/c9"}
     */

    private List<EntriesBean> Entries;
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
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

    public void setIncnt(String incnt) {
        this.incnt = incnt;
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

    public void setId(String id) {
        this.id = id;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
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

    public void setFivouchered(String Fivouchered) {
        this.Fivouchered = Fivouchered;
    }

    public void setBizDate(String bizDate) {
        this.bizDate = bizDate;
    }

    public void setTgbth(String tgbth) {
        this.tgbth = tgbth;
    }

    public void setPigCompany(PigCompanyBean pigCompany) {
        this.pigCompany = pigCompany;
    }

    public void setHasEffected(String hasEffected) {
        this.hasEffected = hasEffected;
    }

    public void setDr(DrBean dr) {
        this.dr = dr;
    }

    public void setEntries(List<EntriesBean> Entries) {
        this.Entries = Entries;
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

    public String getIncnt() {
        return incnt;
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

    public String getId() {
        return id;
    }

    public String getTotalCount() {
        return totalCount;
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

    public String getFivouchered() {
        return Fivouchered;
    }

    public String getBizDate() {
        return bizDate;
    }

    public String getTgbth() {
        return tgbth;
    }

    public PigCompanyBean getPigCompany() {
        return pigCompany;
    }

    public String getHasEffected() {
        return hasEffected;
    }

    public DrBean getDr() {
        return dr;
    }

    public List<EntriesBean> getEntries() {
        return Entries;
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

    public static class PigCompanyBean {
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

    public static class EntriesBean {
        /**
         * id : H4oAAAEi2QxHkde2
         */

        private PigtypeBean pigtype;
        /**
         * id : H4oAAAEqicwt8Ui3
         */

        private BuildArchiveBean buildArchive;
        /**
         * id : H4oAAAEqile9z5bb
         */

        private BthnoBean bthno;
        /**
         * id : tQJYyH9wTvGixuJxgztfyEVA25s=
         */

        private EarnoBean earno;
        /**
         * id : H4oAAAEi2Q+qmIuV
         */

        private PigStateBean pigState;
        /**
         * alias : 未淘汰
         * value : NO
         */

        private WeedStatusBean weedStatus;
        /**
         * id : H4oAAAEqjhU48VjS
         */

        private ParentBean parent;
        private String isGoods;
        private String processMode;
        private String dayage;
        private String id;
        private String avgweight;
        private String cn;
        private String parit;
        private String seq;
        /**
         * id : H4oAAAEi2SEwPXV3
         */

        private ElimReasonBean elimReason;
        private String tgbth;
        /**
         * id : H4oAAAEqic8q0/c9
         */

        private FeederBean feeder;



        public void setPigtype(PigtypeBean pigtype) {
            this.pigtype = pigtype;
        }

        public void setBuildArchive(BuildArchiveBean buildArchive) {
            this.buildArchive = buildArchive;
        }

        public void setBthno(BthnoBean bthno) {
            this.bthno = bthno;
        }

        public void setEarno(EarnoBean earno) {
            this.earno = earno;
        }

        public void setPigState(PigStateBean pigState) {
            this.pigState = pigState;
        }

        public void setWeedStatus(WeedStatusBean weedStatus) {
            this.weedStatus = weedStatus;
        }

        public void setParent(ParentBean parent) {
            this.parent = parent;
        }

        public void setIsGoods(String isGoods) {
            this.isGoods = isGoods;
        }

        public void setProcessMode(String processMode) {
            this.processMode = processMode;
        }

        public void setDayage(String dayage) {
            this.dayage = dayage;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setAvgweight(String avgweight) {
            this.avgweight = avgweight;
        }

        public void setCn(String cn) {
            this.cn = cn;
        }

        public void setParit(String parit) {
            this.parit = parit;
        }

        public void setSeq(String seq) {
            this.seq = seq;
        }

        public void setElimReason(ElimReasonBean elimReason) {
            this.elimReason = elimReason;
        }

        public void setTgbth(String tgbth) {
            this.tgbth = tgbth;
        }

        public void setFeeder(FeederBean feeder) {
            this.feeder = feeder;
        }

        public PigtypeBean getPigtype() {
            return pigtype;
        }

        public BuildArchiveBean getBuildArchive() {
            return buildArchive;
        }

        public BthnoBean getBthno() {
            return bthno;
        }

        public EarnoBean getEarno() {
            return earno;
        }

        public PigStateBean getPigState() {
            return pigState;
        }

        public WeedStatusBean getWeedStatus() {
            return weedStatus;
        }

        public ParentBean getParent() {
            return parent;
        }

        public String getIsGoods() {
            return isGoods;
        }

        public String getProcessMode() {
            return processMode;
        }

        public String getDayage() {
            return dayage;
        }

        public String getId() {
            return id;
        }

        public String getAvgweight() {
            return avgweight;
        }

        public String getCn() {
            return cn;
        }

        public String getParit() {
            return parit;
        }

        public String getSeq() {
            return seq;
        }

        public ElimReasonBean getElimReason() {
            return elimReason;
        }

        public String getTgbth() {
            return tgbth;
        }

        public FeederBean getFeeder() {
            return feeder;
        }

        public static class PigtypeBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class BuildArchiveBean {
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

        public static class BthnoBean {
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

        public static class PigStateBean {
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

        public static class WeedStatusBean {
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

        public static class ParentBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class ElimReasonBean {
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
    public static OutAdd getNewBean(){
        OutAdd bean = new OutAdd();
        bean.setStorageOrg(new StorageOrgBean());
        bean.setPigFarm(new PigFarmBean());
        bean.setPigCompany(new PigCompanyBean());
        bean.setLastUpdateUser(new LastUpdateUserBean());
        bean.setField(new FieldBean());


        bean.setCreator(new CreatorBean());
        bean.setBaseStatus(new BaseStatusBean());
        bean.setAuditor(new AuditorBean());
        return bean;
    }
    public static EntriesBean getNewEntry(){
        EntriesBean bean = new EntriesBean();

       bean.setWeedStatus(new EntriesBean.WeedStatusBean());
       bean.setPigtype(new EntriesBean.PigtypeBean());
       bean.setPigState(new EntriesBean.PigStateBean());
       bean.setParent(new EntriesBean.ParentBean());
       bean.setFeeder(new EntriesBean.FeederBean());
       bean.setElimReason(new EntriesBean.ElimReasonBean());
       bean.setEarno(new EntriesBean.EarnoBean());
       bean.setBuildArchive(new EntriesBean.BuildArchiveBean());
       bean.setBthno(new EntriesBean.BthnoBean());
        return bean;
    }
}
