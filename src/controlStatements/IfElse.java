package controlStatements;

public class IfElse {

	public static void main(String[] args) {

		// Ex: if statement

		int code = 7;
		if (code < 10) {
			System.out.println("I love my wife."); // It executes the if block if condition is true.
		}

		// Ex: if-else statement
		// It executes the if block if condition is true otherwise else block is
		// executed.

		if (1 == 1) {
			System.out.println("Coding is fun.");
		} else {
			System.out.println("Coding is hard.");
		}

		// Ex: if-else-if ladder
		// The if-else-if ladder statement executes one condition from multiple
		// statements.
		int marks = 65;
		if (marks < 50) {
			System.out.println("fail");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("D grade");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("C grade");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("B grade");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("A grade");
		} else if (marks >= 90 && marks < 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("Invalid!");
		}
		// Ex: nested if statement
		// The inner if block condition executes only when outer if block condition is
		// true.
		int age = 20;
		int weight = 80;
		// applying condition on age and weight
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			}
		}

		int myAge = 25;
		int myWeight = 48;
		// applying condition on myAge and myWeight
		if (myAge >= 18) {
			if (myWeight > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}
		} else {
			System.out.println("Age must be greater than 18");
		}
	}

}
