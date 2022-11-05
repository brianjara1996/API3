package com.API3.Veterinario.Dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.API3.Veterinario.Models.persona;

@FeignClient(name = "api-persona" , url = "http://localhost:8080/")
public interface Consultopersona {
	
	@PostMapping(value = "api/Login")
	String obtengotoken(@RequestBody persona p);
	
	@GetMapping(value = "api/persona/{dni}")
	persona consultoP(@PathVariable int dni, @RequestHeader(value="Authorization") String token);

}
