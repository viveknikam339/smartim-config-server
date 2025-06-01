package com.smartimconfig.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SmartimConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartimConfigServerApplication.class, args);
	}

}
