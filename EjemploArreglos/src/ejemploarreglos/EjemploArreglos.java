package ejemploarreglos;

import com.gm.dominio.arreglo.Persona;

public class EjemploArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edades[];
		
		edades = new int[3];
		
		edades[0]=20;
		edades[1]=30;
		edades[2]=99;
		
		System.out.println("Arreglo de enteros indice 0: " + edades[0]);
		System.out.println("Arreglo de enteros indice 0: " + edades[1]);
		System.out.println("Arreglo de enteros indice 0: " + edades[2]);
		
		Persona personas[];
		
		personas = new Persona[4];
		
		personas[0]= new Persona("Juan");
		personas[1]= new Persona("Karla");
		personas[2]= new Persona("Pedro");
		
		System.out.println("Arreglo de personas indice 0: " + personas[0]);
		System.out.println("Arreglo de personas indice 0: " + personas[1]);
		System.out.println("Arreglo de personas indice 0: " + personas[2]);
		
		String nombres[]= {"Sara","Laura","Carlos","Carmen"};
		
		System.out.println("");
		for(int i = 0 ; i < nombres.length; i++) {
			System.out.println("Arreglo de String indice: " + i + ": " + nombres[i]);
		}

	}

}
