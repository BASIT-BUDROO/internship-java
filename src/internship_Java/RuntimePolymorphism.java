package internship_Java;
import java.util.Scanner;

class Shape_R {
	protected String shapeName;
	
	public Shape_R(String shapeName) {
		this.shapeName = shapeName;
	}
	public String getName() {
		return this.shapeName;
	}
	public void setName(String newShapeName) {
		this.shapeName = newShapeName;
	}
	double calculateArea() {
		return 0;
	}	
}

class Square_R extends Shape_R {
	private int side;
	public Square_R(int side) {
		super("Square");
		this.side = side;
	}
	public int getSide() {
		return this.side;
	}
	public void setSide(int newSide) {
		this.side = newSide;
	}
	double calculateArea() {
		return (this.side*this.side);
	}
}

class Rectangle_R extends Shape_R {
	private int length;
	private int breadth;
	
	public Rectangle_R(int length, int breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}
	public int getLength() {
		return this.length;
	}
	public void setLength(int newLength) {
		this.length = newLength;
	}
	public int getBreadth() {
		return this.breadth;
	}
	public void setBreadth(int newBreadth) {
		this.breadth = newBreadth;
	}
	double calculateArea() {
		return this.length*this.breadth;
	}
}

class Circle_R extends Shape_R {
	private int radius;
	
	public Circle_R(int radius) {
		super("Circle");
		this.radius = radius;
	}
	public int getRadius() {
		return this.radius;
	}
	public void setRadius(int newRadius) {
		this.radius = newRadius;
	}
	double calculateArea() {
		return 3.14*2*this.radius;
	}
}

class Hexagon extends Shape_R {
	private int side;
	
	public Hexagon(int side) {
		super("Hexagon");
		this.side = side;
	}
	public int getSide() {
		return this.side;
	}
	public void setSize(int newSide) {
		this.side = newSide;
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter your choice:");
		System.out.println("1. Rectangle\n2. Square\n3. Circle\n4. Hexagon");
		System.out.println("Area Calculator --- Choose your shape");
		char choice = scnr.next().charAt(0);
		switch(choice) {
		case '1':
			System.out.println("Enter Length and Breadth");
			int length = scnr.nextInt();
			int breadth = scnr.nextInt();
			Rectangle_R rect = new Rectangle_R(length, breadth);
			System.out.println("Area of " + rect.shapeName + " is: " + rect.calculateArea());
			break;
		case '2':
			System.out.println("Enter length of side");
			int side = scnr.nextInt();
			Square_R sq = new Square_R(side);
			System.out.println("Area of " + sq.shapeName + " is: " + sq.calculateArea());
			break;
		case '3':
			System.out.println("Enter radius of circle");
			int radius = scnr.nextInt();
			Circle_R circle = new Circle_R(radius);
			System.out.println("Area of " + circle.shapeName + " is: " + circle.calculateArea());
			break;
		case '4':
			System.out.println("Enter side of Hexagon");
			int hex_side = scnr.nextInt();
			Hexagon hex = new Hexagon(hex_side);
			System.out.println("Area of " + hex.shapeName + " is: " + hex.calculateArea());
			break;	
		}
	}
}