package ejemplopalabrafinal;

import ejemplofinal.ClaseFinal;

public class EjemploPalabraFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nombre Persona: " + ClaseFinal.persona.getNombre());
		
		ClaseFinal.persona.setNombre("Otro");
		
		System.out.println("Nombre Persona: " + ClaseFinal.persona.getNombre());

	}

}
