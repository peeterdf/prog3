package mochila;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class MochilaEnteros {

	public static String llenar(Set<ElementoMochilaEnteros> objetos, int pesomochila) {
		int cargaparcial=0;
		List<ElementoMochilaEnteros> conjunto=new ArrayList<ElementoMochilaEnteros>(objetos);
		Collections.sort(conjunto);
		Collections.reverse(conjunto);
		ElementoMochilaEnteros[] sol = new ElementoMochilaEnteros[conjunto.size()];
		int indice=0;
		while(!conjunto.isEmpty()&&(cargaparcial<pesomochila)){
			ElementoMochilaEnteros x =conjunto.get(0);
			if((x.getCantidad()>0)&&(cargaparcial+x.getPeso()<=pesomochila)){
					if(sol[indice]==null){
						sol[indice]= new ElementoMochilaEnteros(x.getNombre(),1 ,x.getValor(), x.getPeso());
						conjunto.get(0).setCantidad(conjunto.get(0).getCantidad()-1);
					}else{
						sol[indice].setCantidad(sol[indice].getCantidad()+1);
						conjunto.get(0).setCantidad(conjunto.get(0).getCantidad()-1);
					}
					cargaparcial+=x.getPeso();			
				}else{
					conjunto.remove(0);
					indice++;
				}
			}
		
		String result ="";
		for (int i = 0; i < sol.length; i++) {
			if(sol[i]!=null)result+=sol[i].toString();
		}
		return result;
	}

}
