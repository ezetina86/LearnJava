package aritmetica;

public class Aritemrica {
	
	int a;
	int b;
	
	Aritemrica() {
		
	}
	
	  //Constructor con 2 argumentos
	Aritemrica( int arg1 , int arg2){
        a = arg1;
        b = arg2;
    }
	
	int  sumar(int a, int b) {
		return a+b;
	}
	
	//Este metodo toma los atributos de la clase para hacer la suma
    //Agregar mas de un metodo con el mismo nombre se le conoce como
    //sobrecarga de metodos, esto lo estudiaremos mas adelante
    int sumar(){
        return a + b;
    }

}
