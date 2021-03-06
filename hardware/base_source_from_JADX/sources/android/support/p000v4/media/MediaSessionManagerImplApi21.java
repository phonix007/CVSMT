package android.support.p000v4.media;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.p000v4.media.MediaSessionManager;

@RequiresApi(21)
/* renamed from: android.support.v4.media.MediaSessionManagerImplApi21 */
class MediaSessionManagerImplApi21 extends MediaSessionManagerImplBase {
    MediaSessionManagerImplApi21(Context context) {
        super(context);
        this.mContext = context;
    }

    public boolean isTrustedForMediaControl(@NonNull MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        return hasMediaControlPermission(remoteUserInfoImpl) || super.isTrustedForMediaControl(remoteUserInfoImpl);
    }

    private boolean hasMediaControlPermission(@NonNull MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        return getContext().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", remoteUserInfoImpl.getPid(), remoteUserInfoImpl.getUid()) == 0;
    }
}
