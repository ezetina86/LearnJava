package personas;

public class PersonaPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creacion del objeto
		Persona p1 = new Persona();
		
		//Llamando a un mtodo del objeto creado
		System.out.println("Valores por default del  objeto persona: ");
		p1.desplegarNomnbre();
		
		//Modificando Valores
		p1.nombre="Enrique";
		p1.apellidoPaterno="Zetina";
		p1.apellidoMaterno="Moya";
		
		//Vuelvo a llamr el metodo
		System.out.println("\nNuevos valores por default del  objeto persona: ");
		p1.desplegarNomnbre();
	}

}
