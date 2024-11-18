package exam01;

public class AiCar extends Car{

	@Override
	public void powerOn() {
		System.out.println("자율 주행 운전 입니다");
	}

	@Override
	public void powerOff() {
		System.out.println("자율 주행을 종료합니다");
	}

}
