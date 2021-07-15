/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.BatchGetDocumentsRequest
 *  com.google.firestore.v1.BatchGetDocumentsResponse
 *  com.google.firestore.v1.BeginTransactionRequest
 *  com.google.firestore.v1.BeginTransactionResponse
 *  com.google.firestore.v1.CommitRequest
 *  com.google.firestore.v1.CommitResponse
 *  com.google.firestore.v1.CreateDocumentRequest
 *  com.google.firestore.v1.DeleteDocumentRequest
 *  com.google.firestore.v1.Document
 *  com.google.firestore.v1.FirestoreGrpc$FirestoreBlockingStub
 *  com.google.firestore.v1.FirestoreGrpc$FirestoreFutureStub
 *  com.google.firestore.v1.FirestoreGrpc$FirestoreStub
 *  com.google.firestore.v1.FirestoreGrpc$MethodHandlers
 *  com.google.firestore.v1.GetDocumentRequest
 *  com.google.firestore.v1.ListCollectionIdsRequest
 *  com.google.firestore.v1.ListCollectionIdsResponse
 *  com.google.firestore.v1.ListDocumentsRequest
 *  com.google.firestore.v1.ListDocumentsResponse
 *  com.google.firestore.v1.ListenRequest
 *  com.google.firestore.v1.ListenResponse
 *  com.google.firestore.v1.RollbackRequest
 *  com.google.firestore.v1.RunQueryRequest
 *  com.google.firestore.v1.RunQueryResponse
 *  com.google.firestore.v1.UpdateDocumentRequest
 *  com.google.firestore.v1.WriteRequest
 *  com.google.firestore.v1.WriteResponse
 *  com.google.protobuf.Empty
 *  com.google.protobuf.MessageLite
 *  io.grpc.MethodDescriptor
 *  io.grpc.MethodDescriptor$Builder
 *  io.grpc.MethodDescriptor$Marshaller
 *  io.grpc.MethodDescriptor$MethodType
 *  io.grpc.ServerCallHandler
 *  io.grpc.ServerServiceDefinition
 *  io.grpc.ServerServiceDefinition$Builder
 *  io.grpc.ServiceDescriptor
 *  io.grpc.ServiceDescriptor$Builder
 *  io.grpc.protobuf.lite.ProtoLiteUtils
 *  io.grpc.stub.AbstractStub
 *  io.grpc.stub.AbstractStub$StubFactory
 *  io.grpc.stub.ServerCalls
 *  io.grpc.stub.ServerCalls$BidiStreamingMethod
 *  io.grpc.stub.ServerCalls$ServerStreamingMethod
 *  io.grpc.stub.ServerCalls$UnaryMethod
 *  io.grpc.stub.StreamObserver
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firestore.v1;

import com.google.firestore.v1.BatchGetDocumentsRequest;
import com.google.firestore.v1.BatchGetDocumentsResponse;
import com.google.firestore.v1.BeginTransactionRequest;
import com.google.firestore.v1.BeginTransactionResponse;
import com.google.firestore.v1.CommitRequest;
import com.google.firestore.v1.CommitResponse;
import com.google.firestore.v1.CreateDocumentRequest;
import com.google.firestore.v1.DeleteDocumentRequest;
import com.google.firestore.v1.Document;
import com.google.firestore.v1.FirestoreGrpc;
import com.google.firestore.v1.GetDocumentRequest;
import com.google.firestore.v1.ListCollectionIdsRequest;
import com.google.firestore.v1.ListCollectionIdsResponse;
import com.google.firestore.v1.ListDocumentsRequest;
import com.google.firestore.v1.ListDocumentsResponse;
import com.google.firestore.v1.ListenRequest;
import com.google.firestore.v1.ListenResponse;
import com.google.firestore.v1.RollbackRequest;
import com.google.firestore.v1.RunQueryRequest;
import com.google.firestore.v1.RunQueryResponse;
import com.google.firestore.v1.UpdateDocumentRequest;
import com.google.firestore.v1.WriteRequest;
import com.google.firestore.v1.WriteResponse;
import com.google.protobuf.Empty;
import com.google.protobuf.MessageLite;
import io.grpc.BindableService;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.MethodDescriptor;
import io.grpc.ServerCallHandler;
import io.grpc.ServerServiceDefinition;
import io.grpc.ServiceDescriptor;
import io.grpc.protobuf.lite.ProtoLiteUtils;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.ServerCalls;
import io.grpc.stub.StreamObserver;

/*
 * Exception performing whole class analysis ignored.
 */
public final class FirestoreGrpc {
    private static final int METHODID_BATCH_GET_DOCUMENTS = 5;
    private static final int METHODID_BEGIN_TRANSACTION = 6;
    private static final int METHODID_COMMIT = 7;
    private static final int METHODID_CREATE_DOCUMENT = 2;
    private static final int METHODID_DELETE_DOCUMENT = 4;
    private static final int METHODID_GET_DOCUMENT = 0;
    private static final int METHODID_LISTEN = 12;
    private static final int METHODID_LIST_COLLECTION_IDS = 10;
    private static final int METHODID_LIST_DOCUMENTS = 1;
    private static final int METHODID_ROLLBACK = 8;
    private static final int METHODID_RUN_QUERY = 9;
    private static final int METHODID_UPDATE_DOCUMENT = 3;
    private static final int METHODID_WRITE = 11;
    public static final String SERVICE_NAME = "google.firestore.v1.Firestore";
    private static volatile MethodDescriptor<BatchGetDocumentsRequest, BatchGetDocumentsResponse> getBatchGetDocumentsMethod;
    private static volatile MethodDescriptor<BeginTransactionRequest, BeginTransactionResponse> getBeginTransactionMethod;
    private static volatile MethodDescriptor<CommitRequest, CommitResponse> getCommitMethod;
    private static volatile MethodDescriptor<CreateDocumentRequest, Document> getCreateDocumentMethod;
    private static volatile MethodDescriptor<DeleteDocumentRequest, Empty> getDeleteDocumentMethod;
    private static volatile MethodDescriptor<GetDocumentRequest, Document> getGetDocumentMethod;
    private static volatile MethodDescriptor<ListCollectionIdsRequest, ListCollectionIdsResponse> getListCollectionIdsMethod;
    private static volatile MethodDescriptor<ListDocumentsRequest, ListDocumentsResponse> getListDocumentsMethod;
    private static volatile MethodDescriptor<ListenRequest, ListenResponse> getListenMethod;
    private static volatile MethodDescriptor<RollbackRequest, Empty> getRollbackMethod;
    private static volatile MethodDescriptor<RunQueryRequest, RunQueryResponse> getRunQueryMethod;
    private static volatile MethodDescriptor<UpdateDocumentRequest, Document> getUpdateDocumentMethod;
    private static volatile MethodDescriptor<WriteRequest, WriteResponse> getWriteMethod;
    private static volatile ServiceDescriptor serviceDescriptor;

    private FirestoreGrpc() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<BatchGetDocumentsRequest, BatchGetDocumentsResponse> getBatchGetDocumentsMethod() {
        MethodDescriptor<BatchGetDocumentsRequest, BatchGetDocumentsResponse> methodDescriptor = getBatchGetDocumentsMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor methodDescriptor2 = getBatchGetDocumentsMethod;
            if (methodDescriptor2 == null) {
                getBatchGetDocumentsMethod = methodDescriptor2 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.SERVER_STREAMING).setFullMethodName(MethodDescriptor.generateFullMethodName((String)"google.firestore.v1.Firestore", (String)"BatchGetDocuments")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)BatchGetDocumentsRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)BatchGetDocumentsResponse.getDefaultInstance())).build();
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return methodDescriptor2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<BeginTransactionRequest, BeginTransactionResponse> getBeginTransactionMethod() {
        MethodDescriptor<BeginTransactionRequest, BeginTransactionResponse> methodDescriptor = getBeginTransactionMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor methodDescriptor2 = getBeginTransactionMethod;
            if (methodDescriptor2 == null) {
                getBeginTransactionMethod = methodDescriptor2 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName((String)"google.firestore.v1.Firestore", (String)"BeginTransaction")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)BeginTransactionRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)BeginTransactionResponse.getDefaultInstance())).build();
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return methodDescriptor2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<CommitRequest, CommitResponse> getCommitMethod() {
        MethodDescriptor<CommitRequest, CommitResponse> methodDescriptor = getCommitMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor methodDescriptor2 = getCommitMethod;
            if (methodDescriptor2 == null) {
                getCommitMethod = methodDescriptor2 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName((String)"google.firestore.v1.Firestore", (String)"Commit")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)CommitRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)CommitResponse.getDefaultInstance())).build();
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return methodDescriptor2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<CreateDocumentRequest, Document> getCreateDocumentMethod() {
        MethodDescriptor<CreateDocumentRequest, Document> methodDescriptor = getCreateDocumentMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor methodDescriptor2 = getCreateDocumentMethod;
            if (methodDescriptor2 == null) {
                getCreateDocumentMethod = methodDescriptor2 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName((String)"google.firestore.v1.Firestore", (String)"CreateDocument")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)CreateDocumentRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)Document.getDefaultInstance())).build();
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return methodDescriptor2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<DeleteDocumentRequest, Empty> getDeleteDocumentMethod() {
        MethodDescriptor<DeleteDocumentRequest, Empty> methodDescriptor = getDeleteDocumentMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor methodDescriptor2 = getDeleteDocumentMethod;
            if (methodDescriptor2 == null) {
                getDeleteDocumentMethod = methodDescriptor2 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName((String)"google.firestore.v1.Firestore", (String)"DeleteDocument")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)DeleteDocumentRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)Empty.getDefaultInstance())).build();
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return methodDescriptor2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<GetDocumentRequest, Document> getGetDocumentMethod() {
        MethodDescriptor<GetDocumentRequest, Document> methodDescriptor = getGetDocumentMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor methodDescriptor2 = getGetDocumentMethod;
            if (methodDescriptor2 == null) {
                getGetDocumentMethod = methodDescriptor2 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName((String)"google.firestore.v1.Firestore", (String)"GetDocument")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)GetDocumentRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)Document.getDefaultInstance())).build();
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return methodDescriptor2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<ListCollectionIdsRequest, ListCollectionIdsResponse> getListCollectionIdsMethod() {
        MethodDescriptor<ListCollectionIdsRequest, ListCollectionIdsResponse> methodDescriptor = getListCollectionIdsMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor methodDescriptor2 = getListCollectionIdsMethod;
            if (methodDescriptor2 == null) {
                getListCollectionIdsMethod = methodDescriptor2 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName((String)"google.firestore.v1.Firestore", (String)"ListCollectionIds")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)ListCollectionIdsRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)ListCollectionIdsResponse.getDefaultInstance())).build();
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return methodDescriptor2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<ListDocumentsRequest, ListDocumentsResponse> getListDocumentsMethod() {
        MethodDescriptor<ListDocumentsRequest, ListDocumentsResponse> methodDescriptor = getListDocumentsMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor methodDescriptor2 = getListDocumentsMethod;
            if (methodDescriptor2 == null) {
                getListDocumentsMethod = methodDescriptor2 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName((String)"google.firestore.v1.Firestore", (String)"ListDocuments")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)ListDocumentsRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)ListDocumentsResponse.getDefaultInstance())).build();
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return methodDescriptor2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<ListenRequest, ListenResponse> getListenMethod() {
        MethodDescriptor<ListenRequest, ListenResponse> methodDescriptor = getListenMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor methodDescriptor2 = getListenMethod;
            if (methodDescriptor2 == null) {
                getListenMethod = methodDescriptor2 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.BIDI_STREAMING).setFullMethodName(MethodDescriptor.generateFullMethodName((String)"google.firestore.v1.Firestore", (String)"Listen")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)ListenRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)ListenResponse.getDefaultInstance())).build();
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return methodDescriptor2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<RollbackRequest, Empty> getRollbackMethod() {
        MethodDescriptor<RollbackRequest, Empty> methodDescriptor = getRollbackMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor methodDescriptor2 = getRollbackMethod;
            if (methodDescriptor2 == null) {
                getRollbackMethod = methodDescriptor2 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName((String)"google.firestore.v1.Firestore", (String)"Rollback")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)RollbackRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)Empty.getDefaultInstance())).build();
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return methodDescriptor2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<RunQueryRequest, RunQueryResponse> getRunQueryMethod() {
        MethodDescriptor<RunQueryRequest, RunQueryResponse> methodDescriptor = getRunQueryMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor methodDescriptor2 = getRunQueryMethod;
            if (methodDescriptor2 == null) {
                getRunQueryMethod = methodDescriptor2 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.SERVER_STREAMING).setFullMethodName(MethodDescriptor.generateFullMethodName((String)"google.firestore.v1.Firestore", (String)"RunQuery")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)RunQueryRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)RunQueryResponse.getDefaultInstance())).build();
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return methodDescriptor2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ServiceDescriptor getServiceDescriptor() {
        ServiceDescriptor serviceDescriptor = FirestoreGrpc.serviceDescriptor;
        if (serviceDescriptor != null) {
            return serviceDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            ServiceDescriptor serviceDescriptor2 = FirestoreGrpc.serviceDescriptor;
            if (serviceDescriptor2 == null) {
                FirestoreGrpc.serviceDescriptor = serviceDescriptor2 = ServiceDescriptor.newBuilder((String)"google.firestore.v1.Firestore").addMethod(FirestoreGrpc.getGetDocumentMethod()).addMethod(FirestoreGrpc.getListDocumentsMethod()).addMethod(FirestoreGrpc.getCreateDocumentMethod()).addMethod(FirestoreGrpc.getUpdateDocumentMethod()).addMethod(FirestoreGrpc.getDeleteDocumentMethod()).addMethod(FirestoreGrpc.getBatchGetDocumentsMethod()).addMethod(FirestoreGrpc.getBeginTransactionMethod()).addMethod(FirestoreGrpc.getCommitMethod()).addMethod(FirestoreGrpc.getRollbackMethod()).addMethod(FirestoreGrpc.getRunQueryMethod()).addMethod(FirestoreGrpc.getWriteMethod()).addMethod(FirestoreGrpc.getListenMethod()).addMethod(FirestoreGrpc.getListCollectionIdsMethod()).build();
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return serviceDescriptor2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<UpdateDocumentRequest, Document> getUpdateDocumentMethod() {
        MethodDescriptor<UpdateDocumentRequest, Document> methodDescriptor = getUpdateDocumentMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor methodDescriptor2 = getUpdateDocumentMethod;
            if (methodDescriptor2 == null) {
                getUpdateDocumentMethod = methodDescriptor2 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName((String)"google.firestore.v1.Firestore", (String)"UpdateDocument")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)UpdateDocumentRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)Document.getDefaultInstance())).build();
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return methodDescriptor2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<WriteRequest, WriteResponse> getWriteMethod() {
        MethodDescriptor<WriteRequest, WriteResponse> methodDescriptor = getWriteMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor methodDescriptor2 = getWriteMethod;
            if (methodDescriptor2 == null) {
                getWriteMethod = methodDescriptor2 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.BIDI_STREAMING).setFullMethodName(MethodDescriptor.generateFullMethodName((String)"google.firestore.v1.Firestore", (String)"Write")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)WriteRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)WriteResponse.getDefaultInstance())).build();
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return methodDescriptor2;
        }
    }

    public static FirestoreBlockingStub newBlockingStub(Channel channel) {
        return FirestoreBlockingStub.newStub((AbstractStub.StubFactory)new AbstractStub.StubFactory<FirestoreBlockingStub>(){

            public FirestoreBlockingStub newStub(Channel channel, CallOptions callOptions) {
                return new /* Unavailable Anonymous Inner Class!! */;
            }
        }, (Channel)channel);
    }

    public static FirestoreFutureStub newFutureStub(Channel channel) {
        return FirestoreFutureStub.newStub((AbstractStub.StubFactory)new AbstractStub.StubFactory<FirestoreFutureStub>(){

            public FirestoreFutureStub newStub(Channel channel, CallOptions callOptions) {
                return new /* Unavailable Anonymous Inner Class!! */;
            }
        }, (Channel)channel);
    }

    public static FirestoreStub newStub(Channel channel) {
        return FirestoreStub.newStub((AbstractStub.StubFactory)new AbstractStub.StubFactory<FirestoreStub>(){

            public FirestoreStub newStub(Channel channel, CallOptions callOptions) {
                return new /* Unavailable Anonymous Inner Class!! */;
            }
        }, (Channel)channel);
    }

    /*
     * Exception performing whole class analysis.
     */
    public static abstract class FirestoreImplBase
    implements BindableService {
        public void batchGetDocuments(BatchGetDocumentsRequest batchGetDocumentsRequest, StreamObserver<BatchGetDocumentsResponse> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(FirestoreGrpc.getBatchGetDocumentsMethod(), streamObserver);
        }

        public void beginTransaction(BeginTransactionRequest beginTransactionRequest, StreamObserver<BeginTransactionResponse> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(FirestoreGrpc.getBeginTransactionMethod(), streamObserver);
        }

        @Override
        public final ServerServiceDefinition bindService() {
            return ServerServiceDefinition.builder((ServiceDescriptor)FirestoreGrpc.getServiceDescriptor()).addMethod(FirestoreGrpc.getGetDocumentMethod(), ServerCalls.asyncUnaryCall((ServerCalls.UnaryMethod)new /* Unavailable Anonymous Inner Class!! */)).addMethod(FirestoreGrpc.getListDocumentsMethod(), ServerCalls.asyncUnaryCall((ServerCalls.UnaryMethod)new /* Unavailable Anonymous Inner Class!! */)).addMethod(FirestoreGrpc.getCreateDocumentMethod(), ServerCalls.asyncUnaryCall((ServerCalls.UnaryMethod)new /* Unavailable Anonymous Inner Class!! */)).addMethod(FirestoreGrpc.getUpdateDocumentMethod(), ServerCalls.asyncUnaryCall((ServerCalls.UnaryMethod)new /* Unavailable Anonymous Inner Class!! */)).addMethod(FirestoreGrpc.getDeleteDocumentMethod(), ServerCalls.asyncUnaryCall((ServerCalls.UnaryMethod)new /* Unavailable Anonymous Inner Class!! */)).addMethod(FirestoreGrpc.getBatchGetDocumentsMethod(), ServerCalls.asyncServerStreamingCall((ServerCalls.ServerStreamingMethod)new /* Unavailable Anonymous Inner Class!! */)).addMethod(FirestoreGrpc.getBeginTransactionMethod(), ServerCalls.asyncUnaryCall((ServerCalls.UnaryMethod)new /* Unavailable Anonymous Inner Class!! */)).addMethod(FirestoreGrpc.getCommitMethod(), ServerCalls.asyncUnaryCall((ServerCalls.UnaryMethod)new /* Unavailable Anonymous Inner Class!! */)).addMethod(FirestoreGrpc.getRollbackMethod(), ServerCalls.asyncUnaryCall((ServerCalls.UnaryMethod)new /* Unavailable Anonymous Inner Class!! */)).addMethod(FirestoreGrpc.getRunQueryMethod(), ServerCalls.asyncServerStreamingCall((ServerCalls.ServerStreamingMethod)new /* Unavailable Anonymous Inner Class!! */)).addMethod(FirestoreGrpc.getWriteMethod(), ServerCalls.asyncBidiStreamingCall((ServerCalls.BidiStreamingMethod)new /* Unavailable Anonymous Inner Class!! */)).addMethod(FirestoreGrpc.getListenMethod(), ServerCalls.asyncBidiStreamingCall((ServerCalls.BidiStreamingMethod)new /* Unavailable Anonymous Inner Class!! */)).addMethod(FirestoreGrpc.getListCollectionIdsMethod(), ServerCalls.asyncUnaryCall((ServerCalls.UnaryMethod)new /* Unavailable Anonymous Inner Class!! */)).build();
        }

        public void commit(CommitRequest commitRequest, StreamObserver<CommitResponse> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(FirestoreGrpc.getCommitMethod(), streamObserver);
        }

        public void createDocument(CreateDocumentRequest createDocumentRequest, StreamObserver<Document> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(FirestoreGrpc.getCreateDocumentMethod(), streamObserver);
        }

        public void deleteDocument(DeleteDocumentRequest deleteDocumentRequest, StreamObserver<Empty> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(FirestoreGrpc.getDeleteDocumentMethod(), streamObserver);
        }

        public void getDocument(GetDocumentRequest getDocumentRequest, StreamObserver<Document> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(FirestoreGrpc.getGetDocumentMethod(), streamObserver);
        }

        public void listCollectionIds(ListCollectionIdsRequest listCollectionIdsRequest, StreamObserver<ListCollectionIdsResponse> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(FirestoreGrpc.getListCollectionIdsMethod(), streamObserver);
        }

        public void listDocuments(ListDocumentsRequest listDocumentsRequest, StreamObserver<ListDocumentsResponse> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(FirestoreGrpc.getListDocumentsMethod(), streamObserver);
        }

        public StreamObserver<ListenRequest> listen(StreamObserver<ListenResponse> streamObserver) {
            return ServerCalls.asyncUnimplementedStreamingCall(FirestoreGrpc.getListenMethod(), streamObserver);
        }

        public void rollback(RollbackRequest rollbackRequest, StreamObserver<Empty> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(FirestoreGrpc.getRollbackMethod(), streamObserver);
        }

        public void runQuery(RunQueryRequest runQueryRequest, StreamObserver<RunQueryResponse> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(FirestoreGrpc.getRunQueryMethod(), streamObserver);
        }

        public void updateDocument(UpdateDocumentRequest updateDocumentRequest, StreamObserver<Document> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(FirestoreGrpc.getUpdateDocumentMethod(), streamObserver);
        }

        public StreamObserver<WriteRequest> write(StreamObserver<WriteResponse> streamObserver) {
            return ServerCalls.asyncUnimplementedStreamingCall(FirestoreGrpc.getWriteMethod(), streamObserver);
        }
    }

}

