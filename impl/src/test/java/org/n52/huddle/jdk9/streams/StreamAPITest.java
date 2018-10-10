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

package org.n52.huddle.jdk9.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StreamAPITest {

    @BeforeEach
    public void setUp() {
        System.out.println("-----------------------");
    }

    @Test
    public void iterate_over_stream() {
        System.out.println(fibonacci().limit(24).map(String::valueOf).collect(Collectors.joining(", ")));
    }

    private Stream<Long> fibonacci() {
        return Stream.iterate(0L, v -> v + v + 1);
    }

    @Test
    public void alert_exceeding_threshold() {
        System.out.println(fibonacci().limit(24)
                                       .dropWhile(v -> v < 15000L)
                                       .takeWhile(v -> v < 50000L)
                                       .map(String::valueOf)
                                       .collect(Collectors.joining(", ")));
    }

}
