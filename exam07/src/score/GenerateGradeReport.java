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

	// 헤드 문자열 buffer에 저장
	// 최상단에 라인 다음줄 XX 수강생 학점 다음줄 이름/학번/전공/점수:등급 다음줄라인
	// 으로 디자인하고 과목클래스를 받아 과목이름까지 buffer에 저장 makeHeader
	public void makeHeader(Subject subject) {
		buffer.append(LINE + "\t" + subject.getSubjectName() + TITLE + HEADER + LINE);
	}

	// 학생이름, 학번, 전공, 점수와등급까지 표시하는 학생목록 makeBody
	public void makeBody(Subject subject) {

		// 과목클래스에 존재하는 학생목록을 저장할 변수 표시
		ArrayList<Student> studentList = subject.getStudentList();
		// 학생목록만큼 반복하여 학생이름, 학번, 전공, 점수:등급까지 표시함
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			// 해당 데이터를 StringBuffer 에 저장
			buffer.append(student.getStudentName());
			buffer.append("|");
			buffer.append(student.getStudentId());
			buffer.append("|");
			buffer.append(student.getMajor().getSubjectName());
			buffer.append("|");
			// 학생점수, 등급을 계산하여 가져오는 메소드
			getScoreGrade(student, subject);
			buffer.append("\n" + LINE);

		}
	}
	// 학생이름, 학번, 전공, 점수와등급까지 표시하는 학생목록 makeBody
//		public void makeBody(Subject subject) { // 문제
//			// 과목클래스에 존재하는 학생목록을 저장할 변수 표시
//			ArrayList<Student> studentList = subject.getStudentList();
//			// 학생목록만큼 반복하여 학생이름, 학번, 전공, 점수:등급까지 표시함
//			// 해당 데이터를 StringBuffer 에 저장
//			for (int i = 0; i < studentList.size(); i++) {
//				Student student = studentList.get(i);
//				buffer.append(student.getStudentName());
//				buffer.append("|");
//				buffer.append(student.getStudentId());
//				buffer.append("|");
//				buffer.append(student.getMajor().getSubjectName());
//				buffer.append("|");
//				// 학생점수, 등급을 계산하여 가져오는 메소드
//				getScoreGrade(student, subject);
//				buffer.append("\n");
//				buffer.append(LINE);
	//
//			}
//		}

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
			// 현재 리포트에 쓸 과목아이디와 과목목록에 등록된 과목아이디 선언
			int currentId = score.getSubject().getSubjectId();
			int subjectId = subject.getSubjectId();
			// 학점 평가 유형들 배열에 저장
			GradeType[] gradeType = { new BasicGradeType(), new MajorGradeType() };
			// 과목목록의 과목 아이디값과 점수에등록된 과목아이디가 맞다면?
			// 리포트에 쓸 것이다.
			if (subjectId == currentId) {
				String grade;
//				현재 점수가 전공과목이면?
				if (currentId == majorId) {
					grade = gradeType[Define.SAB_TYPE].getGrade(score.getPoint());
				} else { // 현재 점수가 전공과목이 아니라면
					grade = gradeType[Define.AB_TYPE].getGrade(score.getPoint());
				}

				// 리포트에 쓸 점수와 등급을 버퍼에 저장
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
	School school = School.getInstance();

	// buffer에 모인 데이터들을 출력하는 메소드
	// 레포트 작성 메소드
	public String getReport() {

		// 과목목록을 받아 저장하는 변수
		ArrayList<Subject> subjectList = school.getSubjectList();

		// 만들어둔 레포트양식을 출력
		// 현재 과목에 등록되어있는 과목의정보들과 학생목록의 정보들까지 레포트로 출력
		for (Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return buffer.toString(); // 버퍼에 쌓인 내용을 String으로 변환하여 반환함
	}
}
