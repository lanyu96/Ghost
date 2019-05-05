package mvp.com.zhou.mvp.utils.util;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.widget.LinearLayout;

/**
 * Created by fei on 2018/6/6.
 */
public class LayoutAnimator {
    public static void setLayoutTransition(LinearLayout linearLayout, LayoutTransition.TransitionListener listener){
        LayoutTransition mLayoutTransition = new LayoutTransition();
        mLayoutTransition.setAnimator(LayoutTransition.APPEARING, getAppearingAnimation());
        mLayoutTransition.setDuration(LayoutTransition.APPEARING, 200);
        mLayoutTransition.setStartDelay(LayoutTransition.APPEARING, 0);//源码中带有默认300毫秒的延时，需要移除，不然view添加效果不好！！

        mLayoutTransition.setAnimator(LayoutTransition.DISAPPEARING, getDisappearingAnimation());
        mLayoutTransition.setDuration(LayoutTransition.DISAPPEARING, 200);

        mLayoutTransition.setAnimator(LayoutTransition.CHANGE_APPEARING,getAppearingChangeAnimation());
        mLayoutTransition.setDuration(200);

        mLayoutTransition.setAnimator(LayoutTransition.CHANGE_DISAPPEARING,getDisappearingChangeAnimation());
        mLayoutTransition.setDuration(200);

        mLayoutTransition.enableTransitionType(LayoutTransition.CHANGE_DISAPPEARING);
        mLayoutTransition.setStartDelay(LayoutTransition.CHANGE_DISAPPEARING, 0);//源码中带有默认300毫秒的延时，需要移除，不然view添加效果不好！！
        mLayoutTransition.addTransitionListener(listener);
        linearLayout.setLayoutTransition(mLayoutTransition);
    }
    private static Animator getAppearingAnimation() {
        AnimatorSet mSet = new AnimatorSet();
        mSet.playTogether(ObjectAnimator.ofFloat(null, "ScaleX", 2.0f, 1.0f),
                ObjectAnimator.ofFloat(null, "ScaleY", 2.0f, 1.0f),
                ObjectAnimator.ofFloat(null, "Alpha", 0.0f, 1.0f),
                ObjectAnimator.ofFloat(null,"translationX",1000,0));
        return mSet;
    }

    private static Animator getDisappearingAnimation() {
        AnimatorSet mSet = new AnimatorSet();
        mSet.playTogether(ObjectAnimator.ofFloat(null, "ScaleX", 1.0f, 0f),
                ObjectAnimator.ofFloat(null, "ScaleY", 1.0f, 0f),
                ObjectAnimator.ofFloat(null, "Alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(null,"translationX",0,1000));
        return mSet;
    }

    private static Animator getDisappearingChangeAnimation(){
        PropertyValuesHolder pvhLeft = PropertyValuesHolder.ofInt("left", 0, 0);
        PropertyValuesHolder pvhTop = PropertyValuesHolder.ofInt("top", 0, 0);
        PropertyValuesHolder pvhRight = PropertyValuesHolder.ofInt("right", 0, 0);
        PropertyValuesHolder pvhBottom = PropertyValuesHolder.ofInt("bottom", 0, 0);
        PropertyValuesHolder scaleX = PropertyValuesHolder.ofFloat("scaleX",1.0f,0f,1.0f);
        PropertyValuesHolder scaleY = PropertyValuesHolder.ofFloat("scaleY",1.0f,0f,1.0f);
        PropertyValuesHolder rotate = PropertyValuesHolder.ofFloat("rotation",0,0,0);
        return ObjectAnimator.ofPropertyValuesHolder((Object)null,pvhLeft, pvhTop, pvhRight, pvhBottom,scaleX,scaleY,rotate);
    }

    private static Animator getAppearingChangeAnimation(){
        PropertyValuesHolder pvhLeft = PropertyValuesHolder.ofInt("left", 0, 0);
        PropertyValuesHolder pvhTop = PropertyValuesHolder.ofInt("top", 0, 0);
        PropertyValuesHolder pvhRight = PropertyValuesHolder.ofInt("right", 0, 0);
        PropertyValuesHolder pvhBottom = PropertyValuesHolder.ofInt("bottom", 0, 0);
        PropertyValuesHolder scaleX = PropertyValuesHolder.ofFloat("scaleX",1.0f,3f,1.0f);
        PropertyValuesHolder scaleY = PropertyValuesHolder.ofFloat("scaleY",1.0f,3f,1.0f);
        return ObjectAnimator.ofPropertyValuesHolder((Object)null,pvhLeft, pvhTop, pvhRight, pvhBottom,scaleX,scaleY);
    }
}
