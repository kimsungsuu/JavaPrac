package ocp;

public class Circle implements Shape{
	private final int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		double area = 0;
		
		area = Math.round(Math.PI * Math.pow(radius, 2));
		return area;
	}
}
