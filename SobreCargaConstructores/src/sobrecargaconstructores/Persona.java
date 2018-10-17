package sobrecargaconstructores;

public class Persona {
	
	private int idPersona;
	private String nombre;
	private int edad;
	private static int contadorPersonas;
	
	//Constructor sin argumentos
	//Asignamos el idPersona
	
	Persona() {
		this.idPersona= ++contadorPersonas;
	}
	
	//Constructor con dos argumentos
	public Persona(String nombre, int edad) {
		this();
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [" + "idPersona" + idPersona + ", nombre: " + nombre + ", edad= " + edad + "\n";
	}
}
 