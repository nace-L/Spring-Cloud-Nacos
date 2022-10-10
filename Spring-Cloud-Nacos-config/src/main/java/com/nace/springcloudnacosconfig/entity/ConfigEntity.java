package com.nace.springcloudnacosconfig.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("naceuser")
@Component
@Data
public class ConfigEntity {
    private String name;

    private Integer age;

    public ConfigEntity() {
    }
}
