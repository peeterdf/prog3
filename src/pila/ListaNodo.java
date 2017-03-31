package pila;

public class ListaNodo {
		Nodo lista;
		
	public ListaNodo(){
		lista = null;
	}
	public String toString(){
		String retornable="";
		if (this.lista == null){
			retornable += "lista vacia";
		}else{
			Nodo aux = lista;
			while(aux.getSig() != null){
				retornable += aux.getElem();
				aux=aux.getSig();
			}
			retornable += aux.getElem();
		}
		return retornable;
	}
	
	//agrega un elem al final de la lista
	public void agregarElem(String elem){
		
		if (this.lista == null){
			lista = new Nodo(elem);
		}else{
			Nodo aux = lista;
			while(aux.getSig() != null){
				aux=aux.getSig();
			}
			aux.setSig(new Nodo(elem));;
		}
	}
	
	
	
	//agrega un elem en una posicion dada
public void agregarElem(int pos, String elem){
	if (lista == null){
		lista = new Nodo(elem);
	}else{
		if(pos==0){
			Nodo nuevo = new Nodo(elem);
			nuevo.setSig(lista);
			lista=nuevo;
		}else{
			if(this.size()>=pos){	
			Nodo aux = lista;
			for(int i =0; i< pos; i++){
				aux= aux.getSig();
			}	
			if (aux== null){
				aux = new Nodo(elem);
			}else{
	
				Nodo nuevo = new Nodo(elem);
				nuevo.setSig(aux.getSig());
				aux.setSig(nuevo);
			}
			}
			}
		}	
}



	//elimina un elemento dado
	public void eliminar(String buscado){
		if (this.lista != null){
			if (lista.getElem()== buscado){
				this.lista=lista.getSig();
			}else{
				
				Nodo aux = lista;
				while(!aux.getSig().getElem().equals(buscado)){
					aux=aux.getSig();
				}
				if (aux.getSig()!=null){
					aux.setSig(aux.getSig().getSig());;
				}

			}
			
		}
	}
	
	
	public boolean esVacio(){
		return this.lista == null;
	}
	
	public int size(){
		int retornable =0;
		if (this.lista == null){
			return retornable;
		}else{
			Nodo aux = lista;
			retornable++;
			while(aux.getSig() != null){
				retornable++;
				aux=aux.getSig();
			}
			return retornable;
		}
	}
	
	
	public String at(int pos){
		if(this.size()>pos){	
			Nodo aux = lista;
			for(int i =0; i< pos; i++){
				aux= aux.getSig();
			}
			return aux.getElem();
		}else return null;
	}
	
	public boolean BuscarElemento(String str){
		if (lista== null){
			return false;
		}else{
			if (lista.getElem()==str){
				return true;
			}else{
				Nodo listaux = lista;
				return BuscarElementoRec(listaux,str);
			}
		}
	}
	
	private boolean BuscarElementoRec(Nodo aux,String str){
		if(aux.getSig()!= null){
			if(aux.getSig().getElem()==str){
				return true;
			}else return BuscarElementoRec(aux.getSig(),str);
		}return false;
	}
	
}




