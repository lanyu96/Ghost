package com.zhou.ghost.utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.HashMap;

/**
 * @Auther: zhou
 * @Date: 2018/11/7 10:35
 * @Description:
 */
public class DataUtils {
    private static Gson gson = new Gson();

    /**
     * 格式化参数
     *
     * @param params 参数
     * @return
     */
    public static String getJsonString(HashMap<String, String> params) {
        return gson.toJson(params);
    }
    /**
     * 格式化参数
     *
     * @param o 参数
     * @return
     */
    public static String getJsonString(Object o) {

        return gson.toJson(o);
    }
    /**
     * 格式化参数
     *
     * @param o 参数
     * @return
     */
    public static JsonObject getJson(Object o) {
        return gson.fromJson(gson.toJson(o), JsonObject.class);
    }
    /**
     * 格式化参数
     *
     * @param params 参数
     * @return
     */
    public static JsonObject getJson(HashMap<String, String> params) {
        return gson.fromJson(gson.toJson(params), JsonObject.class);
    }
}
