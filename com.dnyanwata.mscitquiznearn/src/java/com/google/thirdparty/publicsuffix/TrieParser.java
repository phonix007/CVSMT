/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Lists
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package com.google.thirdparty.publicsuffix;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.thirdparty.publicsuffix.PublicSuffixType;
import java.util.List;

final class TrieParser {
    private static final Joiner PREFIX_JOINER = Joiner.on((String)"");

    TrieParser() {
    }

    private static int doParseTrieToBuilder(List<CharSequence> list, CharSequence charSequence, int n, ImmutableMap.Builder<String, PublicSuffixType> builder) {
        int n2;
        String string;
        int n3 = charSequence.length();
        char c = '\u0000';
        for (n2 = n; n2 < n3 && (c = charSequence.charAt(n2)) != '&' && c != '?' && c != '!' && c != ':' && c != ','; ++n2) {
        }
        list.add(0, (Object)TrieParser.reverse(charSequence.subSequence(n, n2)));
        if ((c == '!' || c == '?' || c == ':' || c == ',') && (string = PREFIX_JOINER.join(list)).length() > 0) {
            builder.put((Object)string, (Object)PublicSuffixType.fromCode(c));
        }
        int n4 = n2 + 1;
        if (c != '?' && c != ',') {
            while (n4 < n3) {
                if (charSequence.charAt(n4 += TrieParser.doParseTrieToBuilder(list, charSequence, n4, builder)) != '?' && charSequence.charAt(n4) != ',') continue;
                ++n4;
                break;
            }
        }
        list.remove(0);
        return n4 - n;
    }

    static ImmutableMap<String, PublicSuffixType> parseTrie(CharSequence charSequence) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int n = charSequence.length();
        for (int i = 0; i < n; i += TrieParser.doParseTrieToBuilder((List<CharSequence>)Lists.newLinkedList(), (CharSequence)charSequence, (int)i, (ImmutableMap.Builder<String, PublicSuffixType>)builder)) {
        }
        return builder.build();
    }

    private static CharSequence reverse(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }
}

