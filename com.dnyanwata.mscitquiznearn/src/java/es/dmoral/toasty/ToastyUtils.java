/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.NinePatchDrawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  androidx.appcompat.content.res.AppCompatResources
 *  androidx.core.content.ContextCompat
 *  java.lang.Object
 */
package es.dmoral.toasty;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import es.dmoral.toasty.R;

final class ToastyUtils {
    private ToastyUtils() {
    }

    static int getColor(Context context, int n) {
        return ContextCompat.getColor((Context)context, (int)n);
    }

    static Drawable getDrawable(Context context, int n) {
        return AppCompatResources.getDrawable((Context)context, (int)n);
    }

    static void setBackground(View view, Drawable drawable2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable2);
            return;
        }
        view.setBackgroundDrawable(drawable2);
    }

    static Drawable tint9PatchDrawableFrame(Context context, int n) {
        return ToastyUtils.tintIcon((Drawable)((NinePatchDrawable)ToastyUtils.getDrawable(context, R.drawable.toast_frame)), n);
    }

    static Drawable tintIcon(Drawable drawable2, int n) {
        drawable2.setColorFilter(n, PorterDuff.Mode.SRC_IN);
        return drawable2;
    }
}

