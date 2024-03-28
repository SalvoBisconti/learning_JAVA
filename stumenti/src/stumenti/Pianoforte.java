package stumenti;

public class Pianoforte extends Strumento{
	
	private int numeroTasti;
	
	public Pianoforte(String nome,int numeroTasti) {
		super(nome);
		this.numeroTasti=numeroTasti;		
	}

	@Override
	public void suona() {
		System.out.println("il pianoforte si suona con i tasti");
	}

	@Override
	public String toString() {
		return super.toString()+" numero tasti= "+numeroTasti;
	}
}
