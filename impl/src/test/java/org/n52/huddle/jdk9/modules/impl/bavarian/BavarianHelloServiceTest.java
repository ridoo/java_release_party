/*
 * Copyright (C) 2015-${latestYearOfContribution} 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 as published
 * by the Free Software Foundation.
 *
 * If the program is linked with libraries which are licensed under one of
 * the following licenses, the combination of the program with the linked
 * library is not considered a "derivative work" of the program:
 *
 *     - Apache License, version 2.0
 *     - Apache Software License, version 1.0
 *     - GNU Lesser General Public License, version 3
 *     - Mozilla Public License, versions 1.0, 1.1 and 2.0
 *     - Common Development and Distribution License (CDDL), version 1.0
 *
 * Therefore the distribution of the program linked with libraries licensed
 * under the aforementioned licenses, is permitted by the copyright holders
 * if the distribution is compliant with both the GNU General Public License
 * version 2 and the aforementioned licenses.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 */
package org.n52.huddle.jdk9.modules.impl.bavarian;

import static org.assertj.core.api.Assertions.assertThat;
import static org.n52.huddle.jdk9.modules.impl.bavarian.BavarianHelloService.DEFAULT_PHRASE;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.n52.huddle.jdk9.modules.api.HelloService;

class BavarianHelloServiceTest {

    private HelloService service;

    @BeforeEach
    void beforeEach() {
        this.service = new BavarianHelloService();
    }

    @Nested
    @DisplayName("When run as default")
    class WhenRunDefault {

        @Test
        @DisplayName("Greet with default phrase")
        void expectDefaultHello() {
            assertThat(service.sayHello()).isEqualTo(DEFAULT_PHRASE);
        }

    }

    @Nested
    @DisplayName("When run with customized")
    class WhenRunCustomPhrase {

        @Test
        @DisplayName("Greet with 'Gruezi!'")
        void expectGreetWithCustomizedPhrase() {
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
        void expectDefaultGreetWhenPhraseIsEmpty() {
            HelloService service = new BavarianHelloService("");
            assertThat(service.sayHello()).isEqualTo(DEFAULT_PHRASE);
        }

    }
}
