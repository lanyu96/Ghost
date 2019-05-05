package mvp.com.zhou.mvp.wsutil;


/**
 * Created by fei on 2018/2/28.
 */
public class WSContants {

    public static String BASE_URL = "http://221.11.67.66:9999";//测试

   //public static String BASE_URL = "http://221.11.67.66:6888";//测试

    /**
     * 登录接口
     *
     * @return
     */
    public static String getLoginUrl() {
        return BASE_URL + "/ormrpc/services/EASLogin";
        //return "http://"+MyApp.getIp() + "/ormrpc/services/EASLogin";
    }

    /**
     * 获取账套
     * test
     *
     * @return
     */
    public static String getDcName() {
        return "test";
        //return "A00";
        //return MyApp.getDcName();
    }
    /**
     * 获取登陆信息及报表信息
     *
     * @return
     */
    public static String getInfoFacade() {
        return BASE_URL + "/ormrpc/services/WSPigFarmWSFacade";
        //return "http://"+MyApp.getIp() + "/ormrpc/services/WSPigFarmWSFacade";
    }

    /**
     * 获取生产管理信息接口
     *
     * @return
     */
    public static String getFacade() {
        return BASE_URL + "/ormrpc/services/WSDynamicFacade";
       // return "http://"+ MyApp.getIp() + "/ormrpc/services/WSDynamicFacade";
    }

    /**
     * 连接超时时间
     */
    public static final int TIME_OUT = 5000;



    public static final String PIG_LITTER_INFO_BOSTYPE = "4540DB9B";//种猪信息
    public static final String FIELD_BOSTYPE = "9DBB5BE4";//分厂信息
    public static final String FARM_BOSTYPE = "B8FDE26D";//猪场信息
    public static final String PEN_BOSTYPE = "2DF148B7";//栋舍信息
    public static final String PIG_TYPE_BOSTYPE = "AA988B95";//猪只状态
    public static final String PIG_BATCH_BOSTYPE = "BDCF96DB";//批次信息
    public static final String PIG_BATCH_TYPE_BOSTYPE = "4791D7B6";//猪只状态
    public static final String PIG_BATCH_SEACH_BOSTYPE = "4AF41F7F";//批次查询种猪状态
    public static final String SEMEN_BOSTYPE = "C785AA28";//公猪精液检测
    public static final String JINGYE_PERSON_BOSTYPE = "C5C1FD1B";//公猪精液检测员
    public static final String BREED_BOSTYPE = "45D6F013";//配种记录
    public static final String BREED_BIG_BOSTYPE = "865C221E";//批量配种记录
    public static final String BREED_PERSON_BOSTYPE = "D5ECEB64";//配种员
    public static final String BREED_BATCH_BOSTYPE = "FCA8FABD";//配种批次
    public static final String PREGNANCY_BOSTYPE = "96B3CFCC";//妊检
    public static final String PREGNANCY_BATCH_BOSTYPE = "2D3DAE68";//批量妊检
    public static final String PREGNANCY_CAUSE_BOSTYPE = "B8F41189";//妊检异常原因
    public static final String FARROW_BOSTYPE = "3D306B01";//分娩
    public static final String FARROW_BATCH_BOSTYPE = "478783E5";//分娩大单
    public static final String FARROW_PERSON = "2AD3F73D";//饲养员
    public static final String WEAN_BOSTYPE = "D8D24F0A";//断奶
    public static final String WEAN_BATCH_BOSTYPE = "266BDBA6";//断奶大单
    public static final String DIE_BOSTYPE = "40A32AA4";//死亡记录
    public static final String DIE_CAUSE_BOSTYPE = "8C8E8942";//死亡原因
    public static final String OUT_BOSTYPE = "38F158D2";//淘汰记录
    public static final String OUT_CAUSE = "303D7577";//淘汰原因
    public static final String CHANGE_BOSTYPE = "9182CB38";//猪只转群单
    public static final String CHANGE_TYPE = "F9F400A7";//转群类别
    public static final String TRANSFER_BOSTYPE = "42479BF6";//生产猪转群
    public static final String HISTORY_DATA = "4DFBD725";//历史数据
    public static final String ESTRUS_BOSTYPE = "602CA330";//发情记录
    public static final String SALE_BOSTYPE = "A68B0A2B";//销售
    public static final String INTRODUCTION_BOSTYPE = "835F284B";//引种记录
    public static final String IMMUNE_PLAN_BOSTYPE = "BDFD961E";//免疫计划
    public static final String IMMUNE_RECORD_BOSTYPE = "05015F2A";//免疫记录
    public static final String PIG_STRAIN = "0813AB4F";//猪只品系
    public static final String PIG_PINZHONF = "C560A3EA";//猪只品系
    public static final String SCAN_PIG = "BDE0A4A9";//盘点
    public static final String HOUSE = "BBE9F8AE";//仓库

    public static final String FEED_BIG_RECORD_BOSTYPE = "C5E7D610";//饲喂记录大单
    public static final String FEED_RECORD_BOSTYPE = "EB4A9A9C";//饲喂记录分录
    //public static final String FEED_FOOD_BOSTYPE = "F50997D2";//饲料

    public static final String FEED_COLLAR_BOSTYPE = "7905EFCF";//饲料领用
    public static final String FEED_FOOD_BOSTYPE = "4409E7F0";//饲料
    public static final String DRUG_COLLAR_BOSTYPE = "6E312FA5";//药品领用



    //各类方法名
    public static final String getRptData = "getRptData";
    public static final String getBillList = "getBillList";//获取分厂信息
    public static final String getEumInfo = "getEumInfo";
    public static final String uploadDataByBosType = "uploadDataByBosType";
    public static final String getDataByID = "getDataByID";
    public static final String uploadData = "uploadData";
    public static final String deleteData = "deleteData";
    public static final String uploadAttachment = "uploadAttachment";
    public static final String deleteAttachment = "deleteAttachment";// deleteAttachment {"billId":"单据id","id":"附件id"}//删除附件
    public static final String getAttachment = "getAttachment";// getAttachment {"billId":"单据id","id":"附件id"}两个参数不能同时为空//获取附件
    public static final String exeFunction = "exeFunction";//exeFunction(String jsonStr ){bosType:bosType,functionName:AUDIT,params:{id:id}} //审核
    public static final String getPersonInfo = "getPersonInfo";

    public static final String getWarningData = "getWarningData";


    //生产预警类型
    public static final String alarm_pig = "alarm_pig";//获取猪只档案
    public static final String alarm_rpt = "alarm_rpt";//获取报表数据
    public static final String alarm_id = "H4oAAAFhcoFDTn19";



    public static final String companyInfo = "http://qdwlhl.com/emt/pigInfoCompany/getCompanyInfoByName.json";
    public static final String app = "http://qdwlhl.com/emt/pigInfoCompany/getAppRecord.json";


    public static final String alarm_rpt_id = "alarm_rpt_id";//报表id
    public static final String mainWaringData =  "mainWaringData";//主预警
    public static final String outUnMating = "outUnMating";//超期未配
    public static final String outUnBirth =  "outUnBirth";//超期未分main
    public static final String outUnWeaning = "outUnWeaning";//超期未断奶
    public static final String outParity =  "outParity";//胎次过高
    public static final String outAge =  "outAge";//日龄过大


}
