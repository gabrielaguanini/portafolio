
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis= new ControladoraPersistencia();
    
 public void crearPersona(Persona per){
    controlPersis.crearPersona(per);
}

public void eliminarPersona(int id){
    controlPersis.eliminarPersona(id);   
        }

public void eliminarPersona(Persona pers){
    controlPersis.eliminarPersona(pers);       
        }

public List<Persona> traerPersonas(){
    return controlPersis.traerPersonas();
}

public void editarPersona(Persona per){
    controlPersis.editarPersona(per);
}
}
