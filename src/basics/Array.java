package basics;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int[] a = new int[5];
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 8;
		a[4] = 10;

		System.out.println(a[2]); // display only a single value in the array
		System.out.println(a.length); // .length --> displays the size of the Array

		for (int b = 0; b < 5; b++) { // must create a "for-loop" to display all the values inside the array
			System.out.print(a[b] + ",");
		}

		System.out.println("********************* ");

		int i[] = { 5, 10, 15, 20, 25 };
		for (int t : i) {
			System.out.print(t + ", ");
		}

//************************************************************************************************************

		System.out.println(" ");
		System.out.println(" ");

		String s[] = new String[3];
		s[0] = "I";
		s[1] = "Love";
		s[2] = "Rahi!";

		System.out.println(s[1]);

		for (int h = 0; h < s.length; h++) {
			System.out.print(s[h] + " ");
		}

		System.out.println(" ");
		System.out.println(" ");

		String arr[] = { "hi", "hello", "bye" };

		for (String str : arr) {
			System.out.println(str);
		}
		System.out.println(arr.length);

//**********************************************************************************************************

		System.out.println(" ");

//Sorting

		int x[] = { 2, 6, 1, 9, 5, 7 };

		Arrays.sort(x);
		for (int y : x) {
			System.out.println(y);
		}

	}

}
