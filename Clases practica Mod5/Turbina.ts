export class Turbina{
    private numTurbina:number = 0;

public constructor (cantidad:number){
    this.numTurbina=cantidad;
    }
    
public toString(){
        return " Turbinas: "+ this.numTurbina + " Turbina/s ";
        
    }

    
}