package com.antra.oauth2demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PassWordEncryptor {

    @Bean(name = "bEncrypt")
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
