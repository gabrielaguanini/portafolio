
package ejemplopoo;


public class Auto extends Vehiculo{
   private int id;
   private String patente;
   private int cantidad_puertas;
   private String color;
   private boolean caja_manual;

    public Auto(){
    }

     public Auto(int id, String patente, int cantidad_puertas, String color, boolean caja_manual, int num_registro, 
        int cantidad_ruedas, String marca, String modelo ) {
         super(num_registro, cantidad_ruedas, marca, modelo);
         this.id=id;
         this.patente=patente;
         this.cantidad_puertas=cantidad_puertas;
         this.color=color;
         this.caja_manual=caja_manual;
    }

        
public int getId(){
    return id;
}    
public void setId(int id){
    this.id=id;
}
public String getPatente(){
    return patente;
}
public void setPatente(String patente){
    this.patente=patente;
}
public int getCantidad_puertas(){
    return cantidad_puertas;
}
public void setCantidad_puertas(int cantidad_puertas){
    this.cantidad_puertas=cantidad_puertas;
}
public String getColor(){
    return color;
}
public void setColor(String color){
    this.color=color;
}
public boolean isCaja_manual(){
    return caja_manual;
}
public void setCaja_manual(boolean caja_manual){
    this.caja_manual=caja_manual;
}

@Override
 public String toString(){
     return "Auto{" + "id: " + id + "// patente: " + patente + "// cantidad_puertas: " 
     +cantidad_puertas + "// color: " + color + "// caja_maual: " + caja_manual+ "}";
 }
     

public void encender(){
System.out.println("Estoy Encendiendo ");
}
public void apagar(){
    System.out.println("Estoy apagando ");
}
public void acelerar(double km){
    System.out.println("Estoy acelerando " + km + " kms");
    }
public void frenar(double km){
    System.out.println("Estoy frenando " + km + " kms");
    }
}
