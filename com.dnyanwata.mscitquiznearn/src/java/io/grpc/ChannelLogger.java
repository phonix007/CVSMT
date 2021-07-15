/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package io.grpc;

public abstract class ChannelLogger {
    public abstract void log(ChannelLogLevel var1, String var2);

    public /* varargs */ abstract void log(ChannelLogLevel var1, String var2, Object ... var3);

    public static final class ChannelLogLevel
    extends Enum<ChannelLogLevel> {
        private static final /* synthetic */ ChannelLogLevel[] $VALUES;
        public static final /* enum */ ChannelLogLevel DEBUG;
        public static final /* enum */ ChannelLogLevel ERROR;
        public static final /* enum */ ChannelLogLevel INFO;
        public static final /* enum */ ChannelLogLevel WARNING;

        static {
            ChannelLogLevel channelLogLevel;
            ChannelLogLevel channelLogLevel2;
            ChannelLogLevel channelLogLevel3;
            ChannelLogLevel channelLogLevel4;
            DEBUG = channelLogLevel3 = new ChannelLogLevel();
            INFO = channelLogLevel = new ChannelLogLevel();
            WARNING = channelLogLevel2 = new ChannelLogLevel();
            ERROR = channelLogLevel4 = new ChannelLogLevel();
            $VALUES = new ChannelLogLevel[]{channelLogLevel3, channelLogLevel, channelLogLevel2, channelLogLevel4};
        }

        public static ChannelLogLevel valueOf(String string2) {
            return (ChannelLogLevel)Enum.valueOf(ChannelLogLevel.class, (String)string2);
        }

        public static ChannelLogLevel[] values() {
            return (ChannelLogLevel[])$VALUES.clone();
        }
    }

}

