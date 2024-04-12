package com.salesianostriana.dam.p01springcore2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

	@Bean
	@Primary
	public Saludator spanishSlaudator() {
		return new SpanishSaludator();
	}
	
	@Bean
	public Saludator englishSlaudator() {
		return new EnglishSaludator();
	}
}
