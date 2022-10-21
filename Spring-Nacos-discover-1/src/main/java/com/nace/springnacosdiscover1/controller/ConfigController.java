package com.nace.springnacosdiscover1.controller;

import com.nace.springcloudnacosconfig.common.ResultDTO;
import com.nace.springcloudnacosconfig.entity.ConfigEntity;
import com.nace.springnacosdiscover1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ConfigController {

    @Autowired
    UserService userService;

    @GetMapping("/config")
    public ResultDTO<ConfigEntity> getConfig() throws RuntimeException, InterruptedException {
        Thread.sleep(11000);
        throw new RuntimeException("数据库异常");
//        return ResultDTO.ok(userService.getUserConfig());
    }
}
