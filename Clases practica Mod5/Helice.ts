export class Helice{
    private numHelices:number =0;

    public constructor (cantidad:number){
        this.numHelices=cantidad;
    }
public toString(){
    return " Helices: " + this.numHelices + " helice/s "
}
}