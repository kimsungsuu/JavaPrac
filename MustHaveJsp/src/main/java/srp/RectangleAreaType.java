package srp;

public class RectangleAreaType {
	private static final double INCH_TERM = 0.0254d;
	private static final double FEET_TERM = 0.3048d;
	
	RectangleAreaCalculator rac = new RectangleAreaCalculator(10, 10);
	
	public double inch() {
		
		
		double inch = rac.area() / INCH_TERM;
		
		return inch;
	}
	
	public double feet() {
		
		double feet = rac.area() / FEET_TERM;
		
		return feet;
	}
	
	public static void main(String[] args) {
		RectangleAreaType rat = new RectangleAreaType();
		
		System.out.println(rat.inch());
		System.out.println(rat.feet());
	
	}
	
}
