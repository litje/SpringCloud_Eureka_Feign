package com.hy.api.service;

import org.springframework.web.bind.annotation.RequestMapping;

public interface IOrderService {

    @RequestMapping("/getOrderToMember")
    public String getOrderToMember(String name);
}
