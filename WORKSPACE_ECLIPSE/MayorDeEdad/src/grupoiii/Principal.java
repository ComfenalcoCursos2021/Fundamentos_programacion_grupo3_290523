package grupoiii;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int edad;
		System.out.println("Por favor ingresa ingresa la edad");

		edad = teclado.nextInt();

		if (edad < 18) {
			System.out.println("ES MENOR DE EDAD");
			if (edad < 10) {
				System.out.println("ES UN NIÑO");
			}
		} else {
			System.out.println("ES MAYOR DE EDAD");
		}

		System.out.println("termino el programa");
		teclado.close();

	}

}
