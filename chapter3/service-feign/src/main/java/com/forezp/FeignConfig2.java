package com.forezp;

import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Tilte: FeignConfig2
 * Description: 配置2
 * Copyright:  Copyright（c）2020 版本
 * Company:E-Limen
 *
 * @Author: zhihua.liang
 * @Date: 2020-03-11 09:40
 * @Vsersion v1.0.0
 **/
public class FeignConfig2 {
    @Bean
    Request.Options requestOptions2(ConfigurableEnvironment env){
        int ribbonReadTimeout = env.getProperty("service-hi2.ribbon.ReadTimeout", int.class, 7000);
        int ribbonConnectionTimeout = env.getProperty("service-hi2.ribbon.ConnectTimeout", int.class, 7000);

        return new Request.Options(ribbonConnectionTimeout, ribbonReadTimeout);
    }
}
