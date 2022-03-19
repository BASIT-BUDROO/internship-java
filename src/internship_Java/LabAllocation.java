package internship_Java;

public class LabAllocation {
	void capacity(int x, int y, int z) {
		if(x < y && x < z) {
			System.out.println("L1 has the minimal seating capacity.");
		}
		if(y < x && y < z) {
			System.out.println("L2 has the minimal seating capacity.");
		} else {
			System.out.println("L3 has the minimal seating capacity.");
		}
	}
	
	public static void main(String args[]) {
		LabAllocation myObj = new LabAllocation();
		myObj.capacity(30, 40, 20);
	}
}
