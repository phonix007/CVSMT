/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  androidx.core.app.NotificationCompat
 *  androidx.core.app.NotificationCompat$Extender
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.SecureRandom
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.onesignal.OSNotification;
import com.onesignal.OneSignal;
import java.security.SecureRandom;
import org.json.JSONObject;

public class OSNotificationGenerationJob {
    private Context context;
    private boolean iamPreview;
    private JSONObject jsonPayload;
    private OSNotification notification;
    private Integer orgFlags;
    private Uri orgSound;
    private CharSequence overriddenBodyFromExtender;
    private Integer overriddenFlags;
    private Uri overriddenSound;
    private CharSequence overriddenTitleFromExtender;
    private boolean restoring;
    private Long shownTimeStamp;

    OSNotificationGenerationJob(Context context) {
        this.context = context;
    }

    OSNotificationGenerationJob(Context context, OSNotification oSNotification, JSONObject jSONObject) {
        this.context = context;
        this.jsonPayload = jSONObject;
        this.notification = oSNotification;
    }

    OSNotificationGenerationJob(Context context, JSONObject jSONObject) {
        this(context, new OSNotification(jSONObject), jSONObject);
    }

    JSONObject getAdditionalData() {
        if (this.notification.getAdditionalData() != null) {
            return this.notification.getAdditionalData();
        }
        return new JSONObject();
    }

    Integer getAndroidId() {
        if (!this.notification.hasNotificationId()) {
            this.notification.setAndroidNotificationId(new SecureRandom().nextInt());
        }
        return this.notification.getAndroidNotificationId();
    }

    int getAndroidIdWithoutCreate() {
        if (!this.notification.hasNotificationId()) {
            return -1;
        }
        return this.notification.getAndroidNotificationId();
    }

    String getApiNotificationId() {
        return OneSignal.getNotificationIdFromFCMJson(this.jsonPayload);
    }

    CharSequence getBody() {
        CharSequence charSequence = this.overriddenBodyFromExtender;
        if (charSequence != null) {
            return charSequence;
        }
        return this.notification.getBody();
    }

    public Context getContext() {
        return this.context;
    }

    public JSONObject getJsonPayload() {
        return this.jsonPayload;
    }

    public OSNotification getNotification() {
        return this.notification;
    }

    public Integer getOrgFlags() {
        return this.orgFlags;
    }

    public Uri getOrgSound() {
        return this.orgSound;
    }

    public CharSequence getOverriddenBodyFromExtender() {
        return this.overriddenBodyFromExtender;
    }

    public Integer getOverriddenFlags() {
        return this.overriddenFlags;
    }

    public Uri getOverriddenSound() {
        return this.overriddenSound;
    }

    public CharSequence getOverriddenTitleFromExtender() {
        return this.overriddenTitleFromExtender;
    }

    public Long getShownTimeStamp() {
        return this.shownTimeStamp;
    }

    CharSequence getTitle() {
        CharSequence charSequence = this.overriddenTitleFromExtender;
        if (charSequence != null) {
            return charSequence;
        }
        return this.notification.getTitle();
    }

    boolean hasExtender() {
        return this.notification.getNotificationExtender() != null;
    }

    public boolean isIamPreview() {
        return this.iamPreview;
    }

    boolean isNotificationToDisplay() {
        return this.getAndroidIdWithoutCreate() != -1;
    }

    public boolean isRestoring() {
        return this.restoring;
    }

    void setAndroidIdWithoutOverriding(Integer n) {
        if (n == null) {
            return;
        }
        if (this.notification.hasNotificationId()) {
            return;
        }
        this.notification.setAndroidNotificationId(n);
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setIamPreview(boolean bl) {
        this.iamPreview = bl;
    }

    public void setJsonPayload(JSONObject jSONObject) {
        this.jsonPayload = jSONObject;
    }

    public void setNotification(OSNotification oSNotification) {
        this.notification = oSNotification;
    }

    public void setOrgFlags(Integer n) {
        this.orgFlags = n;
    }

    public void setOrgSound(Uri uri) {
        this.orgSound = uri;
    }

    public void setOverriddenBodyFromExtender(CharSequence charSequence) {
        this.overriddenBodyFromExtender = charSequence;
    }

    public void setOverriddenFlags(Integer n) {
        this.overriddenFlags = n;
    }

    public void setOverriddenSound(Uri uri) {
        this.overriddenSound = uri;
    }

    public void setOverriddenTitleFromExtender(CharSequence charSequence) {
        this.overriddenTitleFromExtender = charSequence;
    }

    public void setRestoring(boolean bl) {
        this.restoring = bl;
    }

    public void setShownTimeStamp(Long l) {
        this.shownTimeStamp = l;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSNotificationGenerationJob{jsonPayload=");
        stringBuilder.append((Object)this.jsonPayload);
        stringBuilder.append(", isRestoring=");
        stringBuilder.append(this.restoring);
        stringBuilder.append(", isIamPreview=");
        stringBuilder.append(this.iamPreview);
        stringBuilder.append(", shownTimeStamp=");
        stringBuilder.append((Object)this.shownTimeStamp);
        stringBuilder.append(", overriddenBodyFromExtender=");
        stringBuilder.append((Object)this.overriddenBodyFromExtender);
        stringBuilder.append(", overriddenTitleFromExtender=");
        stringBuilder.append((Object)this.overriddenTitleFromExtender);
        stringBuilder.append(", overriddenSound=");
        stringBuilder.append((Object)this.overriddenSound);
        stringBuilder.append(", overriddenFlags=");
        stringBuilder.append((Object)this.overriddenFlags);
        stringBuilder.append(", orgFlags=");
        stringBuilder.append((Object)this.orgFlags);
        stringBuilder.append(", orgSound=");
        stringBuilder.append((Object)this.orgSound);
        stringBuilder.append(", notification=");
        stringBuilder.append((Object)this.notification);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

