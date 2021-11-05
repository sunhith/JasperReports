package com.sunhith.jasper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class JasperReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(JasperReportApplication.class, args);
	}

}
