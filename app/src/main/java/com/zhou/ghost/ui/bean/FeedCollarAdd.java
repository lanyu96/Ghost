package com.zhou.ghost.ui.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: zhou
 * @Date: 2019/1/5 14:19
 * @Description:
 */
public class FeedCollarAdd implements Serializable {

    /**
     * id : plDssBajTr6gZBCLEPkZCsznrtQ=
     */

    private StorageOrgBean storageOrg;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private CreatorBean creator;
    /**
     * id : haXEjv+eS0qid2tdGtKNr8znrtQ=
     */

    private PigCompanyBean pigCompany;
    /**
     * storageOrg : {"id":"plDssBajTr6gZBCLEPkZCsznrtQ="}
     * creator : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * pigCompany : {"id":"haXEjv+eS0qid2tdGtKNr8znrtQ="}
     * bizDate : 2018-11-30 00:00:30
     * auditor : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * warehouse : {"id":"fL1qzunWR1qEal8okHwwM7vp+K4="}
     * Fivouchered : false
     * botpCreated : true
     * dr : {"alias":"未删","value":0}
     * number : 23
     * Entry : [{"parent":{"id":"iBLGLxadQLiOJNYmOYZ3PnkF788="},"pigBatch":{"id":"HL9OKtQVRpaA6mU47TM+3L3Plts="},"sjfhsl":"60","materialName":"102","unit":{"id":"gw5fUwEOEADgAAsRwKgSOFuCXFc="},"pigType":{"id":"PZAZEh/6S8+z8kTGKbvngkeR17Y="},"confirmNum":"60","material":{"id":"khlou3dTQrWgtLX8G30dKEQJ5/A="},"field":{"id":"e7u9De8tS42yaZ1YyEPOaJ27W+Q="},"buildingArchives":{"id":"XQp4PXhYTWS69Ig0F0q7+C3xSLc="},"qty":"60","id":"xP9aT+PgTVisLD+zSvUesp2SseM=","seq":"1"},{"parent":{"id":"iBLGLxadQLiOJNYmOYZ3PnkF788="},"pigBatch":{"id":"HL9OKtQVRpaA6mU47TM+3L3Plts="},"sjfhsl":"2880","materialName":"902","unit":{"id":"gw5fUwEOEADgAAsRwKgSOFuCXFc="},"pigType":{"id":"PZAZEh/6S8+z8kTGKbvngkeR17Y="},"confirmNum":"2880","material":{"id":"FivR5beQRTaMSrDMoYXk5kQJ5/A="},"field":{"id":"e7u9De8tS42yaZ1YyEPOaJ27W+Q="},"buildingArchives":{"id":"XQp4PXhYTWS69Ig0F0q7+C3xSLc="},"qty":"2880","model":"40kg/贷","id":"aCSbtN5qTZ+Xsg8wLO4QNJ2SseM=","seq":"2"},{"parent":{"id":"iBLGLxadQLiOJNYmOYZ3PnkF788="},"pigBatch":{"id":"HL9OKtQVRpaA6mU47TM+3L3Plts="},"sjfhsl":"1480","materialName":"911K","unit":{"id":"gw5fUwEOEADgAAsRwKgSOFuCXFc="},"pigType":{"id":"PZAZEh/6S8+z8kTGKbvngkeR17Y="},"confirmNum":"1480","material":{"id":"Of6dJafmQouNvP0MYtkX3UQJ5/A="},"field":{"id":"e7u9De8tS42yaZ1YyEPOaJ27W+Q="},"buildingArchives":{"id":"XQp4PXhYTWS69Ig0F0q7+C3xSLc="},"qty":"1480","id":"1dLmJSTtSiOHDO1p/Jj1Vp2SseM=","seq":"3"},{"parent":{"id":"iBLGLxadQLiOJNYmOYZ3PnkF788="},"pigBatch":{"id":"V7RDKD5LSfyqNSpMcObVqb3Plts="},"sjfhsl":"140","materialName":"102","unit":{"id":"gw5fUwEOEADgAAsRwKgSOFuCXFc="},"pigType":{"id":"PZAZEh/6S8+z8kTGKbvngkeR17Y="},"confirmNum":"140","material":{"id":"khlou3dTQrWgtLX8G30dKEQJ5/A="},"field":{"id":"e7u9De8tS42yaZ1YyEPOaJ27W+Q="},"buildingArchives":{"id":"XQp4PXhYTWS69Ig0F0q7+C3xSLc="},"qty":"140","id":"rSATtmpzRYGuK3/h+Q6pdp2SseM=","seq":"4"},{"parent":{"id":"iBLGLxadQLiOJNYmOYZ3PnkF788="},"pigBatch":{"id":"V7RDKD5LSfyqNSpMcObVqb3Plts="},"sjfhsl":"2640","materialName":"902","unit":{"id":"gw5fUwEOEADgAAsRwKgSOFuCXFc="},"pigType":{"id":"PZAZEh/6S8+z8kTGKbvngkeR17Y="},"confirmNum":"2640","material":{"id":"FivR5beQRTaMSrDMoYXk5kQJ5/A="},"field":{"id":"e7u9De8tS42yaZ1YyEPOaJ27W+Q="},"buildingArchives":{"id":"XQp4PXhYTWS69Ig0F0q7+C3xSLc="},"qty":"2640","model":"40kg/贷","id":"5/plPWq3SBSfu7Xtk5hesp2SseM=","seq":"5"},{"parent":{"id":"iBLGLxadQLiOJNYmOYZ3PnkF788="},"pigBatch":{"id":"V7RDKD5LSfyqNSpMcObVqb3Plts="},"sjfhsl":"1520","materialName":"911K","unit":{"id":"gw5fUwEOEADgAAsRwKgSOFuCXFc="},"pigType":{"id":"PZAZEh/6S8+z8kTGKbvngkeR17Y="},"confirmNum":"1520","material":{"id":"Of6dJafmQouNvP0MYtkX3UQJ5/A="},"field":{"id":"e7u9De8tS42yaZ1YyEPOaJ27W+Q="},"buildingArchives":{"id":"XQp4PXhYTWS69Ig0F0q7+C3xSLc="},"qty":"1520","id":"bQdXibv2QmewFQqAvqskDp2SseM=","seq":"6"}]
     * CU : {"id":"haXEjv+eS0qid2tdGtKNr8znrtQ="}
     * reveicetype : {"alias":"领料","value":"01"}
     * field : {"id":"e7u9De8tS42yaZ1YyEPOaJ27W+Q="}
     * auditTime : 2018-12-22 12:51:22
     * createTime : 2018-12-19 11:07:19
     * pigFarm : {"id":"DTyqz1DqT+6xP+w84Uau+Lj94m0="}
     * printCount : 0
     * baseStatus : {"alias":"审核","value":4}
     * hasEffected : false
     * lastUpdateUser : {"id":"256c221a-0106-1000-e000-10d7c0a813f413B7DE7F"}
     * id : iBLGLxadQLiOJNYmOYZ3PnkF788=
     * group : {"alias":"保育舍","value":"3"}
     * lastUpdateTime : 2018-12-20 09:06:20
     */

    private String bizDate;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private AuditorBean auditor;
    /**
     * id : fL1qzunWR1qEal8okHwwM7vp+K4=
     */

    private WarehouseBean warehouse;
    private String Fivouchered;
    private String botpCreated;
    /**
     * alias : 未删
     * value : 0
     */

    private DrBean dr;
    private String number;
    /**
     * id : haXEjv+eS0qid2tdGtKNr8znrtQ=
     */

    private CUBean CU;
    /**
     * alias : 领料
     * value : 01
     */

    private ReveicetypeBean reveicetype;
    /**
     * id : e7u9De8tS42yaZ1YyEPOaJ27W+Q=
     */

    private FieldBean field;
    private String auditTime;
    private String createTime;
    private ConfirmPerson confirmPerson;
    /**
     * id : DTyqz1DqT+6xP+w84Uau+Lj94m0=
     */

    private PigFarmBean pigFarm;
    private String printCount;
    /**
     * alias : 审核
     * value : 4
     */

    private BaseStatusBean baseStatus;
    private String hasEffected;
    /**
     * id : 256c221a-0106-1000-e000-10d7c0a813f413B7DE7F
     */

    private LastUpdateUserBean lastUpdateUser;
    private String id;
    /**
     * alias : 保育舍
     * value : 3
     */

    private GroupBean group;
    private String lastUpdateTime;
    /**
     * parent : {"id":"iBLGLxadQLiOJNYmOYZ3PnkF788="}
     * pigBatch : {"id":"HL9OKtQVRpaA6mU47TM+3L3Plts="}
     * sjfhsl : 60
     * materialName : 102
     * unit : {"id":"gw5fUwEOEADgAAsRwKgSOFuCXFc="}
     * pigType : {"id":"PZAZEh/6S8+z8kTGKbvngkeR17Y="}
     * confirmNum : 60
     * material : {"id":"khlou3dTQrWgtLX8G30dKEQJ5/A="}
     * field : {"id":"e7u9De8tS42yaZ1YyEPOaJ27W+Q="}
     * buildingArchives : {"id":"XQp4PXhYTWS69Ig0F0q7+C3xSLc="}
     * qty : 60
     * id : xP9aT+PgTVisLD+zSvUesp2SseM=
     * seq : 1
     */

    private List<EntryBean> Entry;
    public ConfirmPerson getConfirmPerson() {
        return confirmPerson;
    }

    public void setConfirmPerson(ConfirmPerson confirmPerson) {
        this.confirmPerson = confirmPerson;
    }
    public void setStorageOrg(StorageOrgBean storageOrg) {
        this.storageOrg = storageOrg;
    }

    public void setCreator(CreatorBean creator) {
        this.creator = creator;
    }

    public void setPigCompany(PigCompanyBean pigCompany) {
        this.pigCompany = pigCompany;
    }

    public void setBizDate(String bizDate) {
        this.bizDate = bizDate;
    }

    public void setAuditor(AuditorBean auditor) {
        this.auditor = auditor;
    }

    public void setWarehouse(WarehouseBean warehouse) {
        this.warehouse = warehouse;
    }

    public void setFivouchered(String Fivouchered) {
        this.Fivouchered = Fivouchered;
    }

    public void setBotpCreated(String botpCreated) {
        this.botpCreated = botpCreated;
    }

    public void setDr(DrBean dr) {
        this.dr = dr;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCU(CUBean CU) {
        this.CU = CU;
    }

    public void setReveicetype(ReveicetypeBean reveicetype) {
        this.reveicetype = reveicetype;
    }

    public void setField(FieldBean field) {
        this.field = field;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setPigFarm(PigFarmBean pigFarm) {
        this.pigFarm = pigFarm;
    }

    public void setPrintCount(String printCount) {
        this.printCount = printCount;
    }

    public void setBaseStatus(BaseStatusBean baseStatus) {
        this.baseStatus = baseStatus;
    }

    public void setHasEffected(String hasEffected) {
        this.hasEffected = hasEffected;
    }

    public void setLastUpdateUser(LastUpdateUserBean lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(GroupBean group) {
        this.group = group;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setEntry(List<EntryBean> Entry) {
        this.Entry = Entry;
    }

    public StorageOrgBean getStorageOrg() {
        return storageOrg;
    }

    public CreatorBean getCreator() {
        return creator;
    }

    public PigCompanyBean getPigCompany() {
        return pigCompany;
    }

    public String getBizDate() {
        if(bizDate==null||bizDate.length()<10){
            return "";
        }
        return bizDate.substring(0,10);
    }

    public AuditorBean getAuditor() {
        return auditor;
    }

    public WarehouseBean getWarehouse() {
        return warehouse;
    }

    public String getFivouchered() {
        return Fivouchered;
    }

    public String getBotpCreated() {
        return botpCreated;
    }

    public DrBean getDr() {
        return dr;
    }

    public String getNumber() {
        return number;
    }

    public CUBean getCU() {
        return CU;
    }

    public ReveicetypeBean getReveicetype() {
        return reveicetype;
    }

    public FieldBean getField() {
        return field;
    }

    public String getAuditTime() {
        return auditTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public PigFarmBean getPigFarm() {
        return pigFarm;
    }

    public String getPrintCount() {
        return printCount;
    }

    public BaseStatusBean getBaseStatus() {
        return baseStatus;
    }

    public String getHasEffected() {
        return hasEffected;
    }

    public LastUpdateUserBean getLastUpdateUser() {
        return lastUpdateUser;
    }

    public String getId() {
        return id;
    }

    public GroupBean getGroup() {
        return group;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public List<EntryBean> getEntry() {
        return Entry;
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

    public static class AuditorBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class WarehouseBean {
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

    public static class DrBean {
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

    public static class CUBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class ReveicetypeBean {
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

    public static class FieldBean {
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

    public static class BaseStatusBean {
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

    public static class LastUpdateUserBean {
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class GroupBean {
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
    public static class EntryBean {
        /**
         * id : iBLGLxadQLiOJNYmOYZ3PnkF788=
         */

        private ParentBean parent;
        private String houseCount;
        /**
         * id : HL9OKtQVRpaA6mU47TM+3L3Plts=
         */

        private FodderTowerBean fodderTower;
        private PigBatchBean pigBatch;
        private String sjfhsl;
        private String materialName;
        /**
         * id : gw5fUwEOEADgAAsRwKgSOFuCXFc=
         */

        private UnitBean unit;
        /**
         * id : PZAZEh/6S8+z8kTGKbvngkeR17Y=
         */

        private PigTypeBean pigType;
        private String confirmNum;
        /**
         * id : khlou3dTQrWgtLX8G30dKEQJ5/A=
         */

        private MaterialBean material;
        /**
         * id : e7u9De8tS42yaZ1YyEPOaJ27W+Q=
         */

        private FieldBean field;
        /**
         * id : XQp4PXhYTWS69Ig0F0q7+C3xSLc=
         */

        private BuildingArchivesBean buildingArchives;
        private String qty;
        private String id;
        private String seq;

        private UnitBean fzUnit;

        public UnitBean getFzUnit() {
            return fzUnit;
        }

        public void setFzUnit(UnitBean fzUnit) {
            this.fzUnit = fzUnit;
        }

        public String getHouseCount() {
            return houseCount;
        }

        public void setHouseCount(String houseCount) {
            this.houseCount = houseCount;
        }

        public FodderTowerBean getFodderTower() {
            return fodderTower;
        }

        public void setFodderTower(FodderTowerBean fodderTower) {
            this.fodderTower = fodderTower;
        }

        public void setParent(ParentBean parent) {
            this.parent = parent;
        }

        public void setPigBatch(PigBatchBean pigBatch) {
            this.pigBatch = pigBatch;
        }

        public void setSjfhsl(String sjfhsl) {
            this.sjfhsl = sjfhsl;
        }

        public void setMaterialName(String materialName) {
            this.materialName = materialName;
        }

        public void setUnit(UnitBean unit) {
            this.unit = unit;
        }

        public void setPigType(PigTypeBean pigType) {
            this.pigType = pigType;
        }

        public void setConfirmNum(String confirmNum) {
            this.confirmNum = confirmNum;
        }

        public void setMaterial(MaterialBean material) {
            this.material = material;
        }

        public void setField(FieldBean field) {
            this.field = field;
        }

        public void setBuildingArchives(BuildingArchivesBean buildingArchives) {
            this.buildingArchives = buildingArchives;
        }

        public void setQty(String qty) {
            this.qty = qty;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setSeq(String seq) {
            this.seq = seq;
        }

        public ParentBean getParent() {
            return parent;
        }

        public PigBatchBean getPigBatch() {
            return pigBatch;
        }

        public String getSjfhsl() {
            return sjfhsl;
        }

        public String getMaterialName() {
            return materialName;
        }

        public UnitBean getUnit() {
            return unit;
        }

        public PigTypeBean getPigType() {
            return pigType;
        }

        public String getConfirmNum() {
            return confirmNum;
        }

        public MaterialBean getMaterial() {
            return material;
        }

        public FieldBean getField() {
            return field;
        }

        public BuildingArchivesBean getBuildingArchives() {
            return buildingArchives;
        }

        public String getQty() {
            return qty;
        }

        public String getId() {
            return id;
        }

        public String getSeq() {
            return seq;
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
        public static class FodderTowerBean {
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
        public static class PigBatchBean {
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

        public static class UnitBean {
            private String id;
            private String name;
            private String coefficient;

            public String getCoefficient() {
                return coefficient;
            }

            public void setCoefficient(String coefficient) {
                this.coefficient = coefficient;
            }

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

        public static class PigTypeBean {
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

        public static class MaterialBean {
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

        public static class BuildingArchivesBean {
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
}
