package exam02;

public class TestAnimal02 {

	public static void main(String[] args) {
		
		// 생산
		// 클래스명 변수명 = new 클래스명();
		
		/*
		Animal [] animalList2 = {
				new Animal(),
				new Animal(),
				new Animal()
				};
		*/
		
		// 멤버변수 자료형별 기본값
		// String-null, int-0, double - 0.0, boolean - false
		
		// 클래스의 참조변수 = 객체명
		Animal cat = new Animal(Define.ANIMAL_TYPE_CAT, "밍밍", 2, true); // 힙영역 - 인스턴스
		Animal dog = new Animal(Define.ANIMAL_TYPE_DOG, "멍멍", 3, false);
		Animal bird = new Animal();
		
		Animal [] animalList = {cat, dog, bird};
		
		
		// for(클래스명 변수명 : 배열 ) {}
		for(Animal animal : animalList ) {
			animal.printAll();
			// 객체이름 출력 => toString() 자동 실행
			// System.out.println(animal);
			
		}
	}

}







