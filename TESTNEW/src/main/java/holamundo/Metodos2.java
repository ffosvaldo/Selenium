package holamundo;

import java.util.ArrayList;
import java.util.List;

public class Metodos2 {
	static String heredar = "Mensaje de texto heredar";
			

	public static List<String> listaDeNombres(){
		List<String> listaNombres = new ArrayList<>();
		
			listaNombres.add("Sergio");
			listaNombres.add("Ivan");
			listaNombres.add("Ramones");
			listaNombres.add("Velez");
		
		return listaNombres;
		
	}
	
	public static  List<Integer> listaNumeros(){
		List<Integer> listaNumeros = new ArrayList<>();
		
		listaNumeros.add(1);
		listaNumeros.add(20);
		listaNumeros.add(1);
		listaNumeros.add(6);
		listaNumeros.add(78);
		listaNumeros.add(78);
		listaNumeros.add(78);
		listaNumeros.add(12);
		listaNumeros.add(12);
	return listaNumeros;
	
	}
}
