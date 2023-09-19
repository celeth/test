package com.cyt.businessaccount.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("product")
public interface TestFeign {
    @GetMapping("/testFeign")
    public String testFeign();

    @GetMapping("/testSeata")
    public String testSeata();
}
