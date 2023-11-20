package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class EjercicioCompletoBiblioteca {

	// Enumeración para representar los géneros literarios de los libros
	public enum Genero {
		NOVELA, CIENCIA_FICCION, HISTORIA, POESIA
	}

	// Clase Libro con la anotación @Builder y @EqualsAndHashCode de Lombok
	@Builder
	@ToString
	@EqualsAndHashCode
	@Getter
	@Setter
	public static class Libro {
		private String titulo;
		private String autor;
		private Genero genero;
		private int anioPublicacion;
	}

	public static void main(String[] args) {
		// Crear algunos libros utilizando el patrón Builder y varargs
		Libro libro1 = Libro.builder().titulo("Cien años de soledad").autor("Gabriel García Márquez")
				.genero(Genero.NOVELA).anioPublicacion(1967).build();
		Libro libro2 = Libro.builder().titulo("1984").autor("George Orwell").genero(Genero.CIENCIA_FICCION)
				.anioPublicacion(1949).build();
		Libro libro3 = Libro.builder().titulo("Sapiens: De animales a dioses").autor("Yuval Noah Harari")
				.genero(Genero.HISTORIA).anioPublicacion(2011).build();
		Libro libro4 = Libro.builder().titulo("Cien sonetos de amor").autor("Pablo Neruda").genero(Genero.POESIA)
				.anioPublicacion(1959).build();

		// Crear una lista de libros
		List<Libro> biblioteca = Arrays.asList(libro1, libro2, libro3, libro4);

		// Mostrar la información de los libros
		System.out.println("Información de los libros:");
		biblioteca.forEach(System.out::println);

		// Filtrar libros de ciencia ficción y mostrar sus títulos
		System.out.println("\nLibros de Ciencia Ficción:");
		biblioteca.stream().filter(libro -> libro.getGenero() == Genero.CIENCIA_FICCION).map(Libro::getTitulo)
				.forEach(System.out::println);

		// Agrupar libros por género
		Map<Genero, List<Libro>> librosPorGenero = biblioteca.stream().collect(Collectors.groupingBy(Libro::getGenero));
		System.out.println("\nLibros agrupados por género:");
		librosPorGenero.forEach((genero, listaLibros) -> {
			System.out.println(genero + ":");
			listaLibros.forEach(libro -> System.out.println("  " + libro));
		});
	}
}