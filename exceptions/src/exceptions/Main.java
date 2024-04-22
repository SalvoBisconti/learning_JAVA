package exceptions;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int array[] = new int[5];
		Scanner input = new Scanner(System.in);
		int number =0;
		int arrayPosition = 0;
		
		try {
			System.out.println("In quale posizione dell'array vuoi inserire il numero?");
			arrayPosition = input.nextInt();
			if (arrayPosition <= 5  )  {
				System.out.println("Inserisci numero");
				number = input.nextInt();
				array[arrayPosition] = number;
			}
			array[arrayPosition] = number;
			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("L'indice è superiore alla lunghezza dell'array");
			
		}
		catch (Exception e) {
			System.out.println("Errore");
		}

	}

}
