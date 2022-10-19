package abstraction;

public class ElectricCar implements Car{

	private final String carType;
	
	public ElectricCar(String carType) {
		this.carType=carType;
	}

	@Override
	public void color() {
		System.out.println(carType + "는 파란색 입니다.");
		
	}

	@Override
	public void run() {
		System.out.println(carType + "는 달립니다.");
		
	}

	@Override
	public void stop() {
		System.out.println(carType + "는 정지 합니다.");
		
	}

	@Override
	public String getCarType() {
		return this.carType;
	}
	
	
}
