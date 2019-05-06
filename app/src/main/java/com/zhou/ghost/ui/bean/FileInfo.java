package com.zhou.ghost.ui.bean;

import java.io.Serializable;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/12/20 9:35
 * @Description:
 */
public class FileInfo implements Serializable {

    /**
     * size : 2 KB
     * name : Google Chrome
     * id : W8Wp1M7RQmmxXQ4L9WFvTfSvTwM=
     * type : 未知文件类型（.lnk）
     */

    private String size;
    private String name;
    private String id;
    private String type;

    public void setSize(String size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
