package de.codecentric.boot.webflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SimpleWebfluxController {

    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("hello world (" + randomFib() + ")");
    }

    private long randomFib() {
        return fib(Math.round(Math.random() * 30.0));
    }

    private long fib(long n) {
        return n == 0 ? 0 : (n == 1 ? 1 : fib(n - 1) + fib(n - 2));
    }

}
