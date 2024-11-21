package score;

import java.util.ArrayList;

public class School {
	private static final String schoolName = "Korea고등학교";
	private static School instance = null;
	private ArrayList<Student> studentList; // 학생리스트
	private ArrayList<Subject> subjectList; // 과목리스트

	// getter, setter
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	public static String getSchoolname() {
		return schoolName;
	}

	// School 기본 생성자를 만들면서 과목목록,학생목록을 생성하라
	// 단 싱글톤으로 만들수 있게
	private School() {
		subjectList = new ArrayList<Subject>();
		studentList = new ArrayList<Student>();
	}

	// 싱글 톤으로 getInstance 메소드코딩
	public static School getInstance() {
		if (instance == null) {
			instance = new School();
		}
		return instance;
	}

	// 학생 추가 메서드
	public void addStudent(Student student) {
		studentList.add(student);
	}

	// 과목추가 메서드
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
}
