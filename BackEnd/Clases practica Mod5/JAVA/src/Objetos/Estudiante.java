package Objetos;

public class Estudiante extends Persona {
	private String asignatura;
	
public Estudiante(String nombre, String apellido, int DNI, String materia) {
	super(nombre, apellido, DNI, materia);
}

public void setAsignatura(String nuevaAsignatura) {
	asignatura=nuevaAsignatura;
}

public String getAsignatura() {
	return asignatura;
}

public void recibe_nota() {}
}
