package com.nace.springcloudnacosdiscover.controller;

import com.nace.springcloudnacosconfig.common.ResultDTO;
import com.nace.springcloudnacosconfig.entity.ConfigEntity;
import com.nace.springcloudnacosdiscover.service.UserService;
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
    public ResultDTO<ConfigEntity> getConfig(){
        return ResultDTO.ok(userService.getUserConfig());
    }
}
