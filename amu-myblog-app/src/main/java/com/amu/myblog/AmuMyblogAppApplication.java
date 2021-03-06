package com.amu.myblog;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AmuMyblogAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmuMyblogAppApplication.class, args);
	}

	//Bean for ModelMapper to map entity to DTOs and vice versa
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
