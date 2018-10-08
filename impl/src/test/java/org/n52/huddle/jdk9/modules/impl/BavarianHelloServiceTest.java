package org.n52.huddle.jdk9.modules.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.n52.huddle.jdk9.modules.impl.bavarian.BavarianHelloService.DEFAULT_PHRASE;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.n52.huddle.jdk9.modules.api.HelloService;
import org.n52.huddle.jdk9.modules.impl.bavarian.BavarianHelloService;

public class BavarianHelloServiceTest {

    private HelloService service;

    @BeforeEach
    public void beforeEach() {
        this.service = new BavarianHelloService();
    }

    @Nested
    @DisplayName("When run as default")
    class WhenRunDefault {

        @Test
        @DisplayName("Greet with default phrase")
        public void expectDefaultHello() {
            assertThat(service.sayHello()).isEqualTo(DEFAULT_PHRASE);
        }

    }

    @Nested
    @DisplayName("When run with customized")
    class WhenRunCustomPhrase {

        @Test
        @DisplayName("Greet with 'Gruezi!'")
        public void expectGreetWithCustomizedPhrase() {
            HelloService service = new BavarianHelloService("Gruezi!");
            assertThat(service.sayHello()).isEqualTo("Gruezi!");
        }

        @Test
        @DisplayName("Greet with default phrase in case of null")
        public void expectDefaultGreetWhenPhraseIsNull() {
            HelloService service = new BavarianHelloService(null);
            assertThat(service.sayHello()).isEqualTo(DEFAULT_PHRASE);
        }

        @Test
        @DisplayName("Greet with default phrase in case of empty String")
        public void expectDefaultGreetWhenPhraseIsEmpty() {
            HelloService service = new BavarianHelloService("");
            assertThat(service.sayHello()).isEqualTo(DEFAULT_PHRASE);
        }

    }
}
