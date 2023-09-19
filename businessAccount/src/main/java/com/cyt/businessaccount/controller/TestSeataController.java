package com.cyt.businessaccount.controller;

import com.cyt.businessaccount.feign.TestFeign;
import com.cyt.businessaccount.mapper.GetBusinesssAccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSeataController {
    @Autowired
    private TestFeign testFeign;
    @Autowired
    private GetBusinesssAccountMapper getBusinesssAccountMapper;

    @GetMapping("/testSeata")
//    @GlobalTransactional
    public String testSeata() {
        String result = "";
        getBusinesssAccountMapper.insert();
        result = testFeign.testSeata();
        return result;
    }
}
