package com.nace.gatway.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        //配置跨域
        CorsConfiguration config = new CorsConfiguration();
        //任意请求头
        config.addAllowedHeader("*");
        //任意方式
        config.addAllowedMethod("*");
        //任意请求来源
        config.addAllowedOrigin("*");
        //允许携带cookie跨域
        config.setAllowCredentials(true);
        source.registerCorsConfiguration("/**", config);
        return new CorsWebFilter(source);
    }
}
