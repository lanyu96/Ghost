package com.zhou.ghost.ui.model.main;


import android.content.Context;

import java.util.List;

import com.zhou.ghost.ui.callback.CallBackListListener;
import com.zhou.ghost.ui.model.base.BaseModel;

/**
 * @Auther: zhou
 * @Date: 2018/7/27 15:34
 * @Description:
 */
public interface MainReportModel extends BaseModel {

    void getDailyReport(Context context, String date, CallBackListListener<List> listener);
}
