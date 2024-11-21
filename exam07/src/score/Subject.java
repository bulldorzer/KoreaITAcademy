package score;

import java.util.ArrayList;

public class Subject {
	private int subjectId; // 과목코드
	private String subjectName; // 과목이름
	private int gradeType; // 학점 평가 정책 type 0번코드일때 A~F정책 1번코드일때 S~F정책

	// 과목이 학생 목록을 가지고 있다. = 과목별로 수강 신청한 학생의 목록을 가지고 있다.
	// 과목별 수강신청목록
	private ArrayList<Student> studentList;

	// 기본 생성자
	public Subject() {
	}

	// Subject 생성자에 과목아이디와 과목명을 받아 매핑하고
	// 등급채점방식을 A~F타입으로 초기화
	// 학생목록을 만든다
	public Subject(int subjectId, String subjectName) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		gradeType = Define.AB_TYPE;
		studentList = new ArrayList<Student>();
	}

	// getter.setter
	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	// toString 오버라이딩
	@Override
	public String toString() {
		return "subjectId" + subjectId + "subjectName" + subjectName;
	}

	// 수강 신청했다 = Subject 클래스의 studentList에 추가되었다
	// 학생 객체를 받아와서 studentList에 추가하는 메서드 작성하시오
	// 학생등록 메소드 register
	public void register(Student student) {
		studentList.add(student);
	}

}
