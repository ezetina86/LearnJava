package encapsulamiento;

public class Encapsulamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("Juan","Perez",false);
		//Accedemos al atributo nombre 
		System.out.println("Nombre de P1= " + p1.getNombre());
		
		Persona p2 = new Persona("Karla","Gonzalez",false);
		//Accedemos al atributo nombre 
		System.out.println("Estasdi del objeto  de P2= " + p2);
		
		//Marco como eliminado a P2
		p2.setBorrado(true);
		System.out.println("Estasdi del objeto  de P2= " + p2);
		
		//Creo un objeto vacio
		Persona p3 = new Persona();
		//Estado del objeto 3
		System.out.println("Estasdi del objeto  de P3= " + p3);
		
	}

}
