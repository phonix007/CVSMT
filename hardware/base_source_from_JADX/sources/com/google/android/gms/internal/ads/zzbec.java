package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@zzark
@TargetApi(14)
public final class zzbec implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager mAudioManager;
    private boolean zzeri;
    private final zzbed zzeui;
    private boolean zzeuj;
    private boolean zzeuk;
    private float zzeul = 1.0f;

    public zzbec(Context context, zzbed zzbed) {
        this.mAudioManager = (AudioManager) context.getSystemService("audio");
        this.zzeui = zzbed;
    }

    public final void setMuted(boolean z) {
        this.zzeuk = z;
        zzacg();
    }

    public final void setVolume(float f) {
        this.zzeul = f;
        zzacg();
    }

    public final float getVolume() {
        float f = this.zzeuk ? 0.0f : this.zzeul;
        if (this.zzeuj) {
            return f;
        }
        return 0.0f;
    }

    public final void zzacd() {
        this.zzeri = true;
        zzacg();
    }

    public final void zzace() {
        this.zzeri = false;
        zzacg();
    }

    public final void onAudioFocusChange(int i) {
        this.zzeuj = i > 0;
        this.zzeui.zzabd();
    }

    private final void zzacg() {
        boolean z = false;
        boolean z2 = this.zzeri && !this.zzeuk && this.zzeul > 0.0f;
        if (z2 && !this.zzeuj) {
            if (this.mAudioManager != null && !this.zzeuj) {
                if (this.mAudioManager.requestAudioFocus(this, 3, 2) == 1) {
                    z = true;
                }
                this.zzeuj = z;
            }
            this.zzeui.zzabd();
        } else if (!z2 && this.zzeuj) {
            if (this.mAudioManager != null && this.zzeuj) {
                if (this.mAudioManager.abandonAudioFocus(this) == 0) {
                    z = true;
                }
                this.zzeuj = z;
            }
            this.zzeui.zzabd();
        }
    }
}
