package Objetos;

public class Vehiculo {
	
	private int cantidad_ruedas=0;

public Vehiculo(int cantidad_ruedas) {
	this.cantidad_ruedas=cantidad_ruedas;
}

public void setCantidad_ruedas(int nuevaCantidad_ruedas) {
	cantidad_ruedas=nuevaCantidad_ruedas;
}

public int setCantidad_ruedas() {
	return cantidad_ruedas;
}

public void frena() {
	
}
}
