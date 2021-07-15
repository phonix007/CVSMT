/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.thirdparty.publicsuffix;

public final class PublicSuffixType
extends Enum<PublicSuffixType> {
    private static final /* synthetic */ PublicSuffixType[] $VALUES;
    public static final /* enum */ PublicSuffixType PRIVATE;
    public static final /* enum */ PublicSuffixType REGISTRY;
    private final char innerNodeCode;
    private final char leafNodeCode;

    static {
        PublicSuffixType publicSuffixType;
        PublicSuffixType publicSuffixType2;
        PRIVATE = publicSuffixType = new PublicSuffixType(':', ',');
        REGISTRY = publicSuffixType2 = new PublicSuffixType('!', '?');
        $VALUES = new PublicSuffixType[]{publicSuffixType, publicSuffixType2};
    }

    private PublicSuffixType(char c, char c2) {
        this.innerNodeCode = c;
        this.leafNodeCode = c2;
    }

    static PublicSuffixType fromCode(char c) {
        for (PublicSuffixType publicSuffixType : PublicSuffixType.values()) {
            if (publicSuffixType.getInnerNodeCode() != c) {
                if (publicSuffixType.getLeafNodeCode() != c) continue;
                return publicSuffixType;
            }
            return publicSuffixType;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No enum corresponding to given code: ");
        stringBuilder.append(c);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static PublicSuffixType fromIsPrivate(boolean bl) {
        if (bl) {
            return PRIVATE;
        }
        return REGISTRY;
    }

    public static PublicSuffixType valueOf(String string) {
        return (PublicSuffixType)Enum.valueOf(PublicSuffixType.class, (String)string);
    }

    public static PublicSuffixType[] values() {
        return (PublicSuffixType[])$VALUES.clone();
    }

    char getInnerNodeCode() {
        return this.innerNodeCode;
    }

    char getLeafNodeCode() {
        return this.leafNodeCode;
    }
}

