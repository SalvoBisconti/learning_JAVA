package methods;

public class exercise1 {

	public static void main(String[] args) {
		// SCRIVERE UN METODO CHE PRENDE IN INPUT UNA STRINGA E UN NUMERO INTERO,
		// SI STAMPERA' TANTE VOLTE LA STRINGA QUANTE INDICATE NEL NUMERO DI INPUT
		// SE INPUT NEGATIVO STAMPARE "ERRORE"

		printString("Hola", 5);
		printString("Hola", -1);

	}

	static void printString(String stringIn, int number) {
		if (number > 0) {
			for (int i = 1; i <= number; i++) {
				System.out.println(stringIn);
			}
		} else {
			System.out.println("Errore numero negativo");
		}

	}

}
