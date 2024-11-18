package exam04;

//	상속 슈퍼클래스
//	Animal 클래스의 내용 상속 받아서 사용
//	자식클래스
public class Cat extends Animal{
	
	
	public Cat(String name, int age) {
		super(name, age); //부모 생성자 호출
	}


	// 추가되는 부분만 정의
	public void sound() {
		System.out.println("야옹");
	}
	
	// 오버라이딩 부모의 메소드 재정의
	@Override
	public void eat() {
		System.out.printf(super.name+"가 물고기를 먹습니다.");
	}
}
