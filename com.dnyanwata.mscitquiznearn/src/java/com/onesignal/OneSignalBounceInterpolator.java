/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 *  java.lang.Math
 *  java.lang.Object
 */
package com.onesignal;

import android.view.animation.Interpolator;

class OneSignalBounceInterpolator
implements Interpolator {
    private double mAmplitude = 1.0;
    private double mFrequency = 10.0;

    OneSignalBounceInterpolator(double d, double d2) {
        this.mAmplitude = d;
        this.mFrequency = d2;
    }

    public float getInterpolation(float f) {
        return (float)(1.0 + -1.0 * Math.pow((double)2.718281828459045, (double)((double)(-f) / this.mAmplitude)) * Math.cos((double)(this.mFrequency * (double)f)));
    }
}

