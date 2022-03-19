package internship_Java;

import java.util.Scanner;

public class DivideNumbers_33 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = scnr.nextInt();
		scnr.nextLine();
		int b = scnr.nextInt();
		scnr.nextLine();
		
		try {
			int quotient = a/b;
			System.out.println("The quotient of " + a + "/" + b + " = " + quotient);
		}
		catch(ArithmeticException e){
			System.out.println("Divide By Zero Exception caught:   ..  " + e.getMessage());
		}
		finally {
			System.out.println("Inside finally block");
		}
	}

}
