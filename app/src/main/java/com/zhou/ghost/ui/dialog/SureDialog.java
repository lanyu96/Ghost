package com.zhou.ghost.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.zhou.ghost.R;


/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/8/2 10:55
 * @Description:
 */
public class SureDialog {
    private static Dialog dialog;

    /**
     * 展示确定选择框
     *
     * @param context
     * @param title
     * @param sTrue
     * @param sFalse
     * @param listener
     */
    public Dialog showSureDialog(Context context, String title, String message, String sTrue, String sCenter, String sFalse, final OnClickListener listener) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View lview = getSureView(context, title, message, sTrue,sCenter, sFalse, listener);
        builder.setView(lview);
        return builder.create();
    }
    /**
     * 展示确定选择框
     *
     * @param context
     * @param title
     * @param sTrue
     * @param sFalse
     * @param listener
     */
    public Dialog showSureDialog(Context context, String title, String message, String sTrue, String sFalse, final OnClickListener listener) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View lview = getSureView(context, title, message, sTrue,null, sFalse, listener);
        builder.setView(lview);
        return builder.create();
    }
    @NonNull
    private View getSureView(Context context, String title, String message, String sTrue, String sCenter, String sFalse, final OnClickListener listener) {
        View lview = LayoutInflater.from(context).inflate(R.layout.dialog_sure_select, null);
        TextView tv_title = lview.findViewById(R.id.tv_dialog_sure_title);
        TextView tv_message = lview.findViewById(R.id.tv_dialog_sure_message);
        TextView tv_yes = lview.findViewById(R.id.tv_dialog_sure_yes);
        TextView tv_cen = lview.findViewById(R.id.tv_dialog_sure_center);
        TextView tv_no = lview.findViewById(R.id.tv_dialog_sure_no);
        tv_title.setText(title);
        if (message != null) {
            tv_message.setVisibility(View.VISIBLE);
            tv_message.setText(message);
        } else {
            tv_message.setVisibility(View.GONE);
        }
        if(sCenter==null){
            tv_cen.setVisibility(View.GONE);
        }else{
            tv_cen.setVisibility(View.VISIBLE);
            tv_cen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.OnCenterClickListener();
                }
            });
        }
        tv_yes.setText(sTrue);
        tv_cen.setText(sCenter);
        tv_no.setText(sFalse);

        tv_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnConfirmClickListener();
            }
        });
        tv_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnCancleClickListener();
            }
        });
        return lview;
    }

    public interface OnClickListener {
        void OnConfirmClickListener();
        void OnCenterClickListener();
        void OnCancleClickListener();
    }
}
