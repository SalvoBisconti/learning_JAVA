package veicoli;

public class Bicicletta extends Veicolo {
	private int pedali;
	
	public Bicicletta(String nome, int ruote, int pedali) {
		super(nome, ruote);
		this.pedali=pedali;
	}

	public int getPedali() {
		return pedali;
	}

	public void setPedali(int pedali) {
		this.pedali = pedali;
	}

	@Override
	public String toString() {
		return  super.toString() + "pedali= " + pedali;
	}

	@Override
	public void parti() {
		System.out.println("Parto con i pedali");
		
	}

	@Override
	public void ferma() {
		System.out.println("Mi fermo con le manopole");

		
	}

	
	

}
