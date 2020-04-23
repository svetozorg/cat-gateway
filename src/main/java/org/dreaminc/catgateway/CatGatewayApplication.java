package org.dreaminc.catgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.dreaminc.catgateway.filters.pre.SimpleFilter;

@EnableZuulProxy
@SpringBootApplication
public class CatGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatGatewayApplication.class, args);
	}

	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}
}