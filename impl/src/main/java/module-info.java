module impl_module {

    // dependend modules
    requires api_module;

    // API packages
    // exports not required when ServiceLoader is used (also not recommended!)
    // https://docs.oracle.com/javase/9/docs/api/java/util/ServiceLoader.html
//    exports org.n52.huddle.jdk9.modules.impl.bavarian;

    // service declarations
    provides org.n52.huddle.jdk9.modules.api.HelloService
        with org.n52.huddle.jdk9.modules.impl.bavarian.BavarianHelloService;

}

