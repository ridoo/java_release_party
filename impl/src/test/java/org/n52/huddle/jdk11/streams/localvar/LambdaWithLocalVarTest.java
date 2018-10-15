
package org.n52.huddle.jdk11.streams.localvar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class LambdaWithLocalVarTest {

    @Test
    public void when_havingNullsInList_then_lowerCasingFails() {
        assertThrows(NullPointerException.class,
                     () -> Stream.of("FOO", "BAR", null, "BAZ")
                                 .map(it -> it.toLowerCase())
                                 .collect(Collectors.toList()));
    }

    @Test
    public void given_havingNullsInList_when_usingNotNullAnnotatition_thenlowerCaseSucceeds() {
        assertThat(Stream.of("FOO", "BAR", null, "BAZ")
//                         .map((var it) -> it.toLowerCase())
                         .collect(Collectors.toList())).hasSize(3);
    }
}
