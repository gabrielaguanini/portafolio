export class Cabina{

    private cabinaTripulacion:boolean=false;
    private cabinaVuelo:boolean=false;
    private sistemaEmergencia:boolean=false;
    private numTanquesCombustible:number=0;
    private numPuertasSalida:number=0;

public constructor(otraCabinaTripulacion:boolean, otraCabinavuelo:boolean, otraSistemaEmergencia:boolean,
     otraTanquesCombustible:number, otraPuertasSalida:number){

    this.cabinaTripulacion=otraCabinaTripulacion;
    this.cabinaVuelo=otraCabinavuelo;
    this.sistemaEmergencia=otraSistemaEmergencia;
    this.numTanquesCombustible=otraTanquesCombustible;
    this.numPuertasSalida=otraPuertasSalida;
}

public toString(){
    let mensaje= " Cabina compuesta de: ";
      if (this.cabinaVuelo){
        mensaje+=" Cubierta de vuelo ";
    }
      if (this.cabinaTripulacion){
          mensaje+=" Cubierta de tripulacion, ";
      }
      if (this.sistemaEmergencia){
          mensaje+=" Sistema de Emergencia, ";
      }
        mensaje+=this.numTanquesCombustible + " Tanque/s de combustible, ";
        mensaje+=this.numPuertasSalida + " Puerta/s de salida ";
        return mensaje;
}
}