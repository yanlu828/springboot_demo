package com.silverdawn.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan({"com.silverdawn"})
@SpringBootApplication(scanBasePackages = {"com.silverdawn.mybatis"})
@EnableSwagger2
@ServletComponentScan
public class MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}
}
