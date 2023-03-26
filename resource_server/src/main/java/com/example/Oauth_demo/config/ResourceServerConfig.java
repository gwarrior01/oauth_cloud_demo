package com.example.Oauth_demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@Configuration
@EnableResourceServer
public class ResourceServerConfig {

//    @Bean
//    public TokenStore tokenStore() {
//        return new JwtTokenStore(converter());
//    }
//
//    @Bean
//    public JwtAccessTokenConverter converter() {
//        var conv = new JwtAccessTokenConverter();
//        conv.setSigningKey("secret");
//        return conv;
//    }
}
