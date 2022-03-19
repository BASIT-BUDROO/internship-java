package internship_Java;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


class UserMainCode{
	static void displayDate(String dateString) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
		Date myDate = formatter.parse(dateString);
		
		SimpleDateFormat formatter_new = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		String formattedDate = formatter_new.format(myDate);
		System.out.println(formattedDate);
	}
}

public class Main_DisplayDate {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter date: ");
		String dateString = input.nextLine();
		try {
			UserMainCode.displayDate(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
