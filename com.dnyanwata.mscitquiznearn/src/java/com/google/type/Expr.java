/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.type.Expr$1
 *  com.google.type.ExprOrBuilder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.type.Expr;
import com.google.type.ExprOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Expr
extends GeneratedMessageLite<Expr, Builder>
implements ExprOrBuilder {
    private static final Expr DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXPRESSION_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 4;
    private static volatile Parser<Expr> PARSER;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String description_ = "";
    private String expression_ = "";
    private String location_ = "";
    private String title_ = "";

    static {
        Expr expr;
        DEFAULT_INSTANCE = expr = new Expr();
        GeneratedMessageLite.registerDefaultInstance(Expr.class, (GeneratedMessageLite)expr);
    }

    private Expr() {
    }

    private void clearDescription() {
        this.description_ = Expr.getDefaultInstance().getDescription();
    }

    private void clearExpression() {
        this.expression_ = Expr.getDefaultInstance().getExpression();
    }

    private void clearLocation() {
        this.location_ = Expr.getDefaultInstance().getLocation();
    }

    private void clearTitle() {
        this.title_ = Expr.getDefaultInstance().getTitle();
    }

    public static Expr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Expr expr) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)expr);
    }

    public static Expr parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Expr)Expr.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Expr parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Expr)Expr.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Expr parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Expr parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Expr parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Expr parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Expr parseFrom(InputStream inputStream) throws IOException {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Expr parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Expr parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Expr parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Expr parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Expr parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Expr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDescription(String string) {
        string.getClass();
        this.description_ = string;
    }

    private void setDescriptionBytes(ByteString byteString) {
        Expr.checkByteStringIsUtf8((ByteString)byteString);
        this.description_ = byteString.toStringUtf8();
    }

    private void setExpression(String string) {
        string.getClass();
        this.expression_ = string;
    }

    private void setExpressionBytes(ByteString byteString) {
        Expr.checkByteStringIsUtf8((ByteString)byteString);
        this.expression_ = byteString.toStringUtf8();
    }

    private void setLocation(String string) {
        string.getClass();
        this.location_ = string;
    }

    private void setLocationBytes(ByteString byteString) {
        Expr.checkByteStringIsUtf8((ByteString)byteString);
        this.location_ = byteString.toStringUtf8();
    }

    private void setTitle(String string) {
        string.getClass();
        this.title_ = string;
    }

    private void setTitleBytes(ByteString byteString) {
        Expr.checkByteStringIsUtf8((ByteString)byteString);
        this.title_ = byteString.toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
        switch (1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 7: {
                return null;
            }
            case 6: {
                return (byte)1;
            }
            case 5: {
                Parser<Expr> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Expr> class_ = Expr.class;
                synchronized (Expr.class) {
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        PARSER = defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                    }
                    // ** MonitorExit[var8_5] (shouldn't be in output)
                    return defaultInstanceBasedParser;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                Object[] arrobject = new Object[]{"expression_", "title_", "description_", "location_"};
                return Expr.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Expr();
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8((String)this.description_);
    }

    public String getExpression() {
        return this.expression_;
    }

    public ByteString getExpressionBytes() {
        return ByteString.copyFromUtf8((String)this.expression_);
    }

    public String getLocation() {
        return this.location_;
    }

    public ByteString getLocationBytes() {
        return ByteString.copyFromUtf8((String)this.location_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8((String)this.title_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Expr, Builder>
    implements ExprOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDescription() {
            this.copyOnWrite();
            ((Expr)this.instance).clearDescription();
            return this;
        }

        public Builder clearExpression() {
            this.copyOnWrite();
            ((Expr)this.instance).clearExpression();
            return this;
        }

        public Builder clearLocation() {
            this.copyOnWrite();
            ((Expr)this.instance).clearLocation();
            return this;
        }

        public Builder clearTitle() {
            this.copyOnWrite();
            ((Expr)this.instance).clearTitle();
            return this;
        }

        public String getDescription() {
            return ((Expr)this.instance).getDescription();
        }

        public ByteString getDescriptionBytes() {
            return ((Expr)this.instance).getDescriptionBytes();
        }

        public String getExpression() {
            return ((Expr)this.instance).getExpression();
        }

        public ByteString getExpressionBytes() {
            return ((Expr)this.instance).getExpressionBytes();
        }

        public String getLocation() {
            return ((Expr)this.instance).getLocation();
        }

        public ByteString getLocationBytes() {
            return ((Expr)this.instance).getLocationBytes();
        }

        public String getTitle() {
            return ((Expr)this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Expr)this.instance).getTitleBytes();
        }

        public Builder setDescription(String string) {
            this.copyOnWrite();
            ((Expr)this.instance).setDescription(string);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Expr)this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setExpression(String string) {
            this.copyOnWrite();
            ((Expr)this.instance).setExpression(string);
            return this;
        }

        public Builder setExpressionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Expr)this.instance).setExpressionBytes(byteString);
            return this;
        }

        public Builder setLocation(String string) {
            this.copyOnWrite();
            ((Expr)this.instance).setLocation(string);
            return this;
        }

        public Builder setLocationBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Expr)this.instance).setLocationBytes(byteString);
            return this;
        }

        public Builder setTitle(String string) {
            this.copyOnWrite();
            ((Expr)this.instance).setTitle(string);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Expr)this.instance).setTitleBytes(byteString);
            return this;
        }
    }

}

