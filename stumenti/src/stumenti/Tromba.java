package stumenti;

public class Tromba extends Strumento{
	private int tasti;
	
	public Tromba(String nome,int tasti) {
		super(nome);
		this.tasti=tasti;
	}

	@Override
	public void suona() {
		System.out.println("la tromba si suona con l'aria");
	}

	@Override
	public String toString() {
		return super.toString()+ "tasti= "+tasti;
	}

	
	
	
}
