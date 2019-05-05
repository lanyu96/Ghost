package mvp.com.zhou.mvp.ui.bean;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/10/24 17:47
 * @Description:
 */
public class BatchTypeInfo {
    private String material_number;
    private String id;
    private String materialName;
    private String deletedStatus;
    private Object description;
    private String name;
    private String number;
    private String dr;

    public BatchTypeInfo() {
    }

    public BatchTypeInfo( String name) {
        this.name = name;
    }

    public String getMaterial_number() {
        return material_number;
    }

    public void setMaterial_number(String material_number) {
        this.material_number = material_number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(String deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }
}
