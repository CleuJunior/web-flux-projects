package com.learnreactiveprogramming.service;

import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FluxAndMonoGeneratorServiceTest {


    @Test
    void nameFluxTest() {
        var names = new String[]{"Heya", "Freya"};

        StepVerifier.create(FluxAndMonoGeneratorService.namesFux(names))
                .expectNext("Heya", "Freya")
//                .expectNextCount(2)
//                .expectComplete()
                .verifyComplete();
    }

    @Test
    void fluxMapTest() {
        var names = new String[]{"xuxa", "show"};

        StepVerifier.create(FluxAndMonoGeneratorService.nameFluxMap(names))
                .expectNextSequence(List.of("XUXA", "SHOW"))
//                .assertNext(s -> assertEquals(s, "XUXA"))
//                .assertNext(s -> assertEquals(s, "SHOW"))
//                .expectNext("XUXA", "SHOW")
                .verifyComplete();
    }

}