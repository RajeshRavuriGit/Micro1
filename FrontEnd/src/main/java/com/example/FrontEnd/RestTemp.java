package com.example.FrontEnd;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemp {

@Bean
@LoadBalanced
public RestTemplate restTmp()
{
	return new RestTemplate();
}
	
}
