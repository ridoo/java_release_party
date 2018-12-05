package org.n52.huddle.jdk9.modules.impl.bavarian;

import org.n52.huddle.jdk9.modules.api.HelloService;

public class BavarianHelloService implements HelloService {

    public static final String DEFAULT_PHRASE = "Grüß Gott!";

    private final String helloPhrase;

    public BavarianHelloService() {
        this(null);
    }

    public BavarianHelloService(String helloPhrase) {
        this.helloPhrase = (helloPhrase == null) || helloPhrase.isEmpty()
                ? DEFAULT_PHRASE
                : helloPhrase;
    }

    @Override
    public String sayHello() {
        return helloPhrase;
    }

}
