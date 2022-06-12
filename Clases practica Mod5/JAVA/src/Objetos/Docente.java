package Objetos;

public class Docente extends Persona {
	private String asignatura;
	
public Docente(String nombre, String apellido, int DNI, String materia) {
	super(nombre, apellido, DNI, materia);
}
	
public void setAsignatura(String nuevaAsignatura) {
	asignatura=nuevaAsignatura;
}

public String getAsignatura() {
	return asignatura;
}

public void pone_nota() {}
}
