package mochila;

import java.util.HashSet;
import java.util.Set;


public class main {
	

	public static void main(String[] args) {
			
		int pesomochila= 25;
		Set<ElementoMochilaEnteros> objetos= new HashSet<ElementoMochilaEnteros>();
		// nombre, cantidad,valor,peso
		objetos.add(new ElementoMochilaEnteros("Pelota",3,10, 2));
		objetos.add(new ElementoMochilaEnteros("cable",1,100, 1));
		objetos.add(new ElementoMochilaEnteros("libro",10,50, 5));
		//objetos.add(new ElementoMochilaEnteros("compu",1,1000, 7));
		objetos.add(new ElementoMochilaEnteros("celu",10,100, 25));
		String resultado3 = MochilaEnteros.llenar(objetos,pesomochila);
		System.out.println(resultado3);
	}

}
