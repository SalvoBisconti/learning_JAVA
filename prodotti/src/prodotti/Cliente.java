package prodotti;

import person.obj.Person;

public class Cliente extends Person {
	
	private int idCliente;
	private static int proxId = 1;

	public Cliente(String name, String surname, int age, boolean adult, char gender, double weight) {
		super(name, surname, age, adult, gender, weight);
		this.idCliente= proxId;
		proxId++;	
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "ID Cliente=" + idCliente + " " + super.toString();
	}

	
	
}
