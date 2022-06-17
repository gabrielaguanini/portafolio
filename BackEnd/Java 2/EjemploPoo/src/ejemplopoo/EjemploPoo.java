package ejemplopoo;

public class EjemploPoo{
    public static void main(String[] args){
        
        /* Auto auto1=new Auto(); */
        Auto auto2=new Auto(1,"AAA111",4,"rojo",true,2434234,4,"Ford","Taunus");
        Moto moto1=new Moto(250, 3253453, 2, "Honda", "Tornado");
        Camion camion1=new Camion(5,true,534543453,8,"Ford","f-100");
        Vehiculo cuatriciclo=new Vehiculo(5435, 4, "Yamaha", "CuatriMil");
        
        Vehiculo vector[]=new Vehiculo[4];
        vector[0]=cuatriciclo;
        vector[1]=auto2;
        vector[2]=moto1;
        vector[3]=camion1;
        
    for (int i=0; i<4; i++){
        System.out.println("Registro N: " + vector[i].getMarca());
    }
        
       /* System.out.println(auto1.toString()); */    
        System.out.println("-------------------------------------------------");
        System.out.println(auto2.toString());
        
        
        
        
      /*  auto2.encender();
        auto2.acelerar(40);
        auto2.frenar(30);
        auto2.apagar();  */
        
/* System.out.println("El valor de la Id es: " + auto2.getId());
auto2.setId(35000);
System.out.println("El nuevo Id del auto2 es " + auto2.getId()); */
    

/* System.out.println("La Id del auto es: " + auto1.getId());
System.out.println("El color del auto1 es: " + auto1.getColor());

auto1.setId(1);
auto1.setPatente("JJJ555");
auto1.setCantidad_puertas(3);
auto1.setColor("blanco");
auto1.setCaja_manual(false);

System.out.println("-----------------------------------------");
System.out.println("La nueva ID del auto es " + auto1.getId());
System.out.println("El nuevo color del auto1 es: " + auto1.getColor()); */

        
        
}}