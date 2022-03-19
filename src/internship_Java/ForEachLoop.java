package internship_Java;

import java.util.Scanner;

public class ForEachLoop {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of tents");
		int total_refugees = 0;
		int total_tents = scanner.nextInt();
		int[] refugee_array = new int[total_tents];
		for (int i = 0; i < refugee_array.length; i++) {
			System.out.println("Enter number of refugees in tent " + Integer.sum(i, 1));
			int num = scanner.nextInt();
			refugee_array[i] = num;
		}
		for(int i: refugee_array) {
			total_refugees += i;
		}
		System.out.println("\n" + "Total number of refugees in the camp = " + total_refugees);

	}

}
