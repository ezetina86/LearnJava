package ciclos;

import java.util.Scanner;

public class CicloWhileV2 {

	private static Scanner entaradaEscaner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxElement;
		int contador=0;
		
		System.out.println("Ingresa el numeor de iteraciones: \n");
		entaradaEscaner = new Scanner(System.in);
		maxElement= entaradaEscaner.nextInt();
		
		while(contador < maxElement) {
			System.out.println("El valor del contador es: " +  contador);
			contador++;
		}
		
	}

}
