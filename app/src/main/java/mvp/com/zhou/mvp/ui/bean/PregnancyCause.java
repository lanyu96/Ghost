package mvp.com.zhou.mvp.ui.bean;

import java.io.Serializable;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/11/13 10:57
 * @Description:
 */
public class PregnancyCause implements Serializable {
    private String id;
    private String deletedStatus;
    private String remark;
    private String name;
    private String number;
    private String dr;

    public void setId(String id) {
        this.id = id;
    }

    public void setDeletedStatus(String deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }

    public String getId() {
        return id;
    }

    public String getDeletedStatus() {
        return deletedStatus;
    }

    public String getRemark() {
        return remark;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getDr() {
        return dr;
    }
}
