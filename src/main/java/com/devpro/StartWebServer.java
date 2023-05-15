package com.devpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StartWebServer {
	public static void main(String[] args) {
		SpringApplication.run(StartWebServer.class, args);
	}
}