package exam05;

public class CarFactory {
	private static CarFactory instance = null;
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if (instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar(String name, int year, String model) {
		Car car = new Car(name, year, model);
		return car;
	}
}
