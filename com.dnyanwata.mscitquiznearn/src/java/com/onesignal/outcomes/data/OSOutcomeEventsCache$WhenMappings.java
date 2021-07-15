/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  kotlin.Metadata
 */
package com.onesignal.outcomes.data;

import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, k=3, mv={1, 1, 16})
public final class OSOutcomeEventsCache$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static /* synthetic */ {
        int[] arrn = new int[OSInfluenceType.values().length];
        $EnumSwitchMapping$0 = arrn;
        arrn[OSInfluenceType.DIRECT.ordinal()] = 1;
        arrn[OSInfluenceType.INDIRECT.ordinal()] = 2;
        int[] arrn2 = new int[OSInfluenceType.values().length];
        $EnumSwitchMapping$1 = arrn2;
        arrn2[OSInfluenceType.DIRECT.ordinal()] = 1;
        arrn2[OSInfluenceType.INDIRECT.ordinal()] = 2;
    }
}

