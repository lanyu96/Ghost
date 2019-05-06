package com.zhou.ghost.ui.model.main;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import com.zhou.ghost.httputil.HttpRequest;
import com.zhou.ghost.ui.bean.DailyReportData;
import com.zhou.ghost.ui.bean.DailyReportData1;
import com.zhou.ghost.ui.bean.DailyReportTable;
import com.zhou.ghost.ui.bean.DailyReportTableInt;
import com.zhou.ghost.ui.callback.CallBackListListener;
import com.zhou.ghost.ui.callback.CallBackListener;
import com.zhou.ghost.ui.model.base.BaseModelImpl;
import com.zhou.ghost.ui.view.base.BaseView;
import com.zhou.ghost.utils.DataUtils;


/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/7/27 15:34
 * @Description:
 */
public class MainReportModelImpl extends BaseModelImpl implements MainReportModel {


    private List<List> list;
    //配种
    private List<DailyReportTableInt> pzList;
    //返情
    private List<DailyReportTableInt> fqList;
    //流产
    private ArrayList<DailyReportTableInt> lcList;

    //分娩
    private List<DailyReportTable> fmList;

    //断奶
    private ArrayList<DailyReportTable> dnList;
    //死亡
    private ArrayList<DailyReportTable> swList;
    //淘汰
    private ArrayList<DailyReportTable> ttList;
    //销售
    private ArrayList<DailyReportTable> xsList;

    @Override
    public void getDailyReport(Context context, String date, final CallBackListListener<List> listener) {

        String rptName = "dailyReport";
        //临时用前一天的

        list = new ArrayList<>();
        pzList = new ArrayList<>();
        fqList = new ArrayList<>();
        fmList = new ArrayList<>();
        lcList = new ArrayList<>();
        dnList = new ArrayList<>();
        swList = new ArrayList<>();
        ttList = new ArrayList<>();
        xsList = new ArrayList<>();

        HttpRequest.getRptData((BaseView) context, true, rptName,"Report",0,"",date, new CallBackListener<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                String s = String.valueOf(jsonObject);
                Log.i("ZHOUT", "日报 " + s);

                Gson gson = new Gson();
                JsonArray jsonArray = jsonObject.getAsJsonArray("data");
                for (int i = 0;i<jsonArray.size();i++) {
                    JsonObject json = (JsonObject) jsonArray.get(i);
                    String jsonStr = DataUtils.getJsonString(json);
                    if (i < 3) {
                        DailyReportData1 dailyReportData1 = gson.fromJson(jsonStr, DailyReportData1.class);
                        switch (dailyReportData1.getTableName()) {
                            case "配种":
                                List<DailyReportData1.DataBean> pzData = dailyReportData1.getData();
                                for (int j = 0; j < pzData.size(); j++) {
                                    DailyReportData1.DataBean drd1 = pzData.get(j);
                                    String col4 = "";
                                    if (drd1.getCol4() == 0 || drd1.getCol4() == 999) {
                                        col4 = "-";
                                    } else {
                                        col4 = String.valueOf(drd1.getCol4());
                                    }
                                    pzList.add(new DailyReportTableInt(drd1.getCol1(), drd1.getCol2(), drd1.getCol3(), col4));
                                }
                                break;
                            case "返情":
                                List<DailyReportData1.DataBean> fqData = dailyReportData1.getData();
                                for (int j = 0; j < fqData.size(); j++) {
                                    DailyReportData1.DataBean drd1 = fqData.get(j);
                                    String col4 = "";
                                    if (drd1.getCol4() == 0 || drd1.getCol4() == 999) {
                                        col4 = "-";
                                    } else {
                                        col4 = String.valueOf(drd1.getCol4());
                                    }
                                    fqList.add(new DailyReportTableInt(drd1.getCol1(), drd1.getCol2(), drd1.getCol3(), col4));
                                }
                                break;
                            case "流产":
                                List<DailyReportData1.DataBean> lcData = dailyReportData1.getData();
                                for (int j = 0; j < lcData.size(); j++) {
                                    DailyReportData1.DataBean drd1 = lcData.get(j);
                                    String col4 = "";
                                    if (drd1.getCol4() == 0 || drd1.getCol4() == 999) {
                                        col4 = "-";
                                    } else {
                                        col4 = String.valueOf(drd1.getCol4());
                                    }
                                    lcList.add(new DailyReportTableInt(drd1.getCol1(), drd1.getCol2(), drd1.getCol3(), col4));
                                }
                                break;
                        }
                    } else {
                        DailyReportData dailyReportData = gson.fromJson(jsonStr, DailyReportData.class);
                        switch (dailyReportData.getTableName()) {
                            case "分娩":
                                List<DailyReportData.DataBean> fmData = dailyReportData.getData();
                                for (int j = 0; j < fmData.size(); j++) {
                                    DailyReportData.DataBean drd = fmData.get(j);
                                    fmList.add(new DailyReportTable(drd.getCol1(), drd.getCol2(), drd.getCol3(), drd.getCol4()));
                                }
                                break;
                            case "断奶":
                                List<DailyReportData.DataBean> dnData = dailyReportData.getData();
                                for (int j = 0; j < dnData.size(); j++) {
                                    DailyReportData.DataBean drd = dnData.get(j);
                                    dnList.add(new DailyReportTable(drd.getCol1(), drd.getCol2(), drd.getCol3(), drd.getCol4()));
                                }
                                break;
                            case "死亡":
                                List<DailyReportData.DataBean> swData = dailyReportData.getData();
                                for (int j = 0; j < swData.size(); j++) {
                                    DailyReportData.DataBean drd = swData.get(j);
                                    //判断如果为空，则默认赋值为0
                                    if (TextUtils.isEmpty(drd.getCol2())) {
                                        drd.setCol2("0");
                                    }
                                    if (TextUtils.isEmpty(drd.getCol3())) {
                                        drd.setCol3("0");
                                    }
                                    if (TextUtils.isEmpty(drd.getCol4())) {
                                        drd.setCol4("0");
                                    }
                                    swList.add(new DailyReportTable(drd.getCol1(), drd.getCol2(), drd.getCol3(), drd.getCol4()));
                                }
                                break;
                            case "淘汰":
                                List<DailyReportData.DataBean> ttData = dailyReportData.getData();
                                for (int j = 0; j < ttData.size(); j++) {
                                    DailyReportData.DataBean drd = ttData.get(j);
                                    //判断如果为空，则默认赋值为0
                                    if (TextUtils.isEmpty(drd.getCol2())) {
                                        drd.setCol2("0");
                                    }
                                    if (TextUtils.isEmpty(drd.getCol3())) {
                                        drd.setCol3("0");
                                    }
                                    if (TextUtils.isEmpty(drd.getCol4())) {
                                        drd.setCol4("0");
                                    }
                                    ttList.add(new DailyReportTable(drd.getCol1(), drd.getCol2(), drd.getCol3(), drd.getCol4()));
                                }
                                break;
                            case "销售":
                                List<DailyReportData.DataBean> xsData = dailyReportData.getData();
                                for (int j = 0; j < xsData.size(); j++) {
                                    DailyReportData.DataBean drd = xsData.get(j);
                                    //判断如果为空，则默认赋值为0
                                    if (TextUtils.isEmpty(drd.getCol2())) {
                                        drd.setCol2("0");
                                    }
                                    if (TextUtils.isEmpty(drd.getCol3())) {
                                        drd.setCol3("0");
                                    }
                                    if (TextUtils.isEmpty(drd.getCol4())) {
                                        drd.setCol4("0");
                                    }
                                    xsList.add(new DailyReportTable(drd.getCol1(), drd.getCol2(), drd.getCol3(), drd.getCol4()));
                                }
                                break;
                        }


                    }
                }


                //将所有的表格返回到P层调用
                list.add(pzList);
                list.add(fqList);
                list.add(lcList);
                list.add(fmList);
                list.add(dnList);
                list.add(swList);
                list.add(ttList);
                list.add(xsList);


                listener.onSuccess(list);
            }

            @Override
            public void onError(String error) {



                listener.onError(error);
            }
        });




    }
}
