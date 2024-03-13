package arrayProject;

import java.util.Arrays;
import java.util.Scanner;

public class sorting {

	public static void main(String[] args) {
		
		//selection sort
		Scanner scanner= new Scanner(System.in);
		int quanti=scanner.nextInt();
		
		int[] valori=new int[quanti];
		
		for (int i = 0; i < valori.length; i++) {
			System.out.println("inserisci il numero "+(i+1));
			valori[i]=scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(valori));//Array popolato

		//selection sort		
		for (int i = 0; i < valori.length; i++) {//ogni valore dell'array
			for (int j = 0; j < valori.length; j++) {//lo confronto con tutti gli altri
				if (valori[i]<valori[j]) {//se è più piccolo
				int temp=valori[i];//li inverto
					valori[i]=valori[j];
					valori[j]=temp;
				}
			}
		}
		//Array ordinato
		System.out.println("Array ordinato: "+Arrays.toString(valori));

	}

}
