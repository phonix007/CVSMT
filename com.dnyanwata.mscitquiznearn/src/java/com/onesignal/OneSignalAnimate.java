/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ArgbEvaluator
 *  android.animation.TypeEvaluator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.Interpolator
 *  android.view.animation.ScaleAnimation
 *  android.view.animation.TranslateAnimation
 *  java.lang.Integer
 *  java.lang.Object
 */
package com.onesignal;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

class OneSignalAnimate {
    OneSignalAnimate() {
    }

    static Animation animateViewByTranslation(View view, float f, float f2, int n, Interpolator interpolator2, Animation.AnimationListener animationListener) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f, f2);
        translateAnimation.setDuration((long)n);
        translateAnimation.setInterpolator(interpolator2);
        if (animationListener != null) {
            translateAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation((Animation)translateAnimation);
        return translateAnimation;
    }

    static ValueAnimator animateViewColor(final View view, int n, int n2, int n3, Animator.AnimatorListener animatorListener) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration((long)n);
        valueAnimator.setIntValues(new int[]{n2, n3});
        valueAnimator.setEvaluator((TypeEvaluator)new ArgbEvaluator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(){

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setBackgroundColor(((Integer)valueAnimator.getAnimatedValue()).intValue());
            }
        });
        if (animatorListener != null) {
            valueAnimator.addListener(animatorListener);
        }
        return valueAnimator;
    }

    static Animation animateViewSmallToLarge(View view, int n, Interpolator interpolator2, Animation.AnimationListener animationListener) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration((long)n);
        scaleAnimation.setInterpolator(interpolator2);
        if (animationListener != null) {
            scaleAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation((Animation)scaleAnimation);
        return scaleAnimation;
    }

}

