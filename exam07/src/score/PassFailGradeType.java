package score;

public class PassFailGradeType implements GradeType {

	@Override
	public String getGrade(int point) {
		if (point > 70) {
			return "P";
		}
		return "F";
	}

}
