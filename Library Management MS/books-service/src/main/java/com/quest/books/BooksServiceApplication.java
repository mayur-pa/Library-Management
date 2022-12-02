package com.quest.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableEurekaClient
public class BooksServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksServiceApplication.class, args);
	}
	@Bean
	   
	
	public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
}
