package ejemploherencia;

public class Empleado extends Persona {

	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	
	public Empleado(String nombre, double sueldo) {
		super (nombre);
		this.idEmpleado = ++contadorEmpleado;
		this.sueldo = sueldo;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Empleado [ " + "idEmpĺeado: " + idEmpleado + ", sueldo: " + sueldo + "]\n";
	}
	
	
}
