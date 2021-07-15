package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;

@zzark
public final class zzave implements RewardItem {
    private final zzaur zzeel;

    public zzave(zzaur zzaur) {
        this.zzeel = zzaur;
    }

    public final String getType() {
        if (this.zzeel == null) {
            return null;
        }
        try {
            return this.zzeel.getType();
        } catch (RemoteException e) {
            zzbbd.zzc("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    public final int getAmount() {
        if (this.zzeel == null) {
            return 0;
        }
        try {
            return this.zzeel.getAmount();
        } catch (RemoteException e) {
            zzbbd.zzc("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
