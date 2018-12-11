package de.codecentric.boot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleWebController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

}
