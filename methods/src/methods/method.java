package methods;

public class method {

	public static void main(String[] args) {

		print();
		printWithParams("Hola", "Hello");
		String out = printWithParamsOutput("Salvo", "Bisconti");
		System.out.println(out);

		int summ = summNumb(10, 20);
		System.err.println(summ);

		boolean condition = isDivisible(5, 10);
		System.out.println(condition);

		String[] onePiece = { "Luffy", "Zoro", "Usop" };
		readArray(onePiece);

		String[] naruto = { "Naruto", "Kakashi", "Jiraya" };
		readArray(naruto);

		System.out.println(varArgs(5, 4, 4, 4, 5, 2, 1, 555));

		System.out.println(factorial(10));
	}

	static void print() {
		System.out.println("Hola");
	}

	static void printWithParams(String firstPar, String secondPar) {
		System.out.println("First: " + firstPar + " Second: " + secondPar);
	}

	static String printWithParamsOutput(String firstPar, String secondPar) {
		String output = "My name is " + firstPar + "my surname is" + secondPar;
		return output;

	}

	static int summNumb(int a, int b) {
		return a + b;
	}

//OVERLOAD DI SUMMNUMB
	static int summNumb(int a, int b, int c) {
		return a + b + c;
	}

//Il nome dei metodi booleani per convenzione si dichiarano con is
	static boolean isDivisible(int firstNumb, int secondNumb) {
		return (firstNumb % secondNumb == 0);
	}

	static void readArray(String[] arr) {
		for (String readedArray : arr) {
			System.out.println(arr);
		}
	}

	static String[] createArray(String firstEl, String secondEl, String thirdEl) {
		String[] arr = { firstEl, secondEl, thirdEl };
		return arr;
	}

// VARARGS -> VARIABLE ARGUMENTS

	static int varArgs(int... x) {
		int tot = 0;
		for (int args : x) {
			System.out.println(args);
			tot += args;
		}
		return tot;
	}

// FUNZIONI RICORSIVE

	static void every() {
		every();
	}

	static void notEvery(int how) {
		if (how > 0) {
			System.out.println(how);
			how--;
			notEvery(how);
		}
	}

	static long factorial(long x) {
		if (x == 0) {
			return 1;
		} else {
			return x * factorial(x - 1);
		}
	}

}