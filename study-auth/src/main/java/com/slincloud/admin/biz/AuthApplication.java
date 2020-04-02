package com.slincloud.admin.biz;

import com.slincloud.common.security.annotation.EnableMyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * Created by yangsonglin@sykean.com
 * Date 2020/3/26 14:45
 * Description
 */
@SpringCloudApplication
@EnableMyFeignClients
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}
