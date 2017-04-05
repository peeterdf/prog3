package ordenamiento;



public class main {
	public arreglo crearArreglo(int n){
		arreglo arr = new arreglo();
		for (int i = 0; i < n; i++) {
			int nuevo = (int) Math.floor(Math.random()*10);
			arr.insertarAlComienzo(nuevo);
		}
		return arr;
	}
	public static void main( String[] args) {
		int n=1000;
		arreglo arr = new arreglo();
		System.out.println(arr.estaVacia());
		for (int i = 0; i < n; i++) {
			int nuevo = (int) Math.floor(Math.random()*1000);
			arr.insertarAlComienzo(nuevo);
		}
		System.out.println(arr.estaVacia());
		arreglo aux= arr;
		System.out.println("----------------");
		System.out.println(arr.toString());
		System.out.println("ordenar arreglo de "+n+" elementos.");
		System.out.println("----------------");
		System.out.println("---empieza a ordenar burbujeo---");
		for (int i = 0; i < 10; i++) {
			long time_start, time_end;
			time_start = System.nanoTime();
			arr.ordenarSeleccion();
			time_end = System.nanoTime();
			System.out.println("the task has taken "+ ( time_end - time_start )/1000.0 +" milliseconds");
		}
		System.out.println("---termina de ordenar burbujeo---");	
		//complejidad temporal n^2 
		
		aux=arr;
		
		System.out.println("---empieza a ordenar mergesort---");
		for (int i = 0; i < 10; i++) {
			long time_start, time_end;
			time_start = System.nanoTime();
			arr.mergeSort();
			time_end = System.nanoTime();
			System.out.println("the task has taken "+ ( time_end - time_start )/1000.0 +" milliseconds");
		}
		System.out.println("---termina de ordenar mergesort---");
		//complejidad temporal  n*log(n)
		
		
	}

}
