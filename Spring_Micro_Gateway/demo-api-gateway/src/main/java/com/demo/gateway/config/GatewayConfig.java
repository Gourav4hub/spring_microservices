package com.demo.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig 
{
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) 
	{
			return builder.routes()
				.route(r -> r.path("/emp/**")
					.uri("lb://STUDENT-SERVICE"))
				.build();
	}	
}
