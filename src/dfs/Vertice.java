package dfs;



public class Vertice {
	int indice;
	Estado estado;
	int tiempoini;
	int tiempofinal;
	
	public Vertice(int a, Estado b){
		indice =a;
		estado=b;
		
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
