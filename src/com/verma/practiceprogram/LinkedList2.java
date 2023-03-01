package com.verma.practiceprogram;

import java.util.*;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		System.out.println("initial list of elements" + li);
		li.add("Ravi");
		li.add("Vijay");
		li.add("Ajay");

		System.out.println("After invoking add method " + li);
		li.add(1, "Gaurav");
		System.out.println("After invoking ass(int index, E element) method:" + li);
		LinkedList<String> li2 = new LinkedList<String>();
		li2.add("Sonoo");
		li2.add("Hanumat");

		li.addAll(li2);
		System.out.println("After invoking addAll() method" + li);

		LinkedList<String> li3 = new LinkedList<String>();
		li3.add("John");
		li3.add("Rahul");
		li.addAll(li3);
		System.out.println("After invoking addAll() method :" + li);
		li.addFirst("Lokesh");
		System.out.println("After invoking addFirst() method : " + li);
		li.addLast("Harsh");
		System.out.println("After invoking addLast() method: " + li);
	}
}
