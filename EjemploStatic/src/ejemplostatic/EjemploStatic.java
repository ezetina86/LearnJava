package ejemplostatic;

public class EjemploStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("Enrique");
		System.out.println("Persona 1: " + p1);
		
		Persona p2 = new Persona("Liliet");
		System.out.println("Persona 2: " + p2);
		
		System.out.println("No. de personas: " + Persona.getContadorPersonas());

	}

}
