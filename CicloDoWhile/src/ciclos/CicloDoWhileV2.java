package ciclos;

import java.util.Scanner;

public class CicloDoWhileV2 {
	
	private static Scanner entaradaEscaner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=0;
		int limite;
		
		System.out.println("Ingresa el numero de iteraciones\n");
		entaradaEscaner= new Scanner(System.in);
		limite = entaradaEscaner.nextInt();
		
		do {
			System.out.println("El valor del contador es: " + contador);
			contador++;
		}
		while(contador < limite);
		
	}

}
