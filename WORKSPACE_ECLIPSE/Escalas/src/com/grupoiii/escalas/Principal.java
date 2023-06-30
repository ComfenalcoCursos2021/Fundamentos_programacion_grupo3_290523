package com.grupoiii.escalas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		DecimalFormat formateador = new DecimalFormat("#");
		double n;
		int e;

		System.out.println("Ingrese el numero de la escala");		
		n = lector.nextDouble();
		
		while(n<=0) {
			System.out.println("Debe ser un numero positivo");
			System.out.println("Ingrese nuevamente el numero");
			n = lector.nextDouble();
		}
		
		do {
			System.out.println("Ingrese la cantidad de escalas");
			System.out.println("recuerde que debe ser un numero mayor a 4");
			e = lector.nextInt();	
		} while(e<=4);
		
		

		for (int a = 1; a <= e; a = a + 1) {
			int y = e + 1 - a;
			System.out.println(y + " * " + formateador.format(n) );
			n = n * y;
		}

		for (int i = 1; i <= e; i = i + 1) {
			int q = e + 1 - i;
			System.out.println(q + " / " + formateador.format(n));
			n = n / q;
		}

		System.out.println("termino el programa");
		lector.close();
	}

}
