package calculames;

public class CalculaMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes =12;
		String estacion;
		
		if(mes ==1 || mes==2 || mes ==12) {
			estacion="invierno";
		}else  if(mes ==3 || mes==4|| mes ==5) {
			estacion="primavera";
		}else if (mes ==6 || mes==7 || mes ==8) {
			estacion="verano";
		}else if(mes ==9 || mes==10 || mes ==11) {
			estacion="oto�o";
		}else {
			estacion="Mes incorrecto";
		}
		System.out.println("Estas en " + estacion);
	}
}
