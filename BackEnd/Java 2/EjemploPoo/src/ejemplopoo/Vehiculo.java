
package ejemplopoo;


public class Vehiculo{
  
    private int num_registro;
    private int cantidad_ruedas;
    private String marca;
    private String modelo;

public Vehiculo(){}
    
public Vehiculo(int num_registro, int cantidad_ruedas, String marca, String modelo){
    
    this.num_registro=num_registro;
    this.cantidad_ruedas=cantidad_ruedas;
    this.marca=marca;
    this.modelo=modelo;
}

public int getNum_registro(){
    return num_registro;
}
public void setNum_registro(int num_registro){
    this.num_registro=num_registro;
}
public int getCantidad_ruedas(){
    return cantidad_ruedas;
}
public void setCantidad_ruedas(int cantidad_ruedas){
    this.cantidad_ruedas=cantidad_ruedas;
}
public String getMarca(){
    return marca;
}
public void setMarca(String marca){
    this.marca=marca;
}
public String getModelo(){
    return modelo;
}
public void setModelo(String modelo){
    this.modelo=modelo;
}

public void estacionar(){
    System.out.println("Estoy estacionando");       
}
}
