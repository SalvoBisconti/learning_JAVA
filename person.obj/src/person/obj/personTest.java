package person.obj;

public class personTest {

	public static void main(String[] args) {
		
	
		
		//CON COSTRUTTORE DI DEFAULT
//		Person firstPerson;
//		firstPerson = new Person();
//		firstPerson.name = "Naruto";
//		firstPerson.surname = "Uzumaki";
//		firstPerson.age = 17;
//		firstPerson.toEat("pasta", "pizza");
//		firstPerson.toSleep();
//		firstPerson.info();
		
		
		//CON COSTRUTTORE CUSTOM
		
		Person firstPerson =new Person ("Naruto", "Uzumaki", 17, false, 'm', 56.80);
		Person secondPerson =new Person ("Kakashi", "Hatake", 32, true, 'm', 70.20);
		secondPerson.toSleep();
		
		secondPerson.setGender('m');
		System.out.println("Sesso: " + secondPerson.getGender());

		secondPerson.setWeight(60.43);
		System.out.println("Peso: " + secondPerson.getWeight());
		
		System.out.println(secondPerson.toString());
		
		System.out.println(firstPerson.equals(secondPerson));
	}

}
