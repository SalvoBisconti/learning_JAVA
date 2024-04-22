package formatProject;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Evento {

	private Date dataInizio;
	private Date dataFine;
	private String nome;
	private String citta;
	
//	Locale italia = new Locale("it", "IT");
	DateFormat formattaData = DateFormat.getDateTimeInstance(DateFormat.LONG,
			DateFormat.SHORT, Locale.ITALY);
	
	public Evento(){};
	
	
	public Evento(Date dataInizio, Date dataFine, String nome, String citta ) {
		super();
		this.dataInizio= dataInizio;
		this.dataFine=dataFine;
		this.nome=nome;
		this.citta=citta;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public Date getDataFine() {
		return dataFine;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}
	

	@Override
	public String toString() {
		return "Nome: "+ this.nome + ". Città: "+ this.citta+  ". Data inizio: " + formattaData.format(dataInizio) + ". Data fine: "+ formattaData.format(dataFine)  ;
	};
	
	
	
	
	


	
	
	
}
