package com.codeoftheweb.salvo.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

}

