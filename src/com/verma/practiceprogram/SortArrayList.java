package com.verma.practiceprogram;

import java.util.*;

public class SortArrayList {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");

		Collections.sort(list1);
		for (String fruit : list1)
			System.out.println(fruit);

		System.out.println("Sorting numbers...");
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(21);
		list2.add(22);
		list2.add(12);
		list2.add(41);

		Collections.sort(list2);
		for (Integer num : list2)
			System.out.println(num);
	}
}
