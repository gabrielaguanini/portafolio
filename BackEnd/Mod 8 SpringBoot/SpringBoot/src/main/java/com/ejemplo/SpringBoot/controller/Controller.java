
package com.ejemplo.SpringBoot.controller;

import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.service.IPersonaService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
  @Autowired
    private IPersonaService persoServ;
      
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
    persoServ.agregarPersona(pers);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List <Persona> verPersonas(){
    return persoServ.verPersonas();
    }
    
  
   @DeleteMapping ("/borrar/{id}")
   public void borrarPersona(@PathVariable Long id){
   persoServ.borrarPersona(id);
    
}
}



//@PutMapping ("/editar")
//public void editarPersona(@RequestParam Long posicion, @RequestBody Persona pers){

 //int miPosicionInt3= Math.toIntExact(posicion);    
 //listaPersonas.set(miPosicionInt3, pers);
 
 


//@PutMapping ("/editar2/{posicion}")
//public void editarPersona2(@PathVariable Long posicion, @RequestBody Persona pers){

 //int miPosicionInt4= Math.toIntExact(posicion);    
    
//listaPersonas.set(miPosicionInt4, pers);
 
 
//}

//}


