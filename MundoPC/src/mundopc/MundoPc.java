package mundopc;

import com.gm.mundopc.*;

public class MundoPc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monitor monitorToshi = new Monitor("Toshiba",13);
		Teclado tecladoHyperx = new Teclado("Gaming","Hyperx");
		Raton ratonLogitech = new Raton("Gaming","Logitech");
		Computadora alienWare = new Computadora("Computadora Alien Ware", monitorToshi, tecladoHyperx, ratonLogitech);
		
		Monitor monitorDell = new Monitor("Dell",13);
		Teclado tecladoLogitech = new Teclado("Gaming","Logitech");
		Raton ratonMac = new Raton("Magic mouse","Apple");
		Computadora alienDell = new Computadora("Computadora Chida", monitorDell, tecladoLogitech, ratonMac);
		
		Computadora compuArmadita = new Computadora("Computadors Armadita",monitorDell,  tecladoHyperx, ratonLogitech);
		
		Orden orden1 = new Orden();
		
		orden1.agregarProducto(compuArmadita);
		orden1.mostrarOrden();
		System.out.println("");
		
		Orden orden2 = new Orden();
		
		orden2.agregarProducto(alienDell);
		orden2.agregarProducto(alienWare);
		orden2.mostrarOrden();

	}

}
