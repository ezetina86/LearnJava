package com.gm.dominio.matrices;

public class Persona {
	
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNomnbre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Persona{" +"nombre= " + getNombre() + " }";
	}
}
