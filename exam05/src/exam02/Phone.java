package exam02;

public interface Phone {
	
//	상수 - 객체생성X
//	인터페이스.상수명 -- 으로 호출 해야하기떄문에 static을 붙여야함
//	객체 생성이 불가함으로 static 없으면 사용할 수 있는 방법이 없음
	
	public static final int MAX_BETTERY_CAPACITY = 100;
	
	public void powerOn();
	public void powerOff();
	public boolean isOn();
	public void watchUtube();
	public void charge();
	
}
