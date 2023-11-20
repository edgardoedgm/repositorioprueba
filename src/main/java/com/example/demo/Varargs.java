package com.example.demo;

public class Varargs {

	public static void main(String[] args) {

		System.out.println(suma(1, 2, 3, 4, 5, 10));
		System.out.println(suma(10, 20, 30));
	}

	static int suma(int... numeros) {
		int total = 0;
		for (int num : numeros) {
			total += num;
		}
		return total;
	}

}
