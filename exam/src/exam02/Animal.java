package exam02;

public class Animal {
	
//	static - 프로그램 시작~종료까지 계속 유지
//		해당 클래스의 모든 인스턴스가 공유하는 변수다(공통변수)
	
	// 멤버 변수 - 필드(field)
	private static Long serialNum = 1000L; // 리터럴 자료형 Long으로 만들어준다.
	private String name;
	private boolean gender;
	

	private int age,AnimalType;
	private Long id; // 자동으로 1씩 증가하면서 부여되는 번호
	private final int ANIMAL_TYPE_CAT = 1;
	private final int ANIMAL_TYPE_dog = 2;
	
	
//	오버로딩
//		이름은 같은데 매개변수 갯수나 자료형이 다르면 다른 것으로 인식
//		주의!!) 매개변수 이름이 다르다고 절때 다른 타입의 생성자가 생긴것이 아니다.
//	생성자 오버로딩
//		public animal() {} - 기본생성자
//		public animal(String name) {}
//		public animal(String name,int age) {}
//		public animal(String name,int age, String gender) {}
	
	public Animal() {
		this.id = serialNum++;
	};
	
	public Animal(int AnimalType,String name) {
		this(); // 매개변수가 없는 생성자 호출
//		this.id = serialNum++;
		this.AnimalType = AnimalType;
		this.name = name;
	}
	
	// 생성자 constructor - 인스턴스 초기화
	public Animal(int AnimalType,String name,int age, boolean gender) {
//		this.id = serialNum++;
//		this.name = name;
		this(AnimalType,name); // 매개변수에 맞는 생성자 호출
		this.age = age;
		this.gender = gender;
	}
	
//	자주 사용하는 코드를 묶어 놓고 - 원할 때 마다 해당 코드가 실행
//	함수(단독으로 실행)
//	클래스 안에 존재하는 함수 - 메소드 - 객체가 존재해야 실행 하는 함수
//		객체참조변수.메소드();
	 
//	  메소드 형식
//	  	접근 제한자 반환형의자료형 함수이름 (매개변수1,매개변수2...){
//	  		실행할 명령문
//	  	return 값;
//	  }
//	void - 반환 할 값이 없을때 자료형 
//	접근제한자
//	public - 모든 클래스에서 접근 가능한 접근 제한자
//	private - 외부클래스에서 접근하지 못함 즉 외부에서 읽지도 쓰지도 수정하지도 못함
	
	public String getName() {
		return name;
	}
	
	public boolean getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public int getAnimalType() {
		return AnimalType;
	}

	public Long getId() {
		return id;
	}

	
	public static Long getSerialNum() {
		return serialNum;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAnimalType(int animalType) {
		AnimalType = animalType;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public void printAll() {
		System.out.println(AnimalType);
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println("-----------");
	};
	  
//	오버라이드 : 기존 메소드 내용 변경
//	멤버변수의 내용을 확인하는 용도로 변경하여 사용한다.
//	어노테이션
	@Override
	public String toString() {
		return AnimalType+"/"+name+"/"+age+"/"+gender;
	}

	
	
}
