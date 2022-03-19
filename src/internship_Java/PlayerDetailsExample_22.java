package internship_Java;

import java.util.Scanner;

interface IPlayerStatistics {
	public void displayPlayerStatistics();
}
abstract class Player {
	protected String name, teamName;
	protected int noOfMatches;
	
	public Player(String name, String teamName, int noOfMatches) {
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
	}
}
class CricketPlayer extends Player implements IPlayerStatistics {
	private int totalRunsScored, noOfWicketsTaken;
	
	public CricketPlayer(String name, String teamName, int noOfMatches, int totalRunsScored, int noOfWicketsTaken) {
		super(name, teamName, noOfMatches);
		this.totalRunsScored = totalRunsScored;
		this.noOfWicketsTaken = noOfWicketsTaken;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player Details");
		System.out.println("Player Name:" + this.name);
		System.out.println("Team Name:" + this.teamName);
		System.out.println("Number of matches:" + this.noOfMatches);
		System.out.println("Total Runs Scored:" + this.totalRunsScored);
		System.out.println("Number of wickets taken:" + this.noOfWicketsTaken);
	}
}
class HockeyPlayer extends Player implements IPlayerStatistics {
	private String position;
	private int noOfGoals;
	public HockeyPlayer(String name, String teamName, int noOfMatches, String position, int noOfGoals) {
		super(name, teamName, noOfMatches);
		this.position = position;
		this.noOfGoals = noOfGoals;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player Details");
		System.out.println("Player Name:" + this.name);
		System.out.println("Team Name:" + this.teamName);
		System.out.println("Number of matches:" + this.noOfMatches);
		System.out.println("Position: " + this.position);
		System.out.println("Number of goals taken:" + this.noOfGoals);
	}
}
public class PlayerDetailsExample_22 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		System.out.println("Menu\n	1.Cricket Player Details\n	2.Hockey Player Details\nEnter choice");
		
		char ch = scnr.nextLine().charAt(0);
		
		switch(ch) {
			case '1':
				System.out.println("Enter player name");
				String name = scnr.nextLine();
				System.out.println("Enter team name");
				String teamName = scnr.nextLine();
				System.out.println("Enter number of matches played");
				int noOfMatches = scnr.nextInt();
				scnr.nextLine();
				System.out.println("Enter total runs scored");
				int totalRunsScored = scnr.nextInt();
				scnr.nextLine();
				System.out.println("Enter total number of wickets taken");
				int noOfWicketsTaken = scnr.nextInt();
				scnr.nextLine();
				CricketPlayer cp = new CricketPlayer(name, teamName, noOfMatches, totalRunsScored, noOfWicketsTaken);
				cp.displayPlayerStatistics();
				break;
			case '2':
				System.out.println("Enter player name");
				String name_h = scnr.nextLine();
				System.out.println("Enter team name");
				String teamName_h = scnr.nextLine();
				System.out.println("Enter number of matches played");
				int noOfMatches_h = scnr.nextInt();
				scnr.nextLine();
				System.out.println("Enter the position");
				String position = scnr.nextLine();
				System.out.println("Enter total number of goals taken");
				int noOfGoals = scnr.nextInt();
				scnr.nextLine();
				HockeyPlayer hp = new HockeyPlayer(name_h, teamName_h, noOfMatches_h, position, noOfGoals);
				hp.displayPlayerStatistics();
				break;
		}
	}
}
