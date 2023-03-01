package com.verma.practiceprogram;

import java.util.*;

public class ArrayListExample4 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");

		System.out.println("Returning Element :" + al.get(1));
		al.set(2, "Pear");

		for (String fruit : al)
			System.out.println(fruit);
	}
}
