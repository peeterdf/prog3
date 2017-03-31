package pila;

public class Pila {

	ListaNodo pila;
	
	public Pila(){
		pila=new ListaNodo();
	}
	
	//tope, 
	public String tope(){
		return pila.at(0);
	}
	
	//apilar
	public void apilar(String elem){
		pila.agregarElem(0, elem);
	}
	
	//desapilar
	public void desapilar(){
		if(!pila.esVacio()){
		String aux = this.tope();
		pila.eliminar(aux);
		}
	}
	
	//esta vacia
	public boolean esVacia(){
		return pila.esVacio();
	}
}
