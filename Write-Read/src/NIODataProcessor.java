import java.io.IOException;
import java.nio.file.*;
import java.util.List;


public class NIODataProcessor extends AbstractDataProcessor {
	@Override
	public void processData(String inputPath, String output) throws IOException {
		//Leggere il file e calcolare quanto mi è stato richiesto
		List<String> lines = Files.readAllLines(Paths.get(inputPath));
		for (String line : lines) {
			System.err.println("line:"+line);
			double amount = parseLine(line);
			calculateTotals(amount);
		}
		String summary = "Totale vendite: " + totalSales + " in totale transazioni:" + transactionCount;
		//Scrittura del file dopo aver calcolato quanto richiesto
		Files.writeString(Paths.get(output),summary);
	}
	
	private double parseLine(String line) {
		String[] parts  = line.split(";");
		System.err.println("split amount: "+ parts[2]);
		return Double.parseDouble(parts[2]); // Restituisce il solo importo
	}

	
}