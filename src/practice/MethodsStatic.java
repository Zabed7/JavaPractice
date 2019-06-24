package practice;

public class MethodsStatic {

	public static void main(String[] args) {

		// Method 1 Call
		car();

		// Method 2 Call
		double c = favNumber();
		System.out.println("8 divided by 2: " + c);

		// Method 3 Call
		String s = location();
		System.out.println(s);

		// Method 4 Call
		String z = bestCouple();
		for (int a = 1; a <= 3; a++) {
			System.out.println("Best Couple: " + z);
		}

	}

	// Method 1
	public static void car() {
		System.out.println("I love cars.");
	}

	// Method 2
	static double favNumber() {
		int a = 8;
		int b = 2;
		double c = a / b;

		return c;
	}

	// Method 3
	public static String location() {
		String s = "Long Beach";

		return s;
	}

	// Method 4
	static String bestCouple() {
		String x = "Rahi";
		String y = "Ali";
		String z = x + " & " + y;

		return z;
	}

}
