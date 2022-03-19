package internship_Java;

import java.util.Arrays;
import java.util.Scanner;


public class SortArray_26 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of matches played by the player");
		int total = input.nextInt();
		input.nextLine();
		int[] myArr = new int[total];
		
		for(int i = 0; i < total; i++) {
			System.out.println("Enter runs scored in match " + Integer.sum(i, 1));
			myArr[i] = input.nextInt();
			input.nextLine();
		}
		Arrays.sort(myArr);
		for(int i = 0; i < total; i++) {
			System.out.println(myArr[i]);
		}
	}
}
