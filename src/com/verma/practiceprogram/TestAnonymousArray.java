package com.verma.practiceprogram;

public class TestAnonymousArray {
static void printArray(int arr[] ) {
	for(int i = 0; i<arr.length; i++)
		System.out.println(arr[i]);
}
public static void main(String[] args) {
	printArray(new int[] {12,11,14,15,17});
}
}
