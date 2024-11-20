package score;

import java.util.ArrayList;

public class GenerateGradeReport {
	// 양식문자열
	public static final String TITLE = "수강생 학점 \t\t\n";
	public static final String HEADER = "이름|학번\t|전공\t|점수	\n";
	public static final String LINE = "----------------------------\n";

	// StringBuffer : 문자열을 변경하고 조작하기 위해 특별히 디자인된 클래스 가변적임
	// 문자열을 반복적으로 추가 삭제 할때 성능 향상 도모 가능
	private StringBuffer buffer = new StringBuffer();

	public void makeHeader(Subject subject) {
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}

	public void makeBody(Subject subject) { // 문제
		ArrayList<Student> studentList = subject.getStudentList();
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			buffer.append(student.getStudentName());
			buffer.append("|");
			buffer.append(student.getStudentId());
			buffer.append("|");
			buffer.append(student.getMajor().getSubjectName());
			buffer.append("|");
			// 학생점수, 등급을 계산하여 가져오는 메소드
			getScoreGrade(student, subject);
			buffer.append("\n");
			buffer.append(LINE);

		}
	}

	// 점수와 학점을 계산해서 반환
	// 학생객체와, 레포트를 생성할 id를 받아옴
	public void getScoreGrade(Student student, Subject subject) {
//		클래스 : student / 점수 : scoreList
//		채첨방식

		// 학생 객체에서 2가지 정보를 추출 = 점수목록, 전공과목코드
		// 학생이 가지고 있는 점수 목록
		// 내 전공과목 id 추출
		ArrayList<Score> scoreList = student.getScoreList();
		int majorId = student.getMajor().getSubjectId();

//		ArrayList<Score> scoreList = student.getScoreList();
//		int majorId = student.getMajor().getSubjectId();

		// 매개변수의 subjectId : 레포트 생성할 과목코드 / majorId : 과목 전공코드
		// 반복문을 통한 점수리스트를 통해 전공인지 아닌지 체크 채점방식체크하고 점수에 학점을 부여함
		// 그리고 어떻게 점수를 출력 할 것인지 buffer에 저장하라
		for (Score score : scoreList) {
			// 현재 값 검사할 과목의 id 추출
			int currentId = score.getSubject().getSubjectId();
			int subjectId = subject.getSubjectId();
			// 등급 점수를 어떤 기준으로 할건지
			GradeType[] gradeType = { new BasicGradeType(), new MajorGradeType() };
			// 현재 학점을 산출할 과목 체크
			if (subjectId == currentId) {
				String grade;
//				현재 리포트에 쓸 과목이 전공인지 체크
				if (currentId == majorId) {
					grade = gradeType[Define.SAB_TYPE].getGrade(score.getPoint());
				} else {
					grade = gradeType[Define.AB_TYPE].getGrade(score.getPoint());
				}

				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append("|");
			}
		}

//		for (Score score : scoreList) {
//			// 현재 값 검사할 과목의 id 추출
//			int currentSubjectId = score.getSubject().getSubjectId();
//			int subjectId = subject.getSubjectId();
//			GradeType[] gradeType = { new BasicGradeType(), new MajorGradeType(), new PassFailGradeType() };
//			// 현재 학점을 산출할 과목 체크
//			if (currentSubjectId == subjectId) {
//				String grade;
//				if (subject.getGradeType() == Define.PF_TYPE) {
//					grade = gradeType[Define.PF_TYPE].getGrade(score.getPoint());
//				} else {
////				현재 리포트에 쓸 과목이 전공인지 체크
//					if (currentSubjectId == majorId) {
//						grade = gradeType[Define.SAB_TYPE].getGrade(score.getPoint());
//					} else {
//						grade = gradeType[Define.AB_TYPE].getGrade(score.getPoint());
//					}
//				}
//
//				buffer.append(score.getPoint());
//				buffer.append(":");
//				buffer.append(grade);
//				buffer.append("|");
//			}
//		}

	}

	public void makeFooter() {
		buffer.append("\n");
	}

	// 학교의 인스터스 값 찾아서 반환 - 싱글톤 패턴이라 이미 생성된 객체주소를 찾아 반환
	School school = School.getIntance();

	public String getReport() {

		ArrayList<Subject> subjectList = school.getSubjectList();

		for (Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return buffer.toString(); // 버퍼에 쌓인 내용을 String으로 변환하여 반환함
	}
}
