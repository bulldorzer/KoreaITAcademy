package exam02;

public class Animal {

	// static - 프로그램 시작~종료까지 계속 유지 
	// ㄴ 해당 클래스의 모든 인스턴스가 공유하는 변수다(공통변수)
	
	// 1) 멤버변수(= 필드 field) private 선언 - 은닉
	private static Long serialNum = 1000L; // 리터럴 자료형 Long으로 만들어 준다.
	private Long id; // 자동으로 1씩 증가하면서 부여되는 번호
	private int animalType;
	private String name;
	private int age;
	private boolean gender; // 2가지 값만 저장
	
	// 2) 기본생성자
	public Animal() {
		this.id = ++serialNum;
	}
	
	// 3)생성자 오버로딩 - 초기화 
	// 오버로딩 - 갯수, 자료형을 체크함
	// 생성자 - Constructor - 인스턴스 초기화 역할
	public Animal(int AnimalType, String name) {
		this();
		this.animalType = AnimalType;
		this.name = name;
	}
	
	public Animal(int AnimalType, String name, int age, boolean gender) {
		this(AnimalType, name); // 매개변수에 맞는 생성자 호출
		this.age = age;
		this.gender = gender;
	}
	
	// 4) getter
	// 값을 외부에서 읽을 수 있도록 public 메서드 생성
	
	public String getName() {
		return name; // 내부 멤버변수 name값을 반환
	}
	
	public int getAge() {
		return age;
	}
	
	// 삼항연산자 이용하여 남,여가 반환되도록
	public String getGender() {
		return gender ? "남" : "여";
	}
	/*
	public int getAnimalType() {
		return animalType;
	}
	 */
	
	public String getAnimalType() {
		
		String typeStr =  switch(animalType) {
		case Define.ANIMAL_TYPE_DOG -> "강아지"; 
		case Define.ANIMAL_TYPE_CAT -> "고양이";
		case Define.ANIMAL_TYPE_BIRD -> "새";
		default -> "미정";
		};
	
		return typeStr;
	}
	
	// 5) setter
	// 외부에서 값을 변경할 수 있도록 기능 제공
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public void setAnimalType(int animalType) {
		this.animalType = animalType;
	}
	
	// 6) toString 재정의
	@Override 
	public String toString() {
		// 오버라이드 : 기존 메서드 내용 변경 - 메서드 재정의
		// 멤버변수의 내용을 확인하는 용도로 변경하여 사용한다.
		// 애노테이션 : 주석
		return 
				id + "/" + 
				animalType + "/" + 
				name + "/" + 
				age + "/" + 
				getGender();
	}
	
	
	// 멤버변수의 값을 출력하는 메서드(기능 묶음)
		public void printAll() {
			
			// 현재 이 메서드가 Animal 클래스 내에 존재, 멤버변수와 같은 곳에 존재

			System.out.println("-----------");
			System.out.println(id);
			// 같은 클래스 내에서 멤버변수, 메서드에 접근할 때는
			// 객체명 필요x
			System.out.println(getAnimalType());
			System.out.println(name);
			System.out.println(age);
			System.out.println(getGender());
			
		}
	
	
}


/* 
  함수란?
  ㄴ 자주 사용하는 코드를 묶어 놓고 - 원할때마다 해당 코드가 실행
	ㄴ 함수(단독으로 실행) - sum();
	ㄴ메서드 - 클래스 안에 존재하는 함수 - 객체가 존재해야 실행가능한 함수
	 		ㄴ 대상.메서드();
	
	
  * 메서드 형식
	
	접근제한자 반환형의자료형 함수이름 (매개변수, 매개변수) {
			실행할 문장
	 		return 값;
 	}
	 	
    public - 모든 곳에서 접근 가능
	void - 반환값이 없다 = return없다 / 자료형 - 없다, 미정이다
	

	접근제한자 - 정보 보호, 감추기(은닉)
	- public : 내부, 외부, 다른 패키지 모든 지점에서 접근 가능.
	- private : 내부에서만 접근 가능하도록 


	*/





/*
 * 오버로딩
	이름은 같은데 매개변수 갯수와 자료형이 다르면 다른 것으로 인식
	
	생성자 오버로딩
		public Animal() {} --> 기본 생성자
		public Animal(String name) {}
		public Animal(String name, int age) {}
		public Animal(String name, int age, boolean gender) {}
		
		// 갯수, 자료형
		new Animal();
		new Animal("앵무새");
		new Animal("앵무새", 3);
		new Animal("앵무새", 3, true);
	
	
	
	메서드 오버로딩


 */










