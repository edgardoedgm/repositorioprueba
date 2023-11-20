package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class EjercicioInferencia {

	public static void main(String[] args) {
		// Antes de la inferencia (Java 6 y versiones anteriores)
		List<String> listaAntes = obtenerListaAntes();
		System.out.println("Lista antes de la inferencia: " + listaAntes);

		// Con inferencia de tipos (Java 7 en adelante)
		List<String> listaConInferencia = obtenerListaConInferencia();
		System.out.println("Lista con inferencia: " + listaConInferencia);

		// Utilizando var para inferencia de tipos (Java 10 en adelante)
		var numeros = obtenerNumeros();
		System.out.println("Números con inferencia de tipos: " + numeros);

	}

	// Método que devuelve una lista de cadenas (antes de la inferencia)
	static List<String> obtenerListaAntes() {
		List<String> lista = new ArrayList<String>();
		lista.add("Java");
		lista.add("es");
		lista.add("genial");
		return lista;
	}

	// Método que devuelve una lista de cadenas con inferencia de tipos
	static List<String> obtenerListaConInferencia() {
		List<String> lista = new ArrayList<>(); // Inferencia de tipos en la declaración de la lista
		lista.add("Inferencia");
		lista.add("de");
		lista.add("tipos");
		return lista;
	}

	// Método que devuelve una lista de números con var
	static List<Integer> obtenerNumeros() {
		var lista = new ArrayList<Integer>(); // Inferencia de tipos con var
		lista.add(1);
		lista.add(2);
		lista.add(3);
		return lista;
	}

}
