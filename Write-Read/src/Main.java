import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String inputF = "dati_vendita.txt"; 
		String outputF = "sommario_vendita.txt";
		DataProcessor processor = new NIODataProcessor();
		try {
			processor.processData(inputF, outputF);
			System.out.println("il riepilogo delle vendite è stato salvato su: "+outputF);
		}catch(FileNotFoundException e){
			System.err.println("Il file non è stato trovato");
		}catch(IOException e) {
			System.err.println("Si è verificato un errore di I/O");
		}
		
	}

	}

