package mvp.com.zhou.mvp.httputil;



import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import mvp.com.zhou.mvp.MyApp;
import mvp.com.zhou.mvp.constant.SPConstants;
import mvp.com.zhou.mvp.ui.bean.BatchFile;
import mvp.com.zhou.mvp.ui.bean.BatchTypeInfo;
import mvp.com.zhou.mvp.ui.bean.BreedBatch;
import mvp.com.zhou.mvp.ui.bean.BreedPerson;
import mvp.com.zhou.mvp.ui.bean.DieCause;
import mvp.com.zhou.mvp.ui.bean.FileInfo;
import mvp.com.zhou.mvp.ui.bean.LocationNum;
import mvp.com.zhou.mvp.ui.bean.Materiel;
import mvp.com.zhou.mvp.ui.bean.MaterielByHouse;
import mvp.com.zhou.mvp.ui.bean.OutCause;
import mvp.com.zhou.mvp.ui.bean.PenGroupInfo;
import mvp.com.zhou.mvp.ui.bean.PenInfo;
import mvp.com.zhou.mvp.ui.bean.PigCount;
import mvp.com.zhou.mvp.ui.bean.PigFarmInfo;
import mvp.com.zhou.mvp.ui.bean.PigFieldInfo;
import mvp.com.zhou.mvp.ui.bean.PigFile;
import mvp.com.zhou.mvp.ui.bean.PigState;
import mvp.com.zhou.mvp.ui.bean.PregnancyCause;
import mvp.com.zhou.mvp.ui.bean.SemenPerson;
import mvp.com.zhou.mvp.ui.bean.base.BaseBean;
import mvp.com.zhou.mvp.ui.bean.base.BaseListBean;
import mvp.com.zhou.mvp.ui.callback.CallBackListListener;
import mvp.com.zhou.mvp.ui.callback.CallBackListener;
import mvp.com.zhou.mvp.ui.view.base.BaseView;
import mvp.com.zhou.mvp.utils.DataUtils;
import mvp.com.zhou.mvp.wsutil.WSBaseUtil;
import mvp.com.zhou.mvp.wsutil.WSContants;


/**
 * @Auther: LIUQNGFEI
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
     * 获取种猪数据
     */
    public static void getPigDataFromNet(BaseView context, String queryStr, CallBackListListener<PigFile> listListener) {

        getPigDataFromNet(context, -1, -1, queryStr, listListener);
    }

    /**
     * 获取栋舍信息
     *
     * @param listListener
     */
    public static void getPenDataFromNet(BaseView context, final String queryStr, final CallBackListListener<PenInfo> listListener) {
        HashMap<String, String> jsonParams = new HashMap<String, String>();
        jsonParams.put("bosType", WSContants.PEN_BOSTYPE);
        jsonParams.put("isReplaceSplit", "true");
        if (queryStr != null && !"".equals(queryStr)) {
            jsonParams.put("queryStr", queryStr+" order by name asc");
        }
        if (HttpContants.USE_HTTP) {
            HttpRequest.getList(context, true, jsonParams, new CallBackListener<JsonObject>() {
                @Override
                public void onSuccess(JsonObject jsonObject) {
                    Gson gson = new Gson();
                    BaseListBean<PenInfo> bean = gson.fromJson(jsonObject, new TypeToken<BaseListBean<PenInfo>>() {
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
//                    BaseListBean<PenInfo> bean = gson.fromJson(result, new TypeToken<BaseListBean<PenInfo>>() {
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
     * 获取分场
     */
    public static void getFarmInfoFromNet(BaseView context, final CallBackListListener<PigFarmInfo> listener) {
        final HashMap<String, String> jsonParams = new HashMap<>();
        jsonParams.put("userNum", MyApp.getPreferencesService().getValue(SPConstants.LOGIN_USER, ""));
        jsonParams.put("APP_BIZTYPE_CONSTANT", "GetPersonInfo");
        HttpRequest.getData(context, false, jsonParams, new CallBackListener<JsonObject>()

        {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                Gson gson = new Gson();
                BaseListBean<PigFarmInfo> bean = gson.fromJson(jsonObject, new TypeToken<BaseListBean<PigFarmInfo>>() {
                }.getType());
                if (bean.isSuccess()) {
                    listener.onSuccess(bean.getPigFarms());
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
     * 获取分场
     */
    public static void getFieldInfoFromNet(BaseView context, String queryStr, final CallBackListListener<PigFieldInfo> listener) {

        HashMap<String, String> jsonParams = new HashMap<String, String>();
        jsonParams.put("bosType", WSContants.FIELD_BOSTYPE);
        jsonParams.put("isReplaceSplit", "true");
        jsonParams.put("queryStr", queryStr);
        if (HttpContants.USE_HTTP) {
            HttpRequest.getList(context, true, jsonParams, new CallBackListener<JsonObject>() {
                @Override
                public void onSuccess(JsonObject jsonObject) {
                    Gson gson = new Gson();
                    BaseListBean<PigFieldInfo> bean = gson.fromJson(jsonObject, new TypeToken<BaseListBean<PigFieldInfo>>() {
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
        } else {


        }
    }

    /**
     * 获取配种员
     */
    public static void getBreedPersonFromNet(BaseView context, String name, final CallBackListListener<BreedPerson> listener) {
        HashMap<String, String> params = new HashMap<>();
        params.put("bosType", WSContants.BREED_PERSON_BOSTYPE);
        params.put("isReplaceSplit", "true");
        StringBuffer str = new StringBuffer();
        str.append("Belongzc.id='" + MyApp.getPreferencesService().getValue(SPConstants.FARM_ID, "") + "'");
        if (name != null && !"".equals(name)) {
            str.append(" and Employee.id in (\n" +
                    "select fpersonid from t_pm_user where fnumber='" + name + "'\n" +
                    ")");
        }
        params.put("queryStr", str.toString());
        HttpRequest.getList(context, true, params, new CallBackListener<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                Gson gson = new Gson();
                BaseListBean<BreedPerson> bean = gson.fromJson(jsonObject, new TypeToken<BaseListBean<BreedPerson>>() {
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
     * 获取单据详情
     */
    public static void getEtcInfoById(BaseView context, String id, String slor, final CallBackListener<JsonObject> listener) {
        JsonObject object = new JsonObject();
        object.addProperty("id", id);
        if (slor != null) {
            String[] s = slor.split(",");
            JsonArray ja = new JsonArray();
            for (int i = 0; i < s.length; i++) {
                ja.add(s[i]);
            }
            object.add("slor", ja);
        }
        HttpRequest.getData(context, true, object, listener);
    }

    /**
     * 根据仓库获取饲料
     *
     * @param context
     * @param houseId
     * @param listListener
     */
    public static void getMaterielByHouse(BaseView context, String houseId, final CallBackListListener<MaterielByHouse> listListener) {
        HashMap<String, String> jsonParams = new HashMap<>();
        jsonParams.put("queryInfo", "com.kingdee.eas.custom.pig.InitInventoryQuery");
        jsonParams.put("queryStr", "warehouse.id ='" + houseId + "'");
        jsonParams.put("isReplaceSplit", "true");
        HttpRequest.getList(context, true, jsonParams, new CallBackListener<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                Gson gson = new Gson();
                BaseListBean<MaterielByHouse> bean = gson.fromJson(jsonObject, new TypeToken<BaseListBean<MaterielByHouse>>() {
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

    }

    /**
     * 获取饲料
     *
     * @param context
     * @param listListener
     */
    public static void getMaterielfromNet(BaseView context, final CallBackListListener<Materiel> listListener) {
        HashMap<String, String> jsonParams = new HashMap<String, String>();
        jsonParams.put("bosType", WSContants.FEED_FOOD_BOSTYPE);
        jsonParams.put("queryInfo", "com.kingdee.eas.basedata.master.material.app.MaterialQuery");
        jsonParams.put("queryStr", "id in (select FMaterialID from T_BD_MaterialCompanyInfo mc inner join CT_BAS_FieldFile ff on ff.CFCompanyID=mc.FCompanyID where ff.fid='" +
                MyApp.getPreferencesService().getValue(SPConstants.FIELD_ID, "") + "')");
        jsonParams.put("isReplaceSplit", "true");

        HttpRequest.getList(context, true, jsonParams, new CallBackListener<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                Gson gson = new Gson();
                BaseListBean<Materiel> bean = gson.fromJson(jsonObject, new TypeToken<BaseListBean<Materiel>>() {
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

    public static void getLocationNum(BaseView view, List<PenInfo> penInfos, final CallBackListListener<LocationNum> listener ){
        List<String> ids = new ArrayList<>();
        for(int i=0;i<penInfos.size();i++){
            ids.add(penInfos.get(i).getId());
        }
        HttpRequest.getNumByBuilding(view, true, ids, new CallBackListener<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                Gson gson = new Gson();
                BaseListBean<LocationNum> bean = gson.fromJson(jsonObject, new TypeToken<BaseListBean<LocationNum>>() {
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
}
