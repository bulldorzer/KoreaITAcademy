package score;

// 전공 과목이 아닌것에 대한 정책 설정
public class BasicGradeType implements GradeType {

	// 점수받아서 해당 등급을 return함
	@Override
	public String getGrade(int point) { // 문제
		// 90이상 A 80이상B 70이상 C 60이상 D 나머지 F
		String grade = switch (point / 10) {
		case 9 -> grade = "A";
		case 8 -> grade = "B";
		case 7 -> grade = "C";
		case 6 -> grade = "D";
		default -> grade = "F";
		};

		return grade;
	}

}
