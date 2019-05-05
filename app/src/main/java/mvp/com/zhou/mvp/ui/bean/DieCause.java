package mvp.com.zhou.mvp.ui.bean;

import java.io.Serializable;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/12/11 10:42
 * @Description:
 */
public class DieCause implements Serializable {
    private String id;
    private String createTime;
    private Object simpleName;
    private String creator_number;
    private Object description;
    private String lastUpdateTime;
    private String name;
    private String lastUpdateUser_number;
    private String number;
    private String creator_name;
    private String storageOrgUnit_name;
    private String lastUpdateUser_name;
    private String count;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setSimpleName(Object simpleName) {
        this.simpleName = simpleName;
    }

    public void setCreator_number(String creator_number) {
        this.creator_number = creator_number;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastUpdateUser_number(String lastUpdateUser_number) {
        this.lastUpdateUser_number = lastUpdateUser_number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCreator_name(String creator_name) {
        this.creator_name = creator_name;
    }

    public void setStorageOrgUnit_name(String storageOrgUnit_name) {
        this.storageOrgUnit_name = storageOrgUnit_name;
    }

    public void setLastUpdateUser_name(String lastUpdateUser_name) {
        this.lastUpdateUser_name = lastUpdateUser_name;
    }

    public String getId() {
        return id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public Object getSimpleName() {
        return simpleName;
    }

    public String getCreator_number() {
        return creator_number;
    }

    public Object getDescription() {
        return description;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public String getName() {
        return name;
    }

    public String getLastUpdateUser_number() {
        return lastUpdateUser_number;
    }

    public String getNumber() {
        return number;
    }

    public String getCreator_name() {
        return creator_name;
    }

    public String getStorageOrgUnit_name() {
        return storageOrgUnit_name;
    }

    public String getLastUpdateUser_name() {
        return lastUpdateUser_name;
    }
}
