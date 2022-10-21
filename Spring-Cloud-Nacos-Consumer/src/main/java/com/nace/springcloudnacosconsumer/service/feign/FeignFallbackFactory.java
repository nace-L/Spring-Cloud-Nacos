package com.nace.springcloudnacosconsumer.service.feign;

import cn.hutool.core.util.ObjectUtil;
import com.nace.springcloudnacosconfig.common.ResultDTO;
import com.nace.springcloudnacosconfig.entity.ConfigEntity;
import com.nace.springcloudnacosconsumer.service.UserService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FeignFallbackFactory implements FallbackFactory<UserService>  {
    @Override
    public UserService create(Throwable throwable) {
        String msg = ObjectUtil.isNotNull(throwable)?throwable.getMessage():"";
        if(ObjectUtil.isNotEmpty(msg)){
            log.error(msg);
        }
        return new UserService() {
            @Override
            public ResultDTO<ConfigEntity> getConfig() {
                return ResultDTO.failed("getConfig 方法调用失败");
            }
        };
    }
}
