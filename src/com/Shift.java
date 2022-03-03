package com;

public class Shift {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < 1; i++) {

			int last = a[a.length - 1];

			for (int j = a.length - 1; j > 0; j--) {

				a[j] = a[j - 1];
			}
			// Last element of array will be added to the start of array.
			a[0] = last;
		}

		 

		System.out.println("Array after right rotation: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
