package sobrecargaconstructores;

public class SobreCargaConstructores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("Enrique",32);
		System.out.println("Imprimiendo P1");
		System.out.println(p1);
		
		Persona p2 = new Persona("Liliet", 33);
		System.out.println("Imprimiendo P2");
		System.out.println(p2);
		
		Empleado e1= new Empleado("Maria",33,20000);
		System.out.println("Imprimiendo E1");
		System.out.println(e1);

	}

}
