package contoCorrente;

public class ContoCorrente {
	private String nome;
	private int deposito, id;
	private static int IdSuccessivo=1;
	
	
	public ContoCorrente(String nome, int deposito) {
		super();
		this.nome = nome;
		this.deposito = deposito;
		this.id = IdSuccessivo;
		IdSuccessivo++;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getDeposito() {
		return deposito;
	}


	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public String preleva(int qty) {
		
		if (deposito - qty < 0 ) {
			int saldo = deposito - qty;
			return "Mi dispiace ma il saldo è insufficiente";
		} else {
			int saldo = deposito - qty;
			return "Prelievo effettuato, nuovo saldo: "+ saldo ;
		}
		
	}
	
	public String versa(int qty) {
		int saldo = deposito + qty;
		return "Deposito effettuato, nuovo saldo: "+ saldo ;
	}
	
	public String getSaldo () {
		return "Nome conto: " +nome + " Saldo: " +deposito;
	}
	

}
