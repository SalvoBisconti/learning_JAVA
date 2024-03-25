package contoCorrente;

public class Index {

	public static void main(String[] args) {
		
		ContoCorrente primoConto = new ContoCorrente("Salvo", 10000);
		ContoCorrente secondoConto = new ContoCorrente("Ciccio", 2000);

		System.out.println(primoConto.preleva(20000));
		System.out.println(primoConto.versa(200));
		System.out.println(primoConto.getSaldo());
		
		System.out.println("ID primo conto: " +primoConto.getId() + " ID secondo conto: " +secondoConto.getId());
	}

}
