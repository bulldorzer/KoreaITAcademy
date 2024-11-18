package exam03;

public class Student extends Person {
	private int grade;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	public Student(String name, boolean gender, int grade) {
		super(name,gender);
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student ["+super.toString()+"grade=" + grade + "]";
	}
	
}
