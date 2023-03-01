package com.verma.practiceprogram;

import java.util.*;

public class JavaCollectionTest2 {
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Arti");
		al.add("Anvi");
		al.add("Pixy");
		al.add("Shalini");
		al.add("Arti");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
