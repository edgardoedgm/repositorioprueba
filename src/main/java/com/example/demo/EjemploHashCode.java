package com.example.demo;

import lombok.Data;

@Data
public class EjemploHashCode {
	private String nombre;
	private int edad;

	public static void main(String[] args) {

		EjemploHashCode persona1 = new EjemploHashCode();
		persona1.setNombre("Juan");
		persona1.setEdad(25);

		EjemploHashCode persona2 = new EjemploHashCode();
		persona2.setNombre("Juan");
		persona2.setEdad(25);

		// El método equals() debería devolver true
		System.out.println("¿Las personas son iguales? " + persona1.equals(persona2));

		// El método hashCode() debería devolver el mismo valor para objetos iguales
		System.out.println("HashCode persona1: " + persona1.hashCode());
		System.out.println("HashCode persona2: " + persona2.hashCode());

	}

}
