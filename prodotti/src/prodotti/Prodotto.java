package prodotti;

public class Prodotto {
	
	private static int proxId=0;
	private int idProd;
	private String desc;
	protected double prezzo;
	Cliente cliente1;
	
	
	public Prodotto(String desc, double prezzo, Cliente cliente1) {
		this.idProd = proxId;
		this.desc = desc;
		this.prezzo = prezzo;
		proxId++;
	}


	public static int getProxId() {
		return proxId;
	}


	public static void setProxId(int proxId) {
		Prodotto.proxId = proxId;
	}


	public int getIdProd() {
		return idProd;
	}


	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	
	
	
	
	

}
