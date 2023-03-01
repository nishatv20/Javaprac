package com.verma.practiceprogram;

import java.util.*;

class Book1 {
	int id;
	String name, author, publisher;
	int quality;

	public Book1(int id, String name, String author, String publisher, int quality) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quality = quality;
	}
}

public class LinkedListExample {
	public static void main(String[] args) {
		List<Book1> list = new LinkedList<Book1>();
		Book1 b1 = new Book1(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book1 b2 = new Book1(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book1 b3 = new Book1(103, "Operating System", "Galvin", "Wiley", 6);
		list.add(b1);
		list.add(b2);
		list.add(b3);

		for (Book1 b : list) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quality);
		}
	}
}

