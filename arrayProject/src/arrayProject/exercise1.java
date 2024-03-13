package arrayProject;
import java.util.Scanner;
public class exercise1 {

	public static void main(String[] args) {

		//creare un array di 10 numeri in input dall'utente
		//visualizzare il numero massimo e il numero minimo e dire in che posizioni si trovano
				
		Scanner scanner= new Scanner(System.in);
		
			        int[] minMax=new int[10];
			        System.out.println("inserisci 10 numeri:");
			        for (int i = 0; i <10 ; i++) {
			            minMax[i]=scanner.nextInt();
			        }
			        //scegliamo arbitrariamente dei valori iniziali di min e max
			        int min=minMax[0];
			        int max=minMax[0];
			        int posMax=0;
			        int posMin=0;
			        for (int i = 0; i <10 ; i++) {
			            //Se il numero che leggiamo dall'array è più piccolo del minimo
			            if(minMax[i]<min){
			                min=minMax[i];//allora il minimo è quello che leggiamo
			                posMin=i;// e la posizione è questa che stiamo leggendo
			            }else if(minMax[i]>max){
			                max=minMax[i];
			                posMax=i;
			            }
			        }

			        System.out.println("Il valore max è "+max+" in posizione "+posMax);
			        System.out.println("Il valore min è "+min+" in posizione "+posMin);
			     
	}

}
