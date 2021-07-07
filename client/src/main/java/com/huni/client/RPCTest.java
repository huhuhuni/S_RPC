package com.huni.client;

import com.huni.client.RPCClient;
import com.huni.service.HelloService;

import java.io.IOException;
import java.net.InetSocketAddress;

public class RPCTest {

    public static void main(String[] args) throws IOException {
        HelloService service = RPCClient.getRemoteProxyObj(HelloService.class, new InetSocketAddress("localhost", 8088));
        System.out.println(service.sayHi("test"));
    }
}
