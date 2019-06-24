package basics;

public class WrapperClass {

	public static void main(String[] args) {

		String a = "100";

		System.out.println(a + 20);

// 1. String to Integer conversion 
		int b = Integer.parseInt(a);
		System.out.println(b + 20);

// 2. String to Double conversion
		String c = "15.77";
		double d = Double.parseDouble(c);
		System.out.println(d + .23);

// 3. String to Boolean conversion
		String e = "true";
		boolean f = Boolean.parseBoolean(e);
		System.out.println(f);

// 4. Integer to String conversion
		int g = 20;
		System.out.println(g + 30);

		String h = String.valueOf(g);
		System.out.println("200" + h);

	}

}
