package com.ks_xlm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tianmao on 2018/6/7.
 */

@RestController
@RequestMapping("/ww")
public class Abc {
    @RequestMapping("/addchoice")
    public String hhh(){
        //1. do sth
        //2. ====> service impl
        //3.log    & so on
        return "hhhh";
    }
}
