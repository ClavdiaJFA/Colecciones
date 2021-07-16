import java.util.LinkedHashSet; /*TreeSet;*/ /*HashSet;*/ /* importacion de librerias */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.LinkedList;
import java.util.HashMap;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * la coleccion Set no puede contener elementos duplicados
		 * sólo tiene los metodos gheredados de Collection
		 * Existen diferentes tipos de implementaciones
		 * 
		 * HashSet: Esta implementacion almacena los elementos en una
		 * tabla hash. Es la que mejor rendiimiento tiene.
		 * Los elementos no tienen un orden
		 * 
		 * HashSet: los ordena de manera aleatoria
		 * TreeSet: es el màs lento de los tres
		 * LinkedHashSet: Con este los ordena 
		 */
		
		Set<String> frutas =  new LinkedHashSet();
		/*TreeSet();*/ 
		/*HashSet();*/ 
		frutas.add("Manzana");
		frutas.add("Mango");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Carambola");
		frutas.add("Maracuyá");
		frutas.add("Plátano");
	
		 /* nos muestra todas las frutas en un orden de acuerdo
		  a la lista determinada */
		
		/*  
		for(String fruta: frutas) {
			System.out.println(fruta);
		} */
		
		//System.out.println(frutas.All(frutas));
		
		/*
		System.out.println(frutas.contains("Guayaba")); 
		/* 
		 
	    /*para seleccionar una fruta. 
	En este caso, la consola nos da un resultado falso 
		porque la "Guayaba" no está en la lista */
		
		System.out.println(frutas.size()); /*muestra número de elementos */
		
		/*
		 * la interfaz List define una sucesión de elementos.
		 * Sí admite elementos duplicados.
		 * Añade nuevos métodos que podemos usar
		 * Acceso posicional a elementos: manipula elementos en función 
		 * de su posición en la lista.
		 * Búsqueda de elementos: busca un elemento concreto de la lista 
		 * y devuelve su posición.
		 * Rango de operación: permite realizar ciertas operaciones sobre ragos 
		 * de elementos dentro de la propia lista.
		 * 
		 * Implementaciones:
		 * ArrayList
		 * LinkedList
		 */
		 
		List<String> frutas2 = new ArrayList<String>();
		frutas2.add("Manzana");
		frutas2.add("Mango");
		frutas2.add("Durazno");
		frutas2.add("Pera");
		frutas2.add("Cereza");
		frutas2.add("Mandarina");
		frutas2.add("Carambola");
		frutas2.add("Maracuyá");
		frutas2.add("Plátano");
		
		for (String f: frutas2) {
			System.out.println(f);
		}
		
		//variable para seleccionar Pera
		int pera = frutas2.indexOf("Pera"); //"indexOf" buscar elementos
		System.out.println(pera);
		System.out.println(frutas2.get(pera)); //"get" obtener elementos
		
		List <Integer> agenda = new ArrayList<Integer>();
		agenda.add(123);
		agenda.add(456);
		agenda.add(789);
		
		for (Integer a: agenda) {
			System.out.println(a);
		}
		
		//LinkedList
		
		List <String> animales = new LinkedList<String>();
		animales.add("Perro");
		animales.add("Gato");
		animales.add("Conejo");
		animales.add("Tortuga");
		animales.add("Oso");
		animales.add("Quetzal");
		
		for(String an: animales); {
			System.out.println(an);
		}
		
		/*
		 * La interfaz Map asocia claves a valores
		 * No puede contener claves dub¡plicadas y cada
		 * clave solo puede tener asociado un valor
		 * 
		 * Implementaciones
		 * HashMap
		 * TreeMpa: ordenamiento dpenediendo de las claves
		 * LinkedHashMap
		 * 
		 */
		
		Map diccionario = new HashMap<>();
		//diccionario.put(clave,valor);
		diccionario.put ("hjkln", "Claudia Flores");
		diccionario.put("asdfg", "7897");
		diccionario.put("indice", "yuio");
		
		System.out.println(diccionario.get("elemento1"));
		
		for (Map.Entry<String, String> entry : diccionario.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	
	}

}
