package internship_Java;
import java.util.Scanner;
public class Compare {
	void compare_num(int x, int y) {
		if(x < y) {
			System.out.println(x + " is less than " + y);
		} 
		if(x > y) {
			System.out.println(x + " is greater than " + y);
		} else {
			System.out.println(x + " is equal to " + y);
		}
	}
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		int firstNum = myScanner.nextInt();
		System.out.println("Enter Second Number");
		int secondNum = myScanner.nextInt();
		Compare myObject = new Compare();
		myObject.compare_num(firstNum, secondNum);
		
	}
}
