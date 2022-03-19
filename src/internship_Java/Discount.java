package internship_Java;

public class Discount {
	void discount_cal(float item1, float item2, int discount){
		float total = item1 + item2;
		System.out.printf("Total amount = $%.2f\n", total);
		float discounted_amount = total*((float)discount/(float)100);
		System.out.printf("Discounted amount = $%.2f\n", discounted_amount);
		float saved_amount = total - discounted_amount;
		System.out.printf("Saved amount = $%.2f", saved_amount);
	}
	public static void main(String[] args) {
		Discount myDiscount = new Discount();
		myDiscount.discount_cal(20.50f, 45.40f, 10);
	}
}
