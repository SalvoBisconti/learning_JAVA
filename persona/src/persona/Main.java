package persona;

public class Main {

	public static void main(String[] args) {
		
		Persona person1 = new Persona ("Naruto", "Uzumaki", "ZMKNRT85JDJD39DN");
		Studente student1 = new Studente ("Salvo", "Bisconti", "GDGEEI30DJ2884H", 795050, "Unipa");
		Docente teach1 = new Docente ("Gordon", "Gekko", "GDGEEI30DJ2884H", 3500, "Economia aziendale");
		
		System.out.println(person1.toString());
		System.out.println(student1.toString());
		System.out.println(teach1.toString());
	}

}
