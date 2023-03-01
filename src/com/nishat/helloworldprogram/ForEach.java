package com.nishat.helloworldprogram;

public class ForEach {
public static void main(String[] args) {
	int num [] = {10,11,12,13,14,15,16,17};
	int sum = 0;
	for(int x : num) {
		sum += x;
	}
	System.out.println("The sum of ARRAY is : " + sum);
}
}
