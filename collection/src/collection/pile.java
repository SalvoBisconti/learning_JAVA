package collection;

import java.util.Stack;

public class pile {

	public static void main(String[] args) {
	
		//LIFO Last int first out
		
		Stack pila = new Stack();
		pila.push(1); //AGGIUNGERE ELEMENTI NELLA PILA
		pila.push(true);
		pila.push(4.5);
		
		System.out.println("Dimensione: " + pila.size());
		
		System.out.println(pila.peek()); //ELEMENTO IN CIMA ALLA PILA
		System.out.println(pila.get(1)); //ELEMENTO IN POSIZIONE 1
		
		pila.pop(); //RIMUOVE ELEMENTO IN CIMA
	}

}