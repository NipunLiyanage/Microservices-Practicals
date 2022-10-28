package com.example.msdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(MsDemo2Application.class, args);
    }

}
