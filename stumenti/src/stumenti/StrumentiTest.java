package stumenti;

public class StrumentiTest {

	public static void main(String[] args) {
	
		
		Strumento[] arrS= {new Chitarra("Fender", 6),new Pianoforte("piano", 88),new Tromba("tromba", 5)};
		
		//polimorfismo
		for (Strumento strumento : arrS) {
			System.out.println(strumento);
			strumento.suona();
		}
		
	}

}
