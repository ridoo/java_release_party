
package org.n52.huddle.jdk9.modules;

import java.util.ServiceLoader;

import org.n52.huddle.jdk9.modules.api.HelloService;

public class App {

    public static void main(String[] args) {
        System.out.println(ServiceLoader.load(HelloService.class).findFirst().get().sayHello());
        // HelloService service = new BavarianHelloService();
        // System.out.println(service.sayHello());
    }
}
