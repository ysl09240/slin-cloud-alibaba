package com.slincloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author slin
 * Created by yangsonglin@sykean.com
 * Date 2020/3/27 9:30
 * Description
 */
@SpringCloudApplication
@ConfigurationPropertiesScan
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
