package aritmetica;

public class PruebaAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int operandoA=6;
		int operandoB=2;
		
		//Objeto de la clase Aritmetica
		Aritmetica obj1= new Aritmetica(operandoA,operandoB);
		
		//Imprimir operandos
		System.out.println("Operando A: " +  operandoA + " Operando B: " + operandoB);
		
		//Suma
		System.out.println("Suma: " + obj1.sumar());
		
		//Resta
		System.out.println("Resta: " + obj1.restar());
		
		//Multiplicacion
		System.out.println("Multiplicacion: " + obj1.multiplicar());
		
		//Division
		System.out.println("Division: " + obj1.dividir());

	}

}
