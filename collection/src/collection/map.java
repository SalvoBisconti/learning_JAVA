package collection;

import java.util.HashMap;
import java.util.TreeMap;

public class map {

	public static void main(String[] args) {
		// INSIEME DI ELEMENTI IDENTIFICATI DA CHIAVE : VALORE
		// HASH MAP -> NON ORDINATO
		// TREEMAP -> ORDINATO
		
		HashMap<String, String> country = new HashMap<>();
		country.put("Italia", "Roma"); //L'INDICE E' ITALIA
		country.put("Norvegia", "Oslo");
		country.put("Usa", "Washington");
		country.put("Cina", "Pechino");

		country.put("Italia", "Palermo"); //NON AMMETTE DUBPLICATI, QUINDI SOVRASCRIVE ROMA
		System.out.println(country);
		
		country.putIfAbsent("Spagna", "Madrid");
		
		System.out.println(country.get("Usa")); //ACCEDERE AD ELEMENTO
		
		System.out.println(country.containsKey("Norvegia")); //CONTROLLO SE ESISTE
		System.out.println(country.containsValue("Berlini"));
		
		
		country.forEach((key, value) -> System.out.println("Chiave: " + key + " valore: " + value));
		
		country.remove("Usa"); //RIMUOVERE ELEMENTO
		
		
		//CHIAVE STRINGA VALORE NUMERICO
		HashMap<String, Integer> mountains = new HashMap<>();
		mountains.put("Everest", 8848);
		mountains.put("K2", 8600);
		mountains.put("Nanga Parbat", 8210);
		
		mountains.forEach((key, value) -> System.out.println("Nome: " + key + " altezza: " +value));
		
		//FOR EACH CLASSICO
		for (String key : mountains.keySet()) {
			System.out.println(("Nome: " + key + " altezza: " +mountains.get(key)));	
		}
		
		
	//	***********  TREEMAP *********
		TreeMap<Integer, String> cars = new TreeMap<>();
		
		cars.put(2,  "Ferrari");
		cars.put(22,  "Tesla");
		cars.put(1,  "Fiat");
		cars.put(18,  "Lamborgini");
		
		System.out.println(cars); // OUTPUT -> FIAT FERRARI LAMBO TESLA
		


	}

}
