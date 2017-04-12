package ordenamiento;

public class arreglo {
 private int[] arreglo;
 private int[] aux;
 private int cantidad;
 
 public arreglo(){
	 arreglo = new int[1000];
	 cantidad =0;
 }
 
 public boolean estaVacia(){
		return cantidad == 0;
	}
 
public void insertarAlComienzo(int nuevo){

		if(arreglo[arreglo.length-1] != 0){

			int nuevoArreglo[] = new int[cantidad*2];
			for (int i = 0; i < cantidad; i++) {
				nuevoArreglo[i] = arreglo[i];
			}
			arreglo = nuevoArreglo;
		}
		if(!estaVacia()){
			for (int i = cantidad; i != 0; i--) {
				arreglo[i] = arreglo[i-1];
			}
		}
		arreglo[0] = nuevo;
		cantidad++;
	}
 
public int size(){
	return cantidad;
}

public boolean estaOrdenadoSinRec(){
//	 int pos =0;
//	 while (pos< cantidad-1 && arreglo[pos]>=arreglo[pos+1]){
//		 pos++;
//	 }
//	 if(pos==cantidad-1){
//		 return true;
//	 }else return false;
	 
	 for (int pos = 0; pos < cantidad-1; pos++)
	 {
		 if (arreglo[pos] < arreglo[pos+1])
			 return false;
	 }
	 return true;
 }
 
 public boolean estaOrdenado(){
	 boolean respuesta= true;
	 if (cantidad>1){
	 int pos =0;
	 respuesta = (this.estaOrdenadoDes(pos) || this.estaOrdenadoAsc(pos));
	 return respuesta;
	 }else return true;
 }
 
 private boolean estaOrdenadoDes(int pos){
	 boolean resultado= true;
	 if (pos<cantidad-1 && arreglo[pos]>=arreglo[pos+1]){
		resultado = this.estaOrdenadoDes(pos+1);
	 }else if(pos==cantidad-1){
		 return true;
	 } else return false;
	return resultado;
 }
 
 private boolean estaOrdenadoAsc(int pos){
	 boolean resultado= true;
	 if (pos<cantidad-1 && arreglo[pos]<=arreglo[pos+1]){
		resultado = this.estaOrdenadoAsc(pos+1);
	 }else if(pos==cantidad-1){
		 return true;
	 } else return false;
	return resultado;
 }
 
public boolean buscarElemento(int buscado){
	boolean respuesta= true;
	 if (cantidad>0){
	 int pos =0;
	 respuesta = this.buscarElemento(pos, buscado);
	 return respuesta;
	 }else return false;
}
 
private boolean buscarElemento(int pos, int buscado){
	if (arreglo[pos]== buscado){
		return true;
	}else{
		pos++;
		if (pos<cantidad){
			return buscarElemento(pos,buscado);
		}else return false;
	}
}

public void ordenarSeleccion(){
	for(int i=0;i<cantidad-1;i++){
        for(int j=i+1;j<cantidad;j++){
            if(arreglo[i]>arreglo[j]){
                int aux=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=aux;

            }
        }
    }
}
public void ordenarBurbujeo(){
		int i, j, aux;
		for(i=0;i<cantidad-1;i++)
			for(j=0;j<cantidad-i-1;j++)
				if(arreglo[j+1]<arreglo[j]){
					aux=arreglo[j+1];
					arreglo[j+1]=arreglo[j];
					arreglo[j]=aux;
				}
}



public void mergeSort(){
	aux = new int[cantidad];
	mergesort(0, cantidad - 1);
}

private void mergesort(int a, int b){
	if (a < b) {
		int m = (a + b) / 2;
		mergesort(a, m);
		mergesort(m + 1, b);
		merge(a, m, b);
	}
}
	
private void merge(int a, int m, int b){
	
	for (int i = a; i <= b; i++) {
		aux[i] = aux[i];
	}
	
	int i = a;
	int j = m + 1;
	int k = a;
	
	while (i <= m && j <= b) {
		if (aux[i] <= aux[j]) {
		arreglo[k] = aux[i];
		i++;
	} else {
			arreglo[k] = aux[j];
			j++;
		}
	k++;
	}
	while (i <= m) {
		arreglo[k] = aux[i];
		k++;
		i++;
	}
}

public String toString(){
	String resultado = "";
	for (int i = 0; i < cantidad; i++) {
		resultado += " "+arreglo[i]+" ";
	}
	return resultado;
}
}
