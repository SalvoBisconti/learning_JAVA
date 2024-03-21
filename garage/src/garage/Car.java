package garage;

public class Car {
	
	private String brand, model, color, name;
	private int year;
	private double price;
	
	
	
	public Car(String brand, String model, String color, int 	year, double price) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.year = year;
		this.price = price;
	}
	
	public Car(String name) {
		this.name = name;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", year=" + year + ", price=" + price
				+ "]";
	}

	
	
	
}
