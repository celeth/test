package com.cyt.product.controller;

import com.cyt.product.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSeataController {
    @Autowired
    private ProductMapper productMapper;

//    @Transactional
    @GetMapping("/testSeata")
    public String testSeata() {
        productMapper.insert();
        return "success";
    }
}
