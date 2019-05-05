package mvp.com.zhou.mvp.ui.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2019/1/7 8:40
 * @Description:
 */
public class AppInfo implements Serializable {
    /**
     * result : [{"id":2,"faddress":"http://qdwlhl.com/emt/static/pigapp/anyou.apk","fversion":"1.0.1","fcontext":"1","fisable":1,"fcreatetime":"2019-01-07 08:08:08","appname":"anyou"},{"id":1,"faddress":"http://qdwlhl.com/emt/static/pigapp/anyou.apk","fversion":"1.0.0","fcontext":"21","fisable":12,"fcreatetime":"2019-01-05 15:22:42","appname":"anyou"}]
     * success : true
     * message :
     * code : 0000
     * token :
     */

    private boolean success;
    private String message;
    private String code;
    private String token;
    /**
     * id : 2
     * faddress : http://qdwlhl.com/emt/static/pigapp/anyou.apk
     * fversion : 1.0.1
     * fcontext : 1
     * fisable : 1
     * fcreatetime : 2019-01-07 08:08:08
     * appname : anyou
     */

    private List<ResultBean> result;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }

    public String getToken() {
        return token;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public static class ResultBean {
        private int id;
        private String faddress;
        private String fversion;
        private String fcontext;
        private int fisable;
        private String fcreatetime;
        private String appname;

        public void setId(int id) {
            this.id = id;
        }

        public void setFaddress(String faddress) {
            this.faddress = faddress;
        }

        public void setFversion(String fversion) {
            this.fversion = fversion;
        }

        public void setFcontext(String fcontext) {
            this.fcontext = fcontext;
        }

        public void setFisable(int fisable) {
            this.fisable = fisable;
        }

        public void setFcreatetime(String fcreatetime) {
            this.fcreatetime = fcreatetime;
        }

        public void setAppname(String appname) {
            this.appname = appname;
        }

        public int getId() {
            return id;
        }

        public String getFaddress() {
            return faddress;
        }

        public String getFversion() {
            return fversion;
        }

        public String getFcontext() {
            return fcontext;
        }

        public int getFisable() {
            return fisable;
        }

        public String getFcreatetime() {
            return fcreatetime;
        }

        public String getAppname() {
            return appname;
        }
    }
}
