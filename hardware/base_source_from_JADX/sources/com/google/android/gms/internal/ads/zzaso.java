package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzark
@SafeParcelable.Class(creator = "AutoClickProtectionConfigurationParcelCreator")
@SafeParcelable.Reserved({1})
@ParametersAreNonnullByDefault
public final class zzaso extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaso> CREATOR = new zzasp();
    @SafeParcelable.Field(mo8233id = 2)
    public final boolean zzdzg;
    @Nullable
    @SafeParcelable.Field(mo8233id = 3)
    public final List<String> zzdzh;

    public zzaso() {
        this(false, Collections.emptyList());
    }

    @SafeParcelable.Constructor
    public zzaso(@SafeParcelable.Param(mo8236id = 2) boolean z, @SafeParcelable.Param(mo8236id = 3) List<String> list) {
        this.zzdzg = z;
        this.zzdzh = list;
    }

    @Nullable
    public static zzaso zzl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new zzaso();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (JSONException e) {
                    zzaxz.zzc("Error grabbing url from json.", e);
                }
            }
        }
        return new zzaso(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzdzg);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzdzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
