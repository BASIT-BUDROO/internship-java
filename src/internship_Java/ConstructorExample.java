package internship_Java;

import java.util.Scanner;

class Product_Details {
	private long id;
	private String productName;
	private String supplierName;
	
	public Product_Details() {
		this.id = 0;
		this.productName = "DefaultName";
		this.supplierName = "DefaultSupplier";
	}
	
	public Product_Details(long id, String pName, String sName) {
		this.id = id;
		this.productName = pName;
		this.supplierName = sName;
	}
	
	public void setProductDetails(long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	
	public long getID() {
		return this.id;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public String getSupplierName() {
		return this.supplierName;
	}
	
	public void display() {
		System.out.println("Product ID is: " + this.getID());
		System.out.println("Product name is: " + this.getProductName());
		System.out.println("Supplier name is: " + this.getSupplierName());
		System.out.print("\n");
	}
}

public class ConstructorExample {

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
		
		Product_Details PD1 = new Product_Details();
		PD1.display();
		
		Product_Details PD2 = new Product_Details(id, productName, supplierName);
		PD2.display();
	}
}
