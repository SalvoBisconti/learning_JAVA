import java.util.Scanner;

public class esercizio1 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci mese");
		String monthName = s.nextLine();
		
		switch (monthName) {
        case "gennaio", "marzo","maggio","luglio","agosto","ottobre","dicembre":
            System.out.println("Numero di giorni: 31");
            break;
		
		case "febbraio":
            System.out.println("Numero di giorni: 28");
            break;
			
		  case "aprile","giugno","settembre", "novembre":
              System.out.println("Numero di giorni: 30");
              break;
              
			default:
                System.out.println("Numero di giorni: 31");
                break;

	}

	}}
