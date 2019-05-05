package mvp.com.zhou.mvp.constant;


import mvp.com.zhou.mvp.MyApp;
import mvp.com.zhou.mvp.utils.util.PreferencesService;

/**
 * Created by Administrator on 2017/9/14.
 */
public class SPConstants {
    /**
     * 用户名
     */
    public final static String LOGIN_USER = "login_user";
    /**
     * 密码
     */
    public final static String LOGIN_PASSWORD = "login_password";

    /**
     * sessionId
     */
    public final static String SESSIONID = "sessionid";
    /**
     * userId
     */
    public final static String USERID = "userid";

    /**
     * userName
     */
    public final static String USERNAME = "username";

    /**
     * 农场名称
     */
    public final static String FARM_NAME = "farm_name";
    /**
     * 农场id
     */
    public final static String FARM_ID = "farm_id";
    /**
     * 分厂名称
     */
    public final static String FIELD_NAME = "field_name";
    /**
     * 分厂id
     */
    public final static String FIELD_ID = "field_id";
    /**
     * 是否启用配种3天限制
     */
    public final static String FQ2PZ = "fq2pz";

    /**
     * 界面风格ID
     */
    public final static String STYLE_ID = "style_id";

    public static void initSpData(){
        PreferencesService ps = MyApp.getPreferencesService();
        ps.save(SPConstants.LOGIN_USER, "");
        ps.save(SPConstants.LOGIN_PASSWORD, "");
        ps.save(SPConstants.SESSIONID, "");
        ps.save(SPConstants.FARM_NAME, "");
        ps.save(SPConstants.FARM_ID, "");
        ps.save(SPConstants.FIELD_NAME, "");
        ps.save(SPConstants.FIELD_ID, "");
        ps.save(SPConstants.FQ2PZ, "");
        ps.save(SPConstants.STYLE_ID,"");
        ps.save(SPConstants.USERNAME,"");
    }
}
