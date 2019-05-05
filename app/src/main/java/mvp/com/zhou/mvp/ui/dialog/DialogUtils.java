package mvp.com.zhou.mvp.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;

import java.util.List;


/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/7/19 21:31
 * @Description:
 */
public class DialogUtils {
    protected Dialog dialog;

    public void showDateTimeDialog(Context context, final String dateTime, final OnDateTimeListener listener){
        dialog = new DateTimeDialog().showDateTimeDialog(context, dateTime, new DateTimeDialog.OnDateTimeListener() {
            @Override
            public void onDateTimeListener(String dateTime) {
                listener.onDateTimeListener(dateTime);
                dialog.dismiss();
            }
        });
        try {
            dialog.show();
        } catch (Exception e) {
            dialog = null;
        }
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
    public void showSureDialog(Context context, String title, String message, String sTrue, String sFalse, final OnTrueClickListener listener) {

        dialog = new SureDialog().showSureDialog(context, title, message, sTrue, sFalse, new SureDialog.OnClickListener() {
            @Override
            public void OnConfirmClickListener() {
                listener.onTrueClickListener();
                dialog.dismiss();
            }

            @Override
            public void OnCenterClickListener() {

            }

            @Override
            public void OnCancleClickListener() {
                dialog.dismiss();
            }
        });
        try {
            dialog.show();
        } catch (Exception e) {
            dialog = null;
        }
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
    public void showSureDialog(Context context, String title, String message, String sTrue, String sCenter, String sFalse, final OnTrueThreeClickListener listener) {

        dialog = new SureDialog().showSureDialog(context, title, message, sTrue, sCenter,sFalse, new SureDialog.OnClickListener() {
            @Override
            public void OnConfirmClickListener() {
                listener.onTrueClickListener();
                dialog.dismiss();
            }

            @Override
            public void OnCenterClickListener() {
                listener.onCenterClickListener();
                dialog.dismiss();
            }

            @Override
            public void OnCancleClickListener() {
                listener.onCancleClickListener();
                dialog.dismiss();
            }
        });
        dialog.setCanceledOnTouchOutside(false);
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
            @Override
            public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK) {
                    return true;
                }
                return false;
            }
        });
        try {
            dialog.show();
        } catch (Exception e) {
            dialog = null;
        }
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
    public void showSureDialog(Context context, String title, String message, String sTrue, String sFalse, final OnTrueCancleClickListener listener) {

        dialog = new SureDialog().showSureDialog(context, title, message, sTrue, sFalse, new SureDialog.OnClickListener() {
            @Override
            public void OnConfirmClickListener() {
                listener.onTrueClickListener();
                dialog.dismiss();
            }

            @Override
            public void OnCenterClickListener() {

            }

            @Override
            public void OnCancleClickListener() {
                listener.onCancleClickListener();
                dialog.dismiss();
            }
        });
        dialog.setCanceledOnTouchOutside(false);
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
            @Override
            public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK) {
                    return true;
                }
                return false;
            }
        });
        try {
            dialog.show();
        } catch (Exception e) {
            dialog = null;
        }
    }
    /**
     * 展示选择列表框
     *
     * @param context
     * @param list
     * @param listener
     */
    public void showSelectDialog(Context context, final List<String> list, final OnItemClickListener listener) {

        dialog = new SelectTextDialog().showSelectDialog(context, list, new SelectTextDialog.OnItemClickListener() {
            @Override
            public void onItemClickListener(int position) {
                listener.onItemClickListener(position);
                dialog.dismiss();
            }
        });

        try {
            dialog.show();
        } catch (Exception e) {
            dialog = null;
        }

    }

    /**
     * 展示日期选择框
     *
     * @param context
     * @param date
     */
    @SuppressWarnings("ResourceType")
    public void showDateSeletDialog(Context context, String date, final OnDateClickListener listener) {
       dialog =  new DateDialog().showDateSeletDialog(context, date, new DateDialog.OnDateClickListener() {
           @Override
           public void onDateClickListener(String date) {
               listener.onDateClickListener(date);
               dialog.dismiss();
           }
       });
        try {
            dialog.show();
        } catch (Exception e) {
            dialog = null;
        }
    }


    public interface OnDateTimeListener {
        void onDateTimeListener(String dateTime);
    }

    public interface OnItemClickListener {
        void onItemClickListener(int position);
    }

    public interface OnTrueClickListener {
        void onTrueClickListener();
    }
    public interface OnTrueCancleClickListener {
        void onTrueClickListener();

        void onCancleClickListener();
    }
    public interface OnTrueThreeClickListener {
        void onTrueClickListener();
        void onCenterClickListener();
        void onCancleClickListener();
    }
    public interface OnDateClickListener {
        void onDateClickListener(String date);
    }

}
