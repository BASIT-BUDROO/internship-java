package internship_Java;

import java.util.Scanner;

class ProductDetails {
	private long id;
	private String productName;
	private String supplierName;
	
	public void setProductDetails(long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	
	public long getID() {
		System.out.print("Product ID is: ");
		return this.id;
	}
	
	public String getProductName() {
		return "Product Name is "+ this.productName;
	}
	
	public String getSupplierName() {
		return "Supplier Name is " + this.supplierName;
	}
}

public class ProductDetailsExample {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the product id");
		long id = scnr.nextLong();
		scnr.nextLine();
		
		System.out.println("Enter the product name");
		String productName = scnr.nextLine();
		
		System.out.println("Enter the supplier name");
		String supplierName = scnr.nextLine();
		
		ProductDetails PD = new ProductDetails();
		PD.setProductDetails(id, productName, supplierName);
		System.out.println(PD.getID());
		System.out.println(PD.getProductName());
		System.out.println(PD.getSupplierName());
	}
}
