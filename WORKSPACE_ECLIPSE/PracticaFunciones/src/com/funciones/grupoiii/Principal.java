package com.funciones.grupoiii;

public class Principal {

	public static int calculoRaro(int xilofono, int y) {
		int resultado;
		resultado = xilofono + y + (2 * xilofono) + (2 * y);

		return resultado;
	}

	public static void imprimirEncabezado() {
		System.out.println("******************************");
		System.out.println("*                            *");		
		System.out.println("*       CALCULO RARO         *");
		System.out.println("*                            *");		
		System.out.println("******************************");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		imprimirEncabezado();
		
		int a = 9;
		int b = 15;
		int c;
		int d;
		int e;

		c = calculoRaro(9, 15);
		
		System.out.println("El valor a la c " + c);
		d = calculoRaro(b, c);
		System.out.println("El valor de d " + d);
		e = calculoRaro(c, d);
		System.out.println("El valor de e " + e);
		System.out.println("Termino el programa...");
		imprimirEncabezado();
	}

}
