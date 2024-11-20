package score;

public class Score {
	private int studentId; // 학생정보
	private Subject subject; // 과목정보
	private int point; // 학생점수
	// getter,setter

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Score() {
		super();
	}

	public Score(int studentId, Subject subject, int point) {
		super();
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}

	@Override
	public String toString() {
		return "studentId=" + studentId + ", subject=" + subject + ", point=" + point;
	}

}
