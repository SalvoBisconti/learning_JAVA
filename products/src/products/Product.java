package products;

public class Product {
	private double price;
	private String description;
	private int id ;
	
	
	public Product(int id, double price, String description) {
		this.id = id;
		this.price = price;
		this.description = description;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double applyDesc(int perc) {
		return price - price*perc /100;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", description=" + 	description + "]";
	}
	
	
	
	
	

}
