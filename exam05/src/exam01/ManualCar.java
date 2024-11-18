package exam01;

public class ManualCar extends Car{

	@Override
	public void powerOn() {
		System.out.println("수동 운전 모드 입니다");
	}

	@Override
	public void powerOff() {
		System.out.println("수동 운전을 중지합니다");
	}

}
