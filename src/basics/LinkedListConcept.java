package basics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

// To "ADD" the to LinkedList
		ll.add("Rahi");
		ll.add("Dina");
		ll.add("Karina");
		ll.add("Zahid");

// To "PRINT" all the indexes
		System.out.println("Content of the LinkedList: " + ll);

// To "ADD-FIRST" 
		ll.addFirst("Fatema");
		System.out.println("Content of the LinkedList: " + ll);

// To "ADD-LAST" 
		ll.addLast("Zabed");
		System.out.println("Content of the LinkedList: " + ll);

// To "PRINT" a specific index
		System.out.println(ll.get(1));

// To "Set" new data inside LinkedList
		ll.set(0, "Abul");
		System.out.println("Content of the LinkedList: " + ll);

// To "REMOVE" data
		ll.remove("Zabed");
		System.out.println("Content of the LinkedList: " + ll);

		System.out.println(" ");

		// How to print all the values of LinkedList

// 1. for-loop
		System.out.println("Printing all values with for-loop.");
		for (int a = 0; a < ll.size(); a++) {
			System.out.println(ll.get(a));
		}

		System.out.println(" ");

// 2. Advance for-loop
		System.out.println("Printing all values with advance for-loop.");
		for (String s : ll) {
			System.out.println(s);
		}

		System.out.println(" ");

// 3. Iterator
		System.out.println("Printing all values with iterator.");
		Iterator<String> i = ll.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println(" ");

// 4. while-loop
		System.out.println("Printing all values with while-loop.");
		int a = 0;
		while (ll.size() > a) {
			System.out.println(ll.get(a));
			a = a + 1;
		}

		System.out.println(" ");

//To reverse the values in descending order
		Iterator<String> g = ll.descendingIterator();
		System.out.println("Values in descending order:");
		while (g.hasNext()) {
			System.out.println(g.next());
		}

	}

}
