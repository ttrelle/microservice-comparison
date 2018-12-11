package de.codecentric.micronaut.simple;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;

@Controller("/")
public class SimpleMicroController {

    @Get("/hello")
    public Single<String> hello() {
        return Single.just("hello world");
    }

}
