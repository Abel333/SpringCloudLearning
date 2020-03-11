package com.forezp.web;

import com.forezp.service.SchedualServiceHi;
import com.forezp.service.SchedualServiceHi2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @Autowired
    SchedualServiceHi2 schedualServiceHi2;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    @RequestMapping(value = "/hi2",method = RequestMethod.GET)
    public String sayHi2(@RequestParam String name){
        System.out.println(System.currentTimeMillis());
        return schedualServiceHi2.sayHiFromClientOne(name);
    }
}
