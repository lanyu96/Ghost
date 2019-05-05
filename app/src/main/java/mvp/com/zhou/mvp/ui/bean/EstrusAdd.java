package mvp.com.zhou.mvp.ui.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/10/26 9:50
 * @Description:
 */
public class EstrusAdd implements Serializable {
    private String createTime;
    /**
     * id : 7X5i977iTte0nm/2gS8ACRO33n8=
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
    private String Fivouchered;
    private String bizDate;
    private String hasEffected;
    /**
     * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
     */

    private PigCompanyBean pigCompany;
    /**
     * alias : 未删
     * value : 0
     */

    private DrBean dr;
    /**
     * id : H4oAAAEwZc9XKfMi
     * batch : {"id":"H4oAAAEvCiW9z5bb"}
     * esfrt : 2018-08-13 00:00:13
     * seq : 1
     * parent : {"id":"H4oAAAEwZc5gLKMw"}
     * escn : 1
     * borno : {"id":"H4oAAAEvCiZFQNub"}
     * location : {"id":"H4oAAAEqicwt8Ui3"}
     * canBreed : false
     */

    private List<EntriesBean> Entries;

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

    public void setFivouchered(String Fivouchered) {
        this.Fivouchered = Fivouchered;
    }

    public void setBizDate(String bizDate) {
        this.bizDate = bizDate;
    }

    public void setHasEffected(String hasEffected) {
        this.hasEffected = hasEffected;
    }

    public void setPigCompany(PigCompanyBean pigCompany) {
        this.pigCompany = pigCompany;
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

    public PigFarmBean getPigFarm() {
        return pigFarm;
    }

    public LastUpdateUserBean getLastUpdateUser() {
        return lastUpdateUser;
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

    public String getFivouchered() {
        return Fivouchered;
    }

    public String getBizDate() {
        return bizDate;
    }

    public String getHasEffected() {
        return hasEffected;
    }

    public PigCompanyBean getPigCompany() {
        return pigCompany;
    }

    public DrBean getDr() {
        return dr;
    }

    public List<EntriesBean> getEntries() {
        return Entries;
    }

    public static class AuditorBean {
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
        private String id;
        /**
         * id : H4oAAAEvCiW9z5bb
         */

        private BatchBean batch;
        private String esfrt;
        private String essec;
        private String esthr;
        private String seq;
        /**
         * id : H4oAAAEwZc5gLKMw
         */

        private ParentBean parent;
        private String escn;
        /**
         * id : H4oAAAEvCiZFQNub
         */

        private BornoBean borno;
        /**
         * id : H4oAAAEqicwt8Ui3
         */

        private PkPigfenBean location;
        private String canBreed;

        public void setId(String id) {
            this.id = id;
        }

        public void setBatch(BatchBean batch) {
            this.batch = batch;
        }

        public String getEssec() {
            if(essec==null){
                return "";
            }
            return essec.substring(0,10);
        }

        public void setEssec(String essec) {
            this.essec = essec;
        }

        public String getEsthr() {
            if(esthr==null){
                return "";
            }
            return esthr.substring(0,10);
        }

        public void setEsthr(String esthr) {
            this.esthr = esthr;
        }

        public void setEsfrt(String esfrt) {
            this.esfrt = esfrt;
        }

        public void setSeq(String seq) {
            this.seq = seq;
        }

        public void setParent(ParentBean parent) {
            this.parent = parent;
        }

        public void setEscn(String escn) {
            this.escn = escn;
        }

        public void setBorno(BornoBean borno) {
            this.borno = borno;
        }

        public void setLocation(PkPigfenBean location) {
            this.location = location;
        }

        public void setCanBreed(String canBreed) {
            this.canBreed = canBreed;
        }

        public String getId() {
            return id;
        }

        public BatchBean getBatch() {
            return batch;
        }

        public String getEsfrt() {
            if(esfrt==null){
                return "";
            }
            return esfrt.substring(0,10);
        }

        public String getSeq() {
            return seq;
        }

        public ParentBean getParent() {
            return parent;
        }

        public String getEscn() {
            return escn;
        }

        public BornoBean getBorno() {
            return borno;
        }

        public PkPigfenBean getLocation() {
            return location;
        }

        public String getCanBreed() {
            return canBreed;
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

        public static class ParentBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class BornoBean {
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

        public static class PkPigfenBean {
            private String id;
            private String number;
            private String name;

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


    }
    public static EstrusAdd getNewBean(){
        EstrusAdd bean = new EstrusAdd();
        bean.setStorageOrg(new StorageOrgBean());
        bean.setPigFarm(new PigFarmBean());
        bean.setPigCompany(new PigCompanyBean());
        bean.setLastUpdateUser(new LastUpdateUserBean());
        bean.setField(new FieldBean());

        bean.setCU(new CUBean());
        bean.setCreator(new CreatorBean());
        bean.setBaseStatus(new BaseStatusBean());
        bean.setAuditor(new AuditorBean());
        return bean;
    }
    public static EntriesBean getNewEntry(){
        EntriesBean bean = new EntriesBean();

        bean.setBatch(new EntriesBean.BatchBean());

        bean.setBorno(new EntriesBean.BornoBean());

        bean.setParent(new EntriesBean.ParentBean());

        bean.setLocation(new EntriesBean.PkPigfenBean());

        return bean;
    }
}
