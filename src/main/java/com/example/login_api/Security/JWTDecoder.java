package com.example.login_api.Security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JWTDecoder {
    private final jwtProperties properties;
    public DecodedJWT decode(String token) {
        return JWT.require(Algorithm.HMAC256(properties.getSecretkey()))
                .build()
                .verify(token);
    }
}
