package com.example.configserverf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerfApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerfApplication.class, args);
	}

}
