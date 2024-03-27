package products;

public class Products {

	public static void main(String[] args) {
		
		Product firstProduct = new Product(1, 200.40, "Prodotto bello");
		System.out.println(firstProduct.applyDesc(20));

	}

}
