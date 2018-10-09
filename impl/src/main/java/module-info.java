module org.n52.huddle.modules.impl {

    // API packages
    exports org.n52.huddle.jdk9.modules.impl.bavarian;

    // dependend modules
    requires transitive org.n52.huddle.modules.api;

    // service declarations
    provides org.n52.huddle.jdk9.modules.api.HelloService
        with org.n52.huddle.jdk9.modules.impl.bavarian.BavarianHelloService;

    // dependend test modules
    requires org.junit.jupiter.api;
    requires org.assertj.core;
}

