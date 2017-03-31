package pila;


public class Nodo {
	private String elem;
	private Nodo sig;
	
	public Nodo(String elem){
		this.sig = null;
		this.elem = elem;
	}
	
	public Nodo(){
		this.sig = null;
		this.elem = null;
	}
	
	public Nodo getSig(){
		return this.sig;
	}
	
	public String getElem(){
		return this.elem;
		}
	
	public void setSig(Nodo sig){
		this.sig=sig;
	}
	
	public void setElem(String elem){
		this.elem=elem;
	}
}
