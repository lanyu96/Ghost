package mvp.com.zhou.mvp.ui.view.base;

import android.view.View.OnClickListener;


public interface ITitleInterface {
	 String setTitleText();

	 boolean setTitleLeftHide();

	 String setTitleRightText();

	 OnClickListener setTitleRightTextClickListener();

	 int setTitleRightImageResource();

	 OnClickListener setTitleRightImageClickListener();

}
