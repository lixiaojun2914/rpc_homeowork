package service.impl;

import service.IHello;

public class HelloImpl implements IHello {
    @Override
    public String sayHello(String name) {
        return "hello:" + name;
    }
}