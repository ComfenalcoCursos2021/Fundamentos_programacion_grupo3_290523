package com.grupoiii.principal;

import java.util.Scanner;

public class Lanzador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);		
		
		int numero;
		int suma = 0;

		System.out.println("Por favor el numero N ..... ");
		numero = lector.nextInt(); 

		for (int a = 1; a <= numero; a = a + 1) {
			suma = suma + a;
		}
		
		System.out.println("El valor de la suma es " + suma);

		System.out.println("termino el programa");
		lector.close();
	}

}
