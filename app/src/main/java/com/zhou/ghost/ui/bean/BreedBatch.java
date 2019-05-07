package com.zhou.ghost.ui.bean;

import java.io.Serializable;

/**
 * @Auther: zhou
 * @Date: 2018/11/13 10:45
 * @Description:
 */
public class BreedBatch implements Serializable {
    private String id;
    private String field_name;
    private String breedingStartDate;
    private String deletedStatus;
    private String batchStatus;
    private String breedingEndDate;
    private String number;

    public void setId(String id) {
        this.id = id;
    }

    public void setField_name(String field_name) {
        this.field_name = field_name;
    }

    public void setBreedingStartDate(String breedingStartDate) {
        this.breedingStartDate = breedingStartDate;
    }

    public void setDeletedStatus(String deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
    }

    public void setBreedingEndDate(String breedingEndDate) {
        this.breedingEndDate = breedingEndDate;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public String getField_name() {
        return field_name;
    }

    public String getBreedingStartDate() {
        if(breedingStartDate==null||"".equals(breedingStartDate)){
            return "";
        }
        return breedingStartDate.substring(0,10);
    }

    public String getDeletedStatus() {
        return deletedStatus;
    }

    public String getBatchStatus() {
        return batchStatus;
    }

    public String getBreedingEndDate() {
        if(breedingEndDate==null||"".equals(breedingEndDate)){
            return "";
        }
        return breedingEndDate.substring(0,10);
    }

    public String getNumber() {
        return number;
    }
}
