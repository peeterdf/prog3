package dfs;

public class GrafoNoDirigido extends GrafoDirigido {
	public GrafoNoDirigido(){
		super();
	}
	
	public void addArco(int a, int b){
		if(vertices.size()>a && vertices.size()>b){
		vertices.get(a).agregarElem(b);
		vertices.get(b).agregarElem(a);
		}
	}
}
