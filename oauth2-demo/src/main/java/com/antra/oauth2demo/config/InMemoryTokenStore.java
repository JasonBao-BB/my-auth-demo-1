package com.antra.oauth2demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.stereotype.Component;

@Component
public class InMemoryTokenStore {

    @Bean(name = "InMemory")
    public TokenStore tokenStore(){
        return new org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore();
    }

}
