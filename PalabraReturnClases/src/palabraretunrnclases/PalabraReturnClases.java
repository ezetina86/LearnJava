package palabraretunrnclases;

public class PalabraReturnClases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma s= creaObjetoSuma();
		int resultado = s.a + s.b;
		System.out.println("Resultado: " + resultado);
	}
	
	public static Suma creaObjetoSuma() {
		Suma s = new Suma(3,4);
		return s;
	}

}
