package com.nace.springcloudnacosconsumer.configuration;

import com.nace.springcloudnacosconsumer.service.feign.FeignFallback;
import com.nace.springcloudnacosconsumer.service.feign.FeignFallbackFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    @Bean
    public FeignFallbackFactory feignFallbackFactory(){
        return new FeignFallbackFactory();
    }
    @Bean
    public FeignFallback feignFallback(){
        return new FeignFallback();
    }

}
