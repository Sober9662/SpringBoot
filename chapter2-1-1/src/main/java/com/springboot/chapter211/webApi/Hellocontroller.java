package com.springboot.chapter211.webApi;

import com.springboot.chapter211.domain.General;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
    @Autowired
    private General general;
    @RequestMapping("hello")
    public String index(){
        return general.getName()+general.getTitle();
    }
}
