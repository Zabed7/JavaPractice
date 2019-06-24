package practice;

public class MethodsNonStatic {

	public static void main(String[] args) {

		MethodsNonStatic obj = new MethodsNonStatic();
		
		// Method 1
		obj.tester();

		// Method 2
		int z = obj.programmer();
		System.out.println(z);

		// Method 3
		String s1 = obj.qa();
		System.out.println("I will be really good at: " + s1);

		// Method 4
		int b = obj.boss(2, 1);
		System.out.println("I will be the Boss in " + b + " years!");

	}

	// void = means does not return any value
	// return type = void
// 1. Method type = no-input & no-output
	public void tester() {
		System.out.println("Examples of different methods.");
	}

	// return type = int
// 2. Method type = no-input & some-output
	public int programmer() {
		//System.out.println("I will be a programmer.");
		int a = 10;
		int b = 30;
		int c = a + b;

		return c;
	}

	// return type = String
// 3. Method type = no-input & some-output
	public String qa() {
		System.out.println("I wil be good a QA.");
		String s = "Selenium";

		return s;
	}

	// return type = int
	// (int a, int b) = input parameters/arguments
// 4. Method type = some-input & some-output
	public int boss(int a, int b) {
		System.out.println("Soon I will be boss.");
		int c = a * b;

		return c;
	}

}
