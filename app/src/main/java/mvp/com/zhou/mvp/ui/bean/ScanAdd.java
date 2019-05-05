package mvp.com.zhou.mvp.ui.bean;

import java.util.List;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/12/24 10:08
 * @Description:
 */
public class ScanAdd {
    /**
     * createTime : 2018-12-17 15:57:17
     * fieldFile : {"id":"YRyfeYFEQRaSkaN/U7rl/Z27W+Q="}
     * building : {"id":"7UZP3GYmSgirW2dKW5RSOi3xSLc="}
     * auditor : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * CU : {"id":"6Bx6kutZTvCfY7r4+YvficznrtQ="}
     * checkPerson : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * lastUpdateTime : 2018-12-22 16:31:22
     * pigFarm : {"id":"Xfwrc11mR92J2MNiG5IqLrj94m0="}
     * lastUpdateUser : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * entrys : [{"id":"bPXffEpfTVGW63N9fe8xtO1I9Uk=","bookEar":{"id":"CdovwKIdRXSsR/ex+9aSQ0VA25s="},"isMatch":"true","actualEar":"SZ1201812120002","seq":"1","parent":{"id":"KCGOaPeeTbeggKtIw1rOWb3gpKk="}},{"id":"4NhqhWxmQZmz3bQlzt8C++1I9Uk=","bookEar":{"id":"rQkyBRaGS0ellxj7Mgx4NEVA25s="},"isMatch":"true","actualEar":"SZ1201812120003","seq":"2","parent":{"id":"KCGOaPeeTbeggKtIw1rOWb3gpKk="}},{"id":"9jjEdU1uS1OEIblE8U5CeO1I9Uk=","bookEar":{"id":"/J1Io3POSxSEFO8WPY32xEVA25s="},"isMatch":"false","description":"四九年","actualEar":"SZ120181218888","seq":"3","parent":{"id":"KCGOaPeeTbeggKtIw1rOWb3gpKk="}},{"id":"9Tl4CTNOSh6LPhd77EGo+O1I9Uk=","bookEar":{"id":"bo9/K76WRQu0uvYQHbiOXUVA25s="},"isMatch":"false","description":"使得创维","seq":"4","parent":{"id":"KCGOaPeeTbeggKtIw1rOWb3gpKk="}},{"id":"w8hjqv3iTmeLhW4GCPihve1I9Uk=","bookEar":{"id":"OFqHKHr1Tom2TD6A0LPwzUVA25s="},"isMatch":"false","description":"调出","seq":"5","parent":{"id":"KCGOaPeeTbeggKtIw1rOWb3gpKk="}},{"id":"9f9LwTSZS4u3HdbAnzvdhu1I9Uk=","isMatch":"false","description":"上档次","actualEar":"6","seq":"6","parent":{"id":"KCGOaPeeTbeggKtIw1rOWb3gpKk="}},{"id":"f7I6ApA2Rn63f4BN0TMExe1I9Uk=","isMatch":"false","description":"调出","actualEar":"7","seq":"7","parent":{"id":"KCGOaPeeTbeggKtIw1rOWb3gpKk="}},{"id":"LJL9qtDWR0Ce/lyGLRd0pu1I9Uk=","bookEar":{"id":"fkvhE6kSQ0uotQNcR83M60VA25s="},"isMatch":"false","description":"从上档次","actualEar":"855555","seq":"8","parent":{"id":"KCGOaPeeTbeggKtIw1rOWb3gpKk="}}]
     * billStatus : {"alias":"审核","value":4}
     * creator : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * id : KCGOaPeeTbeggKtIw1rOWb3gpKk=
     * auditDate : 2018-12-22 16:31:22
     * book : 6
     * actual : 6
     * Fivouchered : false
     * bizDate : 2018-12-17 15:56:17
     * hasEffected : false
     */

    private String createTime;
    /**
     * id : YRyfeYFEQRaSkaN/U7rl/Z27W+Q=
     */

    private FieldFileBean fieldFile;
    /**
     * id : 7UZP3GYmSgirW2dKW5RSOi3xSLc=
     */

    private BuildingBean building;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private AuditorBean auditor;
    /**
     * id : 6Bx6kutZTvCfY7r4+YvficznrtQ=
     */

    private CUBean CU;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private CheckPersonBean checkPerson;
    private String lastUpdateTime;
    /**
     * id : Xfwrc11mR92J2MNiG5IqLrj94m0=
     */

    private PigFarmBean pigFarm;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private LastUpdateUserBean lastUpdateUser;
    /**
     * alias : 审核
     * value : 4
     */

    private BillStatusBean billStatus;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private CreatorBean creator;
    private String id;
    private String auditDate;
    private String book;
    private String actual;
    private String Fivouchered;
    private String bizDate;
    private String hasEffected;
    /**
     * id : bPXffEpfTVGW63N9fe8xtO1I9Uk=
     * bookEar : {"id":"CdovwKIdRXSsR/ex+9aSQ0VA25s="}
     * isMatch : true
     * actualEar : SZ1201812120002
     * seq : 1
     * parent : {"id":"KCGOaPeeTbeggKtIw1rOWb3gpKk="}
     */

    private List<EntrysBean> entrys;

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setFieldFile(FieldFileBean fieldFile) {
        this.fieldFile = fieldFile;
    }

    public void setBuilding(BuildingBean building) {
        this.building = building;
    }

    public void setAuditor(AuditorBean auditor) {
        this.auditor = auditor;
    }

    public void setCU(CUBean CU) {
        this.CU = CU;
    }

    public void setCheckPerson(CheckPersonBean checkPerson) {
        this.checkPerson = checkPerson;
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

    public void setBillStatus(BillStatusBean billStatus) {
        this.billStatus = billStatus;
    }

    public void setCreator(CreatorBean creator) {
        this.creator = creator;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAuditDate(String auditDate) {
        this.auditDate = auditDate;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void setActual(String actual) {
        this.actual = actual;
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

    public void setEntrys(List<EntrysBean> entrys) {
        this.entrys = entrys;
    }

    public String getCreateTime() {
        return createTime;
    }

    public FieldFileBean getFieldFile() {
        return fieldFile;
    }

    public BuildingBean getBuilding() {
        return building;
    }

    public AuditorBean getAuditor() {
        return auditor;
    }

    public CUBean getCU() {
        return CU;
    }

    public CheckPersonBean getCheckPerson() {
        return checkPerson;
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

    public BillStatusBean getBillStatus() {
        return billStatus;
    }

    public CreatorBean getCreator() {
        return creator;
    }

    public String getId() {
        return id;
    }

    public String getAuditDate() {
        return auditDate;
    }

    public String getBook() {
        return book;
    }

    public String getActual() {
        return actual;
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

    public List<EntrysBean> getEntrys() {
        return entrys;
    }

    public static class FieldFileBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class BuildingBean {
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

    public static class CUBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class CheckPersonBean {
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

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class BillStatusBean {
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

    public static class CreatorBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class EntrysBean {
        private String id;
        /**
         * id : CdovwKIdRXSsR/ex+9aSQ0VA25s=
         */

        private BookEarBean bookEar;
        private String isMatch;
        private String actualEar;
        private String seq;
        private String description;
        /**
         * id : KCGOaPeeTbeggKtIw1rOWb3gpKk=
         */

        private ParentBean parent;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setBookEar(BookEarBean bookEar) {
            this.bookEar = bookEar;
        }

        public void setIsMatch(String isMatch) {
            this.isMatch = isMatch;
        }

        public void setActualEar(String actualEar) {
            this.actualEar = actualEar;
        }

        public void setSeq(String seq) {
            this.seq = seq;
        }

        public void setParent(ParentBean parent) {
            this.parent = parent;
        }

        public String getId() {
            return id;
        }

        public BookEarBean getBookEar() {
            return bookEar;
        }

        public String getIsMatch() {
            return isMatch;
        }

        public String getActualEar() {
            return actualEar;
        }

        public String getSeq() {
            return seq;
        }

        public ParentBean getParent() {
            return parent;
        }

        public static class BookEarBean {
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
    }
}
