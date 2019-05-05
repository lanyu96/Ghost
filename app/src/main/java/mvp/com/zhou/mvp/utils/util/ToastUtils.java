package mvp.com.zhou.mvp.utils.util;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;


/**
 * toast工具类 防止重复弹出toast
 */
public class ToastUtils {

	private Context context;
	private Toast toast = null;

	public ToastUtils(Context context) {
		this.context = context;
	}

	public void showToast(int resID) {
		showToast(context, Toast.LENGTH_SHORT, resID);
	}

	public void showToast(String text) {
		showToast(context, Toast.LENGTH_SHORT, text);
	}

	public void showToast(Context ctx, int resID) {
		showToast(ctx, Toast.LENGTH_SHORT, resID);
	}

	public void showToast(Context ctx, String text) {
		showToast(ctx, Toast.LENGTH_SHORT, text);
	}

	public void showLongToast(Context ctx, int resID) {
		showToast(ctx, Toast.LENGTH_LONG, resID);
	}

	public void showLongToast(int resID) {
		showToast(context, Toast.LENGTH_LONG, resID);
	}

	public void showLongToast(Context ctx, String text) {
		showToast(ctx, Toast.LENGTH_LONG, text);
	}

	public void showLongToast(String text) {
		showToast(context, Toast.LENGTH_LONG, text);
	}

	public void showToast(Context ctx, int duration, int resID) {
		showToast(ctx, duration, ctx.getString(resID));
	}

	/** Toast一个图片 */
	public Toast showToastImage(Context ctx, int resID) {
		toast = Toast.makeText(ctx, "", Toast.LENGTH_SHORT);
		View mNextView = toast.getView();
		if (mNextView != null)
			mNextView.setBackgroundResource(resID);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
		return toast;
	}
	public void showToast(final Context ctx, final int duration,
                          final String text) {

		if (toast == null) {
			toast = Toast.makeText(ctx, text, duration);
//			if(MyApp.isPad(context)) {
//				//LinearLayout layout = (LinearLayout) toast.getView();
//				//layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
//				TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
//				//v.setTextColor(Color.BLACK);
//				v.setTextSize(30);
//			}
		} else {
			toast.setText(text);
		}
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}

	/** 在UI线程运行弹出 */
	public void showToastOnUiThread(final Activity ctx, final String text) {
		if (ctx != null) {
			ctx.runOnUiThread(new Runnable() {
				public void run() {
					showToast(ctx, text);
				}
			});
		}
	}

}
