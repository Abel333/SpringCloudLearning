package com.forezp.service;

import com.forezp.FeignConfig;
import com.forezp.FeignConfig2;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@FeignClient(value = "service-hi2",configuration = FeignConfig2.class)
public interface SchedualServiceHi2 {
    @RequestMapping(value = "/hi2",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
