package exam01;

public abstract class Car {
	
	// 상속된 클래스에 공통된 규격
	// 자식 클래스가 구현해야하는 기능이 다른경우
	// 자식 클래스가 구현해야 하는 메소드의 목록
	public abstract void powerOn();
	public abstract void powerOff();
	
	
	// 상속된 클래스에 공통된 기능
	public void drive() {
		System.out.println("자동차 운행을 시작합니다");
	}
	
	public void stop() {
		System.out.println("자동차 운행을 중지합니다");
	}
	
//	변수 - 값 고정 
//	메소드 - 재정의X
//	클래스 - 상속X
//	템플릿(양식) 메서드
	public final void start() {
		powerOn();
		drive();
		stop();
		powerOff();
	}
	
}
