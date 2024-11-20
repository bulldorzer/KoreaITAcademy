package score;

import java.util.ArrayList;

public class School {
	private static final String schoolName = "Korea고등학교";
	private static School instance = null;
	private ArrayList<Student> studentList; // 학생리스트
	private ArrayList<Subject> subjectList; // 과목리스트

	public static String getSchoolname() {
		return schoolName;
	}

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

	private School() { // 문제
		super();
		this.subjectList = new ArrayList<Subject>();
		this.studentList = new ArrayList<Student>();
	}

	public static School getIntance() { // 문제

		if (instance == null) {
			instance = new School();
		}
		return instance;
	}

	public void addStudent(Student student) {
		studentList.add(student);
	}

	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}

}
