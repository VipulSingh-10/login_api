package com.example.login_api.Security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;
@RequiredArgsConstructor
@Component

public class JwtIssuer {
    private final jwtProperties Properties;
    public String issuer(long userid, String email, List<String> roles) {

        return JWT.create()
                .withSubject(Long.toString(userid))
                .withExpiresAt(Instant.now().plus(Duration.of(1, ChronoUnit.DAYS)))
                .withClaim("r", roles)
                .withClaim("a", email)
                .sign(Algorithm.HMAC256(Properties.getSecretkey()));

    }
}
