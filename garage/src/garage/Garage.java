package garage;

import java.util.ArrayList;

public class Garage {
	
	private String name;
	private ArrayList<Car> carsInGarage = new ArrayList<>();

	
	/**
	 * 
	 * @param name
	 */
	public Garage(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void parking(Car carType) {
		carsInGarage.add(carType);
	}
	
	/**
	 * 
	 * @param carsType
	 */
	public void parking(ArrayList<Car> carsType) {
		carsType.forEach(car -> carsInGarage.add(car));
	}
	
	public void print() {
		carsInGarage.forEach(car -> 	System.out.println(car.getName()));
	}

}
