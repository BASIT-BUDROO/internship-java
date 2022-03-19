package internship_Java;
import java.util.HashMap;
import java.util.Scanner;
public class MaxScorer_28 {
	public static void main(String[] args) {
		HashMap<String, Long> playerDetails = new HashMap<String, Long>();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String name = "";
		long score = 0;
		
		System.out.println("Enter the number of players:");
		int total = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < total; i++) {
			System.out.println("Enter the details of the player " + (i+1) + ":");
			name = input.nextLine();
			score = input.nextLong();
			input.nextLine();
			playerDetails.put(name, score);
		}
		long temp = 0;
		String maxScorer = "";
		for(HashMap.Entry<String, Long> entry : playerDetails.entrySet()) {
			if(entry.getValue() > temp) {
				temp = entry.getValue();
				maxScorer = entry.getKey();
			}
		}
		System.out.println(maxScorer);
	}
}
