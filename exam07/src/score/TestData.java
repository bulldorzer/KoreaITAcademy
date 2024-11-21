package score;

public class TestData {

	School koreaSchool = School.getInstance();
	// 과목추가
	Subject korea; // 이거 오류
	Subject math;
	Subject dance;

	public void createSubject() { // 과목추가
		korea = new Subject(Define.KOREA, "국어");
		math = new Subject(Define.MATH, "수학");
		dance = new Subject(Define.DANCE, "방송댄스");
	}

	public void createStudent() {

		// 학생 객체 생성 - 학번, 이름, 전공과목(subject)
		Student student1 = new Student(211213, "강감찬", korea);
		Student student2 = new Student(211213, "김유신", math);
		Student student3 = new Student(211213, "신사임당", korea);
		Student student4 = new Student(211213, "이순신", korea);
		Student student5 = new Student(211213, "홍길동", math);

//		학교에 학생목록에 학생추가
		koreaSchool.addStudent(student1);
		koreaSchool.addStudent(student2);
		koreaSchool.addStudent(student3);
		koreaSchool.addStudent(student4);
		koreaSchool.addStudent(student5);

		// 학교에 과목목록에 과목추가
		koreaSchool.addSubject(korea);
		koreaSchool.addSubject(math);
		koreaSchool.addSubject(dance);

		// 과목에 수강학생 추가
		// 전공과목 국어 -> SAB 점수 적용
		// 전공과목이 국어가 아닌경우 -> AB 점수적용
		korea.register(student1);
		korea.register(student2);
		korea.register(student3);
		korea.register(student4);
		korea.register(student5);

		// 전공과목 수학 -> SAB 점수 적용
		// 전공과목이 수학가 아닌경우 -> AB 점수적용
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);

		dance.register(student1);
		dance.register(student2);
		dance.register(student3);

		// 학생들 과목 점수 추가
		addScoreForStudent(student1, korea, 95);
		addScoreForStudent(student1, math, 56);
		addScoreForStudent(student1, dance, 76);

		addScoreForStudent(student2, korea, 95);
		addScoreForStudent(student2, math, 95);
		addScoreForStudent(student2, dance, 83);

		addScoreForStudent(student3, korea, 100);
		addScoreForStudent(student3, math, 88);
		addScoreForStudent(student3, dance, 95);

		addScoreForStudent(student4, korea, 89);
		addScoreForStudent(student4, math, 95);

		addScoreForStudent(student5, korea, 85);
		addScoreForStudent(student5, math, 56);
	}

	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
	}

}
