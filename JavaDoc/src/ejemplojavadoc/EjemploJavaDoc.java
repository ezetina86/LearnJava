/**
 * Derechos reserbados Enrique Zetina
 */
package ejemplojavadoc;

import com.gm.javadoc.*;

/**
 * Clase para probar el conceptp de JAVADOC
 * @author Enrique Zetina
 * @version 0.1
 */
public class EjemploJavaDoc {
	
	/**
	 * Metdodo que ejecuta la prueba de la clase Aritmetivca
	 * @param args argumentos de la line de comandos
	 */
	
	public static void main(String[] args) {
		int resultado = new Aritmetica(3,2).sumar();	
		
		System.out.println("El resultado de  la suma es: " +  resultado);
	}

}
