package com.example.algo.he;

public class HelloWorld {
    public String sayHello(String name) {
        if(name == null || name.isEmpty()) name = "none";
        return "hello, " + name;
    }
}
