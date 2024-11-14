package com.example.login_api.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class HelloController {

    @GetMapping("/")
    public String grettings() {
        return "Hello World";
    }

    @GetMapping("/secured")
    public String secured() {
        return "You are secured and logged in using the token";
    }
}
