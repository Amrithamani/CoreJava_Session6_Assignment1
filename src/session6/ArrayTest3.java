package session6;

//adding scanner package from outside
import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initializing String array with month names

		String[] array = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		// initializing integer array with number of days

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner s = new Scanner(System.in);
		// creating object for scanner class

		System.out.println("Enter the month");
		// prints Enter the month

		// initialize month variable to get String value from user

		String month = s.nextLine();

		s.close();
		// closing Scanner

		// loop to print no of days in given month

		for (int i = 0; i < array.length; i++) {

			// decision to check user input and array elements

			if (month.equals(array[i])) {

				System.out.println("No of days in " + array[i] + " is " + days[i]);
				// prints No of days in month is no of days

			}
		}

	}

}
