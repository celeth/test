package com.cyt.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFeignController {

    @GetMapping("/testFeign")
    public String testFeign(){
        return "testfrign";
    }
}
