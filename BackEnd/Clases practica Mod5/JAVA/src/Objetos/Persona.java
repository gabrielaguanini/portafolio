package Objetos;

public class Persona {
	public Vehiculo vehiculo;
	private String nombre;
	private String apellido;
	private int DNI=0;
	private String materia;
	
	
public Persona(String nombre, String apellido, int DNI, String materia ) {
	this.nombre= nombre;
	this.apellido=apellido;
	this.DNI=DNI;
	this.materia=materia;
}

public void setVehiculo (Vehiculo nuevoVehiculo) {
	vehiculo = nuevoVehiculo;
}

public Vehiculo getVehiculo() {
	return vehiculo;
}

public void setNombre(String nuevoNombre) {
	nombre=nuevoNombre;
}

public String getNombre() {
	return nombre;
}

public void setApellido(String nuevoApellido) {
	apellido=nuevoApellido;
}

public String getApellido() {
	return apellido;
}

public void setDNI(int nuevoDni) {
	DNI=nuevoDni;
}

public int getDni() {
	return DNI;
}

public void setMateria(String nuevaMateria) {
	materia=nuevaMateria;
}

public String getMateria() {
	return materia;
}

public boolean paga_coop() {
	return false;
}
}
