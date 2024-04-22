package scuolaMusicale;

public class Chitarra extends StrumentoMusicale implements StrumentoACorda, StrumentoAPercussione{
	
	private String nome;
	private String genere;
	
	
	public Chitarra(String nome, String genere) {
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
		return "Chitarra: "+ this.nome + ", genere:" + this.genere ;
	}

	@Override
	public String pizzica() {
		return "Sto pizzicando la chitarra";
		
	}
	@Override
	public String percuoti() {
		return "Sto battendo sulla chitarra";
		
	}
	
	
	@Override
	public String suona() {
		return "Suono la chitarra";
	}

}
