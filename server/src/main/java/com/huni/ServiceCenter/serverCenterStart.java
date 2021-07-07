package com.huni.ServiceCenter;

import com.huni.service.HelloService;
import com.huni.service.HelloServiceImpl;

import java.io.IOException;

public class serverCenterStart {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Server serviceServer = new ServiceCenter(8088);
                    serviceServer.register(HelloService.class, HelloServiceImpl.class);
                    System.out.println(HelloService.class);
                    serviceServer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
