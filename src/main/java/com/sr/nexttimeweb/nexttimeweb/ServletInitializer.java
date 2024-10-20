package com.sr.nexttimeweb.nexttimeweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(NexttimewebApplication.class);
	}
	public static void main(String args[]) {
		SpringApplication.run(NexttimewebApplication.class, args);
	}
}
