package dfs;



public class Vertice {
	int indice;
	Estado estado;
	int tiempoini;
	int tiempofinal;
	int distancia;
	int padre;
	
	public Vertice(int a, Estado b){
		indice =a;
		estado=b;
		distancia=-1;
		padre=-1;
		
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getPadre() {
		return padre;
	}

	public void setPadre(int padre) {
		this.padre = padre;
	}

	public int getTiempoini() {
		return tiempoini;
	}

	public void setTiempoini(int tiempoini) {
		this.tiempoini = tiempoini;
	}

	public int getTiempofinal() {
		return tiempofinal;
	}

	public void setTiempofinal(int tiempofinal) {
		this.tiempofinal = tiempofinal;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
}
