package com.nace.springcloudnacosconsumer.configuration;

import com.nace.springcloudnacosconsumer.service.feign.FeignFallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    @Bean
    public FeignFallback feignFallback(){
        return new FeignFallback();
    }

}
