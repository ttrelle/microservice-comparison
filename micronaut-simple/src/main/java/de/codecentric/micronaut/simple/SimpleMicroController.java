package de.codecentric.micronaut.simple;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;

@Controller("/")
public class SimpleMicroController {

    @Get("/hello")
    public Single<String> hello() {
        return Single.just("hello world (" + randomFib() + ")");
    }

    private long randomFib() {
        return fib(Math.round(Math.random() * 30.0));
    }

    private long fib(long n) {
        return n == 0 ? 0 : (n == 1 ? 1 : fib(n - 1) + fib(n - 2));
    }

}
