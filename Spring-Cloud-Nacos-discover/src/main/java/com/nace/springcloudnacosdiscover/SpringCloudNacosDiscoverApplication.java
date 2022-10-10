package com.nace.springcloudnacosdiscover;

import com.nace.springcloudnacosconfig.entity.ConfigEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudNacosDiscoverApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringCloudNacosDiscoverApplication.class,args);
//        while (true){
//            int age = Integer.parseInt(applicationContext.getEnvironment().getProperty("user.age"));
//            String name = applicationContext.getEnvironment().getProperty("user.name");
//            System.out.println("user.age = "+age+", user.name = "+name);
//            try {
//                TimeUnit.SECONDS.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            ConfigEntity configEntity = applicationContext.getBean(ConfigEntity.class);
//            System.out.println("naceuser.age = "+configEntity.getAge()+", naceuser.name = "+configEntity.getName());
//            try {
//                TimeUnit.SECONDS.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }

}
