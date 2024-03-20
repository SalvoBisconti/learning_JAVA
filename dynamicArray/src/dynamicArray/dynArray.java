package dynamicArray;

import java.util.ArrayList;
import java.util.Arrays;

public class dynArray {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>();
		words.add("Hola");
		words.add("me llamo");
		words.add(0, "Salvo"); //Salvo in prima posizione

		System.out.println(words);

		System.out.println(words.get(1));
		int dimension = words.size();
		System.out.println(dimension);
		
		
		words.forEach(element -> System.out.println(element));
		words.forEach(System.out::println);
		
		System.out.println(words.contains("Salvo"));
		
		//ARRAY LIST GENERICO
		ArrayList firstArray = new ArrayList();
		firstArray.add('a');
		firstArray.add('b');
		firstArray.add('c');
		firstArray.add('d');
		
		System.out.println(firstArray.indexOf('b'));
		firstArray.remove(2);
		firstArray.remove('d');

		
		//CONVERTIRE ARRAY IN ARRAYLIST
		Character [] charArr = {'a', 'b', 'c'};
		ArrayList<Character> letters = new ArrayList<>(Arrays.asList(charArr)); 
		
		//CONVERTIRE ARRAYLIST IN ARRAY
		Character [] charNormalArr = new Character[letters.size()];
		letters.toArray(charNormalArr) ;
	}

}
