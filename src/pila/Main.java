package pila;

public class Main {

	public static void main(String[] args) {
		Pila pila=new Pila();
		
		int n=10;
		
		System.out.println("es vacia: "+pila.esVacia());
		System.out.println("--carga de pila--");
		for (int i = 0; i < n; i++) {
			pila.apilar("a"+i);
			System.out.println("tope: "+pila.tope());
		}
		System.out.println("es vacia: "+pila.esVacia());
		System.out.println("tope: "+pila.tope());
		System.out.println("--vaciar pila--");
		for (int i = 0; i < n; i++) {
			pila.desapilar();
			System.out.println(pila.tope());
		}
		System.out.println("es vacia: "+pila.esVacia());
	}

}
