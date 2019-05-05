package mvp.com.zhou.mvp.ui.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2019/1/15 15:18
 * @Description:
 */
public class DrugCollarAdd implements Serializable {
    /**
     * id : haXEjv+eS0qid2tdGtKNr8znrtQ=
     */

    private CompanyOrgUnit companyOrgUnit;
    /**
     * companyOrgUnit : {"id":"haXEjv+eS0qid2tdGtKNr8znrtQ="}
     * createTime : 2019-01-14 15:32:14
     * storageOrgUnit : {"id":"plDssBajTr6gZBCLEPkZCsznrtQ="}
     * batch_allcnt : 0
     * BillState : {"alias":"提交","value":"20"}
     * pigBatch : {"id":"ZqmAsnvzQCmAftpTH3jwhr3Plts=","number":"MT-BR-B01-181227"}
     * printCount : 0
     * lastUpdateTime : 2019-01-14 15:32:14
     * lastUpdateUser : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * entrys : [{"measureUnit":"瓶","model":"瓶","drugsbatch":{"id":"fR1dAgBPSF3gUxgKAAos1rqK10c=","lot":"20180101"},"materialgroup":{"id":"7v2YZOH9TNGIFRyJh1HMecefwEI="},"parent":{"id":"PfhoTvPBSeyiVKdkKlM45m4xL6U="},"useQty":"12","Curstoreqty":"138","isCostPrice":"false","id":"Gvn1OjILTVm4E97p2ZzRgRnD580=","amount":"0","isRecoveryed":"false","seq":"1","HasCreateReccare":"false","drugsNumber":{"id":"nqAj3ivhSEC1SUOYlC8xc0QJ5/A="},"basePrice":"0","drugsName":"伪狂犬 (20头份/瓶)"}]
     * accruing_amounts : 0
     * curcnt : 0
     * warehouse : {"id":"mMDmxcd0QbatISzC4Loy3bvp+K4=","name":"码头药品仓库"}
     * isCreateBill : false
     * creator : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * id : PfhoTvPBSeyiVKdkKlM45m4xL6U=
     * materialType : {"alias":"疫苗","value":"2"}
     * hasEffected : false
     * fieldFile : {"id":"e7u9De8tS42yaZ1YyEPOaJ27W+Q="}
     * SimpleNumber : 码头猪场
     * CU : {"id":"haXEjv+eS0qid2tdGtKNr8znrtQ="}
     * pigFarm : {"id":"DTyqz1DqT+6xP+w84Uau+Lj94m0="}
     * reveicetype : {"alias":"领料","value":"01"}
     * useDate : 2019-01-14 14:52:14
     * isInit : false
     * average_receive : 0
     * Fivouchered : false
     * pk_pigfen : {"id":"Usd38V6cTkWSKr3J6Fk4Gi3xSLc=","name":"保育1舍"}
     * group : {"alias":"配怀舍","value":"1"}
     * pigType : {"id":"gaXSMVeMQbSu9HMYk7NzMEeR17Y=","name":"产房仔猪"}
     */

    private String createTime;
    /**
     * id : plDssBajTr6gZBCLEPkZCsznrtQ=
     */

    private StorageOrgUnit storageOrgUnit;
    private String batch_allcnt;
    /**
     * alias : 提交
     * value : 20
     */

    private BillState BillState;

    private ConfirmPerson confirmPerson;
    /**
     * id : ZqmAsnvzQCmAftpTH3jwhr3Plts=
     * number : MT-BR-B01-181227
     */

    private PigBatch pigBatch;
    private String printCount;
    private String lastUpdateTime;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private LastUpdateUser lastUpdateUser;
    private String accruing_amounts;
    private String curcnt;
    /**
     * id : mMDmxcd0QbatISzC4Loy3bvp+K4=
     * name : 码头药品仓库
     */

    private Warehouse warehouse;
    private String isCreateBill;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private Creator creator;
    private String id;
    private String number;
    /**
     * alias : 疫苗
     * value : 2
     */

    private MaterialType materialType;
    private String hasEffected;
    /**
     * id : e7u9De8tS42yaZ1YyEPOaJ27W+Q=
     */

    private FieldFile fieldFile;
    private String SimpleNumber;
    /**
     * id : haXEjv+eS0qid2tdGtKNr8znrtQ=
     */

    private CU CU;
    /**
     * id : DTyqz1DqT+6xP+w84Uau+Lj94m0=
     */

    private PigFarm pigFarm;
    /**
     * alias : 领料
     * value : 01
     */

    private Reveicetype reveicetype;
    private String useDate;
    private String isInit;
    private String average_receive;
    private String Fivouchered;
    /**
     * id : Usd38V6cTkWSKr3J6Fk4Gi3xSLc=
     * name : 保育1舍
     */

    private PkPigfen pk_pigfen;
    /**
     * alias : 配怀舍
     * value : 1
     */

    private Group group;
    /**
     * id : gaXSMVeMQbSu9HMYk7NzMEeR17Y=
     * name : 产房仔猪
     */

    private PigType pigType;
    /**
     * measureUnit : 瓶
     * model : 瓶
     * drugsbatch : {"id":"fR1dAgBPSF3gUxgKAAos1rqK10c=","lot":"20180101"}
     * materialgroup : {"id":"7v2YZOH9TNGIFRyJh1HMecefwEI="}
     * parent : {"id":"PfhoTvPBSeyiVKdkKlM45m4xL6U="}
     * useQty : 12
     * Curstoreqty : 138
     * isCostPrice : false
     * id : Gvn1OjILTVm4E97p2ZzRgRnD580=
     * amount : 0
     * isRecoveryed : false
     * seq : 1
     * HasCreateReccare : false
     * drugsNumber : {"id":"nqAj3ivhSEC1SUOYlC8xc0QJ5/A="}
     * basePrice : 0
     * drugsName : 伪狂犬 (20头份/瓶)
     */

    private List<Entrys> entrys;

    public ConfirmPerson getConfirmPerson() {
        return confirmPerson;
    }

    public void setConfirmPerson(ConfirmPerson confirmPerson) {
        this.confirmPerson = confirmPerson;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCompanyOrgUnit(CompanyOrgUnit companyOrgUnit) {
        this.companyOrgUnit = companyOrgUnit;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setStorageOrgUnit(StorageOrgUnit storageOrgUnit) {
        this.storageOrgUnit = storageOrgUnit;
    }

    public void setBatch_allcnt(String batch_allcnt) {
        this.batch_allcnt = batch_allcnt;
    }

    public void setBillState(BillState BillState) {
        this.BillState = BillState;
    }

    public void setPigBatch(PigBatch pigBatch) {
        this.pigBatch = pigBatch;
    }

    public void setPrintCount(String printCount) {
        this.printCount = printCount;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setLastUpdateUser(LastUpdateUser lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public void setAccruing_amounts(String accruing_amounts) {
        this.accruing_amounts = accruing_amounts;
    }

    public void setCurcnt(String curcnt) {
        this.curcnt = curcnt;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void setIsCreateBill(String isCreateBill) {
        this.isCreateBill = isCreateBill;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }

    public void setHasEffected(String hasEffected) {
        this.hasEffected = hasEffected;
    }

    public void setFieldFile(FieldFile fieldFile) {
        this.fieldFile = fieldFile;
    }

    public void setSimpleNumber(String SimpleNumber) {
        this.SimpleNumber = SimpleNumber;
    }

    public void setCU(CU CU) {
        this.CU = CU;
    }

    public void setPigFarm(PigFarm pigFarm) {
        this.pigFarm = pigFarm;
    }

    public void setReveicetype(Reveicetype reveicetype) {
        this.reveicetype = reveicetype;
    }

    public void setUseDate(String useDate) {
        this.useDate = useDate;
    }

    public void setIsInit(String isInit) {
        this.isInit = isInit;
    }

    public void setAverage_receive(String average_receive) {
        this.average_receive = average_receive;
    }

    public void setFivouchered(String Fivouchered) {
        this.Fivouchered = Fivouchered;
    }

    public void setPk_pigfen(PkPigfen pk_pigfen) {
        this.pk_pigfen = pk_pigfen;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setPigType(PigType pigType) {
        this.pigType = pigType;
    }

    public void setEntrys(List<Entrys> entrys) {
        this.entrys = entrys;
    }

    public CompanyOrgUnit getCompanyOrgUnit() {
        return companyOrgUnit;
    }

    public String getCreateTime() {
        return createTime;
    }

    public StorageOrgUnit getStorageOrgUnit() {
        return storageOrgUnit;
    }

    public String getBatch_allcnt() {
        return batch_allcnt;
    }

    public BillState getBillState() {
        return BillState;
    }

    public PigBatch getPigBatch() {
        return pigBatch;
    }

    public String getPrintCount() {
        return printCount;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public LastUpdateUser getLastUpdateUser() {
        return lastUpdateUser;
    }

    public String getAccruing_amounts() {
        return accruing_amounts;
    }

    public String getCurcnt() {
        return curcnt;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public String getIsCreateBill() {
        return isCreateBill;
    }

    public Creator getCreator() {
        return creator;
    }

    public String getId() {
        return id;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public String getHasEffected() {
        return hasEffected;
    }

    public FieldFile getFieldFile() {
        return fieldFile;
    }

    public String getSimpleNumber() {
        return SimpleNumber;
    }

    public CU getCU() {
        return CU;
    }

    public PigFarm getPigFarm() {
        return pigFarm;
    }

    public Reveicetype getReveicetype() {
        return reveicetype;
    }

    public String getUseDate() {
        if(useDate==null||useDate.length()<10) {
            return "";
        }else{
            return useDate.substring(0,10);
        }
    }

    public String getIsInit() {
        return isInit;
    }

    public String getAverage_receive() {
        return average_receive;
    }

    public String getFivouchered() {
        return Fivouchered;
    }

    public PkPigfen getPk_pigfen() {
        return pk_pigfen;
    }

    public Group getGroup() {
        return group;
    }

    public PigType getPigType() {
        return pigType;
    }

    public List<Entrys> getEntrys() {
        return entrys;
    }

    public static class CompanyOrgUnit {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class StorageOrgUnit {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class BillState {
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

    public static class PigBatch {
        private String id;
        private String number;

        public void setId(String id) {
            this.id = id;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getId() {
            return id;
        }

        public String getNumber() {
            return number;
        }
    }

    public static class LastUpdateUser {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class Warehouse {
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

    public static class Creator {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class MaterialType {
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

    public static class FieldFile {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class CU {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class PigFarm {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class Reveicetype {
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

    public static class PkPigfen {
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

    public static class Group {
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

    public static class PigType {
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
    public static class Entrys {
        private String measureUnit;
        private String model;
        /**
         * id : fR1dAgBPSF3gUxgKAAos1rqK10c=
         * lot : 20180101
         */

        private Drugsbatch drugsbatch;
        /**
         * id : 7v2YZOH9TNGIFRyJh1HMecefwEI=
         */

        private Materialgroup materialgroup;
        /**
         * id : PfhoTvPBSeyiVKdkKlM45m4xL6U=
         */

        private Parent parent;
        private String useQty;
        private String Curstoreqty;
        private String isCostPrice;
        private String id;
        private String amount;
        private String isRecoveryed;
        private String seq;
        private String HasCreateReccare;
        /**
         * id : nqAj3ivhSEC1SUOYlC8xc0QJ5/A=
         */

        private DrugsNumber drugsNumber;
        private String basePrice;
        private String drugsName;
        private String houseCount;
        /**
         * id : FeIGYCvvQGO4EapJ1MK0m73Plts=
         */

        private Pigbatch pigbatch;
        /**
         * id : E6XchCH/T1yBo9n/41McHS3xSLc=
         * name : 四区产房2舍
         */

        private Building building;
        /**
         * pigbatch : {"id":"FeIGYCvvQGO4EapJ1MK0m73Plts="}
         * building : {"id":"E6XchCH/T1yBo9n/41McHS3xSLc=","name":"四区产房2舍"}
         * hideNum : 332
         * sjfhs : 195
         * confirmNum : 195
         * pigType : {"id":"HWkQmUe0S66+SOV8M1n5+0eR17Y=","name":"产房仔猪"}
         */

        private String hideNum;
        private String sjfhs;
        private String confirmNum;
        /**
         * id : HWkQmUe0S66+SOV8M1n5+0eR17Y=
         * name : 产房仔猪
         */

        private PigType pigType;

        public String getHouseCount() {
            return houseCount;
        }

        public void setHouseCount(String houseCount) {
            this.houseCount = houseCount;
        }

        public void setMeasureUnit(String measureUnit) {
            this.measureUnit = measureUnit;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setDrugsbatch(Drugsbatch drugsbatch) {
            this.drugsbatch = drugsbatch;
        }

        public void setMaterialgroup(Materialgroup materialgroup) {
            this.materialgroup = materialgroup;
        }

        public void setParent(Parent parent) {
            this.parent = parent;
        }

        public void setUseQty(String useQty) {
            this.useQty = useQty;
        }

        public void setCurstoreqty(String Curstoreqty) {
            this.Curstoreqty = Curstoreqty;
        }

        public void setIsCostPrice(String isCostPrice) {
            this.isCostPrice = isCostPrice;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public void setIsRecoveryed(String isRecoveryed) {
            this.isRecoveryed = isRecoveryed;
        }

        public void setSeq(String seq) {
            this.seq = seq;
        }

        public void setHasCreateReccare(String HasCreateReccare) {
            this.HasCreateReccare = HasCreateReccare;
        }

        public void setDrugsNumber(DrugsNumber drugsNumber) {
            this.drugsNumber = drugsNumber;
        }

        public void setBasePrice(String basePrice) {
            this.basePrice = basePrice;
        }

        public void setDrugsName(String drugsName) {
            this.drugsName = drugsName;
        }

        public String getMeasureUnit() {
            return measureUnit;
        }

        public String getModel() {
            return model;
        }

        public Drugsbatch getDrugsbatch() {
            return drugsbatch;
        }

        public Materialgroup getMaterialgroup() {
            return materialgroup;
        }

        public Parent getParent() {
            return parent;
        }

        public String getUseQty() {
            return useQty;
        }

        public String getCurstoreqty() {
            return Curstoreqty;
        }

        public String getIsCostPrice() {
            return isCostPrice;
        }

        public String getId() {
            return id;
        }

        public String getAmount() {
            return amount;
        }

        public String getIsRecoveryed() {
            return isRecoveryed;
        }

        public String getSeq() {
            return seq;
        }

        public String getHasCreateReccare() {
            return HasCreateReccare;
        }

        public DrugsNumber getDrugsNumber() {
            return drugsNumber;
        }

        public String getBasePrice() {
            return basePrice;
        }

        public String getDrugsName() {
            return drugsName;
        }

        public void setPigbatch(Pigbatch pigbatch) {
            this.pigbatch = pigbatch;
        }

        public void setBuilding(Building building) {
            this.building = building;
        }

        public void setHideNum(String hideNum) {
            this.hideNum = hideNum;
        }

        public void setSjfhs(String sjfhs) {
            this.sjfhs = sjfhs;
        }

        public void setConfirmNum(String confirmNum) {
            this.confirmNum = confirmNum;
        }

        public void setPigType(PigType pigType) {
            this.pigType = pigType;
        }

        public Pigbatch getPigbatch() {
            return pigbatch;
        }

        public Building getBuilding() {
            return building;
        }

        public String getHideNum() {
            return hideNum;
        }

        public String getSjfhs() {
            return sjfhs;
        }

        public String getConfirmNum() {
            return confirmNum;
        }

        public PigType getPigType() {
            return pigType;
        }

        public static class Drugsbatch {
            private String id;
            private String lot;

            public void setId(String id) {
                this.id = id;
            }

            public void setLot(String lot) {
                this.lot = lot;
            }

            public String getId() {
                return id;
            }

            public String getLot() {
                return lot;
            }
        }

        public static class Materialgroup {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class Parent {
            private String id;

            public void setId(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }
        }

        public static class DrugsNumber {
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

        public static class Pigbatch {
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

        public static class Building {
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

        public static class PigType {
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

}
