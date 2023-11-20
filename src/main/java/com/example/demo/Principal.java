package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		List<Empleado> listaEmpleados = new ArrayList<>();
		Map<Integer, List<Empleado>> empleadosPorAnioContratacion = null;
		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {
			mostrarMenu();
			System.out.print("Ingrese su opción (0 para salir): ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				System.out.println(" Crear una lista de empleados Seleccionaste la opción 1");
				// Crear una lista de empleados
				listaEmpleados.add(new Empleado("Empleado1", LocalDate.of(2020, 1, 1),
						new HashSet<>(Arrays.asList("Java", "SQL"))));
				listaEmpleados.add(new Empleado("Empleado2", LocalDate.of(2019, 5, 15),
						new HashSet<>(Arrays.asList("Python", "JavaScript"))));
				listaEmpleados.add(new Empleado("Empleado3", LocalDate.of(2021, 8, 10),
						new HashSet<>(Arrays.asList("C#", "React"))));

				break;
			case 2:
				System.out.println(
						" Iterar sobre la lista y mostrar la información de cada empleado Seleccionaste la opción 2");
				// Iterar sobre la lista y mostrar la información de cada empleado
				System.out.println("Información de empleados:  Completas");
				listaEmpleados.forEach(
						empleado -> System.out.println("Nombre: " + empleado.getNombre() + ", Fecha de Contratación: "
								+ empleado.getFechaContratacion() + ", Habilidades: " + empleado.getHabilidades()));
				break;
			case 3:
				System.out
						.println(" Verificar si un empleado tiene una habilidad específica Seleccionaste la opción 3");
				// Verificar si un empleado tiene una habilidad específica
				String habilidadBuscada = "Java";
				boolean empleadoConHabilidad = listaEmpleados.stream()
						.anyMatch(empleado -> empleado.getHabilidades().contains(habilidadBuscada));
				System.out.println(
						"¿Al menos un empleado tiene la habilidad " + habilidadBuscada + "? " + empleadoConHabilidad);

				break;

			case 4:
				System.out.println(
						" Calcular y mostrar el tiempo de empleo para cada empleado Seleccionaste la opción 4");
				// Verificar si un empleado tiene una habilidad específica

				// Calcular y mostrar el tiempo de empleo para cada empleado
				System.out.println("Tiempo de empleo de cada empleado:");
				listaEmpleados.forEach(empleado -> System.out
						.println(empleado.getNombre() + ": " + empleado.calcularTiempoEmpleo() + " años"));

				break;

			case 5:
				System.out.println(
						" Agrupar a los empleados por año de contratación utilizando un Map Seleccionaste la opción 5");
				// Verificar si un empleado tiene una habilidad específica

				// Agrupar a los empleados por año de contratación utilizando un Map
				empleadosPorAnioContratacion = listaEmpleados.stream()
						.collect(Collectors.groupingBy(empleado -> empleado.getFechaContratacion().getYear()));

				break;

			case 6:
				System.out.println(
						" Utilizar un bucle para mostrar la información de los empleados agrupados por Seleccionaste la opción 6");
				// Verificar si un empleado tiene una habilidad específica

				// Utilizar un bucle para mostrar la información de los empleados agrupados por
				// año
				System.out.println("Empleados agrupados por año de contratación:");
				for (Map.Entry<Integer, List<Empleado>> entry : empleadosPorAnioContratacion.entrySet()) {
					System.out.println("Año " + entry.getKey() + ":");
					entry.getValue().forEach(empleado -> System.out.println("  " + empleado.getNombre()));
				}

				break;

			case 7:
				System.out.println("Seleccionaste la opción 7");
				// Verificar si un empleado tiene una habilidad específica

				// Crear un Deque de empleados
				Deque<Empleado> dequeEmpleados = new ArrayDeque<>();

				// Agregar empleados al frente del Deque
				dequeEmpleados.offerFirst(new Empleado("Empleado0", LocalDate.of(2018, 3, 20), Set.of("HTML", "CSS")));
				dequeEmpleados
						.offerFirst(new Empleado("Empleado-1", LocalDate.of(2017, 6, 10), Set.of("Ruby", "Rails")));

				// Agregar empleados al final del Deque
				dequeEmpleados
						.offerLast(new Empleado("Empleado3", LocalDate.of(2019, 12, 5), Set.of("Node.js", "MongoDB")));
				dequeEmpleados.offerLast(new Empleado("Empleado4", LocalDate.of(2020, 9, 15), Set.of("Swift", "iOS")));

				// Mostrar información de empleados en ambos extremos del Deque1
				System.out.println("Empleado al frente del Deque: " + dequeEmpleados.peekFirst());
				System.out.println("Empleado al final del Deque: " + dequeEmpleados.peekLast());

				// Eliminar empleados de ambos extremos del Deque
				System.out.println("Empleado eliminado del frente del Deque: " + dequeEmpleados.pollFirst());
				System.out.println("Empleado eliminado del final del Deque: " + dequeEmpleados.pollLast());

				// Mostrar información de todos los empleados en el Deque
				System.out.println("Información de todos los empleados en el Deque:");
				dequeEmpleados.forEach(System.out::println);

				break;

			case 0:
				System.out.println("Saliendo del programa. ¡Hasta luego!");
				break;
			default:
				System.out.println("Opción no válida. Inténtalo de nuevo.");
				break;
			}

		} while (opcion != 0);

		scanner.close();

	}

	public static void mostrarMenu() {
		System.out.println("===== Menú =====");
		System.out.println("1. Realizar acción 1");
		System.out.println("2. Realizar acción 2");
		System.out.println("3. Realizar acción 3");
		System.out.println("4. Realizar acción 4");
		System.out.println("5. Realizar acción 5");
		System.out.println("6. Realizar acción 6");
		System.out.println("7. Realizar acción 7");
		System.out.println("0. Salir");
	}

}
