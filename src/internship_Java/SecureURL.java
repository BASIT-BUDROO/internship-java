package internship_Java;

import java.util.Scanner;

public class SecureURL {
	void check(String str) {
		char ch = str.charAt(4);
		if(ch == ':') {
			System.out.println(str +" does not start with https");
		}
		else {
			System.out.println(str +" starts with https");
		}
	}
	
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String url = myScanner.nextLine();
		SecureURL myURL = new SecureURL();
		myURL.check(url);
	}
}
