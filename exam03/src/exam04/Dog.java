package exam04;

//	상속 슈퍼클래스
//	Animal 클래스의 내용 상속 받아서 사용
//	자식클래스
public class Dog extends Animal{
	
	public Dog(String name, int age) {
		super(name, age);
	}

	// 추가되는 부분만 정의
	public void sound() {
		System.out.println("멍멍");
	}
	
	@Override
	public void eat() {
		System.out.printf(name+"가 개껌을 먹습니다.");
	}
}
