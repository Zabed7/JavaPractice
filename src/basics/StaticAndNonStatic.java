package basics;

public class StaticAndNonStatic {

	// Global or Class variables:
	String name = "Rahi";
	static int age = 18;

	public StaticAndNonStatic(String name) {

	}

	public static void main(String[] args) {

		// This is how to call the NON-STATIC Variables & Methods

		StaticAndNonStatic obj = new StaticAndNonStatic("Ali"); // ---> MUST create an object fist.
		obj.wife(); // ---> Calling method.
		System.out.println(obj.name); // ---> Calling variable.

		System.out.println(" ");

		// This is how to call STATIC Variables & Methods

		// Calling methods:
		job(); // ---> Direct call.
		StaticAndNonStatic.job(); // ---> Calling using the class name.

		// Calling Variables
		System.out.println(age); // ---> Direct call.
		System.out.println(StaticAndNonStatic.age); // ---> Calling using the class name.

	}

	public void wife() {
		System.out.println("Joynur Nahar is my wife.");
	}

	public static void job() {
		System.out.println("I will be a software developer.");
	}

}
