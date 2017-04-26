package mochila;

public class ElementoMochilaEnteros implements Comparable<ElementoMochilaEnteros>{
		String nombre;
		int cantidad;
		int valor;
		int peso;
	
	public ElementoMochilaEnteros(String n,int c, int v, int p) {
		nombre=n;
		cantidad=c;
		valor=v;
		peso=p;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	@Override
	public int compareTo(ElementoMochilaEnteros em) {
		return ((this.getValor()/this.getPeso())-(em.getValor()/em.getPeso()));
		
	}
	
	@Override
	public String toString() {
	
	return "Nombre:"+this.nombre+"\n"+" Cantidad:"+this.cantidad+"\n"+" Valor: "+this.valor+"\n"+" Peso: "+this.peso+"\n"+"-------------------"+"\n";
	}

}
