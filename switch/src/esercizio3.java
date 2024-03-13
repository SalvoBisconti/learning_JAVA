import java.util.Random;

public class esercizio3 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int punt1= 30;
		int punt2 = 30;	

		
		
		for (int i=0; punt1 == 0 || punt2 == 0; i++) {
			int firstDade= r.nextInt(1, 7);
			int secondDade= r.nextInt(1, 7);
			
			if(firstDade < secondDade) {
				punt1 --;
				
			} else if (firstDade > secondDade) {
				punt2 --;
			}	
			
			System.out.println("Punteggi attuali: " + "Giocatore 1: " + punt1 + "Giocatore 2: " + punt2  );
			
		}
		System.out.println("Punteggi attuali: " + "Giocatore 1: " + punt1 + "Giocatore 2: " + punt2  );

	}

}
