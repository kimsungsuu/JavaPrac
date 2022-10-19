package srp;

public class RectangleAreaCalculator {
	private final int width;
	private final int height;
	
	public RectangleAreaCalculator(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int area() {
		int area = 0;
		
		area = width * height;
		
		return area;
	}
	
	public static void main(String[] args) {
		RectangleAreaCalculator rac = new RectangleAreaCalculator(10, 10);
		
		System.out.println(rac.area());
	}

}
