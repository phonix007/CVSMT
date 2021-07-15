/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  androidx.core.view.ViewCompat
 *  androidx.customview.widget.ViewDragHelper
 *  androidx.customview.widget.ViewDragHelper$Callback
 *  java.lang.Object
 */
package com.onesignal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.onesignal.DraggableRelativeLayout;
import com.onesignal.OSViewUtils;

class DraggableRelativeLayout
extends RelativeLayout {
    private static final int EXTRA_PX_DISMISS;
    private static final int MARGIN_PX_SIZE;
    private boolean dismissing;
    private boolean draggingDisabled;
    private ViewDragHelper mDragHelper;
    private DraggableListener mListener;
    private Params params;

    static {
        MARGIN_PX_SIZE = OSViewUtils.dpToPx(28);
        EXTRA_PX_DISMISS = OSViewUtils.dpToPx(64);
    }

    public DraggableRelativeLayout(Context context) {
        super(context);
        this.setClipChildren(false);
        this.createDragHelper();
    }

    static /* synthetic */ Params access$300(DraggableRelativeLayout draggableRelativeLayout) {
        return draggableRelativeLayout.params;
    }

    static /* synthetic */ DraggableListener access$400(DraggableRelativeLayout draggableRelativeLayout) {
        return draggableRelativeLayout.mListener;
    }

    static /* synthetic */ boolean access$500(DraggableRelativeLayout draggableRelativeLayout) {
        return draggableRelativeLayout.dismissing;
    }

    static /* synthetic */ boolean access$502(DraggableRelativeLayout draggableRelativeLayout, boolean bl) {
        draggableRelativeLayout.dismissing = bl;
        return bl;
    }

    static /* synthetic */ ViewDragHelper access$600(DraggableRelativeLayout draggableRelativeLayout) {
        return draggableRelativeLayout.mDragHelper;
    }

    private void createDragHelper() {
        this.mDragHelper = ViewDragHelper.create((ViewGroup)this, (float)1.0f, (ViewDragHelper.Callback)new ViewDragHelper.Callback(this){
            private int lastYPos;
            final /* synthetic */ DraggableRelativeLayout this$0;
            {
                this.this$0 = draggableRelativeLayout;
            }

            public int clampViewPositionHorizontal(View view, int n, int n2) {
                return DraggableRelativeLayout.access$300((DraggableRelativeLayout)this.this$0).maxXPos;
            }

            public int clampViewPositionVertical(View view, int n, int n2) {
                if (DraggableRelativeLayout.access$300((DraggableRelativeLayout)this.this$0).draggingDisabled) {
                    return DraggableRelativeLayout.access$300((DraggableRelativeLayout)this.this$0).maxYPos;
                }
                this.lastYPos = n;
                if (DraggableRelativeLayout.access$300((DraggableRelativeLayout)this.this$0).dragDirection == 1) {
                    if (n >= DraggableRelativeLayout.access$300((DraggableRelativeLayout)this.this$0).dragThresholdY && DraggableRelativeLayout.access$400(this.this$0) != null) {
                        DraggableRelativeLayout.access$400(this.this$0).onDragStart();
                    }
                    if (n < DraggableRelativeLayout.access$300((DraggableRelativeLayout)this.this$0).maxYPos) {
                        return DraggableRelativeLayout.access$300((DraggableRelativeLayout)this.this$0).maxYPos;
                    }
                } else {
                    if (n <= DraggableRelativeLayout.access$300((DraggableRelativeLayout)this.this$0).dragThresholdY && DraggableRelativeLayout.access$400(this.this$0) != null) {
                        DraggableRelativeLayout.access$400(this.this$0).onDragStart();
                    }
                    if (n > DraggableRelativeLayout.access$300((DraggableRelativeLayout)this.this$0).maxYPos) {
                        return DraggableRelativeLayout.access$300((DraggableRelativeLayout)this.this$0).maxYPos;
                    }
                }
                return n;
            }

            public void onViewReleased(View view, float f, float f2) {
                int n = DraggableRelativeLayout.access$300((DraggableRelativeLayout)this.this$0).maxYPos;
                if (!DraggableRelativeLayout.access$500(this.this$0)) {
                    if (DraggableRelativeLayout.access$300((DraggableRelativeLayout)this.this$0).dragDirection == 1) {
                        if (this.lastYPos > Params.access$200(DraggableRelativeLayout.access$300(this.this$0)) || f2 > (float)Params.access$100(DraggableRelativeLayout.access$300(this.this$0))) {
                            n = Params.access$000(DraggableRelativeLayout.access$300(this.this$0));
                            DraggableRelativeLayout.access$502(this.this$0, true);
                            if (DraggableRelativeLayout.access$400(this.this$0) != null) {
                                DraggableRelativeLayout.access$400(this.this$0).onDismiss();
                            }
                        }
                    } else if (this.lastYPos < Params.access$200(DraggableRelativeLayout.access$300(this.this$0)) || f2 < (float)Params.access$100(DraggableRelativeLayout.access$300(this.this$0))) {
                        n = Params.access$000(DraggableRelativeLayout.access$300(this.this$0));
                        DraggableRelativeLayout.access$502(this.this$0, true);
                        if (DraggableRelativeLayout.access$400(this.this$0) != null) {
                            DraggableRelativeLayout.access$400(this.this$0).onDismiss();
                        }
                    }
                }
                if (DraggableRelativeLayout.access$600(this.this$0).settleCapturedViewAt(DraggableRelativeLayout.access$300((DraggableRelativeLayout)this.this$0).maxXPos, n)) {
                    ViewCompat.postInvalidateOnAnimation((View)this.this$0);
                }
            }

            public boolean tryCaptureView(View view, int n) {
                return true;
            }
        });
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.mDragHelper.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation((View)this);
        }
    }

    public void dismiss() {
        this.dismissing = true;
        this.mDragHelper.smoothSlideViewTo((View)this, this.getLeft(), this.params.offScreenYPos);
        ViewCompat.postInvalidateOnAnimation((View)this);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        DraggableListener draggableListener;
        if (this.dismissing) {
            return true;
        }
        int n = motionEvent.getAction();
        if ((n == 0 || n == 5) && (draggableListener = this.mListener) != null) {
            draggableListener.onDragEnd();
        }
        this.mDragHelper.processTouchEvent(motionEvent);
        return false;
    }

    void setListener(DraggableListener draggableListener) {
        this.mListener = draggableListener;
    }

    void setParams(Params params) {
        this.params = params;
        params.offScreenYPos = params.messageHeight + params.posY + (Resources.getSystem().getDisplayMetrics().heightPixels - params.messageHeight - params.posY) + DraggableRelativeLayout.EXTRA_PX_DISMISS;
        params.dismissingYVelocity = OSViewUtils.dpToPx(3000);
        if (params.dragDirection == 0) {
            params.offScreenYPos = -params.messageHeight - DraggableRelativeLayout.MARGIN_PX_SIZE;
            params.dismissingYVelocity = -params.dismissingYVelocity;
            params.dismissingYPos = params.offScreenYPos / 3;
            return;
        }
        params.dismissingYPos = params.messageHeight / 3 + 2 * params.maxYPos;
    }

    static interface DraggableListener {
        public void onDismiss();

        public void onDragEnd();

        public void onDragStart();
    }

    static class Params {
        static final int DRAGGABLE_DIRECTION_DOWN = 1;
        static final int DRAGGABLE_DIRECTION_UP;
        private int dismissingYPos;
        private int dismissingYVelocity;
        int dragDirection;
        int dragThresholdY;
        boolean draggingDisabled;
        int height;
        int maxXPos;
        int maxYPos;
        int messageHeight;
        private int offScreenYPos;
        int posY;

        Params() {
        }

        static /* synthetic */ int access$200(Params params) {
            return params.dismissingYPos;
        }
    }

}

