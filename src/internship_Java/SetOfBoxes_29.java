package internship_Java;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Box{
	double length, width, height, volume;
	
	public Box(double length, double width, double height){
		this.setLength(length);
		this.setWidth(width);
		this.setHeight(height);
		this.setVolume();
	}
	
	public void setLength(double newLength) {
		this.length = newLength;
	}
	public void setWidth(double newWidth) {
		this.width = newWidth;
	}
	public void setHeight(double newHeight) {
		this.height = newHeight;
	}
	public void setVolume() {
		this.volume = this.length*this.width*this.height;
	}
	
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	public double getHeight() {
		return this.height;
	}
	public double getVolume() {
		return this.length*this.width*this.height;
	}
	
	@Override
	public boolean equals(Object o) {
		double this_vol = this.length * this.width * this.height;
		Box newBox = (Box) o;
		double other_vol = newBox.length * newBox.width * newBox.height;
		if(this_vol == other_vol) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Length = " + this.length + " Width = " + this.width + " Height = " + this.height + " Volume = " + this.volume;
	}
}

public class SetOfBoxes_29 {

	public static void main(String[] args) {
		Set<Box> hash_box = new HashSet<Box>();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of Boxes: ");
		int total = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < total; i++) {
			System.out.println("Enter the Box " + (i+1) + " details: ");
			System.out.println("Enter Length: ");
			double length = input.nextDouble();
			input.nextLine();
			System.out.println("Enter Width: ");
			double width = input.nextDouble();
			input.nextLine();
			System.out.println("Enter Height: ");
			double height = input.nextDouble();
			input.nextLine();
			if(i == 0) {
				Box box = new Box(length, width, height);
				hash_box.add(box);
			}
			Box box = new Box(length, width, height);
			int flag = 0;
			for(Box myBox : hash_box) {
				if(box.volume == myBox.volume) {
					flag = 1;
				}
			}
			if(flag == 0) {
				hash_box.add(box);
			}
		}
		for(Box mybox : hash_box) {
			System.out.println(mybox.toString());
		}
	}
}
