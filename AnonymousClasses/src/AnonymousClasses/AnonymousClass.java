package AnonymousClasses;

public class AnonymousClass {

	public static void main(String[] args) {
		

		Anonymous a= new Anonymous();
		a.saluta();
		
		Anonymous a2= new Anonymous();
		a2.saluta();
		
		//classe anonima. 
		Anonymous a3= new Anonymous() {
			@Override 
			public void saluta() {//<--Stiamo facendo l'override del metodo presente nella classe
				System.out.println("Hello World!");
				canta();
			}
			
			//non si possono richiamare altri metodi oltre a quelli predefiniti della classe
			public void canta() {
				System.out.println("la la la ");
			}
		}; //<--obbligatorio il ;
		
		a3.saluta();
		//a3.canta; Non posso richiamarlo perchè non esiste dentro Anonima
		
		
		
		Anonymous a4= new Anonymous() {
			@Override
			public void saluta() {
				System.out.println("bonjour monde!");
			}
		};
				
		a4.saluta();
		
	}


	}
