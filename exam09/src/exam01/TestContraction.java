package exam01;

public class TestContraction {
	public static void main(String[] args) {
		// 생성자 참조
		
		// 익명 클래스 구현
		PersonFactory pFactory01 = new PersonFactory() {
			
			@Override
			public Person create(String name, int age) {
				return new Person(name,age);
			}
		};
		
		Person p1 = pFactory01.create("홍길동", 30);
		
		// 람다식 전
//		PersonFactory pFactory02 = new PersonFactory() {
//			
//			@Override
//			public Person create(String name, int age) {
//				return new Person(name,age);
//			}
//		};
		// 람다식 적용후
		// (매개변수) -> {실행코드}
		PersonFactory pFactory02 = (name, age) -> new Person(name,age);
		
		// 생성자 참조 = 클래스명::new
		PersonFactory pFactory03 = Person::new;
		pFactory03.create("홍길동", 30);
		
		System.out.println(pFactory01);
		System.out.println(pFactory02);
		System.out.println(pFactory03);
		
	}
}
