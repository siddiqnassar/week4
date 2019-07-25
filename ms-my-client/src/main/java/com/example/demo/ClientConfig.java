package com.example.demo;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.ribbon.proxy.annotation.Hystrix;

@Configuration

public class ClientConfig {

	@LoadBalanced //to specify one ms is calling another ms
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
