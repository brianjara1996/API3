package com.API3.Veterinario.Dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.API3.Veterinario.Models.mascota;


@FeignClient(name = "api-mascota" , url = "http://localhost:8081/")
public interface Consultomascota {
	
	@PostMapping(value = "api/LoginM")
	 String obtengoToken(@RequestBody mascota m);
	
	
	@GetMapping(value = "api/mascota/{id}")
	mascota consultoM(@PathVariable int id, @RequestHeader(value="Authorization") String token);

}
