package stumenti;

public abstract class Strumento {

	private String nome;

	public Strumento(String nome) {
		this.nome = nome;
	}
	
	public abstract void suona();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "nome = " +nome;
	}
}

