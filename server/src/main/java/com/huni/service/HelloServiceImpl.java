package com.huni.service;

import com.huni.service.HelloService;

public class HelloServiceImpl implements HelloService {

    public String sayHi(String name) {
        return "Hi, " + name;
    }

}
