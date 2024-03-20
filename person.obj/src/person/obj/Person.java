package person.obj;

public class Person {

	public String name, surname;
	public int age;
	public boolean adult;
	private char gender;
	private double weight;
	
	//METODI
	public void toEat(String food) {
		System.out.println("Sto mangiando: " + food);
	}
	
	public void toEat(String lunchFood, String dinnerFood ) {
		System.out.println("A pranzo mangio: " + lunchFood + " e a cena mangio: " + dinnerFood);
	}
	
	public void toSleep () {
		System.out.println("Zzz");
	}
	
	public boolean isAdult () {
		return age >= 18;
	}
	
	public void info() {
		System.out.println("Mi chiamo " + name + " " + surname + " ed ho " + age + " anni" );
	}
	
	//COSTRUTTORE -> non ritorna nulla neanche void
	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age= age;
	}
	
	//METODI SET -> assegnano un valore agli attributi
	//METODI GET -> ritornano il valore degli attributi
	
	public void setGender(char gender) {
		this.gender= gender;	
	}
	
	public char getGender() {
		return gender;		
	}

	public void setWeight(double weight) {
		this.weight = weight;		
	}

	public double getWeight() {
		return weight;		
	}
	
	//OVERIDE DEL METODO TOSTRING (GIA' ESISTENTE)
	
	@Override
	public String toString() {
		return "La persona si chiama "+name+" "+surname+" ed ha "+age+ " anni";
	}
	
}
