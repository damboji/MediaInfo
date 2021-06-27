package com.ww.dileep.mediaInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class MediaInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediaInfoApplication.class, args);
	}

}
