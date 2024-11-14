package com.example.login_api.Controller;

import com.example.login_api.Security.JwtIssuer;
import com.example.login_api.model.LoginRequest;
import com.example.login_api.model.LoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final JwtIssuer jwtIssuer;
    @PostMapping("/auth/login")
    public LoginResponse login(@RequestBody @Validated LoginRequest loginRequest) {
        var token = jwtIssuer.issuer(1,loginRequest.getEmail(), List.of("User"));
        return LoginResponse.builder()
                .accessToken(token)
                .build();


    }
}
