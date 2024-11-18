package exam03;

public class Teacher extends Person{
	private int classroom;

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	
	public Teacher(String name, boolean gender, int classroom) {
		super(name,gender);
		this.classroom = classroom;
	}

	@Override
	public String toString() {
		return "Teacher ["+super.toString() +"classroom=" + classroom + "]";
	}
	
}
