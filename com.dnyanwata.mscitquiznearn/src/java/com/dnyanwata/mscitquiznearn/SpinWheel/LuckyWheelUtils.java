/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  java.lang.Object
 */
package com.dnyanwata.mscitquiznearn.SpinWheel;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class LuckyWheelUtils {
    public static float convertDpToPixel(float f, Context context) {
        return TypedValue.applyDimension((int)1, (float)f, (DisplayMetrics)context.getResources().getDisplayMetrics());
    }

    public static Bitmap drawableToBitmap(Drawable drawable2) {
        BitmapDrawable bitmapDrawable;
        if (drawable2 instanceof BitmapDrawable && (bitmapDrawable = (BitmapDrawable)drawable2).getBitmap() != null) {
            return bitmapDrawable.getBitmap();
        }
        Bitmap bitmap = drawable2.getIntrinsicWidth() > 0 && drawable2.getIntrinsicHeight() > 0 ? Bitmap.createBitmap((int)drawable2.getIntrinsicWidth(), (int)drawable2.getIntrinsicHeight(), (Bitmap.Config)Bitmap.Config.ARGB_8888) : Bitmap.createBitmap((int)1, (int)1, (Bitmap.Config)Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable2.draw(canvas);
        return bitmap;
    }
}

