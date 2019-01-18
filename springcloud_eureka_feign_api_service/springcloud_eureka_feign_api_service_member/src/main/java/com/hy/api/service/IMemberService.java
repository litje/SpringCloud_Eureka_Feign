package com.hy.api.service;

import com.hy.api.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface IMemberService {

    @RequestMapping("/getMember")
    public UserEntity getMember(@RequestParam("name")String name);
}
