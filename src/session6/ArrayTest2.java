package session6;

//adding scanner package from outside
import java.util.Scanner;

public class ArrayTest2 {

	// declaring boolean method to check prime or not

	public static boolean isPrime(int n) {

		// initialize local variable

		int i;

		// loop to check prime number

		for (i = 2; i <= n / 2; i++) {

			if (n % i == 0) {
				return false;// returning false
			}
		}
		return true;// returning true

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initializing integer array with size 10

		int[] array = new int[10];

		// initializing integer array with size 10 to store reverse values

		int[] array1 = new int[10];

		// creating object for scanner class

		Scanner s = new Scanner(System.in);

		System.out.println("Enter ten prime numbers");
		// prints Enter ten prime numbers

		// looping to fill array elements

		for (int i = 0; i < array.length; i++) {

			// initialize number variable to store integer value

			int number = s.nextInt();

			// checking whether number is prime or not

			if (isPrime(number) == true) {

				array[i] = number;// filling numbers in array

			} else {
				System.out.println("Entered number is not prime ");
				// prints Entered number is not prime

				i--;// decrementing local variable
			}

		}

		s.close();// closing scanner

		System.out.println("Array in normal order");
		// prints Array in normal order

		// loop to print array elements

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);// prints element according to indices

		}

		System.out.println("Array in reverse order");
		// prints Array in reverse order

		// assigning integer value

		int j = 0;

		// loop to copy array elements in array1 by reverse

		for (int i = array.length - 1; i >= 0; i--) {

			array1[j] = array[i];// assigning values to array1

			j++;// incrementing value

		}

		// loop to print reverse array elements
		for (int i = 0; i < array.length; i++) {

			System.out.println(array1[i]);

		}

	}

}
