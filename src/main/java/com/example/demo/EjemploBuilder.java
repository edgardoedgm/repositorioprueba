package com.example.demo;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class EjemploBuilder {
	private String nombre;
	private int edad;
	private String ciudad;

	public static void main(String[] args) {

		EjemploBuilder persona = EjemploBuilder.builder().nombre("Juan").edad(30).ciudad("Ciudad de Ejemplo").build();

		System.out.println(persona);

	}

}
