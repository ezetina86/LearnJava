package ejemplovarargs;

public class EjemploVarArgs {

	public static void main(String[] args) {

		imprimirNumeros(1,2,3,4,5,6,7,8,9);

		System.out.println("");
		imprimirForEach(1,2,3,4,5,6,7);

		System.out.println();
		impimirParametros("Juan", true, 1,2,3,4,5,6,7);

	}	

	public static void imprimirNumeros( int... numeros) {
		int elemento;
		for(int i=0; i<numeros.length; i++) {
			elemento =  numeros[i];
			System.out.println("Elemento " + i + elemento);

		}
	}

	public static void imprimirForEach(int... numeros) {
		for( int numero : numeros) {
			System.out.println("El numero es: " + numero);
		}
	}
	public static void 	impimirParametros(String nombre, boolean valido, int... numeros) {
		System.out.println("Nombre: " + nombre);

		System.out.println("Valido: " + valido);

		System.out.println("Nombre: " + nombre);

		for( int numero : numeros) {
			System.out.println("El numero es: " + numero);
		}

	}
}