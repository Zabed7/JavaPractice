package basics;

import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {

// To ADD numbers:
//        int num1, num2, sum;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter First Number: ");
//        num1 = sc.nextInt();
//        
//        System.out.println("Enter Second Number: ");
//        num2 = sc.nextInt();
//        
//        sc.close();
//        sum = num1 + num2;
//        System.out.println("Sum of these numbers: "+sum);

		// *******************************************************************************************

// To MULTIPLY numbers:
		int a, b, total;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		a = s.nextInt();

		System.out.println("Enter Second Number: ");
		b = s.nextInt();

		s.close();
		total = a * b;
		System.out.println(a + " X " + b + ": " + total);
	}

}
