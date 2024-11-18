package exam05;

public class AiCar extends Car{
	
	private int battery=0;
	
	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public AiCar(String name, int year, String model, int battery) {
		super(name, year, model);
//		if (battery > Define.MAX_OIL) {
//			System.out.println("기름의 수치가 100이상 될수 없습니다");
//			return;
//		}else {
//			this.battery = battery;
//		}
		if (battery<0) {
			System.out.println("battery은 0보다 작을수 없습니다");
			return;
		}
		this.battery=(battery > Define.MAX_BETTERY)? this.battery=Define.MAX_OIL : battery;
	}
	
	@Override
	public void powerOn() {
		System.out.print(super.year+"년식 "+super.model+" "+super.name+" 자율 주행을 시작 합니다. 배터리"+battery+"\n");
	}
	@Override
	public void powerOff() {
		System.out.print(super.year+"년식 "+super.model+" "+super.name+" 자율 주행을 종료 합니다.배터리"+(battery-10)+"\n");
	}

	@Override
	public String toString() {
		return "AiCar [name=" + name + ", year=" + year + ", model=" + model +", battery=" + battery + "]";
	}
}
