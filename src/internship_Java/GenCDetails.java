package internship_Java;

import java.util.Scanner;

class Trainee {
	private static final String COHERT_CODE = "CHNAJ19004";
	private int EmployeeID;
	private String Name;
	
	public Trainee(int id, String name) {
		this.EmployeeID = id;
		this.Name = name;
	}
	public void setDetails(int id, String name) {
		this.EmployeeID = id;
		this.Name = name;
	}
	public int getID() {
		return this.EmployeeID;
	}
	public String getName() {
		return this.Name;
	}
	public void display() {
		System.out.println(this.EmployeeID + " " + this.Name + " " + Trainee.COHERT_CODE);
	}
}

public class GenCDetails {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the number of GenCs");
		int num = scnr.nextInt();
		scnr.nextLine();
		
		Trainee[] myarr = new Trainee[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("Enter EmployeeID");
			int id = scnr.nextInt();
			scnr.nextLine();
			System.out.println("Enter name");
			String name = scnr.nextLine();
			myarr[i] = new Trainee(id, name);
		}
		for(int j = 0; j < myarr.length; j++) {
			myarr[j].display();
		}
	}
}
