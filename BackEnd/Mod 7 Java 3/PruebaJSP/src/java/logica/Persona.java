
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona implements Serializable {
   
    @Id   
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;

    public Persona() {
    }
    
public Persona(int id, String dni, String nombre, String apellido, String telefono){
    this.id=id;
    this.dni=dni;
    this.nombre=nombre;
    this.apellido=apellido;
    this.telefono=telefono;
}

public void setId(int id){
    this.id=id;
}
public int getId(){
    return id;
}
public void setDni(String dni){
    this.dni=dni;
}
public String getDni(){
    return dni;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
public String getNombre(){
    return nombre;}
public void setApellido(String apellido){
    this.dni=apellido;
}
public String getApellido(){
    return apellido;
}
public void setTelefono(String telefono){
    this.telefono=telefono;
}
public String getTelefono(){
    return telefono;
}
}
