package com.verma.practiceprogram;

import java.util.*;

public class TestJavaCollection {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Nishat");
		list.add("Rahul");
		list.add("Gaurav");
		list.add("Happy");
		list.add("Nishat");

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
