package basics;

public class IfElse {

/*
* The statements gets executed only when the given condition is TRUE.
* 
* If the condition is FALSE then the statements inside if statement body are completely ignored.
*/

	public static void main(String[] args) {

		int i = 5;

		if (i == 10) {
			System.out.println("Good Morning.");
		} else if (i > 10) {
			System.out.println("Good Afternoon.");
		} else {
			System.out.println("Good Night.");
		}

		System.out.println(" ");

		boolean a = false;

		if (a) {
			System.out.println("Shop is open.");
		} else {
			System.out.println("Shop is closed.");
		}

	}

}
