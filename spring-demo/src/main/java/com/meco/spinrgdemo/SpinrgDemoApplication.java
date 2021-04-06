package com.meco.spinrgdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableSwagger2
//@EnableSwagger2注释用于为Spring Boot应用程序启用Swagger2
//@EnableScheduling
//@EnableScheduling注解用于为应用程序启用调度程序
// mapper 接口类扫描包配置
@MapperScan("com.meco.spinrgdemo.dao")
public class SpinrgDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpinrgDemoApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.meco.springdemo")).build();
	}


}
