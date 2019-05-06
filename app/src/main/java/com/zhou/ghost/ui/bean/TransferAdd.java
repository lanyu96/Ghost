package com.zhou.ghost.ui.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/11/13 13:55
 * @Description:
 */
public class TransferAdd implements Serializable {
    private String iskfc;
    private String createTime;
    private String isInner;
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
    /**
     * id : H4oAAAEqZzqdu1vk
     */

    private FieldBean field;
    private FieldBean zrfield;
    private String id;
    private String Incnt;
    private String auditTime;
    /**
     * alias : 审核
     * value : 4
     */

    private BaseStatusBean baseStatus;
    /**
     * id : H4oAAAEqickt8Ui3
     */

    private InpenBean Inpen;
    private String Fivouchered;
    private String isSpz;
    private String bizDate;
    private String Inwgt;
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
     * id : H4oAAAEqijg5CYYc
     * indno : {"id":"TLd8RC5ZSZ24xAqrCsAsikVA25s="}
     * sex : {"alias":"母","value":"1"}
     * latestBizdate : 2017-01-31 00:00:31
     * Pk_pigfen : {"id":"H4oAAAEqicgt8Ui3"}
     * seq : 1
     * parent : {"id":"H4oAAAEqijdCR5v2"}
     * intervalDay : 391
     * pigstate : {"id":"H4oAAAEi2RKqmIuV"}
     */

    private List<EntryBean> Entry;

    public String getIsInner() {
        return isInner;
    }

    public void setIsInner(String isInner) {
        if("是".equals(isInner)) {
            this.isInner = "true";
        }else{
            this.isInner = "false";
        }
    }

    public FieldBean getZrfield() {
        return zrfield;
    }

    public void setZrfield(FieldBean zrfield) {
        this.zrfield = zrfield;
    }

    public void setIskfc(String iskfc) {
        if("是".equals(iskfc)) {
            this.iskfc = "true";
        }else{
            this.iskfc = "false";
        }
    }

    public String getInwgt() {
        return Inwgt;
    }

    public void setInwgt(String inwgt) {
        Inwgt = inwgt;
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

    public void setIncnt(String Incnt) {
        this.Incnt = Incnt;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    public void setBaseStatus(BaseStatusBean baseStatus) {
        this.baseStatus = baseStatus;
    }

    public void setInpen(InpenBean Inpen) {
        this.Inpen = Inpen;
    }

    public void setFivouchered(String Fivouchered) {
        this.Fivouchered = Fivouchered;
    }

    public void setIsSpz(String isSpz) {
        if("是".equals(isSpz)) {
            this.isSpz = "true";
        }else{
            this.isSpz = "false";
        }
    }

    public void setBizDate(String bizDate) {
        this.bizDate = bizDate;
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

    public void setEntry(List<EntryBean> Entry) {
        this.Entry = Entry;
    }

    public String getIskfc() {
        return iskfc;
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

    public FieldBean getField() {
        return field;
    }

    public String getId() {
        return id;
    }

    public String getIncnt() {
        return Incnt;
    }

    public String getAuditTime() {
        return auditTime;
    }

    public BaseStatusBean getBaseStatus() {
        return baseStatus;
    }

    public InpenBean getInpen() {
        return Inpen;
    }

    public String getFivouchered() {
        return Fivouchered;
    }

    public String getIsSpz() {
        return isSpz;
    }

    public String getBizDate() {
        return bizDate;
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

    public List<EntryBean> getEntry() {
        return Entry;
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

    public static class InpenBean {
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

    public static class EntryBean {
        private String id;
        /**
         * id : TLd8RC5ZSZ24xAqrCsAsikVA25s=
         */

        private IndnoBean indno;
        /**
         * alias : 母
         * value : 1
         */

        private SexBean sex;
        private String latestBizdate;
        /**
         * id : H4oAAAEqicgt8Ui3
         */

        private PkPigfenBean Pk_pigfen;
        private String seq;
        /**
         * id : H4oAAAEqijdCR5v2
         */

        private ParentBean parent;
        private String intervalDay;
        /**
         * id : H4oAAAEi2RKqmIuV
         */

        private PigstateBean pigstate;

        public void setId(String id) {
            this.id = id;
        }

        public void setIndno(IndnoBean indno) {
            this.indno = indno;
        }

        public void setSex(SexBean sex) {
            this.sex = sex;
        }

        public void setLatestBizdate(String latestBizdate) {
            this.latestBizdate = latestBizdate;
        }

        public void setPk_pigfen(PkPigfenBean Pk_pigfen) {
            this.Pk_pigfen = Pk_pigfen;
        }

        public void setSeq(String seq) {
            this.seq = seq;
        }

        public void setParent(ParentBean parent) {
            this.parent = parent;
        }

        public void setIntervalDay(String intervalDay) {
            this.intervalDay = intervalDay;
        }

        public void setPigstate(PigstateBean pigstate) {
            this.pigstate = pigstate;
        }

        public String getId() {
            return id;
        }

        public IndnoBean getIndno() {
            return indno;
        }

        public SexBean getSex() {
            return sex;
        }

        public String getLatestBizdate() {
            return latestBizdate;
        }

        public PkPigfenBean getPk_pigfen() {
            return Pk_pigfen;
        }

        public String getSeq() {
            return seq;
        }

        public ParentBean getParent() {
            return parent;
        }

        public String getIntervalDay() {
            return intervalDay;
        }

        public PigstateBean getPigstate() {
            return pigstate;
        }

        public static class IndnoBean {
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

        public static class SexBean {
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

        public static class PkPigfenBean {
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

        public static class ParentBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class PigstateBean {
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

    public static EntryBean getNewEntry(){
        EntryBean bean = new EntryBean();

        bean.setIndno(new EntryBean.IndnoBean());

        bean.setParent(new EntryBean.ParentBean());

        bean.setSex(new EntryBean.SexBean());

        bean.setPigstate(new EntryBean.PigstateBean());

        bean.setPk_pigfen(new EntryBean.PkPigfenBean());

        return bean;
    }
    public static TransferAdd getNewBean(){
        TransferAdd bean = new TransferAdd();
        bean.setStorageOrg(new StorageOrgBean());
        bean.setPigFarm(new PigFarmBean());
        bean.setPigCompany(new PigCompanyBean());
        bean.setLastUpdateUser(new LastUpdateUserBean());
        bean.setInpen(new InpenBean());
        bean.setField(new FieldBean());
        bean.setCU(new CUBean());
        bean.setCreator(new CreatorBean());
        bean.setBaseStatus(new BaseStatusBean());
        bean.setAuditor(new AuditorBean());
        bean.setZrfield(new FieldBean());
        return bean;
    }
}
