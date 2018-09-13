package aritmetica;

public class Aritmetica {
   ///Atributos de  clase
	int a;
	int b;
	
   //Constructor Vacio
	Aritmetica(){
		
	}
	
	//Constructor con dos argumentos
	Aritmetica(int a, int b){
		this.a= a;
		this.b= b;	
	}
	
	//Metodos
	
	//metodo suma
	int sumar() {
		return a+b;
	}
	
	//metodo resta
	int restar() {
		return a-b;
	}
	
	//metodo multiplicar
	int multiplicar() {
		return a*b;
	}
	
	//metodo dividir
	int dividir() {
		return a/b;
	}
}
