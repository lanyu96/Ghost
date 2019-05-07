package com.zhou.ghost.ui.bean;

/**
 * @Auther: zhou
 * @Date: 2018/10/24 11:24
 * @Description:
 */
public class PenGroupInfo {
    private String alias;
    private String name;
    private String value;
    private boolean isSelect = false;

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAlias() {
        return alias;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
