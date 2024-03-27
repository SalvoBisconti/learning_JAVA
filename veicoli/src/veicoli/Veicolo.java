package veicoli;

public  abstract class Veicolo {
	private String nome;
	private int ruote;
	
	
	public Veicolo(String nome, int ruote) {
		this.nome = nome;
		this.ruote = ruote;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getRuote() {
		return ruote;
	}


	public void setRuote(int ruote) {
		this.ruote = ruote;
	}
	
	
	public abstract void parti();
	
	public abstract void ferma();


	@Override
	public String toString() {
		return "Nome= " + nome + ", ruote= " + ruote ;
	}
	
	
	

}
