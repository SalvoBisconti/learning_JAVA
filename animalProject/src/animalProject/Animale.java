package animalProject;

public class Animale {
	
	private String nome;
	private int eta;

	public Animale () {};
	
	public Animale(String nome, int eta) {
		this.nome= nome;	
		this.eta=eta;
	}

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}


	@Override
	public String toString() {
		return "Sono un animale, mi chiamo" + this.nome + "e ho" + this.eta + "anni" ;
	}
	
	public String getMovimento() {
		return null;
	}
	
	public String getRiproduzione() {
		return null;
	}
	public String getCopertura() {
		return null;
	}
}
