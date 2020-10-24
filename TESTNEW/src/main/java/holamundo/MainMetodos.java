package holamundo;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Iterator;


public class MainMetodos extends Metodos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Metodos nombreObjeto = new Metodos();
		Metodos nombreObjeto2 = new Metodos(9,3);
		//Metodos2 objeto=new Metodos2();
		
		System.out.println(nombreObjeto2.sumatoria());
		System.out.println(nombreObjeto.sumatoria());
		System.out.println(heredar);
		
		nombreObjeto.mostrarMensaje();
		String elementoGuardado = nombreObjeto.mostrarNombre("Sergio");
		
		System.out.println(elementoGuardado);
		
		Metodos.prueba();
		
		List<String> listaNombres = listaDeNombres();
		List<Integer> listaNumeros = listaNumeros();
		
		for(String nombre : listaNombres) {
			System.out.println(nombre);
			
		}
		System.out.println("for con dos puntos");
		for(int indice=0 ; indice<listaNombres.size(); indice++) {
			System.out.println(listaNombres.get(indice));
			
		}
		
		System.out.println("for con Index");
 
	     for (int numero : listaNumeros) {
	    	 System.out.println(numero);
	    	 
	}
	      List<String> nombresSinElementosDuplicados = listaNombres.stream()
	    		 .distinct()
	    		 .collect(Collectors.toList());
	      
	      Collections.sort(nombresSinElementosDuplicados);
	      System.out.println(nombresSinElementosDuplicados);
	      Collections.sort(nombresSinElementosDuplicados, Collections.reverseOrder());
	      System.out.println(nombresSinElementosDuplicados);
	      
	      System.out.println(Collections.max(listaNumeros));
	      System.out.println(Collections.min(listaNumeros));
	      
	      Collections.sort(listaNumeros);
	      System.out.println(listaNumeros);
	      Collections.sort(listaNumeros, Collections.reverseOrder());
	      System.out.println(listaNumeros);
	      
	      Object last = null;
	      
	      int numCount = 0;
	      Iterator<Integer> i = listaNumeros.iterator();
	      
	      while(i.hasNext()) {
	    	  Object temp = i.next();
	    	  if(temp.equals(last)) {
	    		i.remove();
	    		numCount++; //numCount = numCount +1;
	    	  }else {
	           	 last=temp;
	    	  }  
	      	  }
	      System.out.println(numCount);    
	      System.out.println(listaNumeros);
	} 
}//main


