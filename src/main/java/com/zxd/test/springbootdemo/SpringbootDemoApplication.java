package com.zxd.test.springbootdemo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
		//关闭Banner
//		SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringbootDemoApplication.class);
//		builder.bannerMode(Banner.Mode.OFF).run(args);
	}
}
