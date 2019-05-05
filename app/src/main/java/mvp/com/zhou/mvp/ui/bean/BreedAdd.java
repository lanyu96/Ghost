package mvp.com.zhou.mvp.ui.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by fei on 2018/3/9.
 */
public class BreedAdd implements Serializable {
    private String pzType;
    private String testborno;
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
    private String childBirthDate;
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
     * id : H4oAAAEqjf38qPq9
     */

    private BatchBean batch;
    /**
     * alias : 审核
     * value : 4
     */

    private BaseStatusBean baseStatus;
    private String temp;
    private String Fivouchered;
    private String bizDate;
    private String hasEffected;
    /**
     * alias : 未删
     * value : 0
     */

    private DrBean dr;
    /**
     * createTime : 2018-02-26 17:20:26
     * tgapm : {"alias":"上午","value":"1"}
     * auditor : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * lastUpdateTime : 2018-02-26 17:21:26
     * score : 9.8
     * lastUpdateUser : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * actor : {"id":"H4oAAAEqic7V7Otk"}
     * storageOrg : {"id":"bG9XO093SUyR1HcJ1HpOFcznrtQ="}
     * sowno : {"id":"4a05v0x2TWmmiZaR+BYG5UVA25s="}
     * creator : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * id : H4oAAAEqjgNF1vAT
     * servicetype : {"alias":"流产配种","value":"5"}
     * auditTime : 2018-02-26 17:21:26
     * baseStatus : {"alias":"审核","value":"4"}
     * borno : {"id":"Z7zFjE6tSWmviuu2qNJZZUVA25s="}
     * hasEffected : false
     * dr : {"alias":"未删","value":"0"}
     * avefemale : 0
     * tgsup : false
     * CU : {"id":"bG9XO093SUyR1HcJ1HpOFcznrtQ="}
     * servicecurpt : 0
     * childBirthDate : 2017-09-01 00:00:01
     * pigFarm : {"id":"H4oAAAEqZqO4/eJt"}
     * newPk_pigfen : {"id":"H4oAAAEqicgt8Ui3"}
     * parent : {"id":"H4oAAAEqjgKGXCIe"}
     * number : PZJL2017030200041
     * field : {"id":"H4oAAAEqZzqdu1vk"}
     * ishbmale : false
     * batch : {"id":"H4oAAAEqjf38qPq9"}
     * column : 0
     * temp : 0
     * Fivouchered : false
     * qingqi : 1
     * pk_pigfen : {"id":"H4oAAAEqicgt8Ui3"}
     * bizDate : 2017-05-10 00:00:10
     * oldColumn : 0
     * pigCompany : {"id":"bG9XO093SUyR1HcJ1HpOFcznrtQ="}
     */

    private List<EntriesBean> entries;

    public String getPzType() {
        return pzType;
    }

    public void setPzType(String pzType) {
        this.pzType = pzType;
    }

    public String getTestborno() {
        return testborno;
    }

    public void setTestborno(String testborno) {
        this.testborno = testborno;
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

    public void setChildBirthDate(String childBirthDate) {
        this.childBirthDate = childBirthDate;
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

    public void setBatch(BatchBean batch) {
        this.batch = batch;
    }

    public void setBaseStatus(BaseStatusBean baseStatus) {
        this.baseStatus = baseStatus;
    }

    public void setTemp(String temp) {
        this.temp = temp;
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

    public void setEntries(List<EntriesBean> entries) {
        this.entries = entries;
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

    public String getChildBirthDate() {
        return childBirthDate;
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

    public BatchBean getBatch() {
        return batch;
    }

    public BaseStatusBean getBaseStatus() {
        return baseStatus;
    }

    public String getTemp() {
        return temp;
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

    public List<EntriesBean> getEntries() {
        return entries;
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

    public static class BatchBean {
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

    public static class EntriesBean {
        //===============================================================================================
        private String isPo;
        private String testborno;

        private String jyly;
        /**
         * id : sKPCyBx3S6CTaeLj/e5A8L3Plts=
         */

        private SnowHide snowHide;
        /**
         * snowHide : {"id":"sKPCyBx3S6CTaeLj/e5A8L3Plts="}
         * LLCK : false
         * SCRK : false
         */

        private String LLCK;
        private String SCRK;
        /**
         * alias : 人工
         * value : 1
         */

        private PzType pzType;

        public String getJyly() {
            return jyly;
        }

        public void setJyly(String jyly) {
            this.jyly = jyly;
        }

        public void setIsPo(String isPo) {
            this.isPo = isPo;
        }



        public String getTestborno() {
            return testborno;
        }

        public void setTestborno(String testborno) {
            this.testborno = testborno;
        }

        public boolean getIsPo() {
            return "true".equals(isPo) ? true : false;
        }

        public void setIsPo(boolean isPo) {
            this.isPo = isPo ? "true" : "false";
        }

        //===============================================================================================
        private String createTime;
        /**
         * alias : 上午
         * value : 1
         */

        private TgapmBean tgapm;
        /**
         * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
         */

        private AuditorBean auditor;
        private String lastUpdateTime;
        private String score;
        /**
         * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
         */

        private LastUpdateUserBean lastUpdateUser;
        /**
         * id : H4oAAAEqic7V7Otk
         */

        private ActorBean actor;
        /**
         * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
         */

        private StorageOrgBean storageOrg;
        /**
         * id : 4a05v0x2TWmmiZaR+BYG5UVA25s=
         */

        private SownoBean sowno;
        /**
         * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
         */

        private CreatorBean creator;
        private String id;
        /**
         * alias : 流产配种
         * value : 5
         */

        private ServicetypeBean servicetype;
        private String auditTime;
        /**
         * alias : 审核
         * value : 4
         */

        private BaseStatusBean baseStatus;
        /**
         * id : Z7zFjE6tSWmviuu2qNJZZUVA25s=
         */

        private BornoBean borno;
        private String hasEffected;
        /**
         * alias : 未删
         * value : 0
         */

        private DrBean dr;
        private String avefemale;
        private String tgsup;
        /**
         * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
         */

        private CUBean CU;
        private String servicecurpt;
        private String childBirthDate;
        /**
         * id : H4oAAAEqZqO4/eJt
         */

        private PigFarmBean pigFarm;
        /**
         * id : H4oAAAEqicgt8Ui3
         */

        private NewPkPigfenBean newPk_pigfen;
        /**
         * id : H4oAAAEqjgKGXCIe
         */

        private ParentBean parent;
        private String number;
        /**
         * id : H4oAAAEqZzqdu1vk
         */

        private FieldBean field;
        private String ishbmale;
        /**
         * id : H4oAAAEqjf38qPq9
         */

        private BatchBean batch;
        private String column;
        private String temp;
        private String Fivouchered;
        private String qingqi;
        /**
         * id : H4oAAAEqicgt8Ui3
         */

        private PkPigfenBean pk_pigfen;
        private String bizDate;
        private String oldColumn;
        /**
         * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
         */

        private PigCompanyBean pigCompany;
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

        public void setTgapm(TgapmBean tgapm) {
            this.tgapm = tgapm;
        }

        public void setAuditor(AuditorBean auditor) {
            this.auditor = auditor;
        }

        public void setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
        }

        public void setScore(String score) {
            this.score = score;
        }

        public void setLastUpdateUser(LastUpdateUserBean lastUpdateUser) {
            this.lastUpdateUser = lastUpdateUser;
        }

        public void setActor(ActorBean actor) {
            this.actor = actor;
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

        public void setServicetype(ServicetypeBean servicetype) {
            this.servicetype = servicetype;
        }

        public void setAuditTime(String auditTime) {
            this.auditTime = auditTime;
        }

        public void setBaseStatus(BaseStatusBean baseStatus) {
            this.baseStatus = baseStatus;
        }

        public void setBorno(BornoBean borno) {
            this.borno = borno;
        }

        public void setHasEffected(String hasEffected) {
            this.hasEffected = hasEffected;
        }

        public void setDr(DrBean dr) {
            this.dr = dr;
        }

        public void setAvefemale(String avefemale) {
            this.avefemale = avefemale;
        }

        public void setTgsup(String tgsup) {
            this.tgsup = tgsup;
        }

        public void setCU(CUBean CU) {
            this.CU = CU;
        }

        public void setServicecurpt(String servicecurpt) {
            this.servicecurpt = servicecurpt;
        }

        public void setChildBirthDate(String childBirthDate) {
            this.childBirthDate = childBirthDate;
        }

        public void setPigFarm(PigFarmBean pigFarm) {
            this.pigFarm = pigFarm;
        }

        public void setNewPk_pigfen(NewPkPigfenBean newPk_pigfen) {
            this.newPk_pigfen = newPk_pigfen;
        }

        public void setParent(ParentBean parent) {
            this.parent = parent;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public void setField(FieldBean field) {
            this.field = field;
        }

        public void setIshbmale(String ishbmale) {
            this.ishbmale = ishbmale;
        }

        public void setBatch(BatchBean batch) {
            this.batch = batch;
        }

        public void setColumn(String column) {
            this.column = column;
        }

        public void setTemp(String temp) {
            this.temp = temp;
        }

        public void setFivouchered(String Fivouchered) {
            this.Fivouchered = Fivouchered;
        }

        public void setQingqi(String qingqi) {
            this.qingqi = qingqi;
        }

        public void setPk_pigfen(PkPigfenBean pk_pigfen) {
            this.pk_pigfen = pk_pigfen;
        }

        public void setBizDate(String bizDate) {
            this.bizDate = bizDate;
        }

        public void setOldColumn(String oldColumn) {
            this.oldColumn = oldColumn;
        }

        public void setPigCompany(PigCompanyBean pigCompany) {
            this.pigCompany = pigCompany;
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

        public String getLastUpdateTime() {
            return lastUpdateTime;
        }

        public String getScore() {
            return score;
        }

        public LastUpdateUserBean getLastUpdateUser() {
            return lastUpdateUser;
        }

        public ActorBean getActor() {
            return actor;
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

        public ServicetypeBean getServicetype() {
            return servicetype;
        }

        public String getAuditTime() {
            return auditTime;
        }

        public BaseStatusBean getBaseStatus() {
            return baseStatus;
        }

        public BornoBean getBorno() {
            return borno;
        }

        public String getHasEffected() {
            return hasEffected;
        }

        public DrBean getDr() {
            return dr;
        }

        public String getAvefemale() {
            return avefemale;
        }

        public String getTgsup() {
            return tgsup;
        }

        public CUBean getCU() {
            return CU;
        }

        public String getServicecurpt() {
            return servicecurpt;
        }

        public String getChildBirthDate() {
            return childBirthDate;
        }

        public PigFarmBean getPigFarm() {
            return pigFarm;
        }

        public NewPkPigfenBean getNewPk_pigfen() {
            return newPk_pigfen;
        }

        public ParentBean getParent() {
            return parent;
        }

        public String getNumber() {
            return number;
        }

        public FieldBean getField() {
            return field;
        }

        public String getIshbmale() {
            return ishbmale;
        }

        public BatchBean getBatch() {
            return batch;
        }

        public String getColumn() {
            return column;
        }

        public String getTemp() {
            return temp;
        }

        public String getFivouchered() {
            return Fivouchered;
        }

        public String getQingqi() {
            return qingqi;
        }

        public PkPigfenBean getPk_pigfen() {
            return pk_pigfen;
        }

        public String getBizDate() {
            return bizDate;
        }

        public String getOldColumn() {
            return oldColumn;
        }

        public PigCompanyBean getPigCompany() {
            return pigCompany;
        }

        public void setSnowHide(SnowHide snowHide) {
            this.snowHide = snowHide;
        }

        public void setLLCK(String LLCK) {
            this.LLCK = LLCK;
        }

        public void setSCRK(String SCRK) {
            this.SCRK = SCRK;
        }

        public SnowHide getSnowHide() {
            return snowHide;
        }

        public String getLLCK() {
            return LLCK;
        }

        public String getSCRK() {
            return SCRK;
        }

        public void setPzType(PzType pzType) {
            this.pzType = pzType;
        }

        public PzType getPzType() {
            return pzType;
        }

        public static class TgapmBean {
            private String alias;
            private String value;

            public void setAlias(String alias) {
                this.alias = alias;
            }

            public void setValue(String value) {
                if ("上午".equals(value)) {
                    this.value = "1";
                } else if ("中午".equals(value)) {
                    this.value = "2";
                } else {
                    this.value = "3";
                }
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

        public static class ActorBean {
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

        public static class ServicetypeBean {
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

        public static class NewPkPigfenBean {
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

        public static class FieldBean {
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

        public static class PigCompanyBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class SnowHide {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class PzType {
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
    }
    public static BreedAdd getNewBean(){
        BreedAdd bean = new BreedAdd();
        bean.setStorageOrg(new StorageOrgBean());
        bean.setPigFarm(new PigFarmBean());
        bean.setLastUpdateUser(new LastUpdateUserBean());
        bean.setField(new FieldBean());

        bean.setCU(new CUBean());
        bean.setCreator(new CreatorBean());
        bean.setBatch(new BatchBean());
        bean.setBaseStatus(new BaseStatusBean());
        bean.setAuditor(new AuditorBean());
        return bean;
    }
    public static BreedAdd.EntriesBean getNewEntry() {

        BreedAdd.EntriesBean bean = new BreedAdd.EntriesBean();

        bean.setActor(new EntriesBean.ActorBean());
        bean.setAuditor(new EntriesBean.AuditorBean());
        bean.setBaseStatus(new EntriesBean.BaseStatusBean());
        bean.setBatch(new EntriesBean.BatchBean());
        bean.setBorno(new EntriesBean.BornoBean());
        bean.setCreator(new EntriesBean.CreatorBean());
        bean.setCU(new EntriesBean.CUBean());

        bean.setField(new EntriesBean.FieldBean());
        bean.setLastUpdateUser(new EntriesBean.LastUpdateUserBean());

        bean.setTgapm(new EntriesBean.TgapmBean());
        bean.setStorageOrg(new EntriesBean.StorageOrgBean());
        bean.setSowno(new EntriesBean.SownoBean());
        bean.setPk_pigfen(new EntriesBean.PkPigfenBean());
        bean.setServicetype(new EntriesBean.ServicetypeBean());
        bean.setPigFarm(new EntriesBean.PigFarmBean());
        bean.setPigCompany(new EntriesBean.PigCompanyBean());
        bean.setParent(new EntriesBean.ParentBean());
        return bean;
    }

}
