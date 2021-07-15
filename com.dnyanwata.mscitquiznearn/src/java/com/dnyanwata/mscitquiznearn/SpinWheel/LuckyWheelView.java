/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  java.lang.Object
 *  java.util.List
 */
package com.dnyanwata.mscitquiznearn.SpinWheel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.dnyanwata.mscitquiznearn.R;
import com.dnyanwata.mscitquiznearn.SpinWheel.LuckyWheelUtils;
import com.dnyanwata.mscitquiznearn.SpinWheel.PielView;
import com.dnyanwata.mscitquiznearn.SpinWheel.model.LuckyItem;
import java.util.List;

public class LuckyWheelView
extends RelativeLayout
implements PielView.PieRotateListener {
    private ImageView ivCursorView;
    private int mBackgroundColor;
    private int mBorderColor;
    private Drawable mCenterImage;
    private Drawable mCursorImage;
    private int mEdgeWidth;
    private LuckyRoundItemSelectedListener mLuckyRoundItemSelectedListener;
    private int mSecondaryTextSize;
    private int mTextColor;
    private int mTopTextPadding;
    private int mTopTextSize;
    public PielView pielView;

    public LuckyWheelView(Context context) {
        super(context);
        this.init(context, null);
    }

    public LuckyWheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.LuckyWheelView);
            this.mBackgroundColor = typedArray.getColor(0, -3407872);
            this.mTopTextSize = typedArray.getDimensionPixelSize(8, (int)LuckyWheelUtils.convertDpToPixel(25.0f, this.getContext()));
            this.mSecondaryTextSize = typedArray.getDimensionPixelSize(5, (int)LuckyWheelUtils.convertDpToPixel(10.0f, this.getContext()));
            this.mTextColor = typedArray.getColor(6, 0);
            this.mTopTextPadding = typedArray.getDimensionPixelSize(7, (int)LuckyWheelUtils.convertDpToPixel(22.0f, this.getContext())) + (int)LuckyWheelUtils.convertDpToPixel(15.0f, this.getContext());
            this.mCursorImage = typedArray.getDrawable(2);
            this.mCenterImage = typedArray.getDrawable(1);
            this.mEdgeWidth = typedArray.getInt(4, 10);
            this.mBorderColor = typedArray.getColor(3, 0);
            typedArray.recycle();
        }
        FrameLayout frameLayout = (FrameLayout)LayoutInflater.from((Context)this.getContext()).inflate(2131558461, (ViewGroup)this, false);
        this.pielView = (PielView)frameLayout.findViewById(2131362156);
        this.ivCursorView = (ImageView)frameLayout.findViewById(2131361943);
        this.pielView.setPieRotateListener(this);
        this.pielView.setPieBackgroundColor(this.mBackgroundColor);
        this.pielView.setTopTextPadding(this.mTopTextPadding);
        this.pielView.setTopTextSize(this.mTopTextSize);
        this.pielView.setSecondaryTextSizeSize(this.mSecondaryTextSize);
        this.pielView.setPieCenterImage(this.mCenterImage);
        this.pielView.setBorderColor(this.mBorderColor);
        this.pielView.setBorderWidth(this.mEdgeWidth);
        int n = this.mTextColor;
        if (n != 0) {
            this.pielView.setPieTextColor(n);
        }
        this.ivCursorView.setImageDrawable(this.mCursorImage);
        this.addView((View)frameLayout);
    }

    private boolean isPielView(View view) {
        if (view instanceof ViewGroup) {
            for (int i = 0; i < this.getChildCount(); ++i) {
                if (!this.isPielView(((ViewGroup)view).getChildAt(i))) continue;
                return true;
            }
        }
        return view instanceof PielView;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            if (!this.isPielView(this.getChildAt(i))) continue;
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public void rotateDone(int n) {
        LuckyRoundItemSelectedListener luckyRoundItemSelectedListener = this.mLuckyRoundItemSelectedListener;
        if (luckyRoundItemSelectedListener != null) {
            luckyRoundItemSelectedListener.LuckyRoundItemSelected(n);
        }
    }

    public void setBorderColor(int n) {
        this.pielView.setBorderColor(n);
    }

    public void setData(List<LuckyItem> list) {
        this.pielView.setData(list);
    }

    public void setLuckyRoundItemSelectedListener(LuckyRoundItemSelectedListener luckyRoundItemSelectedListener) {
        this.mLuckyRoundItemSelectedListener = luckyRoundItemSelectedListener;
    }

    public void setLuckyWheelBackgrouldColor(int n) {
        this.pielView.setPieBackgroundColor(n);
    }

    public void setLuckyWheelCenterImage(Drawable drawable2) {
        this.pielView.setPieCenterImage(drawable2);
    }

    public void setLuckyWheelCursorImage(int n) {
        this.ivCursorView.setBackgroundResource(n);
    }

    public void setLuckyWheelTextColor(int n) {
        this.pielView.setPieTextColor(n);
    }

    public void setPredeterminedNumber(int n) {
        this.pielView.setPredeterminedNumber(n);
    }

    public void setRound(int n) {
        this.pielView.setRound(n);
    }

    public void startLuckyWheelWithTargetIndex(int n) {
        this.pielView.rotateTo(n);
    }

    public static interface LuckyRoundItemSelectedListener {
        public void LuckyRoundItemSelected(int var1);
    }

}

