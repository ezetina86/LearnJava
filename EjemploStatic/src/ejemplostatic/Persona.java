package ejemplostatic;

public class Persona {
	
	private String nombre;
	private int idPersona;
	private static  int contadorPersona;
	
	public Persona(String nombre) {
		//Cada que se cree un objeto persona se incrementa un contador
		//parta obtener un nuevo idPersona
		contadorPersona++;
		//Asigno el nuevo valor del idPersona
		idPersona = contadorPersona;
		//Asigno el nombre recibido
		this.nombre = nombre;
	}
	
	public String toString() {
		return "Persona [idPersona:" + idPersona + ", nombre: " + nombre +"]; \n";
	}
	
	public static int getContadorPersonas() {
		return contadorPersona;
	}

}
