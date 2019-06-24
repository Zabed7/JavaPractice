package basics;

public class ForLoops {

// Loops are used to execute a set of statements repeatedly until a particular condition is satisfied.

// In Java we have three types of basic loops: for, while and do-while.

	public static void main(String[] args) {

		/*
		 * 1. for - loop syntax:
		 * 
		 * for(initialization; condition ; increment/decrement) { statement(s); }
		 */

		for (int a = 1; a <= 3; a++) {
			System.out.println("I love my wife.");
		}

		System.out.println(" ");

		for (int b = 3; b >= 1; b--) {
			System.out.println("Count down from: " + b);
		}
	}

}
