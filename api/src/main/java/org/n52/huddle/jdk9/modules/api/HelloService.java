package org.n52.huddle.jdk9.modules.api;

public interface HelloService {

    default String sayHello() {
        return defaultHello();
    }

    private String defaultHello() {
        return "Hello World!";
    }

}
