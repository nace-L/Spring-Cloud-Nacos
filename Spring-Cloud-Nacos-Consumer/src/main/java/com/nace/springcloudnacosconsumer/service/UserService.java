package com.nace.springcloudnacosconsumer.service;

import com.nace.springcloudnacosconfig.common.ResultDTO;
import com.nace.springcloudnacosconfig.entity.ConfigEntity;
import com.nace.springcloudnacosconsumer.service.feign.FeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name = "nacos-provider",fallbackFactory= FeignFallback.class)
public interface UserService {

    @GetMapping("/provider/config")
    ResultDTO<ConfigEntity> getConfig();
}
