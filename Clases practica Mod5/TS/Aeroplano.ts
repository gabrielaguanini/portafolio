import { Helice } from "./Helice";
import { Alas } from "./Alas";
import { Cabina } from "./Cabina";
import { Turbina } from './Turbina';

export class Aeroplano{
    private helice:Helice;
    private alas:Alas;
    private cabina:Cabina;
    private turbina:Turbina;

public constructor(nuevahelice:Helice, nuevaalas:Alas, nuevacabina:Cabina, nuevaturbina:Turbina ){
    this.helice=nuevahelice;
    this.alas=nuevaalas;
    this.cabina=nuevacabina;
    this.turbina=nuevaturbina;
    
}


public toString(){
    let mensaje ="Aeroplano compuesto por: "
    mensaje+=this.helice.toString();
    mensaje+=this.turbina.toString();
    mensaje+=this.alas.toString() ;
    mensaje+=this.cabina.toString();
    return mensaje;
}
}