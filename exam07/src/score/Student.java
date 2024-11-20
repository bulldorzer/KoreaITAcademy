package score;

import java.util.ArrayList;

public class Student {
	private int studentId; // 학번
	private String studentName; // 학생이름
	private Subject major; // 전공 국어문학/컴퓨터공학
	private ArrayList<Score> scoreList; // 점수목록

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Subject getMajor() {
		return major;
	}

	public void setMajor(Subject major) {
		this.major = major;
	}

	public ArrayList getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, Subject major) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.major = major;
		this.scoreList = new ArrayList<Score>();
	}

	// 추가 메서드
	// 성적을 매개변수로 입력받아서 scoreList에 추가하는 메서드
	// addSubjectScore()
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}

	@Override
	public String toString() {
		return "studentId=" + studentId + ", studentName=" + studentName + ", major=" + major + ", scoreList="
				+ scoreList;
	}

}
