package mvp.com.zhou.mvp.ui.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/11/6 14:00
 * @Description:
 */
public class SemenAdd implements Serializable {
    private String peizhong;
    private String createTime;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private AuditorBean auditor;
    /**
     * id : H4oAAAEqidDFwf0b
     */

    private DilutionPersonBean dilutionPerson;
    /**
     * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
     */

    private CUBean CU;
    private String isOutPurchaser;
    private String lastUpdateTime;
    /**
     * id : H4oAAAEqZqO4/eJt
     */

    private PigFarmBean pigFarm;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private LastUpdateUserBean lastUpdateUser;
    /**
     * id : H4oAAAEqidDFwf0b
     */

    private SemenCollectorBean semenCollector;
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
    private String auditTime;
    /**
     * alias : 审核
     * value : 4
     */

    private BaseStatusBean baseStatus;
    private String Fivouchered;
    private String bizDate;
    /**
     * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
     */

    private PigCompanyBean pigCompany;
    private String hasEffected;
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * alias : 未删
     * value : 0
     */

    private DrBean dr;
    /**
     * smell : {"alias":"正常","value":"1"}
     * indno : {"id":"H4oAAAEqjdxFcMfp"}
     * breed : {"id":"H4oAAAEi2RjFYKPq"}
     * incnt : 15
     * bornoAge : 0
     * parent : {"id":"H4oAAAEqjebHhaoo"}
     * dilute : 899
     * actve : 1
     * malfn : 0
     * feiqi : false
     * desty : 2
     * id : H4oAAAEqjeeDtocq
     * color : {"alias":"正常","value":"1"}
     * lastDiffDate : -1
     * seq : 1
     * borno : {"id":"Z7zFjE6tSWmviuu2qNJZZUVA25s="}
     * orign : 300
     * qualified : true
     */

    private List<EntryBean> Entry;

    public void setPeizhong(String peizhong) {
        this.peizhong = peizhong;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setAuditor(AuditorBean auditor) {
        this.auditor = auditor;
    }

    public void setDilutionPerson(DilutionPersonBean dilutionPerson) {
        this.dilutionPerson = dilutionPerson;
    }

    public void setCU(CUBean CU) {
        this.CU = CU;
    }

    public void setIsOutPurchaser(String isOutPurchaser) {
        if ("是".equals(isOutPurchaser)) {
            this.isOutPurchaser = "true";
        } else {
            this.isOutPurchaser = "false";
        }
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

    public void setSemenCollector(SemenCollectorBean semenCollector) {
        this.semenCollector = semenCollector;
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

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
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

    public String getPeizhong() {
        return peizhong;
    }

    public String getCreateTime() {
        return createTime;
    }

    public AuditorBean getAuditor() {
        return auditor;
    }

    public DilutionPersonBean getDilutionPerson() {
        return dilutionPerson;
    }

    public CUBean getCU() {
        return CU;
    }

    public String getIsOutPurchaser() {
        return isOutPurchaser;
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

    public SemenCollectorBean getSemenCollector() {
        return semenCollector;
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

    public String getAuditTime() {
        return auditTime;
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

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        private String number;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class DilutionPersonBean {
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

    public static class SemenCollectorBean {
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

    public static class EntryBean {
        /**
         * alias : 正常
         * value : 1
         */

        private SmellBean smell;
        /**
         * id : H4oAAAEqjdxFcMfp
         */

        private IndnoBean indno;
        /**
         * id : H4oAAAEi2RjFYKPq
         */

        private BreedBean breed;
        private String incnt;
        private String bornoAge;
        /**
         * id : H4oAAAEqjebHhaoo
         */

        private ParentBean parent;
        private String dilute;
        private String actve;
        private String malfn;
        private String feiqi;
        private String desty;
        private String id;
        /**
         * alias : 正常
         * value : 1
         */

        private ColorBean color;
        private String lastDiffDate;
        private String seq;
        /**
         * id : Z7zFjE6tSWmviuu2qNJZZUVA25s=
         */

        private BornoBean borno;
        private String orign;
        private String qualified;

        public void setSmell(SmellBean smell) {
            this.smell = smell;
        }

        public void setIndno(IndnoBean indno) {
            this.indno = indno;
        }

        public void setBreed(BreedBean breed) {
            this.breed = breed;
        }

        public void setIncnt(String incnt) {
            this.incnt = incnt;
        }

        public void setBornoAge(String bornoAge) {
            this.bornoAge = bornoAge;
        }

        public void setParent(ParentBean parent) {
            this.parent = parent;
        }

        public void setDilute(String dilute) {
            this.dilute = dilute;
        }

        public void setActve(String actve) {
            this.actve = actve;
        }

        public void setMalfn(String malfn) {
            this.malfn = malfn;
        }

        public void setFeiqi(String feiqi) {
            if ("是".equals(feiqi)) {
                this.feiqi = "true";
            } else {
                this.feiqi = "false";
            }
        }

        public void setDesty(String desty) {
            this.desty = desty;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setColor(ColorBean color) {
            this.color = color;
        }

        public void setLastDiffDate(String lastDiffDate) {
            this.lastDiffDate = lastDiffDate;
        }

        public void setSeq(String seq) {
            this.seq = seq;
        }

        public void setBorno(BornoBean borno) {
            this.borno = borno;
        }

        public void setOrign(String orign) {
            this.orign = orign;
        }

        public void setQualified(String qualified) {
            if ("是".equals(qualified)) {
                this.qualified = "true";
            } else {
                this.qualified = "false";
            }
        }

        public SmellBean getSmell() {
            return smell;
        }

        public IndnoBean getIndno() {
            return indno;
        }

        public BreedBean getBreed() {
            return breed;
        }

        public String getIncnt() {
            return incnt;
        }

        public String getBornoAge() {
            return bornoAge;
        }

        public ParentBean getParent() {
            return parent;
        }

        public String getDilute() {
            return dilute;
        }

        public String getActve() {
            return actve;
        }

        public String getMalfn() {
            return malfn;
        }

        public String getFeiqi() {
            return feiqi;
        }

        public String getDesty() {
            return desty;
        }

        public String getId() {
            return id;
        }

        public ColorBean getColor() {
            return color;
        }

        public String getLastDiffDate() {
            return lastDiffDate;
        }

        public String getSeq() {
            return seq;
        }

        public BornoBean getBorno() {
            return borno;
        }

        public String getOrign() {
            return orign;
        }

        public String getQualified() {
            return qualified;
        }

        public static class SmellBean {
            private String alias;
            private String value;

            public void setAlias(String alias) {
                this.alias = alias;
                if ("正常".equals(alias)) {
                    this.value = "1";
                } else {
                    this.value = "2";
                }
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

        public static class IndnoBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class BreedBean {
            private String id;

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

        public static class ColorBean {
            private String alias;
            private String value;

            public void setAlias(String alias) {
                this.alias = alias;
                if ("正常".equals(alias)) {
                    this.value = "1";
                } else {
                    this.value = "2";
                }
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
    }

    public static SemenAdd getNewBean(){
        SemenAdd bean = new SemenAdd();
        bean.setStorageOrg(new StorageOrgBean());
        bean.setSemenCollector(new SemenCollectorBean());
        bean.setPigFarm(new PigFarmBean());
        bean.setPigCompany(new PigCompanyBean());
        bean.setLastUpdateUser(new LastUpdateUserBean());
        bean.setField(new FieldBean());
        bean.setEntry(new ArrayList<EntryBean>());
        bean.getEntry().add(getNewEntry());
        bean.setDilutionPerson(new DilutionPersonBean());
        bean.setCU(new CUBean());
        bean.setCreator(new CreatorBean());
        bean.setBaseStatus(new BaseStatusBean());
        bean.setAuditor(new AuditorBean());
        return bean;
    }
    public static EntryBean getNewEntry() {
        EntryBean bean = new EntryBean();
        bean.setSmell(new EntryBean.SmellBean());
        bean.setParent(new EntryBean.ParentBean());
        bean.setIndno(new EntryBean.IndnoBean());
        bean.setColor(new EntryBean.ColorBean());
        bean.setBreed(new EntryBean.BreedBean());
        bean.setBorno(new EntryBean.BornoBean());
        return bean;
    }

}
