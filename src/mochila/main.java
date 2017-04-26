package mochila;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;


public class main {
	

	public static void main(String[] args) {
			
		int pesomochila= 25;
		Set<ElementoMochilaEnteros> objetos= new HashSet<ElementoMochilaEnteros>();
		// nombre, cantidad,valor,peso
		objetos.add(new ElementoMochilaEnteros("Pelota",10,100, 25));
		objetos.add(new ElementoMochilaEnteros("cable",10,50, 5));
		objetos.add(new ElementoMochilaEnteros("libro",3,10, 2));
		//objetos.add(new ElementoMochilaEnteros("compu",1,1000, 7));
		objetos.add(new ElementoMochilaEnteros("celu",1,100, 1));
		String resultado3 = MochilaEnteros.llenar(objetos,pesomochila);
		System.out.println(resultado3);
	}

}
