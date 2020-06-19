package com.shivaot.photoappapiaccountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PhotoappapiaccountmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoappapiaccountmanagementApplication.class, args);
    }

}
