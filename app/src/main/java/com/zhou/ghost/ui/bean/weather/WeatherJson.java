package com.zhou.ghost.ui.bean.weather;

public class WeatherJson {
    private String basic;
    private String update;
    private String status;
    private String now;
    private String daily_forecast;
    private String hourly;
    private String lifestyle;
    private String lifestyle_forecast;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNow() {
        return now;
    }

    public void setNow(String now) {
        this.now = now;
    }

    public String getDaily_forecast() {
        return daily_forecast;
    }

    public void setDaily_forecast(String daily_forecast) {
        this.daily_forecast = daily_forecast;
    }

    public String getHourly() {
        return hourly;
    }

    public void setHourly(String hourly) {
        this.hourly = hourly;
    }

    public String getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(String lifestyle) {
        this.lifestyle = lifestyle;
    }

    public String getLifestyle_forecast() {
        return lifestyle_forecast;
    }

    public void setLifestyle_forecast(String lifestyle_forecast) {
        this.lifestyle_forecast = lifestyle_forecast;
    }
}
