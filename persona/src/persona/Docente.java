package persona;

public class Docente extends Persona {
	
	private int salario;
	private String materia;
	
	public Docente() {}

	public Docente(String nome, String cognome, String codiceFiscale, int salario, String materia) {
		super(nome, cognome, codiceFiscale);
		this.materia=materia;
		this.salario=salario;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Mi chiamo " + this.getNome() + " " + this.getCognome() + " insegno " + this.materia + " ed il mio stipendio è di " + this.salario + " €";
	}
	
	

	
}
