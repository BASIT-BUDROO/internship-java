package internship_Java;

import java.util.Scanner;

class Product_ {
	private long id;
	private String productName;
	private String supplierName;
	
	public Product_(long id, String productName, String supplierName) {
		this.setID(id);
		this.setProductName(productName);
		this.setSupplierName(supplierName);
	}
	
	public void setID(long newID) {
		this.id = newID;
	}
	public void setProductName(String newProductName) {
		this.productName = newProductName;
	}
	public void setSupplierName(String newSupplierName) {
		this.supplierName = newSupplierName;
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
	@Override
	public String toString() {
		return this.id+ " : " + this.productName + " : " + this.supplierName;
	}
}

public class DisplayProductDetails_24 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the product id");
		long id = input.nextLong();
		input.nextLine();
		
		System.out.println("Enter the product name");
		String productName = input.nextLine();
		System.out.println("Enter the supplier name");
		String supplierName = input.nextLine();
		Product_ product = new Product_(id, productName, supplierName);
		
		System.out.println(product.toString());
		System.out.println(product.getClass());
	}
}
