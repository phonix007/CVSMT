package android.support.p000v4.media.session;

import android.media.session.MediaSession;
import android.support.annotation.RequiresApi;

@RequiresApi(22)
/* renamed from: android.support.v4.media.session.MediaSessionCompatApi22 */
class MediaSessionCompatApi22 {
    public static void setRatingType(Object obj, int i) {
        ((MediaSession) obj).setRatingType(i);
    }

    private MediaSessionCompatApi22() {
    }
}
