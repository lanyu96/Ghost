package mvp.com.zhou.mvp.ui.model.main;


import android.content.Context;

import java.util.List;

import mvp.com.zhou.mvp.ui.bean.MainFunction;
import mvp.com.zhou.mvp.ui.model.base.BaseModel;


/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/7/27 15:34
 * @Description:
 */
public interface MainOperateModel extends BaseModel {

    void addFunction(List<MainFunction> mList, Context context);


}
