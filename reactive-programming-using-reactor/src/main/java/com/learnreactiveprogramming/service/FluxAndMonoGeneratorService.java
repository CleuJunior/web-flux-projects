package com.learnreactiveprogramming.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class FluxAndMonoGeneratorService {

    public static Flux<String> namesFux(String... args) {
        return reactor.core.publisher.Flux.fromIterable(List.of(args))
                .log();
    }

    public static Mono<String> nameMono(String... args) {
        return Mono.just(args[0])
                .log();
    }

    public static Flux<String> nameFluxMap(String... args) {
        return Flux.fromArray(args)
                .map(String::toUpperCase)
                .log();
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
