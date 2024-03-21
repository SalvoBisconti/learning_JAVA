package garage;

import java.util.Scanner;

public class TestGarage {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qunati posti ha il parcheggio?");
		int placeNumber = scan.nextInt();
		scan.nextLine(); //Per raccogliere l'invio
		
		Garage firstGarage = new Garage("Parcheggio Sole");
		
		for (int i = 0; i < placeNumber; i++) {
			System.out.println("Inserici dettagli auto");
			firstGarage.parking(new Car(scan.nextLine()));	
		}
		
		System.out.println("Il parcheggio " +firstGarage.getName() + " ha queste macchine: ");
		firstGarage.print();
	}

}
