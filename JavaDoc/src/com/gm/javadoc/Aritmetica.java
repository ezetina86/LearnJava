package com.gm.javadoc;
 /**
  * Esta  clase permite realizar operaciones aritmeticas como sumar, restar, etc.
  * 
  * @author  Henry
  * @version 0.01
  */


public class Aritmetica {
	
	/**
	 * Primer operando
	 */
	
	int operandoA;
	
	/**
	 * Segundo Operando
	 */
	
	int operandoB;
	
	/**
	 * Constructor vacio de la clase
	 */
	public Aritmetica() {
		
	}
	
	/**
	 * Constructor de la clase
	 * @param  operandoA
	 * @param  operandoB
	 */
	public Aritmetica(int a, int b ) {
		this.operandoA=a;
		this.operandoB=b;
	}
	
	/**
	 * Este metodo realiza la suma de dos numeros enteros
	 * @return int resultado de la suma
	 */
	public int sumar() {
		return operandoA + operandoB;
}
	

}
