/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.core.app.NotificationCompat
 *  androidx.core.app.NotificationCompat$Extender
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.core.app.NotificationCompat;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.OSMutableNotification;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OSNotification {
    private List<ActionButton> actionButtons;
    private JSONObject additionalData;
    private int androidNotificationId;
    private BackgroundImageLayout backgroundImageLayout;
    private String bigPicture;
    private String body;
    private String collapseId;
    private String fromProjectNumber;
    private String groupKey;
    private String groupMessage;
    private List<OSNotification> groupedNotifications;
    private String largeIcon;
    private String launchURL;
    private String ledColor;
    private int lockScreenVisibility = 1;
    private NotificationCompat.Extender notificationExtender;
    private String notificationId;
    private int priority;
    private String rawPayload;
    private String smallIcon;
    private String smallIconAccentColor;
    private String sound;
    private String templateId;
    private String templateName;
    private String title;

    protected OSNotification() {
    }

    protected OSNotification(OSNotification oSNotification) {
        this.notificationExtender = oSNotification.notificationExtender;
        this.groupedNotifications = oSNotification.groupedNotifications;
        this.androidNotificationId = oSNotification.androidNotificationId;
        this.notificationId = oSNotification.notificationId;
        this.templateName = oSNotification.templateName;
        this.templateId = oSNotification.templateId;
        this.title = oSNotification.title;
        this.body = oSNotification.body;
        this.additionalData = oSNotification.additionalData;
        this.largeIcon = oSNotification.largeIcon;
        this.bigPicture = oSNotification.bigPicture;
        this.smallIconAccentColor = oSNotification.smallIconAccentColor;
        this.launchURL = oSNotification.launchURL;
        this.sound = oSNotification.sound;
        this.ledColor = oSNotification.ledColor;
        this.lockScreenVisibility = oSNotification.lockScreenVisibility;
        this.groupKey = oSNotification.groupKey;
        this.groupMessage = oSNotification.groupMessage;
        this.actionButtons = oSNotification.actionButtons;
        this.fromProjectNumber = oSNotification.fromProjectNumber;
        this.backgroundImageLayout = oSNotification.backgroundImageLayout;
        this.collapseId = oSNotification.collapseId;
        this.priority = oSNotification.priority;
        this.rawPayload = oSNotification.rawPayload;
    }

    OSNotification(List<OSNotification> list, JSONObject jSONObject) {
        this(list, jSONObject, 0);
    }

    OSNotification(List<OSNotification> list, JSONObject jSONObject, int n) {
        this.initPayloadData(jSONObject);
        this.groupedNotifications = list;
        this.androidNotificationId = n;
    }

    OSNotification(JSONObject jSONObject) {
        this(null, jSONObject, 0);
    }

    OSNotification(JSONObject jSONObject, int n) {
        this(null, jSONObject, n);
    }

    private void initPayloadData(JSONObject jSONObject) {
        JSONObject jSONObject2;
        try {
            jSONObject2 = NotificationBundleProcessor.getCustomJSONObject(jSONObject);
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error assigning OSNotificationReceivedEvent payload values!", throwable);
            return;
        }
        this.notificationId = jSONObject2.optString("i");
        this.templateId = jSONObject2.optString("ti");
        this.templateName = jSONObject2.optString("tn");
        this.rawPayload = jSONObject.toString();
        this.additionalData = jSONObject2.optJSONObject("a");
        this.launchURL = jSONObject2.optString("u", null);
        this.body = jSONObject.optString("alert", null);
        this.title = jSONObject.optString("title", null);
        this.smallIcon = jSONObject.optString("sicon", null);
        this.bigPicture = jSONObject.optString("bicon", null);
        this.largeIcon = jSONObject.optString("licon", null);
        this.sound = jSONObject.optString("sound", null);
        this.groupKey = jSONObject.optString("grp", null);
        this.groupMessage = jSONObject.optString("grp_msg", null);
        this.smallIconAccentColor = jSONObject.optString("bgac", null);
        this.ledColor = jSONObject.optString("ledc", null);
        String string2 = jSONObject.optString("vis", null);
        if (string2 != null) {
            this.lockScreenVisibility = Integer.parseInt((String)string2);
        }
        this.fromProjectNumber = jSONObject.optString("from", null);
        this.priority = jSONObject.optInt("pri", 0);
        String string3 = jSONObject.optString("collapse_key", null);
        if (!"do_not_collapse".equals((Object)string3)) {
            this.collapseId = string3;
        }
        try {
            this.setActionButtons();
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error assigning OSNotificationReceivedEvent.actionButtons values!", throwable);
        }
        try {
            this.setBackgroundImageLayout(jSONObject);
            return;
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error assigning OSNotificationReceivedEvent.backgroundImageLayout values!", throwable);
            return;
        }
    }

    private void setActionButtons() throws Throwable {
        JSONObject jSONObject = this.additionalData;
        if (jSONObject != null && jSONObject.has("actionButtons")) {
            JSONArray jSONArray = this.additionalData.getJSONArray("actionButtons");
            this.actionButtons = new ArrayList();
            for (int i = 0; i < jSONArray.length(); ++i) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                ActionButton actionButton = new ActionButton();
                actionButton.id = jSONObject2.optString("id", null);
                actionButton.text = jSONObject2.optString("text", null);
                actionButton.icon = jSONObject2.optString("icon", null);
                this.actionButtons.add((Object)actionButton);
            }
            this.additionalData.remove("actionId");
            this.additionalData.remove("actionButtons");
        }
    }

    private void setBackgroundImageLayout(JSONObject jSONObject) throws Throwable {
        String string2 = jSONObject.optString("bg_img", null);
        if (string2 != null) {
            BackgroundImageLayout backgroundImageLayout;
            JSONObject jSONObject2 = new JSONObject(string2);
            this.backgroundImageLayout = backgroundImageLayout = new BackgroundImageLayout();
            backgroundImageLayout.image = jSONObject2.optString("img");
            this.backgroundImageLayout.titleTextColor = jSONObject2.optString("tc");
            this.backgroundImageLayout.bodyTextColor = jSONObject2.optString("bc");
        }
    }

    OSNotification copy() {
        return new OSNotificationBuilder().setNotificationExtender(this.notificationExtender).setGroupedNotifications(this.groupedNotifications).setAndroidNotificationId(this.androidNotificationId).setNotificationId(this.notificationId).setTemplateName(this.templateName).setTemplateId(this.templateId).setTitle(this.title).setBody(this.body).setAdditionalData(this.additionalData).setSmallIcon(this.smallIcon).setLargeIcon(this.largeIcon).setBigPicture(this.bigPicture).setSmallIconAccentColor(this.smallIconAccentColor).setLaunchURL(this.launchURL).setSound(this.sound).setLedColor(this.ledColor).setLockScreenVisibility(this.lockScreenVisibility).setGroupKey(this.groupKey).setGroupMessage(this.groupMessage).setActionButtons(this.actionButtons).setFromProjectNumber(this.fromProjectNumber).setBackgroundImageLayout(this.backgroundImageLayout).setCollapseId(this.collapseId).setPriority(this.priority).setRawPayload(this.rawPayload).build();
    }

    public List<ActionButton> getActionButtons() {
        return this.actionButtons;
    }

    public JSONObject getAdditionalData() {
        return this.additionalData;
    }

    public int getAndroidNotificationId() {
        return this.androidNotificationId;
    }

    public BackgroundImageLayout getBackgroundImageLayout() {
        return this.backgroundImageLayout;
    }

    public String getBigPicture() {
        return this.bigPicture;
    }

    public String getBody() {
        return this.body;
    }

    public String getCollapseId() {
        return this.collapseId;
    }

    public String getFromProjectNumber() {
        return this.fromProjectNumber;
    }

    public String getGroupKey() {
        return this.groupKey;
    }

    public String getGroupMessage() {
        return this.groupMessage;
    }

    public List<OSNotification> getGroupedNotifications() {
        return this.groupedNotifications;
    }

    public String getLargeIcon() {
        return this.largeIcon;
    }

    public String getLaunchURL() {
        return this.launchURL;
    }

    public String getLedColor() {
        return this.ledColor;
    }

    public int getLockScreenVisibility() {
        return this.lockScreenVisibility;
    }

    public NotificationCompat.Extender getNotificationExtender() {
        return this.notificationExtender;
    }

    public String getNotificationId() {
        return this.notificationId;
    }

    public int getPriority() {
        return this.priority;
    }

    public String getRawPayload() {
        return this.rawPayload;
    }

    public String getSmallIcon() {
        return this.smallIcon;
    }

    public String getSmallIconAccentColor() {
        return this.smallIconAccentColor;
    }

    public String getSound() {
        return this.sound;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public String getTitle() {
        return this.title;
    }

    boolean hasNotificationId() {
        return this.androidNotificationId != 0;
    }

    public OSMutableNotification mutableCopy() {
        return new OSMutableNotification(this);
    }

    void setActionButtons(List<ActionButton> list) {
        this.actionButtons = list;
    }

    void setAdditionalData(JSONObject jSONObject) {
        this.additionalData = jSONObject;
    }

    protected void setAndroidNotificationId(int n) {
        this.androidNotificationId = n;
    }

    void setBackgroundImageLayout(BackgroundImageLayout backgroundImageLayout) {
        this.backgroundImageLayout = backgroundImageLayout;
    }

    void setBigPicture(String string2) {
        this.bigPicture = string2;
    }

    void setBody(String string2) {
        this.body = string2;
    }

    void setCollapseId(String string2) {
        this.collapseId = string2;
    }

    void setFromProjectNumber(String string2) {
        this.fromProjectNumber = string2;
    }

    void setGroupKey(String string2) {
        this.groupKey = string2;
    }

    void setGroupMessage(String string2) {
        this.groupMessage = string2;
    }

    void setGroupedNotifications(List<OSNotification> list) {
        this.groupedNotifications = list;
    }

    void setLargeIcon(String string2) {
        this.largeIcon = string2;
    }

    void setLaunchURL(String string2) {
        this.launchURL = string2;
    }

    void setLedColor(String string2) {
        this.ledColor = string2;
    }

    void setLockScreenVisibility(int n) {
        this.lockScreenVisibility = n;
    }

    protected void setNotificationExtender(NotificationCompat.Extender extender) {
        this.notificationExtender = extender;
    }

    void setNotificationId(String string2) {
        this.notificationId = string2;
    }

    void setPriority(int n) {
        this.priority = n;
    }

    void setRawPayload(String string2) {
        this.rawPayload = string2;
    }

    void setSmallIcon(String string2) {
        this.smallIcon = string2;
    }

    void setSmallIconAccentColor(String string2) {
        this.smallIconAccentColor = string2;
    }

    void setSound(String string2) {
        this.sound = string2;
    }

    void setTemplateId(String string2) {
        this.templateId = string2;
    }

    void setTemplateName(String string2) {
        this.templateName = string2;
    }

    void setTitle(String string2) {
        this.title = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("androidNotificationId", this.androidNotificationId);
            JSONArray jSONArray = new JSONArray();
            List<OSNotification> list = this.groupedNotifications;
            if (list != null) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    jSONArray.put((Object)((OSNotification)iterator.next()).toJSONObject());
                }
            }
            jSONObject.put("groupedNotifications", (Object)jSONArray);
            jSONObject.put("notificationId", (Object)this.notificationId);
            jSONObject.put("templateName", (Object)this.templateName);
            jSONObject.put("templateId", (Object)this.templateId);
            jSONObject.put("title", (Object)this.title);
            jSONObject.put("body", (Object)this.body);
            jSONObject.put("smallIcon", (Object)this.smallIcon);
            jSONObject.put("largeIcon", (Object)this.largeIcon);
            jSONObject.put("bigPicture", (Object)this.bigPicture);
            jSONObject.put("smallIconAccentColor", (Object)this.smallIconAccentColor);
            jSONObject.put("launchURL", (Object)this.launchURL);
            jSONObject.put("sound", (Object)this.sound);
            jSONObject.put("ledColor", (Object)this.ledColor);
            jSONObject.put("lockScreenVisibility", this.lockScreenVisibility);
            jSONObject.put("groupKey", (Object)this.groupKey);
            jSONObject.put("groupMessage", (Object)this.groupMessage);
            jSONObject.put("fromProjectNumber", (Object)this.fromProjectNumber);
            jSONObject.put("collapseId", (Object)this.collapseId);
            jSONObject.put("priority", this.priority);
            JSONObject jSONObject2 = this.additionalData;
            if (jSONObject2 != null) {
                jSONObject.put("additionalData", (Object)jSONObject2);
            }
            if (this.actionButtons != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator iterator = this.actionButtons.iterator();
                while (iterator.hasNext()) {
                    jSONArray2.put((Object)((ActionButton)iterator.next()).toJSONObject());
                }
                jSONObject.put("actionButtons", (Object)jSONArray2);
            }
            jSONObject.put("rawPayload", (Object)this.rawPayload);
            return jSONObject;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSNotification{notificationExtender=");
        stringBuilder.append((Object)this.notificationExtender);
        stringBuilder.append(", groupedNotifications=");
        stringBuilder.append(this.groupedNotifications);
        stringBuilder.append(", androidNotificationId=");
        stringBuilder.append(this.androidNotificationId);
        stringBuilder.append(", notificationId='");
        stringBuilder.append(this.notificationId);
        stringBuilder.append('\'');
        stringBuilder.append(", templateName='");
        stringBuilder.append(this.templateName);
        stringBuilder.append('\'');
        stringBuilder.append(", templateId='");
        stringBuilder.append(this.templateId);
        stringBuilder.append('\'');
        stringBuilder.append(", title='");
        stringBuilder.append(this.title);
        stringBuilder.append('\'');
        stringBuilder.append(", body='");
        stringBuilder.append(this.body);
        stringBuilder.append('\'');
        stringBuilder.append(", additionalData=");
        stringBuilder.append((Object)this.additionalData);
        stringBuilder.append(", smallIcon='");
        stringBuilder.append(this.smallIcon);
        stringBuilder.append('\'');
        stringBuilder.append(", largeIcon='");
        stringBuilder.append(this.largeIcon);
        stringBuilder.append('\'');
        stringBuilder.append(", bigPicture='");
        stringBuilder.append(this.bigPicture);
        stringBuilder.append('\'');
        stringBuilder.append(", smallIconAccentColor='");
        stringBuilder.append(this.smallIconAccentColor);
        stringBuilder.append('\'');
        stringBuilder.append(", launchURL='");
        stringBuilder.append(this.launchURL);
        stringBuilder.append('\'');
        stringBuilder.append(", sound='");
        stringBuilder.append(this.sound);
        stringBuilder.append('\'');
        stringBuilder.append(", ledColor='");
        stringBuilder.append(this.ledColor);
        stringBuilder.append('\'');
        stringBuilder.append(", lockScreenVisibility=");
        stringBuilder.append(this.lockScreenVisibility);
        stringBuilder.append(", groupKey='");
        stringBuilder.append(this.groupKey);
        stringBuilder.append('\'');
        stringBuilder.append(", groupMessage='");
        stringBuilder.append(this.groupMessage);
        stringBuilder.append('\'');
        stringBuilder.append(", actionButtons=");
        stringBuilder.append(this.actionButtons);
        stringBuilder.append(", fromProjectNumber='");
        stringBuilder.append(this.fromProjectNumber);
        stringBuilder.append('\'');
        stringBuilder.append(", backgroundImageLayout=");
        stringBuilder.append((Object)this.backgroundImageLayout);
        stringBuilder.append(", collapseId='");
        stringBuilder.append(this.collapseId);
        stringBuilder.append('\'');
        stringBuilder.append(", priority=");
        stringBuilder.append(this.priority);
        stringBuilder.append(", rawPayload='");
        stringBuilder.append(this.rawPayload);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static class ActionButton {
        private String icon;
        private String id;
        private String text;

        public ActionButton() {
        }

        public ActionButton(String string2, String string3, String string4) {
            this.id = string2;
            this.text = string3;
            this.icon = string4;
        }

        public ActionButton(JSONObject jSONObject) {
            this.id = jSONObject.optString("id");
            this.text = jSONObject.optString("text");
            this.icon = jSONObject.optString("icon");
        }

        public String getIcon() {
            return this.icon;
        }

        public String getId() {
            return this.id;
        }

        public String getText() {
            return this.text;
        }

        public JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", (Object)this.id);
                jSONObject.put("text", (Object)this.text);
                jSONObject.put("icon", (Object)this.icon);
                return jSONObject;
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
                return jSONObject;
            }
        }
    }

    public static class BackgroundImageLayout {
        private String bodyTextColor;
        private String image;
        private String titleTextColor;

        public String getBodyTextColor() {
            return this.bodyTextColor;
        }

        public String getImage() {
            return this.image;
        }

        public String getTitleTextColor() {
            return this.titleTextColor;
        }
    }

    public static class OSNotificationBuilder {
        private List<ActionButton> actionButtons;
        private JSONObject additionalData;
        private int androidNotificationId;
        private BackgroundImageLayout backgroundImageLayout;
        private String bigPicture;
        private String body;
        private String collapseId;
        private String fromProjectNumber;
        private String groupKey;
        private String groupMessage;
        private List<OSNotification> groupedNotifications;
        private String largeIcon;
        private String launchURL;
        private String ledColor;
        private int lockScreenVisibility = 1;
        private NotificationCompat.Extender notificationExtender;
        private String notificationId;
        private int priority;
        private String rawPayload;
        private String smallIcon;
        private String smallIconAccentColor;
        private String sound;
        private String templateId;
        private String templateName;
        private String title;

        public OSNotification build() {
            OSNotification oSNotification = new OSNotification();
            oSNotification.setNotificationExtender(this.notificationExtender);
            oSNotification.setGroupedNotifications(this.groupedNotifications);
            oSNotification.setAndroidNotificationId(this.androidNotificationId);
            oSNotification.setNotificationId(this.notificationId);
            oSNotification.setTemplateName(this.templateName);
            oSNotification.setTemplateId(this.templateId);
            oSNotification.setTitle(this.title);
            oSNotification.setBody(this.body);
            oSNotification.setAdditionalData(this.additionalData);
            oSNotification.setSmallIcon(this.smallIcon);
            oSNotification.setLargeIcon(this.largeIcon);
            oSNotification.setBigPicture(this.bigPicture);
            oSNotification.setSmallIconAccentColor(this.smallIconAccentColor);
            oSNotification.setLaunchURL(this.launchURL);
            oSNotification.setSound(this.sound);
            oSNotification.setLedColor(this.ledColor);
            oSNotification.setLockScreenVisibility(this.lockScreenVisibility);
            oSNotification.setGroupKey(this.groupKey);
            oSNotification.setGroupMessage(this.groupMessage);
            oSNotification.setActionButtons(this.actionButtons);
            oSNotification.setFromProjectNumber(this.fromProjectNumber);
            oSNotification.setBackgroundImageLayout(this.backgroundImageLayout);
            oSNotification.setCollapseId(this.collapseId);
            oSNotification.setPriority(this.priority);
            oSNotification.setRawPayload(this.rawPayload);
            return oSNotification;
        }

        public OSNotificationBuilder setActionButtons(List<ActionButton> list) {
            this.actionButtons = list;
            return this;
        }

        public OSNotificationBuilder setAdditionalData(JSONObject jSONObject) {
            this.additionalData = jSONObject;
            return this;
        }

        public OSNotificationBuilder setAndroidNotificationId(int n) {
            this.androidNotificationId = n;
            return this;
        }

        public OSNotificationBuilder setBackgroundImageLayout(BackgroundImageLayout backgroundImageLayout) {
            this.backgroundImageLayout = backgroundImageLayout;
            return this;
        }

        public OSNotificationBuilder setBigPicture(String string2) {
            this.bigPicture = string2;
            return this;
        }

        public OSNotificationBuilder setBody(String string2) {
            this.body = string2;
            return this;
        }

        public OSNotificationBuilder setCollapseId(String string2) {
            this.collapseId = string2;
            return this;
        }

        public OSNotificationBuilder setFromProjectNumber(String string2) {
            this.fromProjectNumber = string2;
            return this;
        }

        public OSNotificationBuilder setGroupKey(String string2) {
            this.groupKey = string2;
            return this;
        }

        public OSNotificationBuilder setGroupMessage(String string2) {
            this.groupMessage = string2;
            return this;
        }

        public OSNotificationBuilder setGroupedNotifications(List<OSNotification> list) {
            this.groupedNotifications = list;
            return this;
        }

        public OSNotificationBuilder setLargeIcon(String string2) {
            this.largeIcon = string2;
            return this;
        }

        public OSNotificationBuilder setLaunchURL(String string2) {
            this.launchURL = string2;
            return this;
        }

        public OSNotificationBuilder setLedColor(String string2) {
            this.ledColor = string2;
            return this;
        }

        public OSNotificationBuilder setLockScreenVisibility(int n) {
            this.lockScreenVisibility = n;
            return this;
        }

        public OSNotificationBuilder setNotificationExtender(NotificationCompat.Extender extender) {
            this.notificationExtender = extender;
            return this;
        }

        public OSNotificationBuilder setNotificationId(String string2) {
            this.notificationId = string2;
            return this;
        }

        public OSNotificationBuilder setPriority(int n) {
            this.priority = n;
            return this;
        }

        public OSNotificationBuilder setRawPayload(String string2) {
            this.rawPayload = string2;
            return this;
        }

        public OSNotificationBuilder setSmallIcon(String string2) {
            this.smallIcon = string2;
            return this;
        }

        public OSNotificationBuilder setSmallIconAccentColor(String string2) {
            this.smallIconAccentColor = string2;
            return this;
        }

        public OSNotificationBuilder setSound(String string2) {
            this.sound = string2;
            return this;
        }

        public OSNotificationBuilder setTemplateId(String string2) {
            this.templateId = string2;
            return this;
        }

        public OSNotificationBuilder setTemplateName(String string2) {
            this.templateName = string2;
            return this;
        }

        public OSNotificationBuilder setTitle(String string2) {
            this.title = string2;
            return this;
        }
    }

}

