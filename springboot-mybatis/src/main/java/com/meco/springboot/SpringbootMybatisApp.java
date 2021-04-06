package com.meco.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringbootMybatisApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApp.class, args);
	}
}
