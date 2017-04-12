package dfs;

public class Nodo {
	private int elem;
	private Nodo sig;
	
	public Nodo(int elem){
		this.sig = null;
		this.elem = elem;
	}
	
	public Nodo(){
		this.sig = null;
	}
	
	public Nodo getSig(){
		return this.sig;
	}
	
	public int getElem(){
		return this.elem;
		}
	
	public void setSig(Nodo sig){
		this.sig=sig;
	}
	
	public void setElem(int elem){
		this.elem=elem;
	}
}
