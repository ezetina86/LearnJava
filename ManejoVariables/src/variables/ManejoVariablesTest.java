package variables;

public class ManejoVariablesTest {
	public static void main (String args[]) {
		//declaracion de variables boolena
		 boolean bool1;
		 //inicializacion
		 bool1=true;
		 //declaracion e inicializacion
		  boolean bool2=false;
		  System.out.println("Valor de bool1: " + bool1);
		  System.out.println("Valor de bool2: " + bool2);
		  System.out.println();
		  
		  //variables byte
		  byte b1=10;
		  //literal en hexadecimal
		  byte b2=0xa;
		  System.out.println("Valor de b1: " + b1);
		  System.out.println("Valor de b2: " + b2);
		  System.out.println();
		  
		  //variables short
		  short s1=2;
		  System.out.println("Valor de s1: " + s1);
		  System.out.println();
		  
		  //variables char, declaracion e inicializacion en una sola linea
		  //la primera declaracion es unicode
		  char ch1=65, ch2='A';
		  System.out.println("Valor de ch1: " + ch1);
		  System.out.println("Valor de s1: " + ch2);
		  System.out.println();
		  
		  //valriables enteras
		  int decimal=100;
		  int octal=0144;
		  int hexa=0x64;
		  System.out.println("Valor de decimal: " + decimal);
		  System.out.println("Valor de octal: " + octal);
		  System.out.println("Valor de hexa: " + hexa);
		  System.out.println();
		  
		  //variables long
		   long long1=10, long2=20L;
		   System.out.println("Valor de long1: " + long1);
		   System.out.println("Valor de long2: " + long2);
		   System.out.println();
		   
		   //variables float
		   float f1=16,f2=22.3F;
		   System.out.println("Valor de f1: " + f1);
		   System.out.println("Valor de f2: " + f2);
		   System.out.println();
		   
		   //variables double
		   double d1=11.0, d2=30.15d;
		   System.out.println("Valor de d1: " + d1);
		   System.out.println("Valor de d2: " + d2);
		   System.out.println();
		  		  
	}
}
