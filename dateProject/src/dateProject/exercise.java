package dateProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class exercise {

	public static void main(String[] args) {
		
		LocalDateTime dateOfTheDay = LocalDateTime.now();

		DateTimeFormatter formatted = DateTimeFormatter.ofPattern("'Oggi è il '" + "dd/MM/yyyy" + "' sono le ore '" + "HH:mm:ss" +"' di '" +"EEEE");
		System.out.println(dateOfTheDay.format(formatted));
		
		String mainString = "Java è un bel linguaggio di programmazione";
		
		int requiredIndex = mainString.indexOf("linguaggio");
		System.out.println(requiredIndex);
		
		int lastIndex = mainString.length();
		System.out.println(lastIndex);
		
		System.out.println(mainString.substring(requiredIndex, lastIndex));
		

	}

}