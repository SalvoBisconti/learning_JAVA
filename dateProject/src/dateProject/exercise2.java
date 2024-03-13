package dateProject;

import java.util.Random;

public class exercise2 {

	public static void main(String[] args) {
		Random r = new Random();
		int firstDade= r.nextInt(1, 7);
		int secondDade= r.nextInt(1, 7);
		
		System.out.println(firstDade + secondDade);
		
			boolean result= firstDade == secondDade;
			System.out.println(result);
		
			
			

	}

}