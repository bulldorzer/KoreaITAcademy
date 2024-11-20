package score;

public class Test {

	public static void main(String[] args) {
		// 레포트 객체 생성
		GenerateGradeReport gradeReport = new GenerateGradeReport();

		// 테스트 데이터 생성
		TestData testDate = new TestData();

		// 테스트 과목,학생 데이터 생성
		testDate.createSubject();
		testDate.createStudent();

		// 레포트 생성
		String report = gradeReport.getReport();

		// 레포트 출력
		System.out.println(report);
	}

}
