package com.example.demo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {

	private String nombre;
	private LocalDate fechaContratacion;
	private Set<String> habilidades;

	public int calcularTiempoEmpleo() {
		LocalDate fechaActual = LocalDate.now();
		return Period.between(fechaContratacion, fechaActual).getYears();
	}

}
