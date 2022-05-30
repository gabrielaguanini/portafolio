export class Alas{
    private numAlas:number =0;

public constructor (cantidad:number){
    this.numAlas=cantidad;
    }

public toString(){
    return " Alas: "+ this.numAlas + " ala/s ";
}    
}