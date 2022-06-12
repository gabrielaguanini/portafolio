package Objetos;

public class principal {

	public static void main(String[] args) {
	
		Docente nuevoDocente= new Docente("Gabriela", "Guanini", 34555667, "Historia");
		Estudiante nuevoEstudiante = new Estudiante ("Nicolas", "Oliver", 32333333, "Sistemas de Representacion");
		
		
		System.out.println("Nombre Completo del Docente: " + nuevoDocente.getApellido() + ", " + nuevoDocente.getNombre() + ". Su N de DNI es: " + nuevoDocente.getDni() + " Su designacion es en la Asignatura: " + nuevoDocente.getMateria());
		System.out.println("Nombre Completo del Alumno: " + nuevoEstudiante.getApellido() + ", " + nuevoEstudiante.getNombre() + ". Su N de DNI es: " + nuevoEstudiante.getDni() + " Inscripto en la Asignatura: " + nuevoEstudiante.getMateria());
	}

}
