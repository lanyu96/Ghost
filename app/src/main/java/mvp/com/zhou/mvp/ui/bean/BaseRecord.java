package mvp.com.zhou.mvp.ui.bean;

import java.io.Serializable;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/12/12 17:11
 * @Description:
 */
public class BaseRecord implements Serializable {
    protected String baseStatus;
    protected String id;
    protected String confirmPerson_name;

    public String getConfirmPerson_name() {
        return confirmPerson_name;
    }

    public void setConfirmPerson_name(String confirmPerson_name) {
        this.confirmPerson_name = confirmPerson_name;
    }

    public String getBaseStatus() {
        return baseStatus;
    }

    public void setBaseStatus(String baseStatus) {
        this.baseStatus = baseStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
