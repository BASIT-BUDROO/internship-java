package internship_Java;

import java.util.Scanner;

public class Day_Week {
	String return_day(int day_num) {
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		if (day_num <= 7) {
			return days[day_num - 1];
		}
		else {
			return "Enter a Valid number!!";
		}
	}

	public static void main(String[] args) {
		Day_Week myObj = new Day_Week();
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the day number");
		int day = scnr.nextInt();
		System.out.println("Day of the week is " + myObj.return_day(day));
	}
}
