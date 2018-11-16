package org.n52.huddle.jdk9.modules;

import org.n52.huddle.jdk9.modules.api.HelloService;
import org.n52.huddle.jdk9.modules.impl.bavarian.BavarianHelloService;

public class App {

    public static void main(String[] args) {
        HelloService helloService = new BavarianHelloService();
        System.out.println(helloService.sayHello());
    }
}
