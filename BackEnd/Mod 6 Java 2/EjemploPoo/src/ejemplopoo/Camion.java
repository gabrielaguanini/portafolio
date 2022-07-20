
package ejemplopoo;


public class Camion extends Vehiculo {
    
    private int cantidad_ejes;
    private boolean acoplado;
   
public Camion(int cantidad_ejes, boolean acoplado, int num_registro, 
        int cantidad_ruedas, String marca, String modelo){
    
super(num_registro, cantidad_ruedas, marca, modelo);    
this.cantidad_ejes=cantidad_ejes;
this.acoplado=acoplado;
}    

public Camion(){};

    public int getCantidad_ejes() {
        return cantidad_ejes;
    }

    public void setCantidad_ejes(int cantidad_ejes) {
        this.cantidad_ejes = cantidad_ejes;
    }

    public boolean isAcoplado() {
        return acoplado;
    }

    public void setAcoplado(boolean acoplado) {
        this.acoplado = acoplado;
    }


}
