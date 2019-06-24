package basics;

public class Constructor {

	String name;
	int age;

// 1. DEFAULT Constructor ---> has no parameters
	Constructor() {
		System.out.println("This is default constructor.");
		System.out.println("Constructor is used to initialize class variables.");
		System.out.println("The (this.) keyword is used to initialize class variables with local variables.");
	}

// 2. Constructor with 1 parameter
	Constructor(String name) {
		this.name = name;
		System.out.println("My name is " + name + ".");

	}

// 3. Constructor with 2 parameter
	Constructor(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {

// 1. Results
		new Constructor();

		System.out.println(" ");

//2. Results
		Constructor obj1 = new Constructor("Rahi");
		System.out.println("My name is " + obj1.name + ".");

		System.out.println(" ");

//3. Results
		Constructor obj2 = new Constructor("Ali", 27);
		System.out.println("My name is " + obj2.name);
		System.out.println("My age is " + obj2.age);

	}

}
