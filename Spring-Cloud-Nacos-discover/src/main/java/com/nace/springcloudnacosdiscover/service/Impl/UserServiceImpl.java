package com.nace.springcloudnacosdiscover.service.Impl;

import com.nace.springcloudnacosconfig.entity.ConfigEntity;
import com.nace.springcloudnacosdiscover.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@RefreshScope
@Service
public class UserServiceImpl implements UserService {

    @Value("${naceuser.name}")
    private String name;
    @Value("${naceuser.age}")
    private Integer age;

    @Override
    public ConfigEntity getUserConfig() {
        ConfigEntity configEntity = new ConfigEntity();
        configEntity.setAge(age);
        configEntity.setName(name);
        return configEntity;
    }
}
