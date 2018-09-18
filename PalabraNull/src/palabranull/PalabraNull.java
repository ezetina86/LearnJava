package palabranull;

public class PalabraNull {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1= new Persona("Juan");
		System.out.println("Nombre p1: " + p1.obtenerNombre());
		
		Persona p2 = p1;
		System.out.println("Nombre p2: " + p2.obtenerNombre());
		
		p1=null;
		
		System.out.println("Nombre p2: " + p2.obtenerNombre());
		
		if(p1 !=null) {
			System.out.println("Nombre p1: " + p1.obtenerNombre());
		}

	}

}

class Persona{
	String nombre;
	
	public Persona(String nombre) {
		this.nombre= nombre;
		
	}
	public String obtenerNombre() {
		return this.nombre;
	}
}