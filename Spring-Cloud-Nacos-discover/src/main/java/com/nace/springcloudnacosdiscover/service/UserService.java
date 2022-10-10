package com.nace.springcloudnacosdiscover.service;

import com.nace.springcloudnacosconfig.entity.ConfigEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

public interface UserService {
    ConfigEntity getUserConfig();
}
