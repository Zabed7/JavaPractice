package practice;

public class StaticVariablesAndMethods {

	// Static Variables
	public static String name;
	static int age;

	// Static Methods
	public static void wakeUp() {
		System.out.println("I wake up at 6am.");
	}

	static void sleep() {
		System.out.println("I sleep at 10pm.");
	}

	// THIS IS THE MAIN() METHOD
	public static void main(String[] args) {

		System.out.println("Understanding how STATIC variables & methods works.");

		System.out.println(" ");

		// Calling Static variable directly
		System.out.println(name = "Rahi");
		System.out.println(name = "Ali");
		// calling Static variable using the class name
		System.out.println(StaticVariablesAndMethods.age = 18);
		System.out.println(StaticVariablesAndMethods.age = 27);

		// Calling Static method directly
		wakeUp();
		// Calling Static method using the class name
		StaticVariablesAndMethods.sleep();
	}

}
