/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OSLogger
 *  com.onesignal.OSSharedPreferences
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package com.onesignal.outcomes.data;

import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OneSignalAPIClient;
import com.onesignal.OneSignalDb;
import com.onesignal.outcomes.data.OSOutcomeEventsCache;
import com.onesignal.outcomes.data.OSOutcomeEventsRepository;
import com.onesignal.outcomes.data.OSOutcomeEventsV1Repository;
import com.onesignal.outcomes.data.OSOutcomeEventsV1Service;
import com.onesignal.outcomes.data.OSOutcomeEventsV2Repository;
import com.onesignal.outcomes.data.OSOutcomeEventsV2Service;
import com.onesignal.outcomes.data.OutcomeEventsService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv={1, 0, 3}, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u000eJ\b\u0010\u0012\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2={"Lcom/onesignal/outcomes/data/OSOutcomeEventsFactory;", "", "logger", "Lcom/onesignal/OSLogger;", "apiClient", "Lcom/onesignal/OneSignalAPIClient;", "dbHelper", "Lcom/onesignal/OneSignalDb;", "preferences", "Lcom/onesignal/OSSharedPreferences;", "(Lcom/onesignal/OSLogger;Lcom/onesignal/OneSignalAPIClient;Lcom/onesignal/OneSignalDb;Lcom/onesignal/OSSharedPreferences;)V", "outcomeEventsCache", "Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;", "repository", "Lcom/onesignal/outcomes/domain/OSOutcomeEventsRepository;", "createRepository", "Lcom/onesignal/outcomes/data/OSOutcomeEventsRepository;", "getRepository", "validateRepositoryVersion", "onesignal_release"}, k=1, mv={1, 1, 16})
public final class OSOutcomeEventsFactory {
    private final OneSignalAPIClient apiClient;
    private final OSLogger logger;
    private final OSOutcomeEventsCache outcomeEventsCache;
    private com.onesignal.outcomes.domain.OSOutcomeEventsRepository repository;

    public OSOutcomeEventsFactory(OSLogger oSLogger, OneSignalAPIClient oneSignalAPIClient, OneSignalDb oneSignalDb, OSSharedPreferences oSSharedPreferences) {
        Intrinsics.checkParameterIsNotNull((Object)oSLogger, (String)"logger");
        Intrinsics.checkParameterIsNotNull((Object)oneSignalAPIClient, (String)"apiClient");
        this.logger = oSLogger;
        this.apiClient = oneSignalAPIClient;
        if (oneSignalDb == null) {
            Intrinsics.throwNpe();
        }
        if (oSSharedPreferences == null) {
            Intrinsics.throwNpe();
        }
        this.outcomeEventsCache = new OSOutcomeEventsCache(oSLogger, oneSignalDb, oSSharedPreferences);
    }

    private final OSOutcomeEventsRepository createRepository() {
        if (this.outcomeEventsCache.isOutcomesV2ServiceEnabled()) {
            return new OSOutcomeEventsV2Repository(this.logger, this.outcomeEventsCache, new OSOutcomeEventsV2Service(this.apiClient));
        }
        return new OSOutcomeEventsV1Repository(this.logger, this.outcomeEventsCache, new OSOutcomeEventsV1Service(this.apiClient));
    }

    private final com.onesignal.outcomes.domain.OSOutcomeEventsRepository validateRepositoryVersion() {
        com.onesignal.outcomes.domain.OSOutcomeEventsRepository oSOutcomeEventsRepository;
        com.onesignal.outcomes.domain.OSOutcomeEventsRepository oSOutcomeEventsRepository2;
        if (!this.outcomeEventsCache.isOutcomesV2ServiceEnabled() && (oSOutcomeEventsRepository2 = this.repository) instanceof OSOutcomeEventsV1Repository) {
            if (oSOutcomeEventsRepository2 == null) {
                Intrinsics.throwNpe();
            }
            return oSOutcomeEventsRepository2;
        }
        if (this.outcomeEventsCache.isOutcomesV2ServiceEnabled() && (oSOutcomeEventsRepository = this.repository) instanceof OSOutcomeEventsV2Repository) {
            if (oSOutcomeEventsRepository == null) {
                Intrinsics.throwNpe();
            }
            return oSOutcomeEventsRepository;
        }
        return this.createRepository();
    }

    public final com.onesignal.outcomes.domain.OSOutcomeEventsRepository getRepository() {
        if (this.repository != null) {
            return this.validateRepositoryVersion();
        }
        return this.createRepository();
    }
}

