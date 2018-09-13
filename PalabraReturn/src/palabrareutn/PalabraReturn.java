package palabrareutn;

public class PalabraReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado = sumar(0,0);
		System.out.println("Resultado : " +  resultado);
		
	}
	
	public static int  sumar(int a, int b) {
		if(a== 0 && b==0) {
			System.out.println("Proporcionar valores distintos de cero");
			return 0;
		}
		
		return a+b;
	}

}
