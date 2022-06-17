
package ejemplopoo;


public class Moto extends Vehiculo {
   
    private int cilindrada;
    
public Moto(int cilindrada, int num_registro, int cantidad_ruedas, String marca, String modelo){
    super(num_registro, cantidad_ruedas, marca, modelo);
    this.cilindrada=cilindrada;
}

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
       
}
