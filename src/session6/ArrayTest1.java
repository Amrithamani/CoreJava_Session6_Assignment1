package session6;

//adding scanner package from outside

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initializing integer array with size 10

		int[] array = new int[10];

		// creating object for scanner class

		Scanner s = new Scanner(System.in);

		System.out.println("Enter ten numbers");
		// prints Enter ten numbers

		// looping to fill array elements

		for (int i = 0; i < array.length; i++) {

			array[i] = s.nextInt();
			// scanner object to call user input

		}

		s.close();
		// closing scanner object

		System.out.println("Even numbers of an array are:");
		// prints Even numbers of an array are:

		// looping to check even numbers in an array

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {

				System.out.println(array[i]);
				// prints even numbers in an array elements

			}
		}

	}

}
