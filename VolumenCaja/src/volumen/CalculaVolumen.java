package volumen;

public class CalculaVolumen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 2;
		int b= 3;
		int c=4;
		
		//Creo objeto caja
		
		Caja  box1= new Caja(a,b,c);
		
		System.out.println("Ancho: " + a + " Largo: " +  b + " Alto: " + c);
		
		//Calculo el volumen
		
		System.out.println("Volumen de la caja: " + box1.volumen());
		
		

	}

}
