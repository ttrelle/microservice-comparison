package de.codecentric.boot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleWebController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world (" + randomFib() + ")";
    }

    private long randomFib() {
        return fib(Math.round(Math.random() * 30.0));
    }

    private long fib(long n) {
        return n == 0 ? 0 : (n == 1 ? 1 : fib(n - 1) + fib(n - 2));
    }

}
