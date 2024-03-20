package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class set {

		public static void main(String[] args) {
			//Set è un tipo di collection che non prevede duplicarti
			//Esistono 2 tipologie di set
			//HashSet -> è una collezione di elementi senza un preciso ordine.
			//TreeSet-> è una collezione di elementi ordinati
			
			
			HashSet<String> hash= new HashSet<>();
			hash.add("c");
			hash.add("a");
			hash.add("b");
			hash.add("b");
			
			
			System.out.println(hash);
			System.out.println(hash.add("d"));//true se non esiste ancora
			System.out.println(hash.add("d"));//false se esiste già
			System.out.println(hash.size()); //dimensione
			
			for (String h : hash) {
			System.out.println(h);
			}
			
			hash.forEach(h->System.out.println(h));
			//non esiste il metodo get per cercare un elemento ad una posizione
			for (String h : hash) {
			if (h.equals("a")) {
			System.out.println("trovato");
			}else {
			System.out.println("non trovato");
			}
			}
			String[] a= {"cane","cane","gatto","topo","cane"};
			HashSet<String> mioSet= new HashSet<>(Arrays.asList(a));
			System.out.println(mioSet);
			
			
			/////////////////////////////////////////////////////////////
			//TreeSet è ordinata
			TreeSet<Integer> ts= new TreeSet<>();
			ts.add(9);
			ts.add(1);
			ts.add(5);
			ts.add(2);
			ts.add(9);
			System.out.println(ts);
			}

}