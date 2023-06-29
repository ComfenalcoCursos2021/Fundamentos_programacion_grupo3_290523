package practica.grupoiii;

import java.util.Scanner;

public class Lanzador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1;
		int numero2;
		int numero3;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese el primer numero");
		numero1 = teclado.nextInt();

		System.out.println("Ingrese el segundo numero");
		numero2 = teclado.nextInt();

		System.out.println("Ingrese el tercer numero");
		numero3 = teclado.nextInt();

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println(numero1 + " ES EL MAYOR");
		} else if (numero2 > numero3) {
			System.out.println(numero2 + " ES EL MAYOR");
		} else {
			System.out.println(numero3 + " ES EL MAYOR");
		}

		System.out.println("termino el programa");
		teclado.close();
	}

}
