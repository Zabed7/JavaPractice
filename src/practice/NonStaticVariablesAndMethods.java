package practice;

public class NonStaticVariablesAndMethods {

	// Non-Static Variables
	public String name;
	int age;

	// Non-Static Methods
	public void wakeUp(String wakeUpTime) {
		System.out.println("I like to wake up at " + wakeUpTime + ".");
	}

	void sleep() {
		System.out.println("I sleep at 10pm.");
	}

	// THIS IS THE MAIN() METHOD
	public static void main(String[] args) {

		System.out.println("Understanding how NON-STATIC variables & methods works.");

		System.out.println(" ");

		NonStaticVariablesAndMethods obj = new NonStaticVariablesAndMethods();
		System.out.println(obj.name = "Rahi");
		System.out.println(obj.age = 18);
		obj.wakeUp("6am");
		obj.sleep();

		System.out.println(" ");

		NonStaticVariablesAndMethods obj1 = new NonStaticVariablesAndMethods();
		System.out.println(obj1.name = "Ali");
		System.out.println(obj1.age = 27);
		obj.wakeUp("7am");
		obj.sleep();

	}

}
