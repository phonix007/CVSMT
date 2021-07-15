package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

@zzark
public final class zzavg extends zzavc {
    @Nullable
    private RewardedVideoAdListener zzhy;

    public zzavg(@Nullable RewardedVideoAdListener rewardedVideoAdListener) {
        this.zzhy = rewardedVideoAdListener;
    }

    public final void onRewardedVideoAdLoaded() {
        if (this.zzhy != null) {
            this.zzhy.onRewardedVideoAdLoaded();
        }
    }

    public final void onRewardedVideoAdOpened() {
        if (this.zzhy != null) {
            this.zzhy.onRewardedVideoAdOpened();
        }
    }

    public final void onRewardedVideoStarted() {
        if (this.zzhy != null) {
            this.zzhy.onRewardedVideoStarted();
        }
    }

    public final void onRewardedVideoAdClosed() {
        if (this.zzhy != null) {
            this.zzhy.onRewardedVideoAdClosed();
        }
    }

    public final void zza(zzaur zzaur) {
        if (this.zzhy != null) {
            this.zzhy.onRewarded(new zzave(zzaur));
        }
    }

    public final void onRewardedVideoAdLeftApplication() {
        if (this.zzhy != null) {
            this.zzhy.onRewardedVideoAdLeftApplication();
        }
    }

    public final void onRewardedVideoAdFailedToLoad(int i) {
        if (this.zzhy != null) {
            this.zzhy.onRewardedVideoAdFailedToLoad(i);
        }
    }

    public final void onRewardedVideoCompleted() {
        if (this.zzhy != null) {
            this.zzhy.onRewardedVideoCompleted();
        }
    }

    @Nullable
    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        return this.zzhy;
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.zzhy = rewardedVideoAdListener;
    }
}
