package com.zhou.ghost.ui.bean.base;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/11/7 17:14
 * @Description:
 */
public class BaseBean {
    protected String message;
    protected String result;
    protected String id;
    protected String number;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public  boolean isSuccess(){
        return "0".equals(result);
    }

    public  boolean isLogOut(){
        return "99".equals(result);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
