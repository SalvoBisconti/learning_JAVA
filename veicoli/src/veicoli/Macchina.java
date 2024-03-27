package veicoli;

public class Macchina extends Veicolo {
	
	private int porte;
	
	public Macchina(String nome, int ruote, int porte) {
		super(nome, ruote);
		this.porte = porte;
	}

	public int getPorte() {
		return porte;
	}

	public void setPorte(int porte) {
		this.porte = porte;
	}
	
	
	@Override
	public void parti() {
		System.out.println("Parto schiacciando l'acceleratore"); 
		
	}

	@Override
	public void ferma() {
		System.out.println("Freno schiacciando il pedale"); 	
	}

	@Override
	public String toString() {
		return super.toString() + " porte= " + porte;
	}
	
	

	

}
