/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package com.onesignal;

import android.content.ContentValues;
import android.database.Cursor;
import com.onesignal.OSInAppMessage;
import com.onesignal.OSInAppMessageRedisplayStats;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalPrefs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

class OSInAppMessageRepository {
    static final long IAM_CACHE_DATA_LIFETIME = 15552000L;
    private final OneSignalDbHelper dbHelper;

    OSInAppMessageRepository(OneSignalDbHelper oneSignalDbHelper) {
        this.dbHelper = oneSignalDbHelper;
    }

    private void cleanInAppMessageClickedClickIds(Set<String> set) {
        Set<String> set2;
        if (set != null && set.size() > 0 && (set2 = OneSignalPrefs.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null)) != null && set2.size() > 0) {
            set2.removeAll(set);
            OneSignalPrefs.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", set2);
        }
    }

    private void cleanInAppMessageIds(Set<String> set) {
        if (set != null && set.size() > 0) {
            Set<String> set2 = OneSignalPrefs.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_DISPLAYED_IAMS", null);
            Set<String> set3 = OneSignalPrefs.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_IMPRESSIONED_IAMS", null);
            if (set2 != null && set2.size() > 0) {
                set2.removeAll(set);
                OneSignalPrefs.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_DISPLAYED_IAMS", set2);
            }
            if (set3 != null && set3.size() > 0) {
                set3.removeAll(set);
                OneSignalPrefs.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_IMPRESSIONED_IAMS", set3);
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    void cleanCachedInAppMessages() {
        block16 : {
            block15 : {
                block17 : {
                    block13 : {
                        block14 : {
                            var14_1 = this;
                            // MONITORENTER : var14_1
                            var1_2 = new String[]{"message_id", "click_ids"};
                            var2_3 = new String[]{String.valueOf((long)(System.currentTimeMillis() / 1000L - 15552000L))};
                            var4_4 = OSUtils.newConcurrentSet();
                            var5_5 = OSUtils.newConcurrentSet();
                            var6_6 = null;
                            var6_6 = this.dbHelper.query("in_app_message", var1_2, "last_display < ?", var2_3, null, null, null);
                            if (var6_6 == null || var6_6.getCount() == 0) break block13;
                            if (!var6_6.moveToFirst()) break block14;
                            do {
                                var9_7 = var6_6.getString(var6_6.getColumnIndex("message_id"));
                                var10_8 = var6_6.getString(var6_6.getColumnIndex("click_ids"));
                                var4_4.add((Object)var9_7);
                                var5_5.addAll(OSUtils.newStringSetFromJSONArray(new JSONArray(var10_8)));
                            } while (var13_9 = var6_6.moveToNext());
                        }
                        if (var6_6 == null || var6_6.isClosed()) break block15;
                        break block17;
                    }
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "Attempted to clean 6 month old IAM data, but none exists!");
                    if (var6_6 != null && !var6_6.isClosed()) {
                        var6_6.close();
                    }
                    // MONITOREXIT : var14_1
                    return;
                }
                do {
                    var6_6.close();
                    break block15;
                    break;
                } while (true);
                {
                    catch (Throwable var8_10) {
                        break block16;
                    }
                    catch (JSONException var7_11) {}
                    {
                        var7_11.printStackTrace();
                    }
                    if (var6_6 != null && !var6_6.isClosed()) ** continue;
                }
            }
            this.dbHelper.delete("in_app_message", "last_display < ?", var2_3);
            this.cleanInAppMessageIds(var4_4);
            this.cleanInAppMessageClickedClickIds(var5_5);
            // MONITOREXIT : var14_1
            return;
        }
        if (var6_6 == null) throw var8_10;
        if (var6_6.isClosed() != false) throw var8_10;
        var6_6.close();
        throw var8_10;
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
    List<OSInAppMessage> getCachedInAppMessages() {
        Cursor cursor;
        Throwable throwable22;
        block12 : {
            ArrayList arrayList;
            block13 : {
                block14 : {
                    block11 : {
                        boolean bl;
                        OSInAppMessageRepository oSInAppMessageRepository = this;
                        // MONITORENTER : oSInAppMessageRepository
                        arrayList = new ArrayList();
                        cursor = null;
                        cursor = this.dbHelper.query("in_app_message", null, null, null, null, null, null);
                        if (!cursor.moveToFirst()) break block11;
                        do {
                            int n;
                            String string2 = cursor.getString(cursor.getColumnIndex("message_id"));
                            String string3 = cursor.getString(cursor.getColumnIndex("click_ids"));
                            int n2 = cursor.getInt(cursor.getColumnIndex("display_quantity"));
                            long l = cursor.getLong(cursor.getColumnIndex("last_display"));
                            int n3 = cursor.getInt(cursor.getColumnIndex("displayed_in_session"));
                            if (n3 != (n = 1)) {
                                n = 0;
                            }
                            arrayList.add((Object)new OSInAppMessage(string2, OSUtils.newStringSetFromJSONArray(new JSONArray(string3)), (boolean)n, new OSInAppMessageRedisplayStats(n2, l)));
                        } while (bl = cursor.moveToNext());
                    }
                    if (cursor == null || cursor.isClosed()) break block13;
                    break block14;
                    {
                        boolean bl;
                        catch (Throwable throwable22) {
                            break block12;
                        }
                        catch (JSONException jSONException) {}
                        {
                            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Generating JSONArray from iam click ids:JSON Failed.", jSONException);
                        }
                        if (cursor == null || (bl = cursor.isClosed())) break block13;
                    }
                }
                cursor.close();
                return arrayList;
            }
            // MONITOREXIT : oSInAppMessageRepository
            return arrayList;
        }
        if (cursor == null) throw throwable22;
        if (cursor.isClosed()) throw throwable22;
        cursor.close();
        throw throwable22;
    }

    void saveInAppMessage(OSInAppMessage oSInAppMessage) {
        OSInAppMessageRepository oSInAppMessageRepository = this;
        synchronized (oSInAppMessageRepository) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_id", oSInAppMessage.messageId);
            contentValues.put("display_quantity", Integer.valueOf((int)oSInAppMessage.getRedisplayStats().getDisplayQuantity()));
            contentValues.put("last_display", Long.valueOf((long)oSInAppMessage.getRedisplayStats().getLastDisplayTime()));
            contentValues.put("click_ids", oSInAppMessage.getClickedClickIds().toString());
            contentValues.put("displayed_in_session", Boolean.valueOf((boolean)oSInAppMessage.isDisplayedInSession()));
            OneSignalDbHelper oneSignalDbHelper = this.dbHelper;
            String[] arrstring = new String[]{oSInAppMessage.messageId};
            if (oneSignalDbHelper.update("in_app_message", contentValues, "message_id = ?", arrstring) == 0) {
                this.dbHelper.insert("in_app_message", null, contentValues);
            }
            return;
        }
    }
}

