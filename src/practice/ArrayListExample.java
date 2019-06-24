package practice;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String args[]) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("Abul");
		a.add("Fatema");
		a.add("Dina");
		a.add("Karina");
		a.add("Rahi");
		a.add("Zahid");

//displaying elements
		System.out.println(a);

//Adding "Zabed" at the fourth position
		a.add(3, "Zabed");
		System.out.println(a);

//Removing element
		a.remove(3);
		System.out.println(a);

//Displaying size of array
		System.out.println(a.size());

	}

}
