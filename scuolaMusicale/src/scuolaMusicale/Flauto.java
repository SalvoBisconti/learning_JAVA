package scuolaMusicale;

public class Flauto extends StrumentoMusicale implements StrumentoAFiato {
	
	private String nome;
	private String genere;
	
	
	public Flauto(String nome, String genere) {
		super();
		this.nome = nome;
		this.genere = genere;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getGenere() {
		return genere;
	}


	public void setGenere(String genere) {
		this.genere = genere;
	}


	@Override
	public String toString() {
		return "Flauto: " + nome + ", genere=" + genere ;
	}
 

	public String soffia() {
		return "Sto soffiando nel flauto";
		
	}
	
	@Override
	public String suona() {
		return "Suono il flauto";
	}
	




	
}
