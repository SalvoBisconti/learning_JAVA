package methods;

import java.util.Arrays;
import java.util.Random;

public class exercise2 {

	public static void main(String[] args) {
		//creare un metodo che prende in input un array di 10 numeri casuali da 0 a 20,
		//e un numero intero
		//il metodo deve restituire in output la posizione del numero all'interno dell'array
		//Se il numero non è presente il metodo ritorna -1
		
		int arr [] = numberPositionOnArray(10);
		System.out.println(Arrays.toString(arr));
		

	}
	
	static int[] numberPositionOnArray(int number ) {
		Random random = new Random();
		int[] array1 = new int [number];
		for (int i=0; i< number; i++) {
			array1[i]= random.nextInt(0,21);
		}
		
		return array1;
	}

}
