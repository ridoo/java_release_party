
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
