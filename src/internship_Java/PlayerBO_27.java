package internship_Java;
import java.util.Scanner;

class Player27 {
	private String name, country, skill;
	public void setName(String newName) {
		this.name = newName;
	}
	public void setCountry(String newCountry) {
		this.country = newCountry;
	}
	public void setSkill(String newSkill) {
		this.skill = newSkill;
	}
	public Player27(String name, String country, String skill) {
		this.setName(name);
		this.setCountry(country);
		this.setSkill(skill);
	}
	public String getName() {
		return this.name;
	}
	public String getCountry() {
		return this.country;
	}
	public String getSkill() {
		return this.skill;
	}
	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s", this.getName(), this.getCountry(), this.getSkill());
	}
}
public class PlayerBO_27 {
	void displayAllPalyerDetails(Player27[] playerArr) {
		for(Player27 a:playerArr) {
			System.out.println(a.toString());
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the number of players");
		int total = scnr.nextInt();
		scnr.nextLine();
		Player27[] myArr = new Player27[total]; 
		for(int i = 0; i < total; i++) {
			System.out.println("Enter the player name");
			String str1 = scnr.nextLine();
			System.out.println("Enter the country name");
			String str2 = scnr.nextLine();
			System.out.println("Enter the skill");
			String str3 = scnr.nextLine();
			Player27 P = new Player27(str1, str2, str3);
			myArr[i] = P;
		}
		PlayerBO_27 pbo = new PlayerBO_27();
		pbo.displayAllPalyerDetails(myArr);
	}
}
