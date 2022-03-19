package internship_Java;

public class ProfitLoss {
	void profit_cal(int x, int y, int z) {
		int total_sp = z*12*x;
		int total_cp = x*y;
		float profit = ((float)(total_sp - total_cp)/ (float)total_cp) * (float)100;
		System.out.println("Sam's profit percentage is " + profit);
	}
	
	public static void main(String args[]) {
		 ProfitLoss myObj = new ProfitLoss();
		 myObj.profit_cal(20, 375, 33);
	}
}
