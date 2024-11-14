package com.example.login_api.Security;

import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JwtToPrincipalConverter {
    public static UserPrincipal convert(DecodedJWT decodedJWT) {
        return UserPrincipal.builder()
                .userId(Long.parseLong(decodedJWT.getSubject()))
                .email(decodedJWT.getClaim("e").asString())
                .authorities(extractAuthorityFromDecodedJwt(decodedJWT))
                .build();
    }
    private static List<SimpleGrantedAuthority> extractAuthorityFromDecodedJwt(DecodedJWT decodedJWT) {
        var claim = decodedJWT.getClaim("a");
        if (claim.isNull() || claim.isMissing()) return List.of();
        return claim.asList(SimpleGrantedAuthority.class);
    }
}
