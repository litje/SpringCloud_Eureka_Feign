package com.hy.api.service.impl;

import com.hy.api.entity.UserEntity;
import com.hy.api.service.IOrderService;
import com.hy.api.service.feign.MemberServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author litianjie
 * @ClassName MemberImpl
 * @Description TODO
 * @Date 2019/1/18 15:47
 * @Version 1.0
 **/
@RestController
public class OrderImpl implements IOrderService {
    @Autowired
    private MemberServiceFeign memberServiceFeign;

    @RequestMapping("/getOrderToMember")
    public String getOrderToMember(@RequestParam("name") String name) {
        UserEntity user = memberServiceFeign.getMember(name);
        return user.toString();
    }
}
