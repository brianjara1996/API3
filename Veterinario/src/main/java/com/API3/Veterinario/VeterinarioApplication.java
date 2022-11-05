package com.API3.Veterinario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VeterinarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeterinarioApplication.class, args);
	}

}
