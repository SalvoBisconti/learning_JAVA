package veicoli;

public class VeicoloTest {

	public static void main(String[] args) {
		
		// NON POSSO CREARE OGGETTI DA UNA CLASSER ASTRATTA
		// QUINDI NON POSSO FARE NEW VEICOLO
		
		Macchina car = new Macchina("Ferrari", 4, 3);
		System.out.println(car);
		car.parti();
		car.ferma();
		
		Bicicletta bici = new Bicicletta("Bianchi", 2, 2);
		bici.parti();
		bici.ferma();
		
		
		/*************** POLIMORFISMO ****************/
		
		Veicolo[] transport = {car, bici};
		for (Veicolo veicolo : transport) {
			veicolo.parti();
			veicolo.ferma();
		}
	
	}

}
