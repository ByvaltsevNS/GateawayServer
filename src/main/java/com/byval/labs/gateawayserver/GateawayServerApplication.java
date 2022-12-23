package com.byval.labs.gateawayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GateawayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateawayServerApplication.class, args);
    }

}
