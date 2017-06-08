package session6;

//adding scanner package from outside
import java.util.Scanner;

public class ArrayTest4 {

	// initializing String array with month names

	String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };

	// initializing integer array with number of days

	int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// declaring no of days method to calculate number of days in given month

	public int noOfDays(String month) {

		// initializing local variable to return no of days value

		int no_of_days = 0;

		// loop to print no of days in given month

		for (int i = 0; i < monthName.length; i++) {

			// decision to check user input and array elements

			if (month.equals(monthName[i])) {

				no_of_days = days[i];
				// assigning days array value in no of days

			}
		}

		return no_of_days;// returns no of days
	}

	// declaring month number method to return month number

	public int monthNumber(String month) {

		// initializing local variable to return month number

		int monthNumber = 0;

		// loop to print month number

		for (int i = 0; i < monthName.length; i++) {

			// decision to check user input and array elements

			if (month.equals(monthName[i])) {

				monthNumber = i;
				// assigning index value in month number

			}
		}

		return monthNumber;// returns month number

	}

	// declaring leap year method passing year argument

	public int leapYear(int year) {

		// checking loop year or not

		if (year % 4 == 0) {

			return 1;// returns 1

		} else {
			return 0;// returns 0
		}
	}

	// declaring no of days per month method to calculate number of days in
	// given month per year

	public int noOfDaysPerMonth(String month, int date, int year) {

		// initializing balance days local variable

		int balanceDays;

		// initializing noOfDaysPerMonth local variable

		int noOfDaysPerMonth;

		// initializing total_no_of_days local integer variable

		int total_no_of_days = 0;

		// loop to print no of days per month

		for (int j = 0; j < monthName.length; j++) {

			// checking month greater than array elements

			if (monthNumber(month) >= j) {

				total_no_of_days += noOfDays(monthName[j]);
				// assigning values in total_no_of_days

			}

		}

		// calculating balance days in given month

		balanceDays = noOfDays(month) - date;

		// calculatingnoOfDaysPerMonth in given date , month ,year

		noOfDaysPerMonth = total_no_of_days - balanceDays + leapYear(year);

		return noOfDaysPerMonth;
		// returns noOfDaysPerMonth
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating object for ArrayTest4 class

		ArrayTest4 array = new ArrayTest4();

		Scanner s = new Scanner(System.in);
		// creating object for Scanner class

		System.out.println("Enter the month");
		// prints Enter the month

		// initialize month variable to get String value from user

		String month = s.nextLine();

		System.out.println("Enter the date");
		// prints Enter the date

		// initialize date variable to get Integer value from user

		int date = s.nextInt();

		System.out.println("Enter the year");
		// prints Enter the year

		// initialize year variable to get Integer value from user

		int year = s.nextInt();

		s.close();// closing Scanner object

		System.out.println(
				"No of days from January to given " + month + " is " + array.noOfDaysPerMonth(month, date, year));
		// prints No of days from January to given month is noOfDaysPerMonth

	}

}
