/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  io.grpc.Metadata
 *  io.grpc.MethodDescriptor
 *  io.grpc.MethodDescriptor$Marshaller
 *  io.grpc.Status
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 */
package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ClientInterceptors;
import io.grpc.ForwardingClientCall;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ClientInterceptors {
    private static final ClientCall<Object, Object> NOOP_CALL = new ClientCall<Object, Object>(){

        public void cancel(String string2, Throwable throwable) {
        }

        public void halfClose() {
        }

        public boolean isReady() {
            return false;
        }

        public void request(int n) {
        }

        public void sendMessage(Object object) {
        }

        public void start(ClientCall.Listener<Object> listener, Metadata metadata) {
        }
    };

    private ClientInterceptors() {
    }

    public static Channel intercept(Channel channel, List<? extends ClientInterceptor> list) {
        Preconditions.checkNotNull((Object)channel, (Object)"channel");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            channel = new Channel(channel, (ClientInterceptor)iterator.next()){
                private final Channel channel;
                private final ClientInterceptor interceptor;
                {
                    this.channel = channel;
                    this.interceptor = (ClientInterceptor)Preconditions.checkNotNull((Object)clientInterceptor, (Object)"interceptor");
                }

                @Override
                public String authority() {
                    return this.channel.authority();
                }

                public <ReqT, RespT> ClientCall<ReqT, RespT> newCall(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions) {
                    return this.interceptor.interceptCall(methodDescriptor, callOptions, this.channel);
                }
            };
        }
        return channel;
    }

    public static /* varargs */ Channel intercept(Channel channel, ClientInterceptor ... arrclientInterceptor) {
        return ClientInterceptors.intercept(channel, (List<? extends ClientInterceptor>)Arrays.asList((Object[])arrclientInterceptor));
    }

    public static Channel interceptForward(Channel channel, List<? extends ClientInterceptor> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse((List)arrayList);
        return ClientInterceptors.intercept(channel, (List<? extends ClientInterceptor>)arrayList);
    }

    public static /* varargs */ Channel interceptForward(Channel channel, ClientInterceptor ... arrclientInterceptor) {
        return ClientInterceptors.interceptForward(channel, (List<? extends ClientInterceptor>)Arrays.asList((Object[])arrclientInterceptor));
    }

    static <WReqT, WRespT> ClientInterceptor wrapClientInterceptor(ClientInterceptor clientInterceptor, MethodDescriptor.Marshaller<WReqT> marshaller, MethodDescriptor.Marshaller<WRespT> marshaller2) {
        return new ClientInterceptor(marshaller, marshaller2, clientInterceptor){
            final /* synthetic */ ClientInterceptor val$interceptor;
            final /* synthetic */ MethodDescriptor.Marshaller val$reqMarshaller;
            final /* synthetic */ MethodDescriptor.Marshaller val$respMarshaller;
            {
                this.val$reqMarshaller = marshaller;
                this.val$respMarshaller = marshaller2;
                this.val$interceptor = clientInterceptor;
            }

            public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel) {
                MethodDescriptor methodDescriptor2 = methodDescriptor.toBuilder(this.val$reqMarshaller, this.val$respMarshaller).build();
                return new io.grpc.PartialForwardingClientCall<ReqT, RespT>(this, this.val$interceptor.interceptCall(methodDescriptor2, callOptions, channel), methodDescriptor){
                    final /* synthetic */ 1 this$0;
                    final /* synthetic */ MethodDescriptor val$method;
                    final /* synthetic */ ClientCall val$wrappedCall;
                    {
                        this.this$0 = var1_1;
                        this.val$wrappedCall = clientCall;
                        this.val$method = methodDescriptor;
                    }

                    protected ClientCall<?, ?> delegate() {
                        return this.val$wrappedCall;
                    }

                    public void sendMessage(ReqT ReqT) {
                        java.io.InputStream inputStream = this.val$method.getRequestMarshaller().stream(ReqT);
                        Object object = this.this$0.val$reqMarshaller.parse(inputStream);
                        this.val$wrappedCall.sendMessage(object);
                    }

                    public void start(ClientCall.Listener<RespT> listener, Metadata metadata) {
                        this.val$wrappedCall.start(new io.grpc.PartialForwardingClientCallListener<WRespT>(this, listener){
                            final /* synthetic */ io.grpc.ClientInterceptors$1$1 this$1;
                            final /* synthetic */ ClientCall.Listener val$responseListener;
                            {
                                this.this$1 = var1_1;
                                this.val$responseListener = listener;
                            }

                            protected ClientCall.Listener<?> delegate() {
                                return this.val$responseListener;
                            }

                            public void onMessage(WRespT WRespT) {
                                java.io.InputStream inputStream = this.this$1.this$0.val$respMarshaller.stream(WRespT);
                                Object object = this.this$1.val$method.getResponseMarshaller().parse(inputStream);
                                this.val$responseListener.onMessage(object);
                            }
                        }, metadata);
                    }
                };
            }
        };
    }

}

