package exam05;

public class Car {
	protected String name;
	protected int year;
	protected String model;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public Car(String name, int year, String model) {
//		super();
		this.name = name;
		this.year = year;
		this.model = model;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + ", model=" + model + "]";
	}
	
	public void powerOn() {
		System.out.print(name+"시동을 켭니다.");
	}
	public void powerOff() {
		System.out.print(name+"시동을 끕니다.");
	}
	
}
