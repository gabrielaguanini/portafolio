

/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  public Vehiculo vehiculo;
  private String nombre;
  private String apellido;
  private int dni = 0;
  private String materia;
  
  //
  // Constructors
  //
  public Persona () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of vehiculo
   * @param newVar the new value of vehiculo
   */
  public void setVehiculo (Vehiculo newVar) {
    vehiculo = newVar;
  }

  /**
   * Get the value of vehiculo
   * @return the value of vehiculo
   */
  public Vehiculo getVehiculo () {
    return vehiculo;
  }

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of apellido
   * @param newVar the new value of apellido
   */
  public void setApellido (String newVar) {
    apellido = newVar;
  }

  /**
   * Get the value of apellido
   * @return the value of apellido
   */
  public String getApellido () {
    return apellido;
  }

  /**
   * Set the value of dni
   * @param newVar the new value of dni
   */
  public void setDni (int newVar) {
    dni = newVar;
  }

  /**
   * Get the value of dni
   * @return the value of dni
   */
  public int getDni () {
    return dni;
  }

  /**
   * Set the value of materia
   * @param newVar the new value of materia
   */
  public void setMateria (String newVar) {
    materia = newVar;
  }

  /**
   * Get the value of materia
   * @return the value of materia
   */
  public String getMateria () {
    return materia;
  }

  //
  // Other methods
  //

  /**
   * @param        nombre
   * @param        apellido
   * @param        DNI
   * @param        materia
   */
  public void Persona(String nombre, String apellido, int DNI, String materia)
  {
  }


  /**
   * @return       boolean
   * @param        monto
   */
  public boolean Paga_cooperadora(float monto)
  {
  }


}
