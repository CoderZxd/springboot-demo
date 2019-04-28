package com.zxd.test.springbootdemo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication   //same as @Configuration,@EnableAutoConfiguration,@ComponentScan
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
		//关闭Banner
//		SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringbootDemoApplication.class);
//		builder.bannerMode(Banner.Mode.OFF).run(args);
	}
}
