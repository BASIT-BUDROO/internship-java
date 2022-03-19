package internship_Java;

public class Products {
	String name;
	float buying_price;
	float selling_price;
	
	void get_price() {
		System.out.println("Buying Price is " + this.buying_price);
		System.out.println("Selling price is " + this.selling_price);
	}
	
	public static void main(String args[]) {
		Products phone = new Products();
		phone.name = "iPhone";
		phone.buying_price = 20.54f;
		phone.selling_price = 30.50f;
		phone.get_price();
	}
}
