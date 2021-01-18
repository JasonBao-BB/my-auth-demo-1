package com.example.authorjdbcresource.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.stereotype.Component;

@Component
public class JWTToken {

    private String SIGNING_KEY = "himawari1201";

    @Autowired
    @Qualifier("jwtConverter")
    private JwtAccessTokenConverter converter;

    @Bean(name = "JWTStore")
    public TokenStore tokenStore(){
        return new JwtTokenStore(converter);
    }

    @Bean(name = "jwtConverter")
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey(SIGNING_KEY);
        return converter;
    }

}
