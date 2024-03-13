import java.util.Scanner;

public class esercizio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci numero");
		int number = s.nextInt();
		
		if (number > 0) {
			for (int i=0; i<number; i++)
			{
				
				System.out.println(i);
			}
		} else System.out.println("Il numero è negativo");
				
	}

}
