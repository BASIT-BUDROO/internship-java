package internship_Java;
import java.util.Scanner;
public class Replace_String {
	void replace_content(String content, String old_name, String new_name) {
		System.out.println("Old content of the document is: " + content);
		String new_contentString = content.replace(old_name, new_name);
		System.out.println("New content is: " + new_contentString);
	}

	public static void main(String[] args) {
		Replace_String myObj = new Replace_String();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter content of the document");
		String content = scanner.nextLine();
		System.out.println("Enter old name of the company");
		String old_name = scanner.nextLine();
		System.out.println("Enter new name of the comapany");
		String new_name = scanner.nextLine();
		myObj.replace_content(content, old_name, new_name);
	}
}
