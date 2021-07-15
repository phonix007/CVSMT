/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Align
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.LinearInterpolator
 *  androidx.core.graphics.ColorUtils
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.annotation.Annotation
 *  java.util.List
 *  java.util.Random
 */
package com.dnyanwata.mscitquiznearn.SpinWheel;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.ColorUtils;
import com.dnyanwata.mscitquiznearn.SpinWheel.LuckyWheelUtils;
import com.dnyanwata.mscitquiznearn.SpinWheel.model.LuckyItem;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Random;

public class PielView
extends View {
    private int borderColor = 0;
    private int defaultBackgroundColor = 0;
    long downPressTime;
    private Drawable drawableCenterImage;
    double fingerRotation;
    private boolean isRunning = false;
    private Paint mArcPaint;
    private Paint mBackgroundPaint;
    private int mCenter;
    private int mEdgeWidth = -1;
    private List<LuckyItem> mLuckyItemList;
    private int mPadding;
    private PieRotateListener mPieRotateListener;
    private int mRadius;
    private RectF mRange = new RectF();
    private int mRoundOfNumber = 4;
    private int mSecondaryTextSize;
    private float mStartAngle = 0.0f;
    private TextPaint mTextPaint;
    private int mTopTextPadding;
    private int mTopTextSize;
    double[] newRotationStore = new double[3];
    private int predeterminedNumber = -1;
    private int textColor = 0;
    long upPressTime;
    float viewRotation;

    public PielView(Context context) {
        super(context);
    }

    public PielView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void drawBackgroundColor(Canvas canvas, int n) {
        Paint paint;
        if (n == 0) {
            return;
        }
        this.mBackgroundPaint = paint = new Paint();
        paint.setColor(n);
        int n2 = this.mCenter;
        canvas.drawCircle((float)n2, (float)n2, (float)(n2 - 5), this.mBackgroundPaint);
    }

    private void drawCenterImage(Canvas canvas, Drawable drawable2) {
        Bitmap bitmap = Bitmap.createScaledBitmap((Bitmap)LuckyWheelUtils.drawableToBitmap(drawable2), (int)drawable2.getIntrinsicWidth(), (int)drawable2.getIntrinsicHeight(), (boolean)false);
        canvas.drawBitmap(bitmap, (float)(this.getMeasuredWidth() / 2 - bitmap.getWidth() / 2), (float)(this.getMeasuredHeight() / 2 - bitmap.getHeight() / 2), null);
    }

    private void drawImage(Canvas canvas, float f, Bitmap bitmap) {
        int n = this.mRadius / this.mLuckyItemList.size();
        float f2 = (float)(3.141592653589793 * (double)(f + 360.0f / (float)this.mLuckyItemList.size() / 2.0f) / 180.0);
        double d = this.mCenter;
        double d2 = this.mRadius / 2 / 2;
        double d3 = f2;
        int n2 = (int)(d + d2 * Math.cos((double)d3));
        int n3 = (int)((double)this.mCenter + (double)(this.mRadius / 2 / 2) * Math.sin((double)d3));
        int n4 = n / 2;
        canvas.drawBitmap(bitmap, null, new Rect(n2 - n4, n3 - n4, n2 + n4, n3 + n4), null);
    }

    private void drawPieBackgroundWithBitmap(Canvas canvas, Bitmap bitmap) {
        int n = this.mPadding;
        canvas.drawBitmap(bitmap, null, new Rect(n / 2, n / 2, this.getMeasuredWidth() - this.mPadding / 2, this.getMeasuredHeight() - this.mPadding / 2), null);
    }

    private void drawSecondText(Canvas canvas, float f, float f2, String string2, int n) {
        Path path = new Path();
        path.addArc(this.mRange, f, f2);
        if (n != 0) {
            this.mTextPaint.setColor(n);
        } else {
            this.mTextPaint.setColor(this.getResources().getColor(17170443));
        }
        this.mTextPaint.setTextAlign(Paint.Align.LEFT);
        this.mTextPaint.setTextSize((float)this.mSecondaryTextSize);
        this.mTextPaint.setFakeBoldText(false);
        if (Build.VERSION.SDK_INT >= 21) {
            this.mTextPaint.setLetterSpacing(0.2f);
        } else {
            this.mTextPaint.setTextScaleX(0.2f);
        }
        float f3 = this.mTextPaint.measureText(string2);
        int n2 = (int)(3.141592653589793 * (double)this.mRadius / (double)this.mLuckyItemList.size() / 2.0 - (double)(f3 / 2.0f));
        int n3 = 35 + this.mTopTextPadding;
        canvas.drawTextOnPath(string2, path, (float)n2, (float)n3, (Paint)this.mTextPaint);
    }

    private void drawSecondaryText(Canvas canvas, float f, String string2, int n) {
        canvas.save();
        int n2 = this.mLuckyItemList.size();
        if (this.textColor == 0) {
            TextPaint textPaint = this.mTextPaint;
            int n3 = this.isColorDark(n) ? -1 : -16777216;
            textPaint.setColor(n3);
        }
        Typeface typeface = Typeface.create((Typeface)Typeface.SANS_SERIF, (int)1);
        this.mTextPaint.setTypeface(typeface);
        this.mTextPaint.setTextSize((float)this.mSecondaryTextSize);
        this.mTextPaint.setTextAlign(Paint.Align.LEFT);
        float f2 = this.mTextPaint.measureText(string2);
        float f3 = n2;
        float f4 = f + 360.0f / f3 / 2.0f;
        float f5 = (float)(3.141592653589793 * (double)f4 / 180.0);
        double d = this.mCenter;
        double d2 = this.mRadius / 2 / 2;
        double d3 = f5;
        int n4 = (int)(d + d2 * Math.cos((double)d3));
        int n5 = (int)((double)this.mCenter + (double)(this.mRadius / 2 / 2) * Math.sin((double)d3));
        float f6 = n4;
        float f7 = f6 + f2;
        float f8 = n5;
        RectF rectF = new RectF(f7, f8, f6 - f2, f8);
        Path path = new Path();
        path.addRect(rectF, Path.Direction.CW);
        path.close();
        canvas.rotate(f4 + f3 / 18.0f, f6, f8);
        canvas.drawTextOnPath(string2, path, (float)this.mTopTextPadding / 7.0f, this.mTextPaint.getTextSize() / 2.75f, (Paint)this.mTextPaint);
        canvas.restore();
    }

    private void drawTopText(Canvas canvas, float f, float f2, String string2, int n) {
        Path path = new Path();
        path.addArc(this.mRange, f, f2);
        if (n != 0) {
            this.mTextPaint.setColor(n);
        } else {
            this.mTextPaint.setColor(this.getResources().getColor(17170443));
        }
        this.mTextPaint.setTextAlign(Paint.Align.LEFT);
        this.mTextPaint.setTextSize((float)this.mTopTextSize);
        this.mTextPaint.setFakeBoldText(true);
        float f3 = this.mTextPaint.measureText(string2);
        int n2 = (int)(3.141592653589793 * (double)this.mRadius / (double)this.mLuckyItemList.size() / 2.0 - (double)(f3 / 2.0f));
        int n3 = this.mTopTextPadding;
        canvas.drawTextOnPath(string2, path, (float)n2, (float)n3, (Paint)this.mTextPaint);
    }

    private float getAngleOfIndexTarget(int n) {
        return 360.0f / (float)this.mLuckyItemList.size() * (float)n;
    }

    private int getFallBackRandomIndex() {
        return 0 + new Random().nextInt(-1 + this.mLuckyItemList.size());
    }

    private void init() {
        Paint paint;
        TextPaint textPaint;
        this.mArcPaint = paint = new Paint();
        paint.setAntiAlias(true);
        this.mArcPaint.setDither(true);
        this.mTextPaint = textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        int n = this.textColor;
        if (n != 0) {
            this.mTextPaint.setColor(n);
        }
        this.mTextPaint.setTextSize(TypedValue.applyDimension((int)2, (float)14.0f, (DisplayMetrics)this.getResources().getDisplayMetrics()));
        int n2 = this.mPadding;
        float f = n2;
        float f2 = n2;
        int n3 = this.mRadius;
        this.mRange = new RectF(f, f2, (float)(n2 + n3), (float)(n2 + n3));
    }

    private boolean isColorDark(int n) {
        return ColorUtils.calculateLuminance((int)n) <= 0.3;
    }

    private boolean isRotationConsistent(double d) {
        double[] arrd;
        double[] arrd2;
        double[] arrd3;
        double[] arrd4;
        double[] arrd5 = this.newRotationStore;
        if (Double.compare((double)arrd5[2], (double)arrd5[1]) != 0) {
            double[] arrd6 = this.newRotationStore;
            arrd6[2] = arrd6[1];
        }
        if (Double.compare((double)(arrd2 = this.newRotationStore)[1], (double)arrd2[0]) != 0) {
            double[] arrd7 = this.newRotationStore;
            arrd7[1] = arrd7[0];
        }
        double[] arrd8 = this.newRotationStore;
        arrd8[0] = d;
        if (!(Double.compare((double)arrd8[2], (double)arrd8[0]) == 0 || Double.compare((double)(arrd4 = this.newRotationStore)[1], (double)arrd4[0]) == 0 || Double.compare((double)(arrd3 = this.newRotationStore)[2], (double)arrd3[1]) == 0 || (arrd = this.newRotationStore)[0] > arrd[1] && arrd[1] < arrd[2])) {
            return !(arrd[0] < arrd[1]) || !(arrd[1] > arrd[2]);
        }
        return false;
    }

    private float newRotationValue(float f, double d, double d2) {
        return (360.0f + (f + (float)(d2 - d))) % 360.0f;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mLuckyItemList == null) {
            return;
        }
        this.drawBackgroundColor(canvas, this.defaultBackgroundColor);
        this.init();
        float f = this.mStartAngle;
        float f2 = 360.0f / (float)this.mLuckyItemList.size();
        for (int i = 0; i < this.mLuckyItemList.size(); ++i) {
            if (((LuckyItem)this.mLuckyItemList.get((int)i)).color != 0) {
                this.mArcPaint.setStyle(Paint.Style.FILL);
                this.mArcPaint.setColor(((LuckyItem)this.mLuckyItemList.get((int)i)).color);
                RectF rectF = this.mRange;
                Paint paint = this.mArcPaint;
                canvas.drawArc(rectF, f, f2, true, paint);
            }
            if (this.borderColor != 0 && this.mEdgeWidth > 0) {
                this.mArcPaint.setStyle(Paint.Style.STROKE);
                this.mArcPaint.setColor(this.borderColor);
                this.mArcPaint.setStrokeWidth((float)this.mEdgeWidth);
                RectF rectF = this.mRange;
                Paint paint = this.mArcPaint;
                canvas.drawArc(rectF, f, f2, true, paint);
            }
            int n = ((LuckyItem)this.mLuckyItemList.get((int)i)).textColor != 0 ? ((LuckyItem)this.mLuckyItemList.get((int)i)).textColor : this.defaultBackgroundColor;
            int n2 = n;
            if (!TextUtils.isEmpty((CharSequence)((LuckyItem)this.mLuckyItemList.get((int)i)).topText)) {
                String string2 = ((LuckyItem)this.mLuckyItemList.get((int)i)).topText;
                this.drawTopText(canvas, f, f2, string2, n2);
            }
            if (!TextUtils.isEmpty((CharSequence)((LuckyItem)this.mLuckyItemList.get((int)i)).secondaryText)) {
                String string3 = ((LuckyItem)this.mLuckyItemList.get((int)i)).secondaryText;
                this.drawSecondText(canvas, f, f2, string3, n2);
            }
            if (((LuckyItem)this.mLuckyItemList.get((int)i)).icon != 0) {
                this.drawImage(canvas, f, BitmapFactory.decodeResource((Resources)this.getResources(), (int)((LuckyItem)this.mLuckyItemList.get((int)i)).icon));
            }
            f += f2;
        }
        this.drawCenterImage(canvas, this.drawableCenterImage);
    }

    protected void onMeasure(int n, int n2) {
        super.onMeasure(n, n2);
        int n3 = Math.min((int)this.getMeasuredWidth(), (int)this.getMeasuredHeight());
        int n4 = this.getPaddingLeft() == 0 ? 10 : this.getPaddingLeft();
        this.mPadding = n4;
        this.mRadius = n3 - n4 * 2;
        this.mCenter = n3 / 2;
        this.setMeasuredDimension(n3, n3);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.isRunning) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void rotateTo(int n) {
        this.rotateTo(n, 3 * new Random().nextInt() % 2, true);
    }

    public void rotateTo(final int n, final int n2, boolean bl) {
        if (this.isRunning) {
            return;
        }
        int n3 = n2 <= 0 ? 1 : -1;
        float f = this.getRotation();
        float f2 = 2.0f;
        if (f != 0.0f) {
            this.setRotation(this.getRotation() % 360.0f);
            Object object = bl ? new AccelerateInterpolator() : new LinearInterpolator();
            if (!(this.getRotation() > 200.0f)) {
                f2 = 1.0f;
            }
            this.animate().setInterpolator((TimeInterpolator)object).setDuration(500L).setListener(new Animator.AnimatorListener(){

                public void onAnimationCancel(Animator animator2) {
                }

                public void onAnimationEnd(Animator animator2) {
                    PielView.this.isRunning = false;
                    PielView.this.setRotation(0.0f);
                    PielView.this.rotateTo(n, n2, false);
                }

                public void onAnimationRepeat(Animator animator2) {
                }

                public void onAnimationStart(Animator animator2) {
                    PielView.this.isRunning = true;
                }
            }).rotation(f2 * 360.0f * (float)n3).start();
            return;
        }
        if (n3 < 0) {
            this.mRoundOfNumber = 1 + this.mRoundOfNumber;
        }
        float f3 = 270.0f + 360.0f * (float)this.mRoundOfNumber * (float)n3 - this.getAngleOfIndexTarget(n) - 360.0f / (float)this.mLuckyItemList.size() / f2;
        this.animate().setInterpolator((TimeInterpolator)new DecelerateInterpolator()).setDuration(900L + (long)(1000 * this.mRoundOfNumber)).setListener(new Animator.AnimatorListener(){

            public void onAnimationCancel(Animator animator2) {
            }

            public void onAnimationEnd(Animator animator2) {
                PielView.this.isRunning = false;
                PielView pielView = PielView.this;
                pielView.setRotation(pielView.getRotation() % 360.0f);
                if (PielView.this.mPieRotateListener != null) {
                    PielView.this.mPieRotateListener.rotateDone(n);
                }
            }

            public void onAnimationRepeat(Animator animator2) {
            }

            public void onAnimationStart(Animator animator2) {
                PielView.this.isRunning = true;
            }
        }).rotation(f3).start();
    }

    public void setBorderColor(int n) {
        this.borderColor = n;
        this.invalidate();
    }

    public void setBorderWidth(int n) {
        this.mEdgeWidth = n;
        this.invalidate();
    }

    public void setData(List<LuckyItem> list) {
        this.mLuckyItemList = list;
        this.invalidate();
    }

    public void setPieBackgroundColor(int n) {
        this.defaultBackgroundColor = n;
        this.invalidate();
    }

    public void setPieCenterImage(Drawable drawable2) {
        this.drawableCenterImage = drawable2;
        this.invalidate();
    }

    public void setPieRotateListener(PieRotateListener pieRotateListener) {
        this.mPieRotateListener = pieRotateListener;
    }

    public void setPieTextColor(int n) {
        this.textColor = n;
        this.invalidate();
    }

    public void setPredeterminedNumber(int n) {
        this.predeterminedNumber = n;
    }

    public void setRound(int n) {
        this.mRoundOfNumber = n;
    }

    public void setSecondaryTextSizeSize(int n) {
        this.mSecondaryTextSize = n;
        this.invalidate();
    }

    public void setTopTextPadding(int n) {
        this.mTopTextPadding = n;
        this.invalidate();
    }

    public void setTopTextSize(int n) {
        this.mTopTextSize = n;
        this.invalidate();
    }

    public static interface PieRotateListener {
        public void rotateDone(int var1);
    }

    static @interface SpinRotation {
        public static final int CLOCKWISE = 0;
        public static final int COUNTERCLOCKWISE = 1;
    }

}

