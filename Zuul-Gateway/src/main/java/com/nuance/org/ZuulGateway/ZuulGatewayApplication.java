package com.nuance.org.ZuulGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.nuance.org.filters.ErrorFilter;
import com.nuance.org.filters.PostFilter;
import com.nuance.org.filters.PreFilter;
import com.nuance.org.filters.RouteFilter;


@EnableZuulProxy
@SpringBootApplication
public class ZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayApplication.class, args);
	}

	 @Bean
	    public PreFilter preFilter() {
	        return new PreFilter();
	    }
	    @Bean
	    public PostFilter postFilter() {
	        return new PostFilter();
	    }
	    @Bean
	    public ErrorFilter errorFilter() {
	        return new ErrorFilter();
	    }
	    @Bean
	    public RouteFilter routeFilter() {
	        return new RouteFilter();
	    }
}
