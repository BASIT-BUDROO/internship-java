package internship_Java;

import java.util.Scanner;

public class ProfitLossModular {
		public float calculateProfit(int dozenCount, int pricePerDozen, int sellPrice) {
			int total_sp = sellPrice*12*dozenCount;
			int total_cp = dozenCount*pricePerDozen;
			float profit = ((float)(total_sp - total_cp)/ (float)total_cp) * (float)100;
			return profit;
		}
		
	public static void main(String[] args) {
		ProfitLoss myObj = new ProfitLoss();
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the number of dozens of toys purchased");
		int dozenCount = scnr.nextInt();
		System.out.println("Enter the price per dozen");
		int pricePerDozen = scnr.nextInt();
		System.out.println("Enter the selling price of 1 toy");
		int sellPrice = scnr.nextInt();
		myObj.profit_cal(dozenCount, pricePerDozen, sellPrice);
	}

}
