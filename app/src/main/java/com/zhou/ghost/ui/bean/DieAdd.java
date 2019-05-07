package com.zhou.ghost.ui.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: zhou
 * @Date: 2018/12/11 10:41
 * @Description:
 */
public class DieAdd implements Serializable {
    private String createTime;
    /**
     * alias : 白天
     * value : day
     */

    private TgapmBean tgapm;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private AuditorBean auditor;
    private String avgwt;
    private String lastUpdateTime;
    /**
     * alias :
     * value : 1
     */

    private InsuranceStatusBean InsuranceStatus;
    private String sfspz;
    /**
     * id : H4oAAAEi2QhHkde2
     */

    private PkVtypeBean pk_vtype;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private LastUpdateUserBean lastUpdateUser;
    /**
     * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
     */

    private StorageOrgBean storageOrg;
    private String pk_handle;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private CreatorBean creator;
    private String id;
    /**
     * id : H4oAAAEqZqCMjolC
     */

    private PkDiersnBean pk_diersn;
    private String parit;
    private String auditTime;
    /**
     * alias : 审核
     * value : 4
     */

    private BaseStatusBean baseStatus;
    private String hasEffected;
    /**
     * alias : 未删
     * value : 0
     */

    private DrBean dr;
    private String togwt;
    /**
     * id : H4oAAAEqijC9z5bb
     */
    private EarnoBean earno;
    private BthnoBean bthno;
    /**
     * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
     */

    private CUBean CU;
    private String isBatch;
    private String incnt;
    /**
     * id : H4oAAAEqZqO4/eJt
     */

    private PigFarmBean pigFarm;
    /**
     * id : H4oAAAEqic8q0/c9
     */

    private FederBean feder;
    private String number;
    private String inday;
    /**
     * id : H4oAAAEqZzqdu1vk
     */

    private FieldBean field;
    private String Fivouchered;
    /**
     * id : H4oAAAEqickt8Ui3
     */

    private PkPigfenBean pk_pigfen;
    private String bizDate;
    /**
     * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
     */

    private PigCompanyBean pigCompany;
    private List<DeathDetailBean> DeathDetail;
    private List<?> Entrys;

    private String rmark;

    public List<DeathDetailBean> getDeathDetail() {
        return DeathDetail;
    }

    public void setDeathDetail(List<DeathDetailBean> deathDetail) {
        DeathDetail = deathDetail;
    }

    public String getRmark() {
        return rmark;
    }

    public void setRmark(String rmark) {
        this.rmark = rmark;
    }

    public EarnoBean getEarno() {
        return earno;
    }

    public void setEarno(EarnoBean earno) {
        this.earno = earno;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setTgapm(TgapmBean tgapm) {
        this.tgapm = tgapm;
    }

    public void setAuditor(AuditorBean auditor) {
        this.auditor = auditor;
    }

    public void setAvgwt(String avgwt) {
        this.avgwt = avgwt;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setInsuranceStatus(InsuranceStatusBean InsuranceStatus) {
        this.InsuranceStatus = InsuranceStatus;
    }

    public void setSfspz(String sfspz) {
        this.sfspz = sfspz;
    }

    public void setPk_vtype(PkVtypeBean pk_vtype) {
        this.pk_vtype = pk_vtype;
    }

    public void setLastUpdateUser(LastUpdateUserBean lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public void setStorageOrg(StorageOrgBean storageOrg) {
        this.storageOrg = storageOrg;
    }

    public void setPk_handle(String pk_handle) {
        this.pk_handle = pk_handle;
    }

    public void setCreator(CreatorBean creator) {
        this.creator = creator;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPk_diersn(PkDiersnBean pk_diersn) {
        this.pk_diersn = pk_diersn;
    }

    public void setParit(String parit) {
        this.parit = parit;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    public void setBaseStatus(BaseStatusBean baseStatus) {
        this.baseStatus = baseStatus;
    }

    public void setHasEffected(String hasEffected) {
        this.hasEffected = hasEffected;
    }

    public void setDr(DrBean dr) {
        this.dr = dr;
    }

    public void setTogwt(String togwt) {
        this.togwt = togwt;
    }

    public void setBthno(BthnoBean bthno) {
        this.bthno = bthno;
    }

    public void setCU(CUBean CU) {
        this.CU = CU;
    }

    public void setIsBatch(String isBatch) {
        this.isBatch = isBatch;
    }

    public void setIncnt(String incnt) {
        this.incnt = incnt;
    }

    public void setPigFarm(PigFarmBean pigFarm) {
        this.pigFarm = pigFarm;
    }

    public void setFeder(FederBean feder) {
        this.feder = feder;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setInday(String inday) {
        this.inday = inday;
    }

    public void setField(FieldBean field) {
        this.field = field;
    }

    public void setFivouchered(String Fivouchered) {
        this.Fivouchered = Fivouchered;
    }

    public void setPk_pigfen(PkPigfenBean pk_pigfen) {
        this.pk_pigfen = pk_pigfen;
    }

    public void setBizDate(String bizDate) {
        this.bizDate = bizDate;
    }

    public void setPigCompany(PigCompanyBean pigCompany) {
        this.pigCompany = pigCompany;
    }

    public void setEntrys(List<?> Entrys) {
        this.Entrys = Entrys;
    }

    public String getCreateTime() {
        return createTime;
    }

    public TgapmBean getTgapm() {
        return tgapm;
    }

    public AuditorBean getAuditor() {
        return auditor;
    }

    public String getAvgwt() {
        return avgwt;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public InsuranceStatusBean getInsuranceStatus() {
        return InsuranceStatus;
    }

    public String getSfspz() {
        return sfspz;
    }

    public PkVtypeBean getPk_vtype() {
        return pk_vtype;
    }

    public LastUpdateUserBean getLastUpdateUser() {
        return lastUpdateUser;
    }

    public StorageOrgBean getStorageOrg() {
        return storageOrg;
    }

    public String getPk_handle() {
        return pk_handle;
    }

    public CreatorBean getCreator() {
        return creator;
    }

    public String getId() {
        return id;
    }

    public PkDiersnBean getPk_diersn() {
        return pk_diersn;
    }

    public String getParit() {
        return parit;
    }

    public String getAuditTime() {
        return auditTime;
    }

    public BaseStatusBean getBaseStatus() {
        return baseStatus;
    }

    public String getHasEffected() {
        return hasEffected;
    }

    public DrBean getDr() {
        return dr;
    }

    public String getTogwt() {
        return togwt;
    }

    public BthnoBean getBthno() {
        return bthno;
    }

    public CUBean getCU() {
        return CU;
    }

    public String getIsBatch() {
        return isBatch;
    }

    public String getIncnt() {
        return incnt;
    }

    public PigFarmBean getPigFarm() {
        return pigFarm;
    }

    public FederBean getFeder() {
        return feder;
    }

    public String getNumber() {
        return number;
    }

    public String getInday() {
        return inday;
    }

    public FieldBean getField() {
        return field;
    }

    public String getFivouchered() {
        return Fivouchered;
    }

    public PkPigfenBean getPk_pigfen() {
        return pk_pigfen;
    }

    public String getBizDate() {
        return bizDate;
    }

    public PigCompanyBean getPigCompany() {
        return pigCompany;
    }

    public List<?> getEntrys() {
        return Entrys;
    }

    public static class TgapmBean {
        private String alias;
        private String value;

        public void setAlias(String alias) {
            this.alias = alias;
            if("白天".equals(alias)){
                this.value ="day";
            }else if("上半夜".equals(alias)){
                this.value ="prenight";
            }else if("下半夜".equals(alias)){
                this.value ="nextnight";
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

    public static class AuditorBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class InsuranceStatusBean {
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

    public static class PkVtypeBean {
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

    public static class PkDiersnBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }
    public static class DeathDetailBean {
        private String id;

        /**
         * num : 22
         * seq : 1
         * parent : {"id":"4hzCklTZQryFoWO3sVH+f0CjKqQ="}
         */

        private String num;

        /**
         * id : 4hzCklTZQryFoWO3sVH+f0CjKqQ=
         */

        private ParentBean parent;
        /**
         * id : jERjS/BjQNKR9j0Uf6RszoyOiUI=
         * name : 腹泻
         */

        private DdrrBean ddrr;


        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        public void setNum(String num) {
            this.num = num;
        }



        public void setParent(ParentBean parent) {
            this.parent = parent;
        }

        public String getNum() {
            return num;
        }

        public ParentBean getParent() {
            return parent;
        }

        public void setDdrr(DdrrBean ddrr) {
            this.ddrr = ddrr;
        }

        public DdrrBean getDdrr() {
            return ddrr;
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

        public static class DdrrBean {
            private String id;
            private String name;

            public void setId(String id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public String getName() {
                return name;
            }
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

    public static class FederBean {
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

    public static class PkPigfenBean {
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
    public static DieAdd getNewBean(){
        DieAdd bean = new DieAdd();
        bean.setTgapm(new TgapmBean());
        bean.setStorageOrg(new StorageOrgBean());
        bean.setPk_vtype(new PkVtypeBean());
        bean.setPk_pigfen(new PkPigfenBean());
        bean.setPk_diersn(new PkDiersnBean());
        bean.setPigFarm(new PigFarmBean());
        bean.setPigCompany(new PigCompanyBean());
        bean.setLastUpdateUser(new LastUpdateUserBean());
        bean.setInsuranceStatus(new InsuranceStatusBean());
        bean.setField(new FieldBean());
        bean.setFeder(new FederBean());
        bean.setEarno(new EarnoBean());

        bean.setCU(new CUBean());
        bean.setCreator(new CreatorBean());
        bean.setBaseStatus(new BaseStatusBean());
        bean.setBthno(new BthnoBean());
        bean.setAuditor(new AuditorBean());
        return bean;
    }
}
