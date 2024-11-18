package Test01;
	
/*
 * 학생 정보를 담는 클래스 정의
 * 학생 id(순번) - 1000을 serial번호로 하여,
 * 	객체 생성할때마다 1씩 증가하여 자동으로 부여될 수 있도록 하시오
 * 이름 name
 * 학년 grade
 * 주소 address
 * 성별 gender 
*/
public class Student {
	final long serialNum = 1000L;
	long stu_ID;
	String name,address;
	int grade;
	int gender; // 1 남자 2 여자
	
	public Student() {
		
	}
	
	public Student(String name, int grade, String address, int gender) {
		this.stu_ID = this.serialNum+1;
		this.name = name;
		this.grade = grade;
		this.address = address;
		this.gender = gender;
	}
	@Override
	public  String toString() {
		String genderStr = (gender == Define.GENDER_TYPE_MALE)?"남":"여";		
		return stu_ID+"/"+name+"/"+grade+"/"+address+"/"+genderStr;
		
	}
}
