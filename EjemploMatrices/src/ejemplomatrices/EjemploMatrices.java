package ejemplomatrices;
import com.gm.dominio.matrices.*;

public class EjemploMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edades [] [];
		
		edades = new int [3][2];
		
		edades [0][0] = 10;
		edades [0][1] = 20;
		edades [1][0] = 30;
		edades [1][1] = 40;
		edades [2][0] = 50;
		edades [2][1] = 60;
		
		System.out.println("Matriz de enteros indice 0-0 : " + edades [0][0]);
		System.out.println("Matriz de enteros indice 0-1 : " + edades [0][1]);
		System.out.println("Matriz de enteros indice 1-0 : " + edades [1][0]);
		System.out.println("Matriz de enteros indice 1-1 : " + edades [1][1]);
		System.out.println("Matriz de enteros indice 2-0 : " + edades [2][0]);
		System.out.println("Matriz de enteros indice 2-1 : " + edades [2][1]);
		
		String [][] nombres = {{"Teresa","Cesar","Pedro"},{"Enrique","Julio","Juan"}};
		
		System.out.println("Largo matriz renglones: " + nombres.length);
		System.out.println("Largo matriz filas: " + nombres[0].length);
		
		for(int i=0;i < nombres.length; i++) {
			for(int j=0; j < nombres[i].length; j++) {
				System.out.println("Matriz en el indice : [" + i + "] ,[" + j + "]: " + nombres[i][j]);
			}
		}
		
		
		//Matriz de personas
		Persona personas [][] = new Persona [3][2];
		//Inicializacion de la matriz de objetos
		
		personas[0][0] = new Persona("Enrique");
		personas[0][1] = new Persona("Juan");
		personas[1][0] = new Persona("Pedro");
		personas[1][1] = new Persona("Maria");
		personas[2][0] = new Persona("Liliet");
		personas[2][1] = new Persona("Catty");
		
		System.out.println("Largo matriz renglones: " + personas.length);
		System.out.println("Largo matriz filas: " + personas[0].length);
		
		for(int i=0;i < personas.length; i++) {
			for(int j=0; j < personas[i].length; j++) {
				System.out.println("Matriz en el indice : [" + i + "] ,[" + j + "]: " + personas[i][j]);
			}
		}
		
			
	}

}
