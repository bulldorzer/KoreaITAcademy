package exam02;

public class Person {
	
	Phone phone; // 인터페이스로 다형성 구현이 가능하다.
	
	public Phone getPhone() {
		return phone;
	}
	
	public void buyNewPhone(Phone phone) { // setPhone
		this.phone = phone;
	}
	
	public void turnOn() {
		phone.powerOn();
	}
	
	public void turnOff() {
		phone.powerOff();
	}
	
	public void charge() {
		phone.charge();
	}
	
	public void watchUtube() {
		phone.watchUtube();
	}
	
	public void isOn() {
		phone.isOn();
	}
	
//	Phone 인터페이스로 구현된 클래스 -> 객체를 받아 올 수 있다.
	public Person( Phone phone ) {
		this.phone = phone;
	}

}
