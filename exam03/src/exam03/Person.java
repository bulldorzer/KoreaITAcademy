package exam03;

public class Person {
//	6가지 조건에 맞춰서 VO 클래스 정의
//	학생이름, 학년, 성별 - 저장하는 클래스
	
	private static int serialNum = 1000; // 시작번호
	private static String schoolName;
	
	private int id; // 시그널 넘버 받을 곳 
	private String name;
	private boolean gender;
	
	public Person() {
		this.id = ++serialNum;
		this.schoolName="코리아 고등학교";
	}
	public Person(String name, boolean gender) {
		this();
		this.name = name;
		this.gender = gender;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [id="+id+", name=" + name + ", gender=" + gender + "]";
	}
		
}
