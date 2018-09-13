package operadores;

public class ManejoOperadoresTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Operadores Aritmeticos: ");
		int a = 1+2;
		int b = a*4;
		int c = b/2;
		int d = c-a;
		int e = -d;
		
		System.out.println("a= " +a);
		System.out.println("b= " +b);
		System.out.println("c= " +c);
		System.out.println("d= " +d);
		System.out.println("e= " +e);
		
		System.out.println("Operador Modulo (residuo):");
		System.out.println("x mod 10 = " + a%2);
		
		System.out.println("Operador Compuesto:");
		//a = a+4
		a +=2;
		b -=4;
		c *=a;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		System.out.println("Operador incremento:");
		//int a= a+1
		a++;
		System.out.println("a = " + a);

		//Preincremento / decremento (se incrementa antes de asignar un valor)
		c= ++a;
		d= b++;
		
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		System.out.println("\n Operador relacional:");
		// a es menor que b
		boolean res= a>b;
		System.out.println("res = " + res);
		
		System.out.println("\n Operador Ternario:");
		int min = (a<b) ? a:b;
		System.out.println("min = " + min);

		System.out.println("\n Operador de asignacion:");
		int i,j,k;
		//cadena de asignacion
		i = j = k = 100;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);

		


			


		
		

	}

}
