package mvp.com.zhou.mvp.ui.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/12/14 12:02
 * @Description:
 */
public class FarrowAdd implements Serializable {
    private String faawt;
    private String createTime;
    private String inhur;
    private String avgwt;
    private String lastUpdateTime;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private LastUpdateUserBean lastUpdateUser;
    private String ilive;
    /**
     * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
     */

    private StorageOrgBean storageOrg;
    private String ifmal;
    private String imale;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private CreatorBean creator;
    private String id;
    private String pitno;
    private String parit;
    /**
     * alias : 保存
     * value : 1
     */

    private BaseStatusBean baseStatus;
    private String hasEffected;
    /**
     * id : H4oAAAEqic8q0/c9
     */

    private FeederBean feeder;
    /**
     * alias : 已删
     * value : 1
     */

    private DrBean dr;
    private String idith;
    /**
     * id : H4oAAAEqijC9z5bb
     */

    private BthnoBean bthno;
    /**
     * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
     */

    private CUBean CU;
    private String incnt;
    /**
     * id : H4oAAAEqZqO4/eJt
     */

    private PigFarmBean pigFarm;
    private String number;
    private String farrday;
    /**
     * id : H4oAAAEqZzqdu1vk
     */
    private NewPk_PigstockBean newPk_pigstock;

    private FieldBean field;
    private String imumy;
    private String Fivouchered;
    private String bizDate;
    private String iweak;
    private String iderm;
    /**
     * faawt : 55
     * createTime : 2018-02-26 15:31:26
     * inhur : 0
     * avgwt : 5.5
     * lastUpdateTime : 2018-02-26 15:36:26
     * lastUpdateUser : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * ilive : 10
     * pk_pigstock : {"id":"H4oAAAEqicgt8Ui3"}
     * storageOrg : {"id":"bG9XO093SUyR1HcJ1HpOFcznrtQ="}
     * ifmal : 5
     * sowno : {"id":"TLd8RC5ZSZ24xAqrCsAsikVA25s="}
     * creator : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * imale : 5
     * id : H4oAAAEqijI9MGsB
     * pitno : 0
     * parit : 0
     * baseStatus : {"alias":"保存","value":"1"}
     * borno : {"id":"DJXNaeS4RjKely2oE+hkF0VA25s="}
     * hasEffected : false
     * dr : {"alias":"已删","value":"1"}
     * feeder : {"id":"H4oAAAEqic8q0/c9"}
     * idith : 1
     * bthno : {"id":"H4oAAAEqijC9z5bb"}
     * CU : {"id":"bG9XO093SUyR1HcJ1HpOFcznrtQ="}
     * servicedate : 2017-01-31 00:00:31
     * incnt : 12
     * birthParit : 1
     * pigFarm : {"id":"H4oAAAEqZqO4/eJt"}
     * number : DEL_FMJL2017052500011
     * sourceBillId : H4oAAAEqiiRF1vAT
     * farrday : 114
     * isMixMating : false
     * field : {"id":"H4oAAAEqZzqdu1vk"}
     * isDifficult : false
     * imumy : 1
     * column : 0
     * Fivouchered : false
     * bizDate : 2017-05-25 00:00:25
     * Entrys : []
     * oldColumn : 0
     * pigCompany : {"id":"bG9XO093SUyR1HcJ1HpOFcznrtQ="}
     * parentBatch : {"id":"H4oAAAEqijFHh4Pl"}
     * iweak : 0
     * iderm : 0
     */

    private List<RecordsBean> records;

    public NewPk_PigstockBean getNewPk_pigstock() {
        return newPk_pigstock;
    }

    public void setNewPk_pigstock(NewPk_PigstockBean newPk_pigstock) {
        this.newPk_pigstock = newPk_pigstock;
    }

    public void setFaawt(String faawt) {
        this.faawt = faawt;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setInhur(String inhur) {
        this.inhur = inhur;
    }

    public void setAvgwt(String avgwt) {
        this.avgwt = avgwt;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setLastUpdateUser(LastUpdateUserBean lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public void setIlive(String ilive) {
        this.ilive = ilive;
    }

    public void setStorageOrg(StorageOrgBean storageOrg) {
        this.storageOrg = storageOrg;
    }

    public void setIfmal(String ifmal) {
        this.ifmal = ifmal;
    }

    public void setImale(String imale) {
        this.imale = imale;
    }

    public void setCreator(CreatorBean creator) {
        this.creator = creator;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPitno(String pitno) {
        this.pitno = pitno;
    }

    public void setParit(String parit) {
        this.parit = parit;
    }

    public void setBaseStatus(BaseStatusBean baseStatus) {
        this.baseStatus = baseStatus;
    }

    public void setHasEffected(String hasEffected) {
        this.hasEffected = hasEffected;
    }

    public void setFeeder(FeederBean feeder) {
        this.feeder = feeder;
    }

    public void setDr(DrBean dr) {
        this.dr = dr;
    }

    public void setIdith(String idith) {
        this.idith = idith;
    }

    public void setBthno(BthnoBean bthno) {
        this.bthno = bthno;
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

    public void setNumber(String number) {
        this.number = number;
    }

    public void setFarrday(String farrday) {
        this.farrday = farrday;
    }

    public void setField(FieldBean field) {
        this.field = field;
    }

    public void setImumy(String imumy) {
        this.imumy = imumy;
    }

    public void setFivouchered(String Fivouchered) {
        this.Fivouchered = Fivouchered;
    }

    public void setBizDate(String bizDate) {
        this.bizDate = bizDate;
    }

    public void setIweak(String iweak) {
        this.iweak = iweak;
    }

    public void setIderm(String iderm) {
        this.iderm = iderm;
    }

    public void setRecords(List<RecordsBean> records) {
        this.records = records;
    }

    public String getFaawt() {
        return faawt;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getInhur() {
        return inhur;
    }

    public String getAvgwt() {
        return avgwt;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public LastUpdateUserBean getLastUpdateUser() {
        return lastUpdateUser;
    }

    public String getIlive() {
        return ilive;
    }

    public StorageOrgBean getStorageOrg() {
        return storageOrg;
    }

    public String getIfmal() {
        return ifmal;
    }

    public String getImale() {
        return imale;
    }

    public CreatorBean getCreator() {
        return creator;
    }

    public String getId() {
        return id;
    }

    public String getPitno() {
        return pitno;
    }

    public String getParit() {
        return parit;
    }

    public BaseStatusBean getBaseStatus() {
        return baseStatus;
    }

    public String getHasEffected() {
        return hasEffected;
    }

    public FeederBean getFeeder() {
        return feeder;
    }

    public DrBean getDr() {
        return dr;
    }

    public String getIdith() {
        return idith;
    }

    public BthnoBean getBthno() {
        return bthno;
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

    public String getNumber() {
        return number;
    }

    public String getFarrday() {
        return farrday;
    }

    public FieldBean getField() {
        return field;
    }

    public String getImumy() {
        return imumy;
    }

    public String getFivouchered() {
        return Fivouchered;
    }

    public String getBizDate() {
        return bizDate;
    }

    public String getIweak() {
        return iweak;
    }

    public String getIderm() {
        return iderm;
    }

    public List<RecordsBean> getRecords() {
        return records;
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

    public static class FeederBean {
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

    public static class BthnoBean {
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

    public static class NewPk_PigstockBean {
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

    public static class RecordsBean {
        private String fosterageOut;
        private String fosterageIn;
        private String faawt;
        private String createTime;
        private String inhur;
        private String avgwt;
        private String lastUpdateTime;
        private String blackDead;
        private String whiteDead;

        public String getWhiteDead() {
            return whiteDead;
        }

        public void setWhiteDead(String whiteDead) {
            this.whiteDead = whiteDead;
        }

        public String getBlackDead() {
            return blackDead;
        }

        public void setBlackDead(String blackDead) {
            this.blackDead = blackDead;
        }

        /**
         * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
         */

        private LastUpdateUserBean lastUpdateUser;
        private String ilive;
        /**
         * id : H4oAAAEqicgt8Ui3
         */

        private PkPigstockBean pk_pigstock;
        /**
         * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
         */

        private StorageOrgBean storageOrg;
        private String ifmal;
        /**
         * id : TLd8RC5ZSZ24xAqrCsAsikVA25s=
         */

        private SownoBean sowno;
        /**
         * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
         */

        private CreatorBean creator;
        private String imale;
        private String id;
        private String pitno;
        private String parit;
        /**
         * alias : 保存
         * value : 1
         */

        private BaseStatusBean baseStatus;
        /**
         * id : DJXNaeS4RjKely2oE+hkF0VA25s=
         */

        private BornoBean borno;
        private String hasEffected;
        /**
         * alias : 已删
         * value : 1
         */

        private DrBean dr;
        /**
         * id : H4oAAAEqic8q0/c9
         */

        private FeederBean feeder;
        private String idith;
        /**
         * id : H4oAAAEqijC9z5bb
         */

        private BthnoBean bthno;
        /**
         * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
         */

        private CUBean CU;
        private String servicedate;
        private String incnt;
        private String birthParit;
        /**
         * id : H4oAAAEqZqO4/eJt
         */

        private PigFarmBean pigFarm;
        private String number;
        private String sourceBillId;
        private String farrday;
        private String isMixMating;
        /**
         * id : H4oAAAEqZzqdu1vk
         */

        private FieldBean field;
        private String isDifficult;
        private String imumy;
        private String column;
        private String Fivouchered;
        private String bizDate;
        private String oldColumn;
        /**
         * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
         */

        private PigCompanyBean pigCompany;
        /**
         * id : H4oAAAEqijFHh4Pl
         */

        private ParentBatchBean parentBatch;
        private String iweak;
        private String iderm;
        private List<?> Entrys;
        private NewPk_PigstockBean newPk_pigstock;

        private String rmark;

        public NewPk_PigstockBean getNewPk_pigstock() {
            return newPk_pigstock;
        }

        public void setNewPk_pigstock(NewPk_PigstockBean newPk_pigstock) {
            this.newPk_pigstock = newPk_pigstock;
        }

        public void setFaawt(String faawt) {
            if ("".equals(faawt)) {
                this.faawt = "0";
            }
            this.faawt = faawt;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public void setInhur(String inhur) {
            if ("".equals(inhur)) {
                this.inhur = "0";
            }
            this.inhur = inhur;
        }

        public void setAvgwt(String avgwt) {
            this.avgwt = avgwt;
        }

        public void setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
        }

        public void setLastUpdateUser(LastUpdateUserBean lastUpdateUser) {
            this.lastUpdateUser = lastUpdateUser;
        }

        public void setIlive(String ilive) {
            this.ilive = ilive;
        }

        public void setPk_pigstock(PkPigstockBean pk_pigstock) {
            this.pk_pigstock = pk_pigstock;
        }

        public void setStorageOrg(StorageOrgBean storageOrg) {
            this.storageOrg = storageOrg;
        }

        public void setIfmal(String ifmal) {
            this.ifmal = ifmal;
        }

        public void setSowno(SownoBean sowno) {
            this.sowno = sowno;
        }

        public void setCreator(CreatorBean creator) {
            this.creator = creator;
        }

        public void setImale(String imale) {
            this.imale = imale;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setPitno(String pitno) {
            this.pitno = pitno;
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

        public void setHasEffected(String hasEffected) {
            this.hasEffected = hasEffected;
        }

        public void setDr(DrBean dr) {
            this.dr = dr;
        }

        public void setFeeder(FeederBean feeder) {
            this.feeder = feeder;
        }

        public void setIdith(String idith) {
            if ("".equals(idith)) {
                this.idith = "0";
            }
            this.idith = idith;
        }

        public void setBthno(BthnoBean bthno) {
            this.bthno = bthno;
        }

        public void setCU(CUBean CU) {
            this.CU = CU;
        }

        public void setServicedate(String servicedate) {
            this.servicedate = servicedate;
        }

        public void setIncnt(String incnt) {
            this.incnt = incnt;
        }

        public void setBirthParit(String birthParit) {
            this.birthParit = birthParit;
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

        public void setFarrday(String farrday) {
            this.farrday = farrday;
        }

        public void setIsMixMating(String isMixMating) {
            this.isMixMating = isMixMating;
        }

        public void setField(FieldBean field) {
            this.field = field;
        }

        public void setIsDifficult(String isDifficult) {
            if ("是".equals(isDifficult)) {
                this.isDifficult = "true";
            } else {
                this.isDifficult = "false";
            }
        }

        public void setImumy(String imumy) {
            if ("".equals(imumy)) {
                this.imumy = "0";
            }
            this.imumy = imumy;
        }

        public void setColumn(String column) {
            this.column = column;
        }

        public void setFivouchered(String Fivouchered) {
            this.Fivouchered = Fivouchered;
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

        public void setParentBatch(ParentBatchBean parentBatch) {
            this.parentBatch = parentBatch;
        }

        public void setIweak(String iweak) {
            if ("".equals(iweak)) {
                this.iweak = "0";
            }
            this.iweak = iweak;
        }

        public void setIderm(String iderm) {
            if ("".equals(iderm)) {
                this.iderm = "0";
            }
            this.iderm = iderm;
        }

        public void setEntrys(List<?> Entrys) {
            this.Entrys = Entrys;
        }

        public String getFosterageOut() {
            return fosterageOut;
        }

        public void setFosterageOut(String fosterageOut) {
            this.fosterageOut = fosterageOut;
        }

        public String getFosterageIn() {
            return fosterageIn;
        }

        public void setFosterageIn(String fosterageIn) {
            this.fosterageIn = fosterageIn;
        }

        public String getRmark() {
            return rmark;
        }

        public void setRmark(String rmark) {
            this.rmark = rmark;
        }

        public String getFaawt() {
            return faawt;
        }

        public String getCreateTime() {
            return createTime;
        }

        public String getInhur() {
            return inhur;
        }

        public String getAvgwt() {
            return avgwt;
        }

        public String getLastUpdateTime() {
            return lastUpdateTime;
        }

        public LastUpdateUserBean getLastUpdateUser() {
            return lastUpdateUser;
        }

        public String getIlive() {
            return ilive;
        }

        public PkPigstockBean getPk_pigstock() {
            return pk_pigstock;
        }

        public StorageOrgBean getStorageOrg() {
            return storageOrg;
        }

        public String getIfmal() {
            return ifmal;
        }

        public SownoBean getSowno() {
            return sowno;
        }

        public CreatorBean getCreator() {
            return creator;
        }

        public String getImale() {
            return imale;
        }

        public String getId() {
            return id;
        }

        public String getPitno() {
            return pitno;
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

        public String getHasEffected() {
            return hasEffected;
        }

        public DrBean getDr() {
            return dr;
        }

        public FeederBean getFeeder() {
            return feeder;
        }

        public String getIdith() {
            return idith;
        }

        public BthnoBean getBthno() {
            return bthno;
        }

        public CUBean getCU() {
            return CU;
        }

        public String getServicedate() {
            return servicedate;
        }

        public String getIncnt() {
            return incnt;
        }

        public String getBirthParit() {
            return birthParit;
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

        public String getFarrday() {
            return farrday;
        }

        public String getIsMixMating() {
            return isMixMating;
        }

        public FieldBean getField() {
            return field;
        }

        public String getIsDifficult() {
            return isDifficult;
        }

        public String getImumy() {
            return imumy;
        }

        public String getColumn() {
            return column;
        }

        public String getFivouchered() {
            return Fivouchered;
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

        public ParentBatchBean getParentBatch() {
            return parentBatch;
        }

        public String getIweak() {
            return iweak;
        }

        public String getIderm() {
            return iderm;
        }

        public List<?> getEntrys() {
            return Entrys;
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

        public static class PkPigstockBean {
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

        public static class NewPk_PigstockBean {
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

        public static class FeederBean {
            private String id;

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

        public static class PigCompanyBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class ParentBatchBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }
    }

    public static FarrowAdd getNewBean() {
        FarrowAdd bean = new FarrowAdd();
        bean.setStorageOrg(new StorageOrgBean());
        bean.setPigFarm(new PigFarmBean());
        bean.setNewPk_pigstock(new NewPk_PigstockBean());
        bean.setLastUpdateUser(new LastUpdateUserBean());
        bean.setRecords(new ArrayList<RecordsBean>());
        bean.getRecords().add(getNewRecord());
        bean.setField(new FieldBean());
        bean.setFeeder(new FeederBean());

        bean.setCU(new CUBean());
        bean.setCreator(new CreatorBean());
        bean.setBthno(new BthnoBean());
        bean.setBaseStatus(new BaseStatusBean());
        return bean;
    }

    private static RecordsBean getNewRecord() {
        RecordsBean bean = new RecordsBean();
        bean.setStorageOrg(new RecordsBean.StorageOrgBean());
        bean.setSowno(new RecordsBean.SownoBean());
        bean.setPk_pigstock(new RecordsBean.PkPigstockBean());
        bean.setPigFarm(new RecordsBean.PigFarmBean());
        bean.setPigCompany(new RecordsBean.PigCompanyBean());
        bean.setParentBatch(new RecordsBean.ParentBatchBean());
        bean.setNewPk_pigstock(new RecordsBean.NewPk_PigstockBean());
        bean.setLastUpdateUser(new RecordsBean.LastUpdateUserBean());
        bean.setField(new RecordsBean.FieldBean());
        bean.setFeeder(new RecordsBean.FeederBean());

        bean.setCU(new RecordsBean.CUBean());
        bean.setCreator(new RecordsBean.CreatorBean());
        bean.setBthno(new RecordsBean.BthnoBean());
        bean.setBorno(new RecordsBean.BornoBean());
        bean.setBaseStatus(new RecordsBean.BaseStatusBean());
        return bean;
    }
}
