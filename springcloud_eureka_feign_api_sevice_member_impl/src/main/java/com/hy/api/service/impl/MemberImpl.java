package com.hy.api.service.impl;

import com.hy.api.entity.UserEntity;
import com.hy.api.service.IMemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author litianjie
 * @ClassName MemberImpl
 * @Description TODO
 * @Date 2019/1/18 15:47
 * @Version 1.0
 **/
@RestController
public class MemberImpl implements IMemberService {

    @RequestMapping("/getMember")
    public UserEntity getMember(String name) {
        UserEntity user = new UserEntity();
        user.setName(name);
        user.setAge(20);
        return user;
    }
}
