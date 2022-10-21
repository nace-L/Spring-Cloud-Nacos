package com.nace.springcloudnacosconsumer.service.feign;

import com.nace.springcloudnacosconfig.common.ResultDTO;
import com.nace.springcloudnacosconfig.entity.ConfigEntity;
import com.nace.springcloudnacosconsumer.service.UserService;

public class FeignFallback implements UserService {
    @Override
    public ResultDTO<ConfigEntity> getConfig() {
        return ResultDTO.failed("getConfig 方法调用失败");
    }
}
