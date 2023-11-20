package com.example.demo;

enum DiasDeLaSemana {
	LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}

public class EjercicioEnumTypeSafe {

	public static void main(String[] args) {

		// Imprimir todos los días de la semana
		imprimirDias();

		// Obtener el día siguiente a MARTES
		DiasDeLaSemana siguienteDia = obtenerDiaSiguiente(DiasDeLaSemana.MARTES);
		System.out.println("El día siguiente a MARTES es: " + siguienteDia);

		// Verificar si MIERCOLES es un día laboral
		boolean esDiaLaboral = esDiaLaboral(DiasDeLaSemana.MIERCOLES);
		System.out.println("¿MIERCOLES es un día laboral? " + esDiaLaboral);

	}

	static void imprimirDias() {
		// Imprimir todos los días de la semana
		System.out.println("Días de la semana:");
		for (DiasDeLaSemana dia : DiasDeLaSemana.values()) {
			System.out.println(dia);
		}
	}

	static DiasDeLaSemana obtenerDiaSiguiente(DiasDeLaSemana dia) {
		// Obtener el día siguiente
		DiasDeLaSemana[] dias = DiasDeLaSemana.values();
		int indice = (dia.ordinal() + 1) % dias.length;
		return dias[indice];
	}

	static boolean esDiaLaboral(DiasDeLaSemana dia) {
		// Verificar si el día es laboral (LUNES a VIERNES)
		switch (dia) {
		case LUNES:
		case MARTES:
		case MIERCOLES:
		case JUEVES:
		case VIERNES:
			return true;
		default:
			return false;
		}

	}
}