/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  android.widget.Toast
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package es.dmoral.toasty;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import es.dmoral.toasty.R;
import es.dmoral.toasty.ToastyUtils;

public class Toasty {
    public static final int LENGTH_LONG = 1;
    public static final int LENGTH_SHORT;
    private static final Typeface LOADED_TOAST_TYPEFACE;
    private static boolean allowQueue;
    private static Typeface currentTypeface;
    private static Toast lastToast;
    private static int textSize;
    private static boolean tintIcon;

    static {
        Typeface typeface;
        LOADED_TOAST_TYPEFACE = typeface = Typeface.create((String)"sans-serif-condensed", (int)0);
        currentTypeface = typeface;
        textSize = 16;
        tintIcon = true;
        allowQueue = true;
        lastToast = null;
    }

    private Toasty() {
    }

    static /* synthetic */ Typeface access$000() {
        return currentTypeface;
    }

    static /* synthetic */ int access$100() {
        return textSize;
    }

    static /* synthetic */ boolean access$200() {
        return tintIcon;
    }

    public static Toast custom(Context context, int n, int n2, int n3, int n4, boolean bl, boolean bl2) {
        return Toasty.custom(context, context.getString(n), ToastyUtils.getDrawable(context, n2), ToastyUtils.getColor(context, n3), ToastyUtils.getColor(context, R.color.defaultTextColor), n4, bl, bl2);
    }

    public static Toast custom(Context context, int n, Drawable drawable2, int n2, int n3, int n4, boolean bl, boolean bl2) {
        return Toasty.custom(context, context.getString(n), drawable2, ToastyUtils.getColor(context, n2), ToastyUtils.getColor(context, n3), n4, bl, bl2);
    }

    public static Toast custom(Context context, int n, Drawable drawable2, int n2, int n3, boolean bl, boolean bl2) {
        return Toasty.custom(context, context.getString(n), drawable2, ToastyUtils.getColor(context, n2), ToastyUtils.getColor(context, R.color.defaultTextColor), n3, bl, bl2);
    }

    public static Toast custom(Context context, int n, Drawable drawable2, int n2, boolean bl) {
        return Toasty.custom(context, context.getString(n), drawable2, -1, ToastyUtils.getColor(context, R.color.defaultTextColor), n2, bl, false);
    }

    public static Toast custom(Context context, CharSequence charSequence, int n, int n2, int n3, boolean bl, boolean bl2) {
        return Toasty.custom(context, charSequence, ToastyUtils.getDrawable(context, n), ToastyUtils.getColor(context, n2), ToastyUtils.getColor(context, R.color.defaultTextColor), n3, bl, bl2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Toast custom(Context context, CharSequence charSequence, Drawable drawable2, int n, int n2, int n3, boolean bl, boolean bl2) {
        Toast toast = Toast.makeText((Context)context, (CharSequence)"", (int)n3);
        View view = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(R.layout.toast_layout, null);
        ImageView imageView = (ImageView)view.findViewById(R.id.toast_icon);
        TextView textView = (TextView)view.findViewById(R.id.toast_text);
        Drawable drawable3 = bl2 ? ToastyUtils.tint9PatchDrawableFrame(context, n) : ToastyUtils.getDrawable(context, R.drawable.toast_frame);
        ToastyUtils.setBackground(view, drawable3);
        if (bl) {
            if (drawable2 == null) throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            if (tintIcon) {
                drawable2 = ToastyUtils.tintIcon(drawable2, n2);
            }
            ToastyUtils.setBackground((View)imageView, drawable2);
        } else {
            imageView.setVisibility(8);
        }
        textView.setText(charSequence);
        textView.setTextColor(n2);
        textView.setTypeface(currentTypeface);
        textView.setTextSize(2, (float)textSize);
        toast.setView(view);
        if (allowQueue) return toast;
        Toast toast2 = lastToast;
        if (toast2 != null) {
            toast2.cancel();
        }
        lastToast = toast;
        return toast;
    }

    public static Toast custom(Context context, CharSequence charSequence, Drawable drawable2, int n, boolean bl) {
        return Toasty.custom(context, charSequence, drawable2, -1, ToastyUtils.getColor(context, R.color.defaultTextColor), n, bl, false);
    }

    public static Toast error(Context context, int n) {
        return Toasty.error(context, context.getString(n), 0, true);
    }

    public static Toast error(Context context, int n, int n2) {
        return Toasty.error(context, context.getString(n), n2, true);
    }

    public static Toast error(Context context, int n, int n2, boolean bl) {
        return Toasty.custom(context, context.getString(n), ToastyUtils.getDrawable(context, R.drawable.ic_clear_white_24dp), ToastyUtils.getColor(context, R.color.errorColor), ToastyUtils.getColor(context, R.color.defaultTextColor), n2, bl, true);
    }

    public static Toast error(Context context, CharSequence charSequence) {
        return Toasty.error(context, charSequence, 0, true);
    }

    public static Toast error(Context context, CharSequence charSequence, int n) {
        return Toasty.error(context, charSequence, n, true);
    }

    public static Toast error(Context context, CharSequence charSequence, int n, boolean bl) {
        return Toasty.custom(context, charSequence, ToastyUtils.getDrawable(context, R.drawable.ic_clear_white_24dp), ToastyUtils.getColor(context, R.color.errorColor), ToastyUtils.getColor(context, R.color.defaultTextColor), n, bl, true);
    }

    public static Toast info(Context context, int n) {
        return Toasty.info(context, context.getString(n), 0, true);
    }

    public static Toast info(Context context, int n, int n2) {
        return Toasty.info(context, context.getString(n), n2, true);
    }

    public static Toast info(Context context, int n, int n2, boolean bl) {
        return Toasty.custom(context, context.getString(n), ToastyUtils.getDrawable(context, R.drawable.ic_info_outline_white_24dp), ToastyUtils.getColor(context, R.color.infoColor), ToastyUtils.getColor(context, R.color.defaultTextColor), n2, bl, true);
    }

    public static Toast info(Context context, CharSequence charSequence) {
        return Toasty.info(context, charSequence, 0, true);
    }

    public static Toast info(Context context, CharSequence charSequence, int n) {
        return Toasty.info(context, charSequence, n, true);
    }

    public static Toast info(Context context, CharSequence charSequence, int n, boolean bl) {
        return Toasty.custom(context, charSequence, ToastyUtils.getDrawable(context, R.drawable.ic_info_outline_white_24dp), ToastyUtils.getColor(context, R.color.infoColor), ToastyUtils.getColor(context, R.color.defaultTextColor), n, bl, true);
    }

    public static Toast normal(Context context, int n) {
        return Toasty.normal(context, context.getString(n), 0, null, false);
    }

    public static Toast normal(Context context, int n, int n2) {
        return Toasty.normal(context, context.getString(n), n2, null, false);
    }

    public static Toast normal(Context context, int n, int n2, Drawable drawable2) {
        return Toasty.normal(context, context.getString(n), n2, drawable2, true);
    }

    public static Toast normal(Context context, int n, int n2, Drawable drawable2, boolean bl) {
        return Toasty.custom(context, context.getString(n), drawable2, ToastyUtils.getColor(context, R.color.normalColor), ToastyUtils.getColor(context, R.color.defaultTextColor), n2, bl, true);
    }

    public static Toast normal(Context context, int n, Drawable drawable2) {
        return Toasty.normal(context, context.getString(n), 0, drawable2, true);
    }

    public static Toast normal(Context context, CharSequence charSequence) {
        return Toasty.normal(context, charSequence, 0, null, false);
    }

    public static Toast normal(Context context, CharSequence charSequence, int n) {
        return Toasty.normal(context, charSequence, n, null, false);
    }

    public static Toast normal(Context context, CharSequence charSequence, int n, Drawable drawable2) {
        return Toasty.normal(context, charSequence, n, drawable2, true);
    }

    public static Toast normal(Context context, CharSequence charSequence, int n, Drawable drawable2, boolean bl) {
        return Toasty.custom(context, charSequence, drawable2, ToastyUtils.getColor(context, R.color.normalColor), ToastyUtils.getColor(context, R.color.defaultTextColor), n, bl, true);
    }

    public static Toast normal(Context context, CharSequence charSequence, Drawable drawable2) {
        return Toasty.normal(context, charSequence, 0, drawable2, true);
    }

    public static Toast success(Context context, int n) {
        return Toasty.success(context, context.getString(n), 0, true);
    }

    public static Toast success(Context context, int n, int n2) {
        return Toasty.success(context, context.getString(n), n2, true);
    }

    public static Toast success(Context context, int n, int n2, boolean bl) {
        return Toasty.custom(context, context.getString(n), ToastyUtils.getDrawable(context, R.drawable.ic_check_white_24dp), ToastyUtils.getColor(context, R.color.successColor), ToastyUtils.getColor(context, R.color.defaultTextColor), n2, bl, true);
    }

    public static Toast success(Context context, CharSequence charSequence) {
        return Toasty.success(context, charSequence, 0, true);
    }

    public static Toast success(Context context, CharSequence charSequence, int n) {
        return Toasty.success(context, charSequence, n, true);
    }

    public static Toast success(Context context, CharSequence charSequence, int n, boolean bl) {
        return Toasty.custom(context, charSequence, ToastyUtils.getDrawable(context, R.drawable.ic_check_white_24dp), ToastyUtils.getColor(context, R.color.successColor), ToastyUtils.getColor(context, R.color.defaultTextColor), n, bl, true);
    }

    public static Toast warning(Context context, int n) {
        return Toasty.warning(context, context.getString(n), 0, true);
    }

    public static Toast warning(Context context, int n, int n2) {
        return Toasty.warning(context, context.getString(n), n2, true);
    }

    public static Toast warning(Context context, int n, int n2, boolean bl) {
        return Toasty.custom(context, context.getString(n), ToastyUtils.getDrawable(context, R.drawable.ic_error_outline_white_24dp), ToastyUtils.getColor(context, R.color.warningColor), ToastyUtils.getColor(context, R.color.defaultTextColor), n2, bl, true);
    }

    public static Toast warning(Context context, CharSequence charSequence) {
        return Toasty.warning(context, charSequence, 0, true);
    }

    public static Toast warning(Context context, CharSequence charSequence, int n) {
        return Toasty.warning(context, charSequence, n, true);
    }

    public static Toast warning(Context context, CharSequence charSequence, int n, boolean bl) {
        return Toasty.custom(context, charSequence, ToastyUtils.getDrawable(context, R.drawable.ic_error_outline_white_24dp), ToastyUtils.getColor(context, R.color.warningColor), ToastyUtils.getColor(context, R.color.defaultTextColor), n, bl, true);
    }

    public static class Config {
        private boolean allowQueue = true;
        private int textSize = Toasty.access$100();
        private boolean tintIcon = Toasty.access$200();
        private Typeface typeface = Toasty.access$000();

        private Config() {
        }

        public static Config getInstance() {
            return new Config();
        }

        public static void reset() {
            currentTypeface = LOADED_TOAST_TYPEFACE;
            textSize = 16;
            tintIcon = true;
            allowQueue = true;
        }

        public Config allowQueue(boolean bl) {
            this.allowQueue = bl;
            return this;
        }

        public void apply() {
            currentTypeface = this.typeface;
            textSize = this.textSize;
            tintIcon = this.tintIcon;
            allowQueue = this.allowQueue;
        }

        public Config setTextSize(int n) {
            this.textSize = n;
            return this;
        }

        public Config setToastTypeface(Typeface typeface) {
            this.typeface = typeface;
            return this;
        }

        public Config tintIcon(boolean bl) {
            this.tintIcon = bl;
            return this;
        }
    }

}

