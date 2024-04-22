// definire un metodo per leggere e scrivere da un file.
import java.io.IOException;

public interface DataProcessor {
	void processData(String inputPath,String output) throws IOException;
}
