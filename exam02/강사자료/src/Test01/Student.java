package Test01;

/*
 * 학생 정보를 담는 클래스 정의
 1) 멤버변수 + 생성자
 - 학생 id (순번) - 1000을 serial번호의 시작번호로 하여,
 			객체 생성할때마다 1씩 증가하며 자동으로 부여될 수 있도록 하시오.
 - 이름 name, 학년 grade, 주소 address, 성별 gender
 
 2) 생성자는 기본 생성자와 함께 메서드 오버로드로 객체를 초기화 할 수 있도록 하시오.
 
 3) toString 재정의 - 멤버변수의 값을 확인할 수 있도록 하시오.
 
 4) Define 클래스 정의하고 - 상수 선언
 	MALE = 1;
 	FEMALE = 2;
 
 */
public class Student {
	static Long serialNum = 1000L;
	
	Long id;
	String name;
	int grade;
	String address;
	int gender;
	
	public Student() {}
	
	public Student(String name, int grade, String address, int gender) {
		this.id = ++serialNum;
		this.name = name;
		this.grade = grade;
		this.address = address;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		
		String genderStr = 
				(gender == Define.MALE) ? "남" : "여";
		
		return id + "/" + name + "/" + grade 
				+ "/" + address + "/" + genderStr ;
	}
	
}











