package com.cleberfeitosa.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieApplication {

	public String PORT = System.getenv( "PORT");
	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}

}
