package arrayProject;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		
		//programma che chiede all'utente 10 numeri, crea un array e calcola la somma e la media 
		//degli elementi.
		//stampa tutto, gli array, la somma e la media
			
		Scanner scanner= new Scanner(System.in);
		
	        int[] mioArray=new int[10];
	        int somma=0;
	        System.out.println("inserisci 10 numeri:");
	        for (int i = 0; i <10 ; i++) {
	            mioArray[i]=scanner.nextInt();
	        }

	        for (int ris:mioArray) {
	            System.out.println(ris);
	            somma+=ris;
	        }

	        System.out.println("la somma è: "+somma+" la media è: "+(somma/10));
	}

}
