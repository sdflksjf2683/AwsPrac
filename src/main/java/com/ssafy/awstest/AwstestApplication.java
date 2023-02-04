package com.ssafy.awstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AwstestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwstestApplication.class, args);
    }

}
