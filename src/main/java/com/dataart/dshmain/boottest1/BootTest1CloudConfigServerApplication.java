package com.dataart.dshmain.boottest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BootTest1CloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootTest1CloudConfigServerApplication.class, args);
	}
}
