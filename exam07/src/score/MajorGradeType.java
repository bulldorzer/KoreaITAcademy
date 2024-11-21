package score;

// 전공 과목이 아닌것에 대한 정책 설정
public class MajorGradeType implements GradeType { // 문제

	// 점수받아서 해당 등급을 return함
	@Override
	public String getGrade(int point) {
		// 95 S 90이상 A 80이상B 70이상 C 60이상 D 나머지 F
//		switch 구문을 통해 점수등급을 매겨라 S부분은 삼항연산자로 할것
//		int score = (int) Math.floor(point / 10);
//		String grade = switch (score) {
//		case 9 -> (point >= 95) ? "S" : "A";
//		case 8 -> "B";
//		case 7 -> "C";
//		case 6 -> "D";
//		default -> "F";
//		};

//		또는 if
		String grade;
		if (point >= 95) {
			grade = "S";
		} else if (point >= 90) {
			grade = "A";
		} else if (point >= 80) {
			grade = "B";
		} else if (point >= 70) {
			grade = "C";
		} else if (point >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		return grade;
	}

}
