package com.zhou.ghost.wsutil;


/**
 * Created by zhou on 2018/2/28.
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


    //各类方法名
    public static final String getRptData = "getRptData";
    public static final String getBillList = "getBillList";//获取分厂信息


    public static final String app = "http://qdwlhl.com/emt/pigInfoCompany/getAppRecord.json";




}
