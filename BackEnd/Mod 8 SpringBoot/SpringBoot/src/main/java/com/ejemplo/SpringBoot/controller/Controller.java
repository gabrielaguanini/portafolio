
package com.ejemplo.SpringBoot.controller;

import com.ejemplo.SpringBoot.model.Persona;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    List <Persona> listaPersonas = new ArrayList();
    
    @GetMapping("/hola/{nombre}")
    public String decirHola(@PathVariable String nombre){
    return "Hola Mundo" + nombre;
    }
    
    @GetMapping("/chau")
    public String decirChau(@RequestParam String nombre, @RequestParam String apellido, @RequestParam int edad){
    return "Chau Mundo" + " Nombre: " + nombre + " Apellido: " + apellido + " Edad: "+ edad;
    }
    
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
        listaPersonas.add(pers);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List <Persona> verPersonas(){
    return listaPersonas;
    }
    
  
@DeleteMapping ("/borrar")
public void borrarPersona(@RequestParam Long posicion){
  int miPosicionInt= Math.toIntExact(posicion);
  listaPersonas.remove(miPosicionInt);
  
}

@DeleteMapping ("/borrar2/{posicion}")
public void borrarPersona2( @PathVariable Long posicion){

   int miPosicionInt2= Math.toIntExact(posicion);
    
 listaPersonas.remove(miPosicionInt2);
  
}

@PutMapping ("/editar")
public void editarPersona(@RequestParam Long posicion, @RequestBody Persona pers){

 int miPosicionInt3= Math.toIntExact(posicion);    
    
listaPersonas.set(miPosicionInt3, pers);
 
 
}

@PutMapping ("/editar2/{posicion}")
public void editarPersona2(@PathVariable Long posicion, @RequestBody Persona pers){

 int miPosicionInt4= Math.toIntExact(posicion);    
    
listaPersonas.set(miPosicionInt4, pers);
 
 
}

}


