package com.hy.api.service.feign;

import com.hy.api.service.IMemberService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("Eureka-Member-Client")
public interface MemberServiceFeign extends IMemberService {
}
