package com.slincloud.admin.biz;

import com.slincloud.common.security.annotation.EnableMyFeignClients;
import com.slincloud.common.security.annotation.EnablePigResourceServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @auther slin
 * Created by yangsonglin@sykean.com
 * Date 2020/3/27 17:31
 * Description
 */
@EnablePigResourceServer
@EnableMyFeignClients
@SpringCloudApplication
public class AdminBizApplication {
    public static void main(String[] args) {
            SpringApplication.run(AdminBizApplication.class, args);
    }
}
