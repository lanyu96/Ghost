package com.zhou.ghost.ui.model.main;


import android.content.Context;

import java.util.List;

import com.zhou.ghost.ui.bean.MainFunction;
import com.zhou.ghost.ui.model.base.BaseModel;


/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/7/27 15:34
 * @Description:
 */
public interface MainOperateModel extends BaseModel {

    void addFunction(List<MainFunction> mList, Context context);


}
