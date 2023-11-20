package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class EjercicioExpresionesLambda {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Filtrar números pares
		System.out.println("Números pares:");
		numeros.forEach(numero -> {
			if (numero % 2 == 0) {
				System.out.print(numero + " ");
			}
		});

		// Elevar al cuadrado cada número
		System.out.println("\nCuadrados de los números:");
		numeros.forEach(numero -> {
			int cuadrado = numero * numero;
			System.out.print(cuadrado + " ");
		});

		// Calcular la suma de los cuadrados
		int sumaCuadrados = numeros.stream().map(numero -> numero * numero).reduce(0, Integer::sum);
		System.out.println("\nSuma de los cuadrados: " + sumaCuadrados);

		List<String> palabras = Arrays.asList("java", "streams", "expresiones", "lambda", "programacion", "funcional");

		System.out.println("Palabras originales:");
		palabras.forEach(System.out::println);

		// Filtrar, convertir a mayúsculas y imprimir
		System.out.println("\nPalabras filtradas y en mayúsculas:");
		palabras.stream().filter(palabra -> palabra.length() > 6).map(String::toUpperCase).forEach(System.out::println);

	}

}
