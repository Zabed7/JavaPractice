package controlStatements;

public class DoWhileLoop {

	// Do-while loop is used to iterate a part of the program several times. If the
	// number of iteration is not fixed and you must have to execute the loop at
	// least once, it is recommended to use do-while loop.

	// Do-while loop is executed at least once because condition is checked after
	// loop body.

	public static void main(String[] args) {

		int a = 0;
		do {
			System.out.println("I want Rahi.");
			a++;
		} while (a <= 5);

	}

}
