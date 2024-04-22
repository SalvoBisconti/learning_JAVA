package persona;

public class Studente extends Persona{
	
	private int matricola;
	private String universita;
	
	public Studente() {}

	public Studente(String nome, String cognome, String codiceFiscale, int matricola, String universita) {
		super(nome, cognome, codiceFiscale);
		this.matricola=matricola;
		this.universita=universita;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getUniversita() {
		return universita;
	}

	public void setUniversita(String universita) {
		this.universita = universita;
	}

	@Override
	public String toString() {
		return "Mi chiamo " + this.getNome() + " "  +this.getCognome() + " studio all'università " + this.universita + " e ho la seguente matricola: " + this.matricola;
	};


	
}
