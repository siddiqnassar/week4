package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient //can discover any other client

@EnableHystrix
public class MsMyClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMyClientApplication.class, args);
	}

}
