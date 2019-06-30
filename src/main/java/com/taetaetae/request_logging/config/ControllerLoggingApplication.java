package com.taetaetae.request_logging.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = "com.taetaetae.request_logging")
@ServletComponentScan(basePackages = "com.taetaetae.request_logging.filter")
@SpringBootApplication
@EnableAspectJAutoProxy
public class ControllerLoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControllerLoggingApplication.class, args);
	}

}
