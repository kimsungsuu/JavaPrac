package ocp;

import java.util.ArrayList;

public class Calculate {
	private final ArrayList<Shape> shapes;
	
	public Calculate(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}
	
	public double sum() {
		int sum = 0;
		
		for(Shape shape : shapes) {
			sum += shape.area();
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Shape> shapes = new ArrayList<>();
		Circle circle = new Circle(2);
		Rectangle rec = new Rectangle(2, 5);
		shapes.add(rec);
		shapes.add(circle);
		Calculate cal = new Calculate(shapes); 
		
		System.out.println(cal.sum());
	}
}
