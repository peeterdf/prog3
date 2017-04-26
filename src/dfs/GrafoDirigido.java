package dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GrafoDirigido {
	ArrayList<ListaNodo> vertices;
	 
	
	public GrafoDirigido(){
		vertices= new ArrayList<ListaNodo>();
		
	}

	public void addVertice(int n){
		
		vertices.add(n, new ListaNodo());
	}
	
	public void addArco(int a, int b){
		if(vertices.size()>a && vertices.size()>b)
		vertices.get(a).agregarElem(b);
	}
	
	public String imprimirVertices(){
		String resultado ="";
		for (int i = 0; i < vertices.size(); i++) {
			if(vertices.get(i)!=null){
				resultado+= " "+i+" ";
			}
		}
		return resultado;
	}
	
	public String imprimirAdyacencias(){
		String retornable ="";
		for (int i = 0; i < vertices.size(); i++) {
			retornable += "vertice: "+i+"\n";
			if(vertices.get(i)!= null){
			retornable += vertices.get(i).toString()+"\n";
			}
		}
		return retornable;
	}
	
	private boolean DFS_Visit(Vertice v,int tiempo,ArrayList<Vertice> aux){
		v.setEstado(Estado.Visitandose);
		tiempo++;
		v.setTiempoini(tiempo);
		if(vertices.get(v.getIndice())!=null){
			for (int i = 0; i < vertices.get(v.getIndice()).size(); i++) {
				if(  aux.get(vertices.get(v.getIndice()).at(i)).getEstado()==Estado.No_Visitado){
					if(DFS_Visit(aux.get(vertices.get(v.getIndice()).at(i)), tiempo, aux)){
						return true;
					};
				}else{
					if(aux.get(vertices.get(v.getIndice()).at(i)).getEstado()==Estado.Visitandose){
						return true;
					}
				}
			}
			v.setEstado(Estado.Visitado);
			tiempo++;
			v.setTiempofinal(tiempo);
			return false;
		}
		return false;
	}
	
	public boolean tieneCiclo_rec(){
		ArrayList<Vertice> aux = new ArrayList<Vertice>();
		for (int i = 0; i < vertices.size(); i++) {
			
			aux.add(new Vertice(i,Estado.No_Visitado));
		}
		//////////////
		int tiempo =0;
		for (int i = 0; i < aux.size(); i++) {
			if(aux.get(i).getEstado()==Estado.No_Visitado){
				
				return DFS_Visit(aux.get(i),tiempo,aux);
							
			}
		}
		return false;
	}
	
	
	
	public boolean tieneCiclo_iter(){
		ArrayList<Vertice> aux = new ArrayList<Vertice>();
		for (int i = 0; i < vertices.size(); i++) {
			aux.add(new Vertice(i,Estado.No_Visitado));
		}
		Stack<Integer> pila= new Stack<Integer>();
		//int j=0;
		//while(aux.get(j).getEstado()==Estado.No_Visitado && j<aux.size()){
			pila.push(aux.get(0).getIndice());
			while (!pila.isEmpty()) {
				int tope=pila.peek();
				if(aux.get(tope).getEstado()==Estado.No_Visitado){
					aux.get(tope).setEstado(Estado.Visitandose);			
					if(vertices.get(tope)!=null){
						for (int i = 0; i < vertices.get(tope).size(); i++) {
							if(aux.get(vertices.get(tope).at(i)).getEstado()==Estado.No_Visitado){
								pila.push(vertices.get(tope).at(i));
							}else if(aux.get(vertices.get(tope).at(i)).getEstado()==Estado.Visitandose){
								return true;
							}
						}
					}else{
							aux.get(tope).setEstado(Estado.Visitado);
							pila.pop();
						}

				}else if(aux.get(tope).getEstado()==Estado.Visitado){
					pila.pop();
				}else{
					aux.get(tope).setEstado(Estado.Visitado);
					pila.pop();
				}
			}
			//j++;
		//}
		
		return false;
	}

	
	public void bfs(){
		ArrayList<Vertice> aux = new ArrayList<Vertice>();
		for (int i = 0; i < vertices.size(); i++) {
			aux.add(new Vertice(i,Estado.No_Visitado));
		}
		
		Queue<Integer> cola=new LinkedList<Integer>();
		aux.get(0).setEstado(Estado.Visitandose);
		aux.get(0).setDistancia(0);
		cola.add(0);
		while(!cola.isEmpty()){
			int tope =cola.poll();
			for (int i = 0; i < vertices.get(tope).size(); i++) {
				int adyacente = vertices.get(tope).at(i);
				if(aux.get(adyacente).getEstado()==Estado.No_Visitado){
					aux.get(adyacente).setEstado(Estado.Visitandose);
					aux.get(adyacente).setDistancia(aux.get(tope).getDistancia()+1);
					aux.get(adyacente).setPadre(tope);
					cola.add(adyacente);
				}
			}
			aux.get(tope).setEstado(Estado.Visitado);
			
		}
	}
	
	private String imprimirarr(ArrayList<Vertice> aux) {
		String resultado="";
		for (int i = 0; i < aux.size(); i++) {
			resultado+=aux.get(i).getIndice();
			resultado+=" ";
			resultado+=aux.get(i).getEstado();
			resultado+="\n";
		}
		return resultado;
	}
	
}
