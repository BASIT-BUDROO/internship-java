package internship_Java;
import java.lang.Integer;

import java.util.Scanner;

public class SumAverage_25 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of matches played by the team");
		int total = input.nextInt();
		input.nextLine();
		int[] myArr = new int[total];
		
		for(int i = 0; i < total; i++) {
			System.out.println("Enter points scored in match " + Integer.sum(i, 1));
			myArr[i] = input.nextInt();
			input.nextLine();
		}
		int sum = 0;
		for(int i : myArr) {
			sum += i;
		}
		System.out.println(sum);
		int sum_ = 0;
		for(int j = 0; j < myArr.length; j++) {
			sum_ += myArr[j];
		}
		
		float average = (float)sum_/(float)total;
		System.out.println(average);
	}
}
