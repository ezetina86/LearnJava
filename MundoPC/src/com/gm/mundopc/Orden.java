package com.gm.mundopc;


public class Orden {
	
	private final int idOrden; 
	private final Computadora computadoras[];
	private static int contadorOrdenes;
	private int contadorProductos;
	private static final int maxProductos=10;
	
	public Orden() {
		this.idOrden = ++contadorOrdenes;
		computadoras = new Computadora[maxProductos];
	}
	
	public void agregarProducto(Computadora computadora) {
		if(contadorProductos <  maxProductos) {
			computadoras[contadorProductos++]= computadora;
		}
		else {
			System.out.println("Se ha superado el maximo de productos: " + maxProductos);
		}
	}

	
	public void mostrarOrden() {
		System.out.println("Orden #" + idOrden);
		System.out.println("Computadoras de la Orden #" + idOrden + ": " );
		for(int i=0; i< contadorProductos; i++) {
			System.out.println(computadoras[i]);
		}
	}
}
