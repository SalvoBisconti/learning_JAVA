package dataTypes;

public class data {

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.print("Ciao");
		
		// Number
		byte b = 1;
		short corto = 2;
		int intero = 2;
		float virgola = 0.51F;
		double doppiaVirgola = 2.5;
		final double PI= 3.14; //Costante non può essere cambiata
		long lunga = 30;
		short pic= 1;
		
		//String
		char variable = 'a';
		char number = '1';
		
		String parola = "ciao a tutti";
		System.out.print(parola);	
		
		boolean vero = true;
		
		//CLASSI WRAPPER
		Integer interoOne = 123;
		Double virgolaOne = 3.14;
		Character chara ='a';
		Boolean bool = true;
		
		String str="TRUE";
		Character.toLowerCase(chara);
		Boolean b5= Boolean.parseBoolean(str);  //Converte stringa in booleano
		String uno = "uno";
		int numeroConvertito = Integer.parseInt(uno); // Converte stringa in numero
		
		
		

	}

}