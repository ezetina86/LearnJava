package ejemploeneumeraciones;

public class EjemploEnumeraciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Valor 1 : " + Dias.LUNES);
		
		indicarDia(Dias.LUNES);
		
		System.out.println("Continente no.4: " +  Continentes.AMERICA);
		
		System.out.println("");
		inidcarContinentes(Continentes.OCEANIA);
		
		System.out.println("");
		imprimirContinentes();
		
	}
	
	public static void indicarDia(Dias dia) {
		switch(dia) {
		case LUNES:
			System.out.println("Peimer dia de la semana:");
			break;
		case MARTES:
			System.out.println("Segundo dia de la semana:");
			break;
		case MIERCOLES:
			System.out.println("Tercer dia de la semana:");
			break;
		case JUEVES:
			System.out.println("Cuarto dia de la semana:");
			break;
		case VIERNES:
			System.out.println("Quinto dia de la semana:");
			break;
		case SABADO:
			System.out.println("Sexto dia de la semana:");
			break;
		case DOMINGO:
			System.out.println("Septimo dia de la semana:");
			break;
			
			
		}
	}

	public static void inidcarContinentes(Continentes continentes) {
		switch(continentes) {
		case AFRICA:
			System.out.println("No. de paides en: " + continentes +  ": " + continentes.getPaises());
		case EUROPA:
			System.out.println("No. de paides en: " + continentes +  ": " + continentes.getPaises());
		case ASIA:
			System.out.println("No. de paides en: " + continentes +  ": " + continentes.getPaises());
		case AMERICA:
			System.out.println("No. de paides en: " + continentes +  ": " + continentes.getPaises());
		case OCEANIA:
			System.out.println("No. de paides en: " + continentes +  ": " + continentes.getPaises());
		
		}
	}

	public static void imprimirContinentes() {
		for(Continentes c: Continentes.values()) {
			System.out.println("Continente: " + c + " contiene: " +  c.getPaises() + " paises.");
		}
	}
}
