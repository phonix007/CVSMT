/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  com.onesignal.OSLogger
 *  com.onesignal.OSSharedPreferences
 *  dalvik.annotation.SourceDebugExtension
 *  java.lang.Float
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Set
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package com.onesignal.outcomes.data;

import android.content.ContentValues;
import android.database.Cursor;
import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OneSignalDb;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import com.onesignal.outcomes.data.OSOutcomeEventsCache$WhenMappings;
import com.onesignal.outcomes.domain.OSCachedUniqueOutcome;
import com.onesignal.outcomes.domain.OSOutcomeEventParams;
import com.onesignal.outcomes.domain.OSOutcomeSource;
import com.onesignal.outcomes.domain.OSOutcomeSourceBody;
import dalvik.annotation.SourceDebugExtension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

@SourceDebugExtension(value="SMAP\nOSOutcomeEventsCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OSOutcomeEventsCache.kt\ncom/onesignal/outcomes/data/OSOutcomeEventsCache\n*L\n1#1,332:1\n*E\n")
@Metadata(bv={1, 0, 3}, d1={"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ(\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010\u001a\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0007J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0007J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0$H\u0007J4\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010&H\u0002J$\u0010-\u001a\b\u0012\u0004\u0012\u00020.0$2\u0006\u0010/\u001a\u00020\u000e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020.0$H\u0007J*\u00101\u001a\u0004\u0018\u00010&2\u0006\u00102\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u000eH\u0002J\u0010\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\"H\u0007J\u0018\u00106\u001a\u00020\u00122\u0010\u00107\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rJ\u0010\u00108\u001a\u00020\u00122\u0006\u00105\u001a\u00020\"H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u00069"}, d2={"Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;", "", "logger", "Lcom/onesignal/OSLogger;", "dbHelper", "Lcom/onesignal/OneSignalDb;", "preferences", "Lcom/onesignal/OSSharedPreferences;", "(Lcom/onesignal/OSLogger;Lcom/onesignal/OneSignalDb;Lcom/onesignal/OSSharedPreferences;)V", "isOutcomesV2ServiceEnabled", "", "()Z", "unattributedUniqueOutcomeEventsSentByChannel", "", "", "getUnattributedUniqueOutcomeEventsSentByChannel", "()Ljava/util/Set;", "addIdToListFromChannel", "", "cachedUniqueOutcomes", "", "Lcom/onesignal/outcomes/domain/OSCachedUniqueOutcome;", "channelIds", "Lorg/json/JSONArray;", "channel", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "addIdsToListFromSource", "sourceBody", "Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;", "cleanCachedUniqueOutcomeEventNotifications", "notificationTableName", "notificationIdColumnName", "deleteOldOutcomeEvent", "event", "Lcom/onesignal/outcomes/domain/OSOutcomeEventParams;", "getAllEventsToSend", "", "getIAMInfluenceSource", "Lcom/onesignal/outcomes/domain/OSOutcomeSource;", "iamInfluenceType", "Lcom/onesignal/influence/domain/OSInfluenceType;", "directSourceBody", "indirectSourceBody", "iamIds", "source", "getNotCachedUniqueInfluencesForOutcome", "Lcom/onesignal/influence/domain/OSInfluence;", "name", "influences", "getNotificationInfluenceSource", "notificationInfluenceType", "notificationIds", "saveOutcomeEvent", "eventParams", "saveUnattributedUniqueOutcomeEventsSentByChannel", "unattributedUniqueOutcomeEvents", "saveUniqueOutcomeEventParams", "onesignal_release"}, k=1, mv={1, 1, 16})
public final class OSOutcomeEventsCache {
    private final OneSignalDb dbHelper;
    private final OSLogger logger;
    private final OSSharedPreferences preferences;

    public OSOutcomeEventsCache(OSLogger oSLogger, OneSignalDb oneSignalDb, OSSharedPreferences oSSharedPreferences) {
        Intrinsics.checkParameterIsNotNull((Object)oSLogger, (String)"logger");
        Intrinsics.checkParameterIsNotNull((Object)oneSignalDb, (String)"dbHelper");
        Intrinsics.checkParameterIsNotNull((Object)oSSharedPreferences, (String)"preferences");
        this.logger = oSLogger;
        this.dbHelper = oneSignalDb;
        this.preferences = oSSharedPreferences;
    }

    private final void addIdToListFromChannel(List<OSCachedUniqueOutcome> list, JSONArray jSONArray, OSInfluenceChannel oSInfluenceChannel) {
        if (jSONArray != null) {
            int n = jSONArray.length();
            for (int i = 0; i < n; ++i) {
                try {
                    String string2 = jSONArray.getString(i);
                    Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"influenceId");
                    list.add((Object)new OSCachedUniqueOutcome(string2, oSInfluenceChannel));
                    continue;
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                }
            }
        }
    }

    private final void addIdsToListFromSource(List<OSCachedUniqueOutcome> list, OSOutcomeSourceBody oSOutcomeSourceBody) {
        if (oSOutcomeSourceBody != null) {
            JSONArray jSONArray = oSOutcomeSourceBody.getInAppMessagesIds();
            JSONArray jSONArray2 = oSOutcomeSourceBody.getNotificationIds();
            this.addIdToListFromChannel(list, jSONArray, OSInfluenceChannel.IAM);
            this.addIdToListFromChannel(list, jSONArray2, OSInfluenceChannel.NOTIFICATION);
        }
    }

    private final OSOutcomeSource getIAMInfluenceSource(OSInfluenceType oSInfluenceType, OSOutcomeSourceBody oSOutcomeSourceBody, OSOutcomeSourceBody oSOutcomeSourceBody2, String string2, OSOutcomeSource oSOutcomeSource) {
        OSOutcomeSource oSOutcomeSource2;
        int n = OSOutcomeEventsCache$WhenMappings.$EnumSwitchMapping$1[oSInfluenceType.ordinal()];
        if (n != 1) {
            OSOutcomeSource oSOutcomeSource3;
            if (n != 2) {
                return oSOutcomeSource;
            }
            oSOutcomeSourceBody2.setInAppMessagesIds(new JSONArray(string2));
            if (oSOutcomeSource != null && (oSOutcomeSource3 = oSOutcomeSource.setIndirectBody(oSOutcomeSourceBody2)) != null) {
                return oSOutcomeSource3;
            }
            return new OSOutcomeSource(null, oSOutcomeSourceBody2);
        }
        oSOutcomeSourceBody.setInAppMessagesIds(new JSONArray(string2));
        if (oSOutcomeSource != null && (oSOutcomeSource2 = oSOutcomeSource.setDirectBody(oSOutcomeSourceBody)) != null) {
            return oSOutcomeSource2;
        }
        return new OSOutcomeSource(oSOutcomeSourceBody, null);
    }

    private final OSOutcomeSource getNotificationInfluenceSource(OSInfluenceType oSInfluenceType, OSOutcomeSourceBody oSOutcomeSourceBody, OSOutcomeSourceBody oSOutcomeSourceBody2, String string2) {
        OSOutcomeSource oSOutcomeSource;
        int n = OSOutcomeEventsCache$WhenMappings.$EnumSwitchMapping$0[oSInfluenceType.ordinal()];
        if (n != 1) {
            if (n != 2) {
                return null;
            }
            oSOutcomeSourceBody2.setNotificationIds(new JSONArray(string2));
            oSOutcomeSource = new OSOutcomeSource(null, oSOutcomeSourceBody2);
        } else {
            oSOutcomeSourceBody.setNotificationIds(new JSONArray(string2));
            oSOutcomeSource = new OSOutcomeSource(oSOutcomeSourceBody, null);
        }
        return oSOutcomeSource;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void cleanCachedUniqueOutcomeEventNotifications(String string2, String string3) {
        OSOutcomeEventsCache oSOutcomeEventsCache = this;
        synchronized (oSOutcomeEventsCache) {
            Intrinsics.checkParameterIsNotNull((Object)string2, (String)"notificationTableName");
            Intrinsics.checkParameterIsNotNull((Object)string3, (String)"notificationIdColumnName");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("NOT EXISTS(SELECT NULL FROM ");
            stringBuilder.append(string2);
            stringBuilder.append(" n ");
            stringBuilder.append("WHERE");
            stringBuilder.append(" n.");
            stringBuilder.append(string3);
            stringBuilder.append(" = ");
            stringBuilder.append("channel_influence_id");
            stringBuilder.append(" AND ");
            stringBuilder.append("channel_type");
            stringBuilder.append(" = \"");
            String string4 = OSInfluenceChannel.NOTIFICATION.toString();
            Locale locale = Locale.ROOT;
            Intrinsics.checkExpressionValueIsNotNull((Object)locale, (String)"Locale.ROOT");
            if (string4 == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            String string5 = string4.toLowerCase(locale);
            Intrinsics.checkExpressionValueIsNotNull((Object)string5, (String)"(this as java.lang.String).toLowerCase(locale)");
            stringBuilder.append(string5);
            stringBuilder.append("\")");
            String string6 = stringBuilder.toString();
            this.dbHelper.delete("cached_unique_outcome", string6, null);
            return;
        }
    }

    public final void deleteOldOutcomeEvent(OSOutcomeEventParams oSOutcomeEventParams) {
        OSOutcomeEventsCache oSOutcomeEventsCache = this;
        synchronized (oSOutcomeEventsCache) {
            Intrinsics.checkParameterIsNotNull((Object)oSOutcomeEventParams, (String)"event");
            OneSignalDb oneSignalDb = this.dbHelper;
            String[] arrstring = new String[]{String.valueOf((long)oSOutcomeEventParams.getTimestamp())};
            oneSignalDb.delete("outcome", "timestamp = ?", arrstring);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final List<OSOutcomeEventParams> getAllEventsToSend() {
        block12 : {
            block17 : {
                block16 : {
                    block14 : {
                        block13 : {
                            block15 : {
                                var26_1 = this;
                                // MONITORENTER : var26_1
                                var2_2 = (List)new ArrayList();
                                var3_3 = null;
                                var5_4 = this.dbHelper.query("outcome", null, null, null, null, null, null);
                                try {
                                    Intrinsics.checkExpressionValueIsNotNull((Object)var5_4, (String)"cursor");
                                    if (!var5_4.moveToFirst()) break block12;
lbl10: // 2 sources:
                                    do {
                                        var6_5 = var5_4.getString(var5_4.getColumnIndex("notification_influence_type"));
                                        var7_6 = OSInfluenceType.Companion.fromString(var6_5);
                                        var8_7 = var5_4.getString(var5_4.getColumnIndex("iam_influence_type"));
                                        var9_8 = OSInfluenceType.Companion.fromString(var8_7);
                                        var10_9 = var5_4.getString(var5_4.getColumnIndex("notification_ids"));
                                        if (var10_9 == null) break block13;
                                        break block14;
                                        break;
                                    } while (true);
                                }
                                catch (Throwable var4_22) {
                                    var3_3 = var5_4;
                                    break block15;
                                }
                                catch (Throwable var4_23) {
                                    // empty catch block
                                }
                            }
                            if (var3_3 == null) throw var4_24;
                            if (var3_3.isClosed() != false) throw var4_24;
                            var3_3.close();
                            throw var4_24;
                        }
                        var10_9 = "[]";
                    }
                    if ((var11_10 = var5_4.getString(var5_4.getColumnIndex("iam_ids"))) == null) {
                        var11_10 = "[]";
                    }
                    var12_11 = var11_10;
                    var13_12 = var5_4.getString(var5_4.getColumnIndex("name"));
                    var14_13 = var5_4.getFloat(var5_4.getColumnIndex("weight"));
                    var15_14 = var5_4.getLong(var5_4.getColumnIndex("timestamp"));
                    try {
                        var17_15 = new OSOutcomeSourceBody(null, null, 3, null);
                        var18_16 = new OSOutcomeSourceBody(null, null, 3, null);
                        var21_19 = this.getNotificationInfluenceSource(var7_6, var17_15, var18_16, var10_9);
                        this.getIAMInfluenceSource(var9_8, var17_15, var18_16, var12_11, var21_19);
                        if (var21_19 != null) break block16;
                        var21_19 = new OSOutcomeSource(null, null);
                    }
                    catch (JSONException var19_17) {
                        this.logger.error("Generating JSONArray from notifications ids outcome:JSON Failed.", (Throwable)var19_17);
                        break block17;
                    }
                }
                var23_20 = var21_19;
                Intrinsics.checkExpressionValueIsNotNull((Object)var13_12, (String)"name");
                var24_21 = new OSOutcomeEventParams(var13_12, var23_20, var14_13, var15_14);
                var2_2.add((Object)var24_21);
            }
            ** while (var20_18 = var5_4.moveToNext())
        }
        if (!var5_4.isClosed()) {
            var5_4.close();
        }
        // MONITOREXIT : var26_1
        return var2_2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final List<OSInfluence> getNotCachedUniqueInfluencesForOutcome(String string2, List<OSInfluence> list) {
        Cursor cursor;
        Throwable throwable22;
        block18 : {
            List list2;
            block16 : {
                block17 : {
                    OSOutcomeEventsCache oSOutcomeEventsCache = this;
                    // MONITORENTER : oSOutcomeEventsCache
                    Intrinsics.checkParameterIsNotNull((Object)string2, (String)"name");
                    Intrinsics.checkParameterIsNotNull(list, (String)"influences");
                    list2 = (List)new ArrayList();
                    cursor = null;
                    Iterator iterator = list.iterator();
                    block9 : do {
                        JSONArray jSONArray;
                        OSInfluence oSInfluence;
                        JSONArray jSONArray2;
                        if (iterator.hasNext()) {
                            oSInfluence = (OSInfluence)iterator.next();
                            jSONArray = new JSONArray();
                            jSONArray2 = oSInfluence.getIds();
                            if (jSONArray2 == null) continue;
                        } else {
                            if (cursor == null || cursor.isClosed()) break block16;
                            break block17;
                        }
                        int n = jSONArray2.length();
                        int n2 = 0;
                        do {
                            if (n2 < n) {
                                String string3 = jSONArray2.getString(n2);
                                OSInfluenceChannel oSInfluenceChannel = oSInfluence.getInfluenceChannel();
                                String[] arrstring = new String[]{};
                                String[] arrstring2 = new String[]{string3, oSInfluenceChannel.toString(), string2};
                                cursor = this.dbHelper.query("cached_unique_outcome", arrstring, "channel_influence_id = ? AND channel_type = ? AND name = ?", arrstring2, null, null, null, "1");
                                Intrinsics.checkExpressionValueIsNotNull((Object)cursor, (String)"cursor");
                                if (cursor.getCount() == 0) {
                                    jSONArray.put((Object)string3);
                                }
                            } else {
                                if (jSONArray.length() <= 0) continue block9;
                                OSInfluence oSInfluence2 = oSInfluence.copy();
                                oSInfluence2.setIds(jSONArray);
                                list2.add((Object)oSInfluence2);
                                continue block9;
                            }
                            ++n2;
                        } while (true);
                        break;
                    } while (true);
                    {
                        boolean bl;
                        catch (Throwable throwable22) {
                            break block18;
                        }
                        catch (JSONException jSONException) {}
                        {
                            jSONException.printStackTrace();
                        }
                        if (cursor == null || (bl = cursor.isClosed())) break block16;
                    }
                }
                cursor.close();
                return list2;
            }
            // MONITOREXIT : oSOutcomeEventsCache
            return list2;
        }
        if (cursor == null) throw throwable22;
        if (cursor.isClosed()) throw throwable22;
        cursor.close();
        throw throwable22;
    }

    public final Set<String> getUnattributedUniqueOutcomeEventsSentByChannel() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getStringSet(oSSharedPreferences.getPreferencesName(), "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", null);
    }

    public final boolean isOutcomesV2ServiceEnabled() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getBool(oSSharedPreferences.getPreferencesName(), this.preferences.getOutcomesV2KeyName(), false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void saveOutcomeEvent(OSOutcomeEventParams oSOutcomeEventParams) {
        OSOutcomeEventsCache oSOutcomeEventsCache = this;
        synchronized (oSOutcomeEventsCache) {
            JSONArray jSONArray;
            OSInfluenceType oSInfluenceType;
            JSONArray jSONArray2;
            OSInfluenceType oSInfluenceType2;
            block19 : {
                OSOutcomeSourceBody oSOutcomeSourceBody;
                block20 : {
                    block17 : {
                        OSOutcomeSourceBody oSOutcomeSourceBody2;
                        block18 : {
                            Intrinsics.checkParameterIsNotNull((Object)oSOutcomeEventParams, (String)"eventParams");
                            jSONArray = new JSONArray();
                            jSONArray2 = new JSONArray();
                            oSInfluenceType = OSInfluenceType.UNATTRIBUTED;
                            oSInfluenceType2 = OSInfluenceType.UNATTRIBUTED;
                            OSOutcomeSource oSOutcomeSource = oSOutcomeEventParams.getOutcomeSource();
                            if (oSOutcomeSource == null) break block17;
                            oSOutcomeSourceBody2 = oSOutcomeSource.getDirectBody();
                            if (oSOutcomeSourceBody2 == null) break block17;
                            JSONArray jSONArray3 = oSOutcomeSourceBody2.getNotificationIds();
                            if (jSONArray3 == null) break block18;
                            if (jSONArray3.length() <= 0) break block18;
                            oSInfluenceType = OSInfluenceType.DIRECT;
                            jSONArray = jSONArray3;
                        }
                        JSONArray jSONArray4 = oSOutcomeSourceBody2.getInAppMessagesIds();
                        if (jSONArray4 == null) break block17;
                        if (jSONArray4.length() <= 0) break block17;
                        oSInfluenceType2 = OSInfluenceType.DIRECT;
                        jSONArray2 = jSONArray4;
                    }
                    OSOutcomeSource oSOutcomeSource = oSOutcomeEventParams.getOutcomeSource();
                    if (oSOutcomeSource == null) break block19;
                    oSOutcomeSourceBody = oSOutcomeSource.getIndirectBody();
                    if (oSOutcomeSourceBody == null) break block19;
                    JSONArray jSONArray5 = oSOutcomeSourceBody.getNotificationIds();
                    if (jSONArray5 == null) break block20;
                    if (jSONArray5.length() <= 0) break block20;
                    oSInfluenceType = OSInfluenceType.INDIRECT;
                    jSONArray = jSONArray5;
                }
                JSONArray jSONArray6 = oSOutcomeSourceBody.getInAppMessagesIds();
                if (jSONArray6 == null) break block19;
                if (jSONArray6.length() <= 0) break block19;
                oSInfluenceType2 = OSInfluenceType.INDIRECT;
                jSONArray2 = jSONArray6;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("notification_ids", jSONArray.toString());
            contentValues.put("iam_ids", jSONArray2.toString());
            String string2 = oSInfluenceType.toString();
            if (string2 == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            String string3 = string2.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull((Object)string3, (String)"(this as java.lang.String).toLowerCase()");
            contentValues.put("notification_influence_type", string3);
            String string4 = oSInfluenceType2.toString();
            if (string4 == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            String string5 = string4.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull((Object)string5, (String)"(this as java.lang.String).toLowerCase()");
            contentValues.put("iam_influence_type", string5);
            contentValues.put("name", oSOutcomeEventParams.getOutcomeId());
            contentValues.put("weight", Float.valueOf((float)oSOutcomeEventParams.getWeight()));
            contentValues.put("timestamp", Long.valueOf((long)oSOutcomeEventParams.getTimestamp()));
            this.dbHelper.insert("outcome", null, contentValues);
            return;
        }
    }

    public final void saveUnattributedUniqueOutcomeEventsSentByChannel(Set<String> set) {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        String string2 = oSSharedPreferences.getPreferencesName();
        if (set == null) {
            Intrinsics.throwNpe();
        }
        oSSharedPreferences.saveStringSet(string2, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void saveUniqueOutcomeEventParams(OSOutcomeEventParams oSOutcomeEventParams) {
        OSOutcomeEventsCache oSOutcomeEventsCache = this;
        synchronized (oSOutcomeEventsCache) {
            Intrinsics.checkParameterIsNotNull((Object)oSOutcomeEventParams, (String)"eventParams");
            OSLogger oSLogger = this.logger;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("OneSignal saveUniqueOutcomeEventParams: ");
            stringBuilder.append((Object)oSOutcomeEventParams);
            oSLogger.debug(stringBuilder.toString());
            String string2 = oSOutcomeEventParams.getOutcomeId();
            List list = (List)new ArrayList();
            OSOutcomeSource oSOutcomeSource = oSOutcomeEventParams.getOutcomeSource();
            OSOutcomeSourceBody oSOutcomeSourceBody = oSOutcomeSource != null ? oSOutcomeSource.getDirectBody() : null;
            OSOutcomeSource oSOutcomeSource2 = oSOutcomeEventParams.getOutcomeSource();
            OSOutcomeSourceBody oSOutcomeSourceBody2 = oSOutcomeSource2 != null ? oSOutcomeSource2.getIndirectBody() : null;
            this.addIdsToListFromSource((List<OSCachedUniqueOutcome>)list, oSOutcomeSourceBody);
            this.addIdsToListFromSource((List<OSCachedUniqueOutcome>)list, oSOutcomeSourceBody2);
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                OSCachedUniqueOutcome oSCachedUniqueOutcome = (OSCachedUniqueOutcome)iterator.next();
                ContentValues contentValues = new ContentValues();
                contentValues.put("channel_influence_id", oSCachedUniqueOutcome.getInfluenceId());
                contentValues.put("channel_type", oSCachedUniqueOutcome.getChannel().toString());
                contentValues.put("name", string2);
                this.dbHelper.insert("cached_unique_outcome", null, contentValues);
            }
            return;
        }
    }
}

