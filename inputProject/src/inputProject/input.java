package inputProject;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Come ti chiami?");
		String nome = input.nextLine();
		
		System.out.println("Quanti anni hai?");
		int anni = input.nextInt(); // salva numeri
		input.nextLine(); //raccoglie l'invio
		
		System.out.println("Ti chiami "+ nome + " ed hai" + anni + " anni");
		
}
}
