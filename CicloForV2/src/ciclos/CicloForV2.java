package ciclos;

import java.util.Scanner;

public class CicloForV2 {
	
	private static Scanner entaradaEscaner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingresa el limite del ciclo: \n");
		int limite;
		entaradaEscaner = new Scanner(System.in);
		limite= entaradaEscaner.nextInt();
		
		for(int contador=0; contador < limite; contador++) {
			System.out.println("El valor del contador es: " + contador);
		}

	}

}
