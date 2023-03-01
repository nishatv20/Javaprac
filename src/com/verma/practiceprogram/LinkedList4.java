package com.verma.practiceprogram;

import java.util.*;

public class LinkedList4 {
	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		li.add("Nishat");
		li.add("Vijay");
		li.add("Ajay");

		Iterator i = li.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
