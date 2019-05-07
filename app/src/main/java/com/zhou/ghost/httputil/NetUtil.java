package com.zhou.ghost.httputil;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.zhou.ghost.ui.bean.FileInfo;
import com.zhou.ghost.ui.bean.PigCount;
import com.zhou.ghost.ui.bean.PigFile;
import com.zhou.ghost.ui.bean.base.BaseBean;
import com.zhou.ghost.ui.bean.base.BaseListBean;
import com.zhou.ghost.ui.callback.CallBackListListener;
import com.zhou.ghost.ui.callback.CallBackListener;
import com.zhou.ghost.ui.view.base.BaseView;
import com.zhou.ghost.wsutil.WSContants;

import java.io.File;
import java.util.HashMap;
import java.util.List;


/**
 * @Auther: zhou
 * @Date: 2018/11/6 12:10
 * @Description:
 */
public class NetUtil {

    /**
     * 获取种猪数据
     */
    public static void getPigDataFromNet(BaseView context, int m, int n, String queryStr, final CallBackListListener<PigFile> listListener) {
        queryStr = "BuildArchives.name is not null and " + queryStr + " order by BuildArchives.name desc, days desc";
        HashMap<String, String> jsonParams = new HashMap<>();
        jsonParams.put("bosType", WSContants.PIG_LITTER_INFO_BOSTYPE);
        jsonParams.put("queryInfo", "com.kingdee.eas.custom.pig.pigfarm.app.BoarInfoQuery");
        jsonParams.put("isReplaceSplit", "true");

        if (queryStr != null && !"".equals(queryStr)) {
            jsonParams.put("queryStr", queryStr);
        }
        if (m != -1) {
            jsonParams.put("beginRow", m + "");
            jsonParams.put("rowCount", n + "");
        }
        if (HttpContants.USE_HTTP) {
            HttpRequest.getList(context, true, jsonParams, new CallBackListener<JsonObject>() {
                @Override
                public void onSuccess(JsonObject jsonObject) {
                    Gson gson = new Gson();
                    BaseListBean<PigFile> bean = gson.fromJson(jsonObject, new TypeToken<BaseListBean<PigFile>>() {
                    }.getType());
                    if (bean.isSuccess()) {
                        listListener.onSuccess(bean.getData());
                    } else {
                        listListener.onError(bean.getMessage());
                    }
                }

                @Override
                public void onError(String error) {
                    listListener.onError(error);
                }
            });
        } else {
//            HashMap<String, String> params = new HashMap<>();
//            params.put("jsonStr", DataUtils.getJsonString(jsonParams));
//            WSBaseUtil.webServiceStart(WSContants.getFacade(), WSContants.getBillList, params, new WSBaseUtil.WsListener() {
//                @Override
//                public void onSuccess(String result) {
//                    Gson gson = new Gson();
//                    BaseListBean<PigFile> bean = gson.fromJson(result, new TypeToken<BaseListBean<PigFile>>() {
//                    }.getType());
//                    if (bean.isSuccess()) {
//                        listListener.onSuccess(bean.getData());
//                    } else {
//                        listListener.onError(bean.getMessage());
//                    }
//                }
//
//                @Override
//                public void onError(String error) {
//                    listListener.onError(error);
//                }
//            });
        }
    }

    /**
     * 获取种猪数量
     */
    public static void getPigCountFromNet(BaseView context, String queryStr, final CallBackListener<PigCount> listener) {
        queryStr = "BuildArchives.name is not null and " + queryStr + " order by BuildArchives.name desc";
        HashMap<String, String> jsonParams = new HashMap<>();
        jsonParams.put("queryInfo", "com.kingdee.eas.custom.pig.pigfarm.app.BoarInfoCountQuery");
        jsonParams.put("isReplaceSplit", "true");

        if (queryStr != null && !"".equals(queryStr)) {
            jsonParams.put("queryStr", queryStr);
        }
        HttpRequest.getList(context, true, jsonParams, new CallBackListener<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                Gson gson = new Gson();
                BaseListBean<PigCount> bean = gson.fromJson(jsonObject, new TypeToken<BaseListBean<PigCount>>() {
                }.getType());
                if (bean.isSuccess()) {
                    listener.onSuccess(bean.getData().get(0));
                } else {
                    listener.onError(bean.getMessage());
                }
            }

            @Override
            public void onError(String error) {
                listener.onError(error);
            }
        });

    }




    /**
     * 保存数据
     *
     * @param jsonObject
     * @param listener
     */
    public static void save(BaseView context, JsonObject jsonObject, String bosType, final CallBackListener<BaseBean> listener) {
        HttpRequest.uploadData(context, true, jsonObject, bosType, new CallBackListener<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                Gson gson = new Gson();
                BaseBean bean = gson.fromJson(jsonObject, BaseBean.class);
                if (bean.isSuccess()) {
                    listener.onSuccess(bean);
                } else {
                    listener.onError(bean.getMessage());
                }
            }

            @Override
            public void onError(String error) {
                listener.onError(error);
            }
        });
    }

    /**
     * 删除数据
     */
    public static void deleteData(BaseView context, String bosType, List<String> ids, final CallBackListener<BaseBean> listener) {
        HttpRequest.deleteData(context, true, bosType, ids, new CallBackListener<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                Gson gson = new Gson();
                BaseBean bean = gson.fromJson(jsonObject, BaseBean.class);
                if (bean.isSuccess()) {
                    listener.onSuccess(null);
                } else {
                    listener.onError(bean.getMessage());
                }
            }

            @Override
            public void onError(String error) {
                listener.onError(error);
            }
        });
    }








    /**
     * 审核
     */
    public static void checkData(BaseView context, String bosType, String id, final CallBackListener<BaseBean> listener) {
        HttpRequest.checkData(context, true, bosType, id, new CallBackListener<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                Gson gson = new Gson();
                BaseBean bean = gson.fromJson(jsonObject, BaseBean.class);
                if (bean.isSuccess()) {
                    listener.onSuccess(bean);
                } else {
                    listener.onError(bean.getMessage());
                }
            }

            @Override
            public void onError(String error) {
                listener.onError(error);
            }
        });
    }

    /**
     * 反审核
     */
    public static void unCheckData(BaseView context, String bosType, String id, final CallBackListener<BaseBean> listener) {
        HttpRequest.unCheckData(context, true, bosType, id, new CallBackListener<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                Gson gson = new Gson();
                BaseBean bean = gson.fromJson(jsonObject, BaseBean.class);
                if (bean.isSuccess()) {
                    listener.onSuccess(bean);
                } else {
                    listener.onError(bean.getMessage());
                }
            }

            @Override
            public void onError(String error) {
                listener.onError(error);
            }
        });
    }

    /**
     * 反审核
     */
    public static void getPermission(BaseView context, final List<String> permissions, final CallBackListListener<String> listener) {
        //饲料药品领用未添加权限
        if(permissions.size()>0&&(permissions.get(0).contains("饲料领用")||permissions.get(0).contains("药品领用"))){
            listener.onSuccess(permissions);
            return;
        }
        HttpRequest.getPermission(context, true, permissions, new CallBackListener<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                Gson gson = new Gson();
                BaseListBean<String> bean = gson.fromJson(jsonObject, new TypeToken<BaseListBean<String>>() {
                }.getType());
//                bean.setData(permissions);
//                listener.onSuccess(bean.getData());
                if (bean.isSuccess()) {
                    listener.onSuccess(bean.getData());
                } else {
                    listener.onError(bean.getMessage());
                }
            }

            @Override
            public void onError(String error) {
                listener.onError(error);
            }
        });
    }

    /**
     * 多图上传
     *
     * @param context
     * @param files
     * @param id
     * @param listener
     */
    public static void putFiles(BaseView context, List<File> files, String id, final CallBackListener<BaseBean> listener) {
        HttpRequest.putFiles(context, true, files, id, new CallBackListener<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                Gson gson = new Gson();
                BaseBean bean = gson.fromJson(jsonObject, BaseBean.class);
                if (bean.isSuccess()) {
                    listener.onSuccess(bean);
                } else {
                    listener.onError(bean.getMessage());
                }
            }

            @Override
            public void onError(String error) {
                listener.onError(error);
            }
        });
    }

    /**
     * 获取图片信息
     *
     * @param context
     * @param id
     * @param listener
     */
    public static void getFilesInfo(BaseView context, String id, final CallBackListListener<FileInfo> listener) {
        HttpRequest.getFilesInfo(context, true, id, new CallBackListener<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                Gson gson = new Gson();
                BaseListBean<FileInfo> bean = gson.fromJson(jsonObject, new TypeToken<BaseListBean<FileInfo>>() {
                }.getType());
                if (bean.isSuccess()) {
                    listener.onSuccess(bean.getData());
                } else {
                    listener.onError(bean.getMessage());
                }
            }

            @Override
            public void onError(String error) {
                listener.onError(error);
            }
        });
    }

    /**
     * 获取图片
     *
     * @param context
     * @param id
     * @param listener
     */
    public static void getFile(BaseView context, String id, final CallBackListener<String> listener) {
        HttpRequest.getFile(context, id, listener);
    }


}
