package mvp.com.zhou.mvp.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;

import mvp.com.zhou.mvp.R;

public class Slider extends HorizontalScrollView {

    //左边菜单布局
    private View mLeftMenu;
    //右边菜单布局
    private View mRightMenu;

    //内容布局
    private View mContentView;
    //菜单是否打开
    private boolean mMenuIsOpen;
    //是否拦截事件
    private boolean mIntercept;
    //手势处理类
    private GestureDetector mGestureDetector;

    //右侧手势处理类
    private GestureDetector mRightGestureDetector;
    //菜单的宽度
    private int mMenuWidth;
    private View mShadeView;
    private Context mContext;
    //屏幕宽度
    private int screenWidth;

    //是否从右侧滑出
    private boolean isRight = false;

    public Slider(Context context) {
        this(context, null);
    }

    public Slider(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Slider(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.Slider);
        //菜单离右边屏幕边缘的距离
        float rightMargin = array.getDimension(R.styleable.Slider_MenuLeftMargin, ScreenUtils.dip2px(mContext, 50));
        mMenuWidth = (int) (ScreenUtils.getScreenWidth(mContext) - rightMargin);
        screenWidth = ScreenUtils.getScreenWidth(mContext);
        array.recycle();
        mGestureDetector = new GestureDetector(mContext, mGestureDetectorListener);
    }

    //右侧滑出
    public Slider(Context context, AttributeSet attrs, int defStyleAttr, boolean isRightSlider) {
        super(context, attrs, defStyleAttr);
        isRight = true;
        this.mContext = context;
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.Slider);
        float leftMargin = array.getDimension(R.styleable.Slider_MenuLeftMargin, ScreenUtils.dip2px(mContext, 50));
        mMenuWidth = (int) (ScreenUtils.getScreenWidth(mContext) - leftMargin);
        mRightGestureDetector = new GestureDetector(mContext, mRightGestureDetectorListener);


    }


    /**
     * 从右侧滑出
     */
    private GestureDetector.SimpleOnGestureListener mRightGestureDetectorListener = new GestureDetector.SimpleOnGestureListener() {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            // 快速滑动
            // 向右快速滑动会是正的  +   向左快速滑动 是  -
            // 如果菜单是打开的   向右向左快速滑动都会回调这个方法
            if (mMenuIsOpen) {
                if (velocityX > 0) {
                    closeRightMenu();
                    return true;
                }
            } else {
                if (velocityX < 0) {
                    openRightMenu();
                    return true;
                }
            }
            return super.onFling(e1, e2, velocityX, velocityY);

        }


    };


    /**
     * 从左侧滑出
     */
    private GestureDetector.SimpleOnGestureListener mGestureDetectorListener = new GestureDetector.SimpleOnGestureListener() {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            // 快速滑动
            // 向右快速滑动会是正的  +   向左快速滑动 是  -
            // 如果菜单是打开的   向右向左快速滑动都会回调这个方法
            if (mMenuIsOpen) {
                if (velocityX+2500 < 0) {
                    Log.i("ZHOUTEST", "" + velocityX);
                    closeMenu();
                    return true;
                }
            } else {
                if (velocityX-2500 > 0) {
                    Log.i("ZHOUTEST", "" + velocityX);
                    openMenu();
                    return true;
                }
            }
            return super.onFling(e1, e2, velocityX, velocityY);
        }
    };


    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (isRight) {
            ViewGroup rootView = (ViewGroup) getChildAt(0);
            int childCount = rootView.getChildCount();
            if (childCount != 2) {
                throw new RuntimeException("布局数量不为2");
            }
            mContentView = rootView.getChildAt(0);
            ViewGroup.LayoutParams mContentLayoutParams = mContentView.getLayoutParams();
            //把内容布局单读提出来
            rootView.removeView(mContentView);
            //在外面套一层阴影
            RelativeLayout contentContainer = new RelativeLayout(mContext);
            contentContainer.addView(mContentView);
            mShadeView = new View(mContext);
            mShadeView.setBackgroundColor(Color.parseColor("#55000000"));
            contentContainer.addView(mShadeView);
            //把容器放回去
            mContentLayoutParams.width = ScreenUtils.getScreenWidth(mContext);

            contentContainer.setLayoutParams(mContentLayoutParams);
            rootView.addView(contentContainer);


//            mContentLayoutParams.width = screenWidth;
            //拿到菜单布局
            mRightMenu = rootView.getChildAt(1);
            ViewGroup.LayoutParams mRightMenuLayoutParams = mRightMenu.getLayoutParams();
            mRightMenuLayoutParams.width = mMenuWidth;
            mRightMenu.setLayoutParams(mRightMenuLayoutParams);
            mShadeView.setAlpha(0.0f);


        } else {
            //拿到根布局
            ViewGroup rootView = (ViewGroup) getChildAt(0);
            int childCount = rootView.getChildCount();
            if (childCount != 2)
                throw new RuntimeException("You can only place two sub view in the root");


            //拿到内容布局
            mContentView = rootView.getChildAt(1);
            //指定内容的宽度
            ViewGroup.LayoutParams mContentLayoutParams = mContentView.getLayoutParams();
            //把内容布局单读提出来
            rootView.removeView(mContentView);
            //在外面套一层阴影
            RelativeLayout contentContainer = new RelativeLayout(mContext);
            contentContainer.addView(mContentView);
            mShadeView = new View(mContext);
            mShadeView.setBackgroundColor(Color.parseColor("#55000000"));
            contentContainer.addView(mShadeView);
            //把容器放回去
            mContentLayoutParams.width = ScreenUtils.getScreenWidth(mContext);

            contentContainer.setLayoutParams(mContentLayoutParams);
            rootView.addView(contentContainer);

            //拿到菜单布局
            mLeftMenu = rootView.getChildAt(0);
            //指定菜单的宽度
            ViewGroup.LayoutParams mLeftMenuLayoutParams = mLeftMenu.getLayoutParams();
            mLeftMenuLayoutParams.width = mMenuWidth;
            mLeftMenu.setLayoutParams(mLeftMenuLayoutParams);

            mShadeView.setAlpha(0.0f);
        }
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        if (isRight) {
            //右侧滑出
            super.onLayout(changed, l, t, r, b);
            scrollTo(screenWidth - mMenuWidth, 0);

        } else {
            super.onLayout(changed, l, t, r, b);
            scrollTo(mMenuWidth, 0);
        }

    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (isRight) {

            mIntercept = false;
            if (mMenuIsOpen) {
                float currentX = ev.getX();
                if (currentX > mMenuWidth) {
                    //关闭菜单
                    closeMenu();
                    //子view不响应任何事件 拦截子view的触摸事件
                    //如果返回true 代表会拦截子view的触摸事件，但是会相应自己的onTouch事件
                    mIntercept = true;
                    return true;
                }
            }
            return super.onInterceptTouchEvent(ev);
        } else {
            mIntercept = false;
            if (mMenuIsOpen) {
                float currentX = ev.getX();
                if (currentX > mMenuWidth) {
                    //关闭菜单
                    closeMenu();
                    //子view不响应任何事件 拦截子view的触摸事件
                    //如果返回true 代表会拦截子view的触摸事件，但是会相应自己的onTouch事件
                    mIntercept = true;
                    return true;
                }
            }
            return super.onInterceptTouchEvent(ev);
        }
    }


    //3 事件的拦截处理
    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        if (isRight) {
            //获取手指滑动速率，获取手指滑动的速率，当期大于一定值就认为是快速滑动 ， GestureDetector（系统提供好的类）
            //当菜单打开的时候，手指触摸右边内容部分需要关闭菜单，还需要拦截事件（打开情况下点击内容页不会响应点击事件）
            //这里保证了手势处理类的调用
            //快速滑动了 下面的拦截事件就不要处理了、
            if (mGestureDetector.onTouchEvent(ev)) {
                return true;
            }
            //如果有拦截，则不执行自己的onTouch方法
            if (mIntercept) {
                return true;
            }
            // 拦截处理事件
            int action = ev.getAction();
            switch (action) {
                case MotionEvent.ACTION_UP:
                    int currentScrollX = getScrollX();
                    //在这里注意currentScrollX的变化，当我们默认关闭菜单的时候去拉动ScrollView，数值在不断的变小
                    if (currentScrollX < mMenuWidth / 2) {
                        //打开菜单
                        openRightMenu();
                    } else {
                        //关闭菜单
                        closeRightMenu();
                    }
                    //确保super.onTouchEvent不会执行 这里看super.onTouchEvent源码中的fling方法
                    //和smoothScrollTo的源码
                    return true;
            }
            return super.onTouchEvent(ev);
        } else {
            //获取手指滑动速率，获取手指滑动的速率，当期大于一定值就认为是快速滑动 ， GestureDetector（系统提供好的类）
            //当菜单打开的时候，手指触摸右边内容部分需要关闭菜单，还需要拦截事件（打开情况下点击内容页不会响应点击事件）
            //这里保证了手势处理类的调用
            //快速滑动了 下面的拦截事件就不要处理了、
            if (mGestureDetector.onTouchEvent(ev)) {
                return true;
            }
            //如果有拦截，则不执行自己的onTouch方法
            if (mIntercept) {
                return true;
            }
            // 拦截处理事件
            int action = ev.getAction();
            switch (action) {
                case MotionEvent.ACTION_UP:
                    int currentScrollX = getScrollX();
                    //在这里注意currentScrollX的变化，当我们默认关闭菜单的时候去拉动ScrollView，数值在不断的变小
                    if (currentScrollX < mMenuWidth/3) {
                        //打开菜单
                        openMenu();
                    } else {
                        //关闭菜单
                        closeMenu();
                    }
                    //确保super.onTouchEvent不会执行 这里看super.onTouchEvent源码中的fling方法
                    //和smoothScrollTo的源码
                    return true;
            }
            return super.onTouchEvent(ev);
        }

    }

    /**
     * 关闭菜单
     */
    private void closeMenu() {
        smoothScrollTo(mMenuWidth, 0);
        mMenuIsOpen = false;
    }

    /**
     * 右侧菜单关闭方法
     */
    private void closeRightMenu() {
        smoothScrollTo(screenWidth - mMenuWidth, 0);
        mMenuIsOpen = false;

    }


    /**
     * 右侧菜单打开方法
     */
    private void openRightMenu() {
        smoothScrollTo(screenWidth, 0);
        mMenuIsOpen = true;

    }


    /**
     * 打开菜单
     */
    private void openMenu() {
        smoothScrollTo(0, 0);
        Log.i("ZHOUTEST", "mMenuWidth:" + mMenuWidth);

        mMenuIsOpen = true;
    }

    /**
     * 点击筛选按钮,打开
     */
    public void onClickListener(){



    }

    //4 处理主页内容的，这就需要不断的获取当前的滑动位置
    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        if (isRight) {
            super.onScrollChanged(l, t, oldl, oldt);
            //l是从mMenuWidth一直变化到0
            //计算梯度值
            float scale = 1f * l / mMenuWidth; //梯度从1逐渐变为0
            //控制阴影 从0变化到1
            float alphaScale = 1 - scale;
            mShadeView.setAlpha(alphaScale);

            ViewCompat.setTranslationX(mRightMenu, 0.6f * l);
        }else {

            super.onScrollChanged(l, t, oldl, oldt);
            //l是从mMenuWidth一直变化到0
            //计算梯度值
            float scale = 1f * l / mMenuWidth; //梯度从1逐渐变为0
            //控制阴影 从0变化到1
            float alphaScale = 1 - scale;
            mShadeView.setAlpha(alphaScale);

            ViewCompat.setTranslationX(mLeftMenu, 0.6f * l);
        }
    }
}


