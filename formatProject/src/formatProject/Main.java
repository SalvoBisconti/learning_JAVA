package formatProject;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
//		Supponiamo di dover scrivere un programma Java che gestisca le date per una società di eventi. 
//		Il programma deve essere in grado di registrare la data e l'ora di inizio e fine di ogni evento e 
//		visualizzare le informazioni utilizzando formattazioni date in lingua italiana.
//		Realizza un programma che soddisfi i seguenti requisiti:
//		Definisci una classe Evento che abbia attributi per la data e l'ora di inizio e fine dell'evento.
//		Utilizza la classe java.util.Date per gestire le date e le ore di inizio e fine dell'evento.
//		Implementa un metodo per visualizzare le informazioni dell'evento, inclusa la data e l'ora in un formato leggibile in lingua italiana.
//		Crea un metodo main per testare il funzionamento del programma, 
//		istanziando alcuni oggetti Evento e visualizzando le loro informazioni.
		
		
		Date dataInizio = new Date(2024, 4, 16, 10, 0);
		Date dataFine = new Date(2024, 4, 16, 14, 0);

		
		Evento evento1 = new Evento(dataInizio, dataFine, "JAITA116", "Palermo");
		
		System.out.println(evento1.toString());

	}

}
