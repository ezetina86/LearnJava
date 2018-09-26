package ventas;


import com.gm.ventas.*;


public class Ventas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p1 = new Producto("Camisa",50.00);
		Producto p2 = new Producto("Pantalon",100.00);
		Producto p3 = new Producto("Corbata",30.00);
		
		Orden orden1 = new Orden();
		
		orden1.agregarProducto(p1);
		orden1.agregarProducto(p2);
		orden1.agregarProducto(p3);
		
		orden1.mostrarOrden();
		
		Orden orden2= new Orden();
		
		Producto p4 = new Producto("Zapatos",200);
		Producto p5 = new Producto("Blusa",90);
		
		orden2.agregarProducto(p1);
		orden2.agregarProducto(p4);
		orden2.agregarProducto(p5);
		orden2.agregarProducto(p3);
		
		System.out.println("");
		orden2.mostrarOrden();
		
	}

}
