package mvp.com.zhou.mvp.ui.model.main;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import mvp.com.zhou.mvp.httputil.HttpRequest;
import mvp.com.zhou.mvp.ui.bean.ProductData;
import mvp.com.zhou.mvp.ui.bean.ProductTable;
import mvp.com.zhou.mvp.ui.callback.CallBackListListener;
import mvp.com.zhou.mvp.ui.callback.CallBackListener;
import mvp.com.zhou.mvp.ui.model.base.BaseModelImpl;
import mvp.com.zhou.mvp.ui.view.base.BaseView;
import mvp.com.zhou.mvp.utils.DataUtils;
import mvp.com.zhou.mvp.utils.DateTimeHelper;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/7/27 15:34
 * @Description:
 */
public class MainHomeModelImpl extends BaseModelImpl implements MainHomeModel {
//    private int dayInfo;
//    private int monthInfo;
//    private int standardInfo;

    @Override
    public void addProductTableData(final Context context, final CallBackListListener<List> listener) {


        //表数据
        String rptName = "indexProduct";
        String date = DateTimeHelper.getDayBefore();
        final List<ProductTable> list = new ArrayList<>();
        final List<ProductTable> listSCTX = new ArrayList<>();
        final List<ProductTable> listCL = new ArrayList();
        final List<List> list1 = new ArrayList();
//        list.add(new ProductTable("xiangmu", 21, 3, 5));

//        showProgress(MyApp.getRes().getString(R.string.loading));
        HttpRequest.getRptData((BaseView) context, true, rptName, "SCQK", 0, "", date, new CallBackListener<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {

                String s = String.valueOf(jsonObject);
                Log.i("ZHOUT", s);

                JsonArray ja1 = jsonObject.getAsJsonArray("data");

                for (int i = 0; i < 3; i++) {
                    JsonArray ja = (JsonArray) ja1.get(i);
                    //生产提醒/生产异常
                    if (ja.size() == 1 || ja.size() == 2) {
                        Gson gson = new Gson();

                        JsonObject json1 = (JsonObject) ja.get(0);

                        String jsonStr = DataUtils.getJsonString(json1);
                        ProductData productData = gson.fromJson(jsonStr, ProductData.class);
                        //生产提醒的
                        int sctx = productData.getProductAlarm();
                        //生产异常的
                        int scyc = productData.getProductError();
                        listSCTX.add(new ProductTable(sctx, scyc));

                    } else if (ja.size() == 6) {

                        Gson gson = new Gson();

                        for (int j = 0; j < ja.size(); j++) {
                            //处理生产情况中的六条信息
                            JsonObject jsonObjectAlone = (JsonObject) ja.get(j);
                            String jsonStr = DataUtils.getJsonString(jsonObjectAlone);
                            ProductData productData = gson.fromJson(jsonStr, ProductData.class);
//                            Log.i("ZHOUT", productData.getProgram()+productData.getDayBirth());
                            String program1 = productData.getProgram();
                            //根据项目名称判断
                            switch (program1) {
                                case "配种数":
                                    list.add(new ProductTable(program1, productData.getDayMating(), productData.getMonthMating(), productData.getStandMating()));
                                    break;
                                case "分娩":
                                    list.add(new ProductTable(program1, productData.getDayBirth(), productData.getMonthBirth(), productData.getStandBirth()));
                                    break;
                                case "窝均活仔":
                                    list.add(new ProductTable(program1, productData.getDaywjhz(), productData.getMonthwjhz(), productData.getStandwjhz()));
                                    break;
                                case "育肥死亡":
                                    list.add(new ProductTable(program1, productData.getDayYFDeath(), productData.getMonthYFDeath(), productData.getStandYFDeath()));
                                    break;
                                case "保育死亡":
                                    list.add(new ProductTable(program1, productData.getDayBYDeath(), productData.getMonthBYDeath(), productData.getStandBYDeath()));
                                    break;
                                case "产房死亡":
                                    list.add(new ProductTable(program1, productData.getDayCFDeath(), productData.getMonthCFDeath(), productData.getStandCFDeath()));
                                    break;
                            }
                        }
                    } else if (ja.size() == 4) {
                        Gson gson = new Gson();
                        for (int z = 0; z < 4; z++) {
                            JsonObject json = (JsonObject) ja.get(z);
                            String jsonStr = DataUtils.getJsonString(json);
                            ProductData productData = gson.fromJson(jsonStr, ProductData.class);
                            String program = productData.getProgram();
                            int num = productData.getNum();
                            listCL.add(new ProductTable(program, num));

                        }


//                        listCL.add(new ProductTable(1, 2, 3, 4));
                    }
                }

                list1.add(listSCTX);
                list1.add(list);
                list1.add(listCL);
                listener.onSuccess(list1);

            }

            @Override
            public void onError(String error) {
                listener.onError(error);
            }
        });


    }


}
