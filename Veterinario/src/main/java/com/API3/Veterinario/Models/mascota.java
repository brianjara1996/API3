package com.API3.Veterinario.Models;

public class mascota {
	
	private int id;
	
	private String nombre;
	
	private String apellido;
	
	private int edad;
	
	private String imagen;

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public String getImagen() {
		return imagen;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	

}
