package personas;

public class Persona {
   //Atributos de la clase
	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	
	//Metodos de la clase
	//Lo usaran los objetos de esta clase
	
	public void desplegarNomnbre() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido Paterno: " + apellidoPaterno);
		System.out.println("Apellido Materno: " + apellidoMaterno);
	}
}
