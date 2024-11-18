package exam02;

public class TestAnimal {

	public static void main(String[] args) {
		
		// 생산
		// 클래스명 변수명 = new 클래스명();
		
		// 스택영역 - 참조변수 = 주소값 저장 
		Animal cat = new Animal(1,"밍밍", 2, true); // 힙영역 - 인스턴스
		Animal dog = new Animal(2,"멍멍", 3, false);
		Animal bird = new Animal();
		
		// 객체의 이름으로 멤버변수에 접근
		
		// private으로 선언해 놓으면 - 외부에서는 읽고x, 저장x
		System.out.println(cat.getName());
		System.out.println(cat.getAge());
		
		// 삼항연산자 - if~else (실행문장이 한줄짜리 코드일때)
		// 유형1 : 함수( 조건 ? 참 : 거짓 );
		// 유형2 : 변수 = 조건 ? 참 : 거짓;
		
		System.out.println( cat.getGender()); 
		
		String gender = cat.getGender();
		System.out.println(gender);
		
		dog.setAge(7); // 변경
		
		// dog 객체의 정보 출력하시오.
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		System.out.println( "성별 : " +  dog.getGender() );
		
		// bird의 정보를 저장 : 짹짹, 1, 여 / 출력까지
		bird.setName("짹짹");
		bird.setAge(1);
		bird.setGender(false);
		bird.setAnimalType(Define.ANIMAL_TYPE_BIRD);
		
		System.out.println(bird);
		
		
	}

}







