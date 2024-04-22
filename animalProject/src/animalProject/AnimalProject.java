package animalProject;

public class AnimalProject {

	public static void main(String[] args) {
		
		Animale cane = new Animale ("Kai", 4);
		
		System.out.println(cane.toString());
		
		Gatto cat = new Gatto ("Garfield", 12, "Exotic Shorthair", "arancione");
		System.out.println(cat.toString());
		
	}

}
