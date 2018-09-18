package ejemploherencia;

public class EjemploHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado e1 = new Empleado("Juan",2500);
		System.out.println("Imprimo el objeto Empleado 1");
		System.out.println(e1);
		
		Empleado e2 = new Empleado("Pedro",5000);
		e2.setEdad(30);
		e2.setGenero('M');
		e2.setDireccion("Guadalajara, Mexico");
		System.out.println(e2);
		
		Cliente c1 = new Cliente(new  java.util.Date(), false);
		System.out.println("Imprimo el objeto Cliente 1");
		System.out.println(c1);
		c1.setNombre("Karla");
		c1.setEdad(32);
		c1.setGenero('F');
		c1.setDireccion("Toluca, Mexico");
		System.out.println(c1);
	}

}
