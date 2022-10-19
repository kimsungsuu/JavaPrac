package abstraction;

public class Main {
	public static void main(String[] args) {
		Car electric = new ElectricCar("BMW");
		
		electric.color();
		System.out.println("차 종은 : " + electric.getCarType());
		
		electric.run();
		electric.stop();
	}

}
