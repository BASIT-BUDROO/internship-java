package internship_Java;
import java.util.Scanner;

class Product {
	private long id;
	private String productName;
	private String supplierName;
	
	public Product(long id, String productName, String supplierName) {
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
	
	public boolean equals(Product other) {
		if(this.id == other.id && this.productName.equals(other.productName) && this.supplierName.equals(other.supplierName)) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class CompareProductDetails_23 {
	void display(Product product) {
		System.out.println("Product ID is: " + product.getID());
		System.out.println("Product Name is: " + product.getProductName());
		System.out.println("Supplier Name is: " + product.getSupplierName());
	}

	public static void main(String[] args) {
		CompareProductDetails_23 cpd = new CompareProductDetails_23();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter product id: ");
		long id = input.nextLong();
		input.nextLine();
		
		System.out.println("Enter the product name: ");
		String productName = input.nextLine();
		
		System.out.println("Enter the supplier name: ");
		String supplierName = input.nextLine();
		
		Product product = new Product(id, productName, supplierName);
		cpd.display(product);
		
		System.out.println("Enter product id: ");
		long id_ = input.nextLong();
		input.nextLine();
		
		System.out.println("Enter the product name: ");
		String productName_ = input.nextLine();
		
		System.out.println("Enter the supplier name: ");
		String supplierName_ = input.nextLine();
		
		Product product_ = new Product(id_, productName_, supplierName_);
		cpd.display(product_);
		
		if(product.equals(product_)) {
			System.out.println("The two products are same");
		}
		else {
			System.out.println("The two products are different");
		}
	}
}
