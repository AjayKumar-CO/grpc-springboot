package com.catalystone.grpc;

import com.main.GreeterGrpc;
import com.main.HelloReply;
import com.main.HelloRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();
        GreeterGrpc.GreeterBlockingStub stub = GreeterGrpc.newBlockingStub(channel);
        HelloRequest helloRequest = HelloRequest.newBuilder().setName("John").build();
        HelloReply helloReply = stub.sayHello(helloRequest);
        System.out.println(helloReply.getMessage());
        channel.shutdown();
    }
}