package volumen;

public class Caja {
	
	int ancho;
	int largo;
	int alto;
	
	Caja(){
		
	}
	
	Caja(int ancho, int largo, int alto){
		this.ancho = ancho;
		this.largo = largo;
		this.alto = alto;
	}
	
	int volumen(){
		
		return alto*largo*ancho;
		
	}

}
