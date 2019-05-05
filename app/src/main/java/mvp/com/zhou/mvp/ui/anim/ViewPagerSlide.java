package mvp.com.zhou.mvp.ui.anim;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;


/**
 * 控制viewPager是否可以左右滑动
 *
 * isSlide 为 false是不可左右滑动 为 true是可以左右滑动
 */
public class ViewPagerSlide extends ViewPager {

    private boolean isSlide = false;

    public void setSlide(boolean slide) {
        isSlide = slide;
    }
    public ViewPagerSlide(Context context) {
        super(context);
    }

    public ViewPagerSlide(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    /**
     * 设置其是否能滑动换页
     * @param isSlide false 不能换页， true 可以滑动换页
     */
    public void setScanScroll(boolean isSlide) {
        this.isSlide = isSlide;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return isSlide && super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return isSlide && super.onTouchEvent(ev);

    }



}
