package com.forezp;

import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Tilte: FeignConfig
 * Description: 配置
 * Copyright:  Copyright（c）2020 版本
 *
 * @Author: zhihua.liang
 * @Date: 2020-03-11 08:49
 * @Vsersion v1.0.0
 **/
public class FeignConfig {
    @Bean
    Request.Options requestOptions(ConfigurableEnvironment env){
        int ribbonReadTimeout = env.getProperty("service-hi.ribbon.ReadTimeout", int.class, 1000);
        int ribbonConnectionTimeout = env.getProperty("service-hi.ribbon.ConnectTimeout", int.class, 1000);

        return new Request.Options(ribbonConnectionTimeout, ribbonReadTimeout);
    }
}
