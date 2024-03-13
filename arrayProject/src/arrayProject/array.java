package arrayProject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class array {


		public static void main(String[] args) {

			//Gli array in java sono immutabili
			//Devo specifiare una dimensione alla dichiarazione
			//Non posso aggiungere e togliere elementi
			
			int[] unArray=new int[10];//gli array si dichiarano col new come le classi
			
			unArray[0]=1;
			unArray[1]=2;
			unArray[2]=3;
			
			System.out.println(unArray[1]);
			System.out.println(unArray);//l'indirizzo di memoria in cui è presente l'array
			System.out.println(unArray[8]); //0
			//Se non assegno un valore gli elementi di tipi primitivi int hanno valore predefinito 0
			//Per i boolean primitivi il valore predefinito è false 
			//Per le stringhe il valore predefinito è "";
			
			String[] noteMusicali= new String[7];
			noteMusicali[0]="Do";
			noteMusicali[1]="Re";
			noteMusicali[2]="Mi";
			noteMusicali[3]="Fa";
			noteMusicali[4]="Sol";
			noteMusicali[5]="La";
			noteMusicali[6]="Si";
			
			int lungezzaArr=noteMusicali.length;
			System.out.println("l'array contiene "+lungezzaArr+" elementi");
			
			String[] colori= {"bianco","nero","giallo","blu"};
			System.out.println(colori[3]);//blu
			
			boolean[] veroFalso= {true,false,true,true,false};
			System.out.println(veroFalso[2]);//true
			
			boolean[] veroFalso2= new boolean[10];
			veroFalso2[0]=true;
			veroFalso2[1]=true;
			System.out.println(veroFalso2[8]);//false
			
			for (int i=0;i<colori.length;i++) {
				System.out.println(colori[i]);//utilizza l'indice per trovare l'elemento 
			}
			
			//improved loop
			for(String colore:colori) {
				System.out.println(colore);//il vantaggio che non devo dire quante volte ciclare
										  //lo svantaggio è che io non conosco la pos. degli elementi
			}
			
			int[] arr= new int[5];
			for (int i = 0; i < 5; i++) {
				arr[i]=i;//popolo l'array con i valori dell'indice del for
			}
			
			for (int i : arr) {
				System.out.println(i);
			}
			
			String[] giorni= {"lunedi","martedì","mercoledi","giovedì","venerdì","sabato","domenica"};
			for (int i = 0; i < giorni.length; i++) {
				if (giorni[i]=="venerdì" || giorni[i]=="sabato") {
					System.out.println(giorni[i]+" festa");
				}else if (giorni[i]=="domenica") {
					System.out.println(giorni[i]+" relax");
				}else {
					System.out.println(giorni[i]+" si lavora");
				}
			}
			//cercare un elemento in un array
			String[] animali= {"cane","gatto","topo","criceto","pesce","tricheco"};
			String piuLunga=animali[0];
			for (String s : animali) {
				if (s.length()>piuLunga.length()) {
					piuLunga=s;
				}
			}
			System.out.println("la più lunga è "+piuLunga);
			
			String stringa="ciao come stai";
			
			char[] car=stringa.toCharArray();//crea un array di caratteri a partire da una stringa
			
			for (char c : car) {
				System.out.println(c);
			}
			
			String[] arrDiStringhe=stringa.split(" ");
			for (String a : arrDiStringhe) {
				System.out.println(a);
			}
			
			System.out.println(unArray);//l'indirizzo di memoria in cui è presente l'array
			System.out.println(Arrays.toString(unArray));
			
			int[] arrCasuali=new int[10];
			Random r= new Random();
			for (int i = 0; i < 10; i++) {
				arrCasuali[i]=r.nextInt(101);//popolo l'array con valori casuali da 0 a 100
			}
			
			for (int valori : arrCasuali) {
				System.out.println(valori);
			}
			
			System.out.println("Stampa usando Arrays "+Arrays.toString(arrCasuali));
			
			/*************************ORDINAMENTO***********************************/
			
			Object[] misto= new Object[4];
			misto[0]= true;
			misto[1]= "ciao";
		    misto[2]= 123;
		    misto[3]= 3.14;
		    
		    System.out.println(Arrays.toString(misto));
		    
		    /////////////////////////////////////
		    int[][] arrMulti= {
		    		{1,2,3},//primo elemento dell'array	 pos 0
		    		{4,5,6} //secondo elemento dell'array pos 1
		    };
			
		    System.out.println(arrMulti[0][1]);//2
		    
			int[][] multiplo=new int[2][3];
			multiplo[0][0]=1;
			multiplo[0][1]=2;
			multiplo[0][2]=3;
			multiplo[1][0]=4;
			multiplo[1][1]=5;
			multiplo[1][2]=6;
			
			for (int[] arr2 : multiplo) {
				System.out.println(Arrays.toString(arr2));
				for (int num : arr2) {
					System.out.println(num);
				}
			}
					
			String [][] arrMulti2= { //3X2				
					{"mario","rossi"}, //0
					{"giuseppe","verdi"}, //1
					{"ugo","bianchi"} //2			
			};
			
			System.out.println(arrMulti2[1][1]);//verdi
			
			/////////////////////////////////////////////////
			String[] frutti= {"banane","arance","limoni","lamponi"};
			String[] verdure= {"carote","piselli","pomodori","insalata"};
			
			String[][] vegetali= {frutti,verdure};
			//forEach
			for (String[] fruttiEverdure : vegetali) {// ritorna gli array frutti e verdure
				System.out.println(Arrays.toString(fruttiEverdure));			
				for (String elementi : fruttiEverdure) {
					System.out.println(elementi);//estrae i singoli elementi
				}
			}
			
			//stampa con indice
			for (int i = 0; i < vegetali.length; i++) {
				for (int j = 0; j < vegetali[i].length; j++) {//ciclo sugli elementi dell'array
					System.out.println(vegetali[i][j]);
				}
			}
			
			//deepToString stampa array multiDimensionali
			System.out.println(Arrays.deepToString(vegetali));	
				
		
	        
	     
			
		}

	}

