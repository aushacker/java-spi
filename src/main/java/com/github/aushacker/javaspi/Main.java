package com.github.aushacker.javaspi;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        ServiceLoader<MyService> svcs = ServiceLoader.load(MyService.class);
        for (MyService svc : svcs) {
            svc.greet();
        }
    }

}
