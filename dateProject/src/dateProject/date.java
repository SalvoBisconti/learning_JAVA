package dateProject;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class date {

	public static void main(String[] args) {
		
		// Non si usa più
		Date oggi= new Date();
	    System.out.println(oggi);
	    
	    LocalDate data = LocalDate.now();
		System.out.println(data);
		
		LocalTime ora =LocalTime.now();
		
		LocalDateTime dataOra = LocalDateTime.now();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss\n" + "EEEE dd MMMM y \n" + "'giorno dell anno' EEEE");
		System.out.println(dataOra.format(formato));
		
		//EStrarre parti di data
		System.out.println(LocalDate.now().getDayOfMonth());
		String nomeGiorno= LocalDate.now().getDayOfWeek().name();
		System.out.println(nomeGiorno);
		
		//Per averlo in italiano
		System.out.println(LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY));
		

		//Confronto tra due stringhe
		
		String word = "ciao";
		
		boolean uguali= word.equalsIgnoreCase("CIAO");
		System.out.println(uguali);
		
		//Controllo se vuota
		System.out.println(word.isEmpty());
		
		System.out.println(word.substring(1,3));
		
		System.out.println(word.replace(word,"hola"));
		
		
		//METODO MATH
		int massimo= Math.max(5, 10);
		int minimo = Math.min(5, 10);
		double potenza= Math.pow(2, 4);
		
		Math.round(potenza);
		DecimalFormat df = new DecimalFormat("0,0") ; //TO FIXED NUMBER
		
		System.out.println(df.format(potenza));
	
		System.out.println(Math.ceil(4.4)); // 4
		System.out.println(Math.floor(4.4)); // 5
		
		Random r = new Random();
		int casuale= r.nextInt(5, 9000);
		System.out.println(casuale);
		
		boolean casualBool= r.nextBoolean();
		double casualDouble= r.nextDouble(5, 30.99);

		
		
		
		
	}
}