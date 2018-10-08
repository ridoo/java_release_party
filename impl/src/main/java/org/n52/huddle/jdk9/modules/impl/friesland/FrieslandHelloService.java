package org.n52.huddle.jdk9.modules.impl.friesland;

import org.n52.huddle.jdk9.modules.api.HelloService;

public class FrieslandHelloService implements HelloService {

    @Override
    public String sayHello() {
        return "Moin Moin!";
    }

}
