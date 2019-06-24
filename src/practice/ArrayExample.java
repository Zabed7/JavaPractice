package practice;

public class ArrayExample {

	public static void main(String[] args) {

		String a[] = new String[5];

		a[0] = "I";
		a[1] = "will";
		a[2] = "be";
		a[3] = "a";
		a[4] = "programmer";

		System.out.println(a.length); // Displays the total size of the array

		System.out.println(a[4]); // Displays the specific array index value

		System.out.println(a[4].length()); // Displays the number of character for the value of the index

		for (String b : a) {
			System.out.print(b + " "); // Displays all the values inside the array
		}

		System.out.println(" ");
//*****************************************************************************************************
		System.out.println(" ");

		String c[] = { "I", "will", "learn", "Java" };

		System.out.println(c.length); // Displays the total size of the array

		System.out.println(c[3]); // Displays the specific array index value

		System.out.println(c[2].length());// Displays the number of character for the value of the index

		for (String d : c) {
			System.out.print(d);
			System.out.println(" = " + d.length() + " character");
		}

		System.out.println(" ");
//*****************************************************************************************************
		System.out.println(" ");

		int e[] = new int[7];
		for (int f = 0; f < e.length; f++) {
			e[f] = f + 1;
			e[2] = 5;
			System.out.println(e[f]);
		}

	}

}
