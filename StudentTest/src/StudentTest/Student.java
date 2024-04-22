package StudentTest;

import person.obj.Person;

public class Student extends Person {

	String subject;
	
	public Student(String name, String surname, boolean adult, char gender, double weight, int age, String subject) {
		super(name, surname, age, adult, gender, weight);
		this.subject = subject;
	}
	
	public void study(String subject) {
		System.out.println("Sto studiando " + subject);
	}
	
	@Override
	public void toSleep() {
		System.out.println("Sto dormendo");	
	}

}
