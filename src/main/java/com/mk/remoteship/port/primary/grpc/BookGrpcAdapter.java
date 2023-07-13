package com.mk.remoteship.port.primary.grpc;

import com.mk.remoteship.spring.annotations.Log;
import io.grpc.stub.StreamObserver;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;

@Log
@Slf4j
@GRpcService
public class BookGrpcAdapter extends BookServiceGrpc.BookServiceImplBase{

  @Override
  public void createBooks(CreateBook request, StreamObserver<ResponseBook> responseObserver) {

    ResponseBook responseBook = ResponseBook.newBuilder()
        .setId(UUID.randomUUID().toString())
        .build();

    responseObserver.onNext(responseBook);
    responseObserver.onCompleted();
  }

  @Override
  public void getBooks(FindBook request, StreamObserver<Book> responseObserver) {
    super.getBooks(request, responseObserver);
  }
}
