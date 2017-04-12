package dfs;


public class main {
	 static int n =4;
	
	public static GrafoDirigido crearGrafo(int n){

		GrafoDirigido grafod= new GrafoDirigido();
		
		
		for (int i = 0; i <n; i++) {
			grafod.addVertice(i);
		}
				
		for (int i = 0; i < (n-2); i++) {
			grafod.addArco(i, i+2);
			grafod.addArco(i, i+1);
		}

		//System.out.println(grafod.imprimirAdyacencias());
		return grafod;
	}
	
	public static void dfs_iter(boolean bool){
		
		GrafoDirigido grafod = crearGrafo(n);
		if (bool){
			grafod.addArco(n-1, n-1);
		}
		boolean esciclico2 = grafod.tieneCiclo_iter();
		System.out.println("es ciclico: "+esciclico2);
//		System.out.println("------");
//		System.out.println(grafod.imprimirVertices());
//		System.out.println("------");

	}
	
	public static void dfs_rec(boolean bool){
		
		GrafoDirigido grafod = crearGrafo(n);
		if(bool){
			grafod.addArco(n-1, n-1);
		}
		boolean esciclico = grafod.tieneCiclo_rec();
		System.out.println("es ciclico: "+esciclico);
//		System.out.println("------");
//		System.out.println(grafod.imprimirVertices());
//		System.out.println("------");
	}

	public static void main(String[] args) {
		
		
		
		long time_start, time_end;
		time_start = System.nanoTime();
		dfs_iter(true);
		time_end = System.nanoTime();
		System.out.println("dfs iter true"+"the task has taken "+ ( time_end - time_start )/1000.0 +" milliseconds");
		
		long time_start2, time_end2;
		time_start2 = System.nanoTime();
		dfs_iter(false);
		time_end2 = System.nanoTime();
		System.out.println("dfs iter false"+"the task has taken "+ ( time_end2 - time_start2 )/1000.0 +" milliseconds");
		
		long time_start3, time_end3;
		time_start3 = System.nanoTime();
		dfs_rec(true);
		time_end3 = System.nanoTime();
		System.out.println("dfs rec "+"the task has taken "+ ( time_end3 - time_start3 )/1000.0 +" milliseconds");
		
		long time_start4, time_end4;
		time_start3 = System.nanoTime();
		dfs_rec(false);
		time_end3 = System.nanoTime();
		System.out.println("the task has taken "+ ( time_end3 - time_start3 )/1000.0 +" milliseconds");
		
		
	}

}
