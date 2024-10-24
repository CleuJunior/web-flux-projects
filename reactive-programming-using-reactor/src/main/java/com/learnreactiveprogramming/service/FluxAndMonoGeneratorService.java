package com.learnreactiveprogramming.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class FluxAndMonoGeneratorService {

    private static Flux<String> namesFux(String... args) {
        return Flux.fromIterable(List.of(args));
    }

    private static Mono<String> nameMono(String... args) {
        return Mono.just(args[0]);
    }


    public static void main(String[] args) {
        namesFux(args)
                .subscribe(System.out::println);

        System.out.println("==========================================");
        System.out.println("==========================================");

        nameMono(args)
                .subscribe(System.out::println);
    }
}
