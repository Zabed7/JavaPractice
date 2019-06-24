package basics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept1 {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(1);
		ll.add(17);
		ll.add(11);
		ll.add(21);
		ll.add(69);

		System.out.println(ll.get(1));

		System.out.println("These are the number of LinkedList: " + ll);

// To add any "int" (index,value) 
		ll.add(2, 777);
		System.out.println("These are the number of LinkedList: " + ll);

		ll.add(2, 707);
		System.out.println("These are the number of LinkedList: " + ll);

		ll.addFirst(77);
		System.out.println("These are the number of LinkedList: " + ll);

		ll.addLast(100);
		System.out.println("These are the number of LinkedList: " + ll);

// To get the total number of values of the LinkedList
		int i = ll.size();
		System.out.println(i);

		System.out.println("         ");

// To print all the values using for-loop
		for (int a = 0; a < ll.size(); a++) {
			System.out.println(ll.get(a));
		}

		System.out.println(" ");

//To print all the values using advance for-loop
		for (int b : ll) {
			System.out.println(b);
		}

		System.out.println(" ");

// To reverse the values in descending order
		Iterator<Integer> c = ll.descendingIterator();
		while (c.hasNext()) {
			System.out.println(c.next());
		}

	}

}
