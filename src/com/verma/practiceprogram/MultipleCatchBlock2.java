package com.verma.practiceprogram;

public class MultipleCatchBlock2 {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			System.out.println(a[10]);
		}

		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occured !");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception Occured");
		}

		catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}

		System.out.println("Rest of the code");
	}
}
