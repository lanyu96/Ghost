package com.zhou.ghost.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import com.zhou.ghost.R;
import com.zhou.ghost.ui.adapter.dialog.MyTextAdapter;


/**
 * @Auther: zhou
 * @Date: 2018/8/2 11:07
 * @Description:
 */
public class SelectTextDialog {
    /**
     * 展示选择列表框
     *
     * @param context
     * @param list
     * @param listener
     */
    public Dialog showSelectDialog(Context context, final List<String> list, final OnItemClickListener listener) {
        //    通过LayoutInflater来加载一个xml的布局文件作为一个View对象
        View lview = LayoutInflater.from(context).inflate(R.layout.dialog_table_show, null);
        ListView listView = (ListView) lview.findViewById(R.id.lv_data_show);

        MyTextAdapter adapter = new MyTextAdapter(context, list);
        listView.setAdapter(adapter);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(lview);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listener.onItemClickListener(position);

            }
        });
        return builder.create();
    }


    public interface OnItemClickListener {
        void onItemClickListener(int position);
    }
}
