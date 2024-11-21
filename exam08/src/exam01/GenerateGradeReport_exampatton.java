package exam01;

public class GenerateGradeReport_exampatton {

	// school 싱글톤 패턴 - 객체 가져오기
//	School school = School.getInstance();
//	
//	public static final String TITLE = " 수강생 학점 \t\t\n";
//	public static final String HEADER = " 이름  |  학번  | 전공 | 점수   \n";
//	public static final String LINE = "-------------------------------------\n";
//	
//	
//	private StringBuffer buffer = new StringBuffer(); // 문자열 차례대로 저장
//	
//	
//	public String getReport(){
//		
//		// 문제5-1) school 객체에서 과목리스트를 추출
//		ArrayList<Subject> subjectList = school.getSubjectList();
//		
//		// 과목리스트 기준으로 반복  ex) 국어, 수학, 방송댄스
//		for(Subject subject : subjectList) {
//			makeHeader(subject);
//			makeBody(subject);
//			makeFooter();
//		}
//		return buffer.toString(); 
//	}
//	
//	
//	public void makeHeader(Subject subject) {
//		
//		buffer.append(GenerateGradeReport_exampatton.LINE);
//		buffer.append(GenerateGradeReport_exampatton.TITLE);
//		buffer.append(GenerateGradeReport_exampatton.HEADER);
//		buffer.append(GenerateGradeReport_exampatton.LINE);
//	}
//	
//	// 개별 과목별로 처리
//	public void makeBody(Subject subject) { // ex) subject = 국어 과목 받아옴
//		
//		// 문제5-2) 해당 과목의 등록된 학생리스트 추출 = 수강신청생 목록
//		ArrayList<Student> studentList = subject.getStudentList();
//		
//		for(int i = 0; i < studentList.size(); i++) {
//			
//			// 학생별
//			Student student = studentList.get(i);
//			
//			buffer.append( student.getStduentName() );
//			buffer.append("|");
//			buffer.append(student.getStudentId());
//			buffer.append("|");
//			buffer.append(student.getMajor().getSubjectName()+"\t");
//			buffer.append("|");
//			
//			getScoreGrade(student, subject); // 현재 학생, 현재 레포트 작성할 과목 ex)국어
//			
//			buffer.append("|\n");
//			buffer.append(LINE); 
//		}
//	}
//	
// 
//	// student-현재학생 / subject-국어
//	public void getScoreGrade(Student student, Subject subject) {
//		
//
//		// 문제5-3) 현재 학생이 가지고 있는 점수목록
//		
//		// 1) 내 점수 목록
//		// 2) 현재 학생의 전공과목의 id 추출
//		ArrayList<Score> scoreList = student.getScoreList(); 
//		int majorId = student.getMajor().getSubjectId(); 
//		
//		
//		for(Score score : scoreList) {
//			
//			// 문제5-4) 학점 정책을 배열로 선언
//			// gradeType[0] = basic정책 = ab_type
//			// gradetType[1] = major정책 = sab_type
//			GradeType[] gradeType = {new BasicGradeType(), new MajorGradeType()};
//						
//			// 문제5-5) 
//			// 1) 현재 점수의 과목코드
//			// 2) 레포트 작성할 과목의 코드
//			int currentSubjectId = score.getSubject().getSubjectId();
//			int subjectId =  subject.getSubjectId(); // 
//			
//			// 문제5-6) 현재과목의 아이디와 레포트 작성할 과목코드가 같은가?
//			// ex) 학생이 가진 점수리스트 중 - 국어 점수 걸러내기
//			if( currentSubjectId == subjectId) { 
//				String grade;
//				
//				// 문제5-7) 내 전공이 같니?
//				if(currentSubjectId == majorId) { 
//					grade = gradeType[Define.SAB_TYPE].getGrade( score.getPoint());
//					
//				} else {
//					grade = gradeType[Define.AB_TYPE].getGrade( score.getPoint());
//				}
//				
//				buffer.append(score.getPoint());
//				buffer.append(":");
//				buffer.append(grade);
//				
//			}
//		}
//		
//	}
//			
//	public void makeFooter() {
//		buffer.append("\n"); 
//	}

}
