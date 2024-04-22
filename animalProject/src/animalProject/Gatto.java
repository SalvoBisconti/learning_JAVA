package animalProject;

public class Gatto extends Animale {

	private String razza;
	private String pelo;

	
	public Gatto(String nome, int eta, String razza, String pelo) {
		super(nome, eta);
		this.razza = razza;
		this.pelo = pelo;
	}
	

	public String getRazza() {
		return razza;
	}


	public void setRazza(String razza) {
		this.razza = razza;
	}


	public String getPelo() {
		return pelo;
	}


	public void setPelo(String pelo) {
		this.pelo = pelo;
	}


	@Override
	public String toString() {
		return "Sono un gatto di razza" + this.razza +"e ho il pelo "+   this.pelo ;
	}
	
	
	
	
	
}
