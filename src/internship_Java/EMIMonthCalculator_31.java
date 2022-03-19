package internship_Java;
import java.util.Calendar;
import java.util.Scanner;

class UserMainCode_31{
	public static String getDate(Calendar cal, String givenDate){
        return "20 months before " + givenDate + " will be " + cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH)) + "-" + cal.get(Calendar.DATE);
    }
	public static void displayDate(String givenDate) {
		Calendar cal = Calendar.getInstance();
		String [] strArray = givenDate.split("-");
		int year = Integer.parseInt(strArray[0]);
		int month = Integer.parseInt(strArray[1]);
		int date = Integer.parseInt(strArray[2]);
		cal.set(year, month, date);	
		cal.add(Calendar.MONTH, -3);
		System.out.println(getDate(cal, givenDate));
 	}
}

public class EMIMonthCalculator_31 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter date in format yyyy-MM-dd: ");
		String dateString = scnr.nextLine();
		UserMainCode_31.displayDate(dateString);
	}
}
