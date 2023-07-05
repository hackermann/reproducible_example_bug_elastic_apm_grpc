package de.testservice.controller;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import de.testservice.grpc.TestRequest;
import de.testservice.grpc.TestResponse;
import de.testservice.grpc.TestServiceGrpc.TestServiceImplBase;

@GrpcService
public class TestGrpcService extends TestServiceImplBase {

    @Override
    public void testRequest(
        TestRequest request, StreamObserver<TestResponse> responseObserver) {
        responseObserver.onNext(TestResponse.getDefaultInstance());
        responseObserver.onCompleted();
    }

}
