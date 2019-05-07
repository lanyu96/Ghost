package com.zhou.ghost.ui.model.main;

import android.content.Context;

import java.util.List;

import com.zhou.ghost.ui.bean.MainFunction;
import com.zhou.ghost.ui.model.base.BaseModelImpl;


/**
 * @Auther: zhou
 * @Date: 2018/7/27 15:34
 * @Description:
 */
public class MainOperateModelImpl extends BaseModelImpl implements MainOperateModel {

    public void addFunction(List<MainFunction> mList, Context context) {
        mList.clear();

//        mList.add(new MainFunction("种猪档案", R.drawable.function_pig_manage, new Intent(context, PigFileViewActivity.class)));
//
//        mList.add(new MainFunction("批次档案", R.drawable.function_batch_manage, new Intent(context, BatchFileViewActivity.class)));
//
//        mList.add(new MainFunction("生产记录", R.drawable.function_produce_manage, new Intent(context, ProductViewActivity.class)));
//
//        mList.add(new MainFunction("公猪业务", R.drawable.function_pig_manage,
//                new Intent(context, BusinessCategoryViewActivity.class).putExtra(BaseConstants.BUSINESS, BaseConstants.MALE_BUSINESS)));
//
//        mList.add(new MainFunction("母猪业务", R.drawable.function_pig_manage,
//                new Intent(context, BusinessCategoryViewActivity.class).putExtra(BaseConstants.BUSINESS, BaseConstants.FEMALE_BUSINESS)));
//
//        mList.add(new MainFunction("转群业务", R.drawable.function_transfer_pigpen,
//                new Intent(context, BusinessCategoryViewActivity.class).putExtra(BaseConstants.BUSINESS, BaseConstants.TRANSFER_BUSINESS)));
//
//        mList.add(new MainFunction("死淘业务", R.drawable.function_dielimt,
//                new Intent(context, BusinessCategoryViewActivity.class).putExtra(BaseConstants.BUSINESS, BaseConstants.DEATH_BUSINESS)));
//
//        mList.add(new MainFunction("生产猪盘点", R.drawable.function_alarm_immune,
//                new Intent(context, ScanListViewActivity.class)));
//        mList.add(new MainFunction("物资领用", R.drawable.recfeed,
//                new Intent(context, BusinessCategoryViewActivity.class).putExtra(BaseConstants.BUSINESS, BaseConstants.USE_BUSINESS)));

//        mList.add(new MainFunction("饲喂管理", R.drawable.function_recfeed,
//                new Intent(context, BusinessCategoryViewActivity.class).putExtra(BaseConstants.BUSINESS, BaseConstants.FEED_BUSINESS)));
//
//        mList.add(new MainFunction("生产预警", R.drawable.function_alarm, null));
//
//        mList.add(new MainFunction("报表分析", R.drawable.function_report_form,
//                new Intent(context, BusinessCategoryViewActivity.class).putExtra(BaseConstants.BUSINESS, BaseConstants.REPORT_BUSINESS)));


        int n = mList.size();
        if(n%3!=0) {
            for (int i = 0; i < 3 - n % 3; i++) {
                mList.add(new MainFunction());
            }
        }

    }


}
