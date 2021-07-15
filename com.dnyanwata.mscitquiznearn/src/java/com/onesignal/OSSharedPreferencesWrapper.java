/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OSSharedPreferences
 *  com.onesignal.OneSignalPrefs
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Set
 */
package com.onesignal;

import com.onesignal.OSSharedPreferences;
import com.onesignal.OneSignalPrefs;
import java.util.Set;

class OSSharedPreferencesWrapper
implements OSSharedPreferences {
    OSSharedPreferencesWrapper() {
    }

    public boolean getBool(String string2, String string3, boolean bl) {
        return OneSignalPrefs.getBool((String)string2, (String)string3, (boolean)bl);
    }

    public int getInt(String string2, String string3, int n) {
        return OneSignalPrefs.getInt((String)string2, (String)string3, (int)n);
    }

    public long getLong(String string2, String string3, long l) {
        return OneSignalPrefs.getLong((String)string2, (String)string3, (long)l);
    }

    public Object getObject(String string2, String string3, Object object) {
        return OneSignalPrefs.getObject((String)string2, (String)string3, (Object)object);
    }

    public String getOutcomesV2KeyName() {
        return "PREFS_OS_OUTCOMES_V2";
    }

    public String getPreferencesName() {
        return OneSignalPrefs.PREFS_ONESIGNAL;
    }

    public String getString(String string2, String string3, String string4) {
        return OneSignalPrefs.getString((String)string2, (String)string3, (String)string4);
    }

    public Set<String> getStringSet(String string2, String string3, Set<String> set) {
        return OneSignalPrefs.getStringSet((String)string2, (String)string3, set);
    }

    public void saveBool(String string2, String string3, boolean bl) {
        OneSignalPrefs.saveBool((String)string2, (String)string3, (boolean)bl);
    }

    public void saveInt(String string2, String string3, int n) {
        OneSignalPrefs.saveInt((String)string2, (String)string3, (int)n);
    }

    public void saveLong(String string2, String string3, long l) {
        OneSignalPrefs.saveLong((String)string2, (String)string3, (long)l);
    }

    public void saveObject(String string2, String string3, Object object) {
        OneSignalPrefs.saveObject((String)string2, (String)string3, (Object)object);
    }

    public void saveString(String string2, String string3, String string4) {
        OneSignalPrefs.saveString((String)string2, (String)string3, (String)string4);
    }

    public void saveStringSet(String string2, String string3, Set<String> set) {
        OneSignalPrefs.saveStringSet((String)string2, (String)string3, set);
    }
}

