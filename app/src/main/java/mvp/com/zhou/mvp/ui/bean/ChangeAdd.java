package mvp.com.zhou.mvp.ui.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/12/14 20:01
 * @Description:
 */
public class ChangeAdd implements Serializable {
    /**
     * id : H4oAAAEqnX69z5bb
     */

    private IndnoBean indno;
    private String createTime;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private AuditorBean auditor;
    private String isspz;
    private String lastUpdateTime;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private LastUpdateUserBean lastUpdateUser;
    /**
     * id : H4oAAAEqic0t8Ui3
     */

    private InpenBean inpen;
    /**
     * id : H4oAAAErJo+9z5bb
     */

    private InbthBean inbth;
    /**
     * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
     */

    private StorageOrgBean storageOrg;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private CreatorBean creator;
    private String id;
    private String outPigType;
    private String inwgt;
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
    private String iskfc;
    /**
     * id : H4oAAAEi2SX59ACn
     */

    private TranstypeBean transtype;
    /**
     * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
     */

    private CUBean CU;
    private String incnt;
    private String inPigType;
    /**
     * id : H4oAAAEqZqO4/eJt
     */

    private PigFarmBean pigFarm;
    /**
     * id : H4oAAAEqic0t8Ui3
     */

    private OtpenBean otpen;
    private String inday;
    /**
     * id : H4oAAAEqZzqdu1vk
     */

    private FieldBean field;
    private ZrfieldBean zrfield;
    private String Fivouchered;
    private String bizDate;
    /**
     * id : bG9XO093SUyR1HcJ1HpOFcznrtQ=
     */

    private PigCompanyBean pigCompany;
    /**
     * id : H4oAAAEs6z/bE5Aa
     * sex : {"alias":"公","value":"0"}
     * seq : 1
     * parent : {"id":"H4oAAAEs6z6Rgss4"}
     * choose : true
     * Cfarm : {"id":"OdPznkVZQZ285VVweMRCvUVA25s="}
     */
    private ConfirmPerson confirmPerson;
    private List<EntryBean> Entry;

    public ConfirmPerson getConfirmPerson() {
        return confirmPerson;
    }

    public void setConfirmPerson(ConfirmPerson confirmPerson) {
        this.confirmPerson = confirmPerson;
    }

    public ZrfieldBean getZrfield() {
        return zrfield;
    }

    public void setZrfield(ZrfieldBean zrfield) {
        this.zrfield = zrfield;
    }

    public void setIndno(IndnoBean indno) {
        this.indno = indno;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setAuditor(AuditorBean auditor) {
        this.auditor = auditor;
    }

    public void setIsspz(String isspz) {
        this.isspz = isspz;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setLastUpdateUser(LastUpdateUserBean lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public void setInpen(InpenBean inpen) {
        this.inpen = inpen;
    }

    public void setInbth(InbthBean inbth) {
        this.inbth = inbth;
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

    public void setOutPigType(String outPigType) {
        this.outPigType = outPigType;
    }

    public void setInwgt(String inwgt) {
        this.inwgt = inwgt;
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

    public void setIskfc(String iskfc) {
        if ("是".equals(iskfc)) {
            this.iskfc = "true";
        } else {
            this.iskfc = "false";
        }
    }

    public void setTranstype(TranstypeBean transtype) {
        this.transtype = transtype;
    }

    public void setCU(CUBean CU) {
        this.CU = CU;
    }

    public void setIncnt(String incnt) {
        this.incnt = incnt;
    }

    public void setInPigType(String inPigType) {
        this.inPigType = inPigType;
    }

    public void setPigFarm(PigFarmBean pigFarm) {
        this.pigFarm = pigFarm;
    }

    public void setOtpen(OtpenBean otpen) {
        this.otpen = otpen;
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

    public void setBizDate(String bizDate) {
        this.bizDate = bizDate;
    }

    public void setPigCompany(PigCompanyBean pigCompany) {
        this.pigCompany = pigCompany;
    }

    public void setEntry(List<EntryBean> Entry) {
        this.Entry = Entry;
    }

    public IndnoBean getIndno() {
        return indno;
    }

    public String getCreateTime() {
        return createTime;
    }

    public AuditorBean getAuditor() {
        return auditor;
    }

    public String getIsspz() {
        return isspz;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public LastUpdateUserBean getLastUpdateUser() {
        return lastUpdateUser;
    }

    public InpenBean getInpen() {
        return inpen;
    }

    public InbthBean getInbth() {
        return inbth;
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

    public String getOutPigType() {
        return outPigType;
    }

    public String getInwgt() {
        return inwgt;
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

    public String getIskfc() {
        return iskfc;
    }

    public TranstypeBean getTranstype() {
        return transtype;
    }

    public CUBean getCU() {
        return CU;
    }

    public String getIncnt() {
        return incnt;
    }

    public String getInPigType() {
        return inPigType;
    }

    public PigFarmBean getPigFarm() {
        return pigFarm;
    }

    public OtpenBean getOtpen() {
        return otpen;
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

    public String getBizDate() {
        return bizDate;
    }

    public PigCompanyBean getPigCompany() {
        return pigCompany;
    }

    public List<EntryBean> getEntry() {
        return Entry;
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

    public static class InpenBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class InbthBean {
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
    public static class ConfirmPerson{
        private String name;
        private String id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
    public static class TranstypeBean {
        private String id;
        /**
         * closeperson :
         * deletedStatus : 1
         * remark :
         * opendate : 2018-12-14
         * Sourcetype : {"id":"gaXSMVeMQbSu9HMYk7NzMEeR17Y="}
         * closedate :
         * openperson : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
         * Targettype : {"id":"gaXSMVeMQbSu9HMYk7NzMEeR17Y="}
         * dr : 0
         */

        private String closeperson;
        private String deletedStatus;
        private String remark;
        private String opendate;
        /**
         * id : gaXSMVeMQbSu9HMYk7NzMEeR17Y=
         */

        private SourcetypeBean Sourcetype;
        private String closedate;
        /**
         * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
         */

        private OpenpersonBean openperson;
        /**
         * id : gaXSMVeMQbSu9HMYk7NzMEeR17Y=
         */

        private TargettypeBean Targettype;
        private String dr;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        public void setCloseperson(String closeperson) {
            this.closeperson = closeperson;
        }

        public void setDeletedStatus(String deletedStatus) {
            this.deletedStatus = deletedStatus;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public void setOpendate(String opendate) {
            this.opendate = opendate;
        }

        public void setSourcetype(SourcetypeBean Sourcetype) {
            this.Sourcetype = Sourcetype;
        }

        public void setClosedate(String closedate) {
            this.closedate = closedate;
        }

        public void setOpenperson(OpenpersonBean openperson) {
            this.openperson = openperson;
        }

        public void setTargettype(TargettypeBean Targettype) {
            this.Targettype = Targettype;
        }

        public void setDr(String dr) {
            this.dr = dr;
        }

        public String getCloseperson() {
            return closeperson;
        }

        public String getDeletedStatus() {
            return deletedStatus;
        }

        public String getRemark() {
            return remark;
        }

        public String getOpendate() {
            return opendate;
        }

        public SourcetypeBean getSourcetype() {
            return Sourcetype;
        }

        public String getClosedate() {
            return closedate;
        }

        public OpenpersonBean getOpenperson() {
            return openperson;
        }

        public TargettypeBean getTargettype() {
            return Targettype;
        }

        public String getDr() {
            return dr;
        }

        public static class SourcetypeBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class OpenpersonBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class TargettypeBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
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

    public static class OtpenBean {
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

    public static class ZrfieldBean {
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

    public static class EntryBean {
        private String id;
        /**
         * alias : 公
         * value : 0
         */

        private SexBean sex;
        private String seq;
        /**
         * id : H4oAAAEs6z6Rgss4
         */

        private ParentBean parent;
        private String choose;
        /**
         * id : OdPznkVZQZ285VVweMRCvUVA25s=
         */

        private CfarmBean Cfarm;

        public void setId(String id) {
            this.id = id;
        }

        public void setSex(SexBean sex) {
            this.sex = sex;
        }

        public void setSeq(String seq) {
            this.seq = seq;
        }

        public void setParent(ParentBean parent) {
            this.parent = parent;
        }

        public void setChoose(String choose) {
            this.choose = choose;
        }

        public void setCfarm(CfarmBean Cfarm) {
            this.Cfarm = Cfarm;
        }

        public String getId() {
            return id;
        }

        public SexBean getSex() {
            return sex;
        }

        public String getSeq() {
            return seq;
        }

        public ParentBean getParent() {
            return parent;
        }

        public String getChoose() {
            return choose;
        }

        public CfarmBean getCfarm() {
            return Cfarm;
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

        public static class ParentBean {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class CfarmBean {

            /**
             * curpt : 0
             * birth : 2017-04-01
             * zhejiuYear : 0
             * brhwt : 15
             * weady : 0
             * entrys : []
             * number : LQF001
             * ilive : 0
             * id : fzW8XlSeRK+7HlmHj8G850VA25s=
             * ileft : 0
             * days : 388
             * tgsex : 0
             * parit : 0
             * readyZhejiuMonths : 0
             * iright : 0
             */

            private String curpt;
            private String birth;
            private String zhejiuYear;
            private String brhwt;
            private String weady;
            private String number;
            private String ilive;
            private String id;
            private String ileft;
            private String days;
            private String tgsex;
            private String parit;
            private String readyZhejiuMonths;
            private String iright;
            private List<?> entrys;

            public void setCurpt(String curpt) {
                this.curpt = curpt;
            }

            public void setBirth(String birth) {
                this.birth = birth;
            }

            public void setZhejiuYear(String zhejiuYear) {
                this.zhejiuYear = zhejiuYear;
            }

            public void setBrhwt(String brhwt) {
                this.brhwt = brhwt;
            }

            public void setWeady(String weady) {
                this.weady = weady;
            }

            public void setNumber(String number) {
                this.number = number;
            }

            public void setIlive(String ilive) {
                this.ilive = ilive;
            }

            public void setId(String id) {
                this.id = id;
            }

            public void setIleft(String ileft) {
                this.ileft = ileft;
            }

            public void setDays(String days) {
                this.days = days;
            }

            public void setTgsex(String tgsex) {
                this.tgsex = tgsex;
            }

            public void setParit(String parit) {
                this.parit = parit;
            }

            public void setReadyZhejiuMonths(String readyZhejiuMonths) {
                this.readyZhejiuMonths = readyZhejiuMonths;
            }

            public void setIright(String iright) {
                this.iright = iright;
            }

            public void setEntrys(List<?> entrys) {
                this.entrys = entrys;
            }

            public String getCurpt() {
                return curpt;
            }

            public String getBirth() {
                return birth;
            }

            public String getZhejiuYear() {
                return zhejiuYear;
            }

            public String getBrhwt() {
                return brhwt;
            }

            public String getWeady() {
                return weady;
            }

            public String getNumber() {
                return number;
            }

            public String getIlive() {
                return ilive;
            }

            public String getId() {
                return id;
            }

            public String getIleft() {
                return ileft;
            }

            public String getDays() {
                return days;
            }

            public String getTgsex() {
                return tgsex;
            }

            public String getParit() {
                return parit;
            }

            public String getReadyZhejiuMonths() {
                return readyZhejiuMonths;
            }

            public String getIright() {
                return iright;
            }

            public List<?> getEntrys() {
                return entrys;
            }
        }
    }
    public static ChangeAdd getNewBean(){
        ChangeAdd bean = new ChangeAdd();
        bean.setZrfield(new ZrfieldBean());
        bean.setTranstype(new TranstypeBean());
        bean.setStorageOrg(new StorageOrgBean());
        bean.setPigFarm(new PigFarmBean());
        bean.setPigCompany(new PigCompanyBean());
        bean.setOtpen(new OtpenBean());
        bean.setLastUpdateUser(new LastUpdateUserBean());
        bean.setInpen(new InpenBean());
        bean.setIndno(new IndnoBean());
        bean.setInbth(new InbthBean());
        bean.setField(new FieldBean());

        bean.setCU(new CUBean());
        bean.setCreator(new CreatorBean());
        bean.setBaseStatus(new BaseStatusBean());
        bean.setAuditor(new AuditorBean());
       // bean.setEntry(new ArrayList<EntryBean>());
        //bean.getEntry().add(getNewEntry());
        return bean;
    }
    private static EntryBean getNewEntry(){
        EntryBean bean = new EntryBean();
        bean.setSex(new EntryBean.SexBean());
        bean.setParent(new EntryBean.ParentBean());
        bean.setCfarm(new EntryBean.CfarmBean());
        return bean;
    }
}
