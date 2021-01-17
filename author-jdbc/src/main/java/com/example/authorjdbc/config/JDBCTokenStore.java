package com.example.authorjdbc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class JDBCTokenStore {

    @Autowired
    private DataSource datasource;

    @Bean
    public TokenStore tokenStore(){
        return new JdbcTokenStore(datasource);
    }

}
