package Test01;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	1) Student 배열 선언 - studentList
		 	학생 3명으로 초기화, 학생 정보는 임의로 넣으시오.
		 	
		 	2) 향상된 for문 이용하여 객체의 정보를 출력하시오.
		 	
		 	3) Define.MALE 이면 "남", 
		 	   Define.FEMALE 이면 "여"가 출력되도록
		 	   toString()을 수정하시오.
		 */
		
		Student [] studentList= {
				new Student("홍길동", 1, "서울", Define.MALE),
				new Student("이몽룡", 2, "남원", Define.MALE),
				new Student("성춘향", 3, "남원", Define.FEMALE),
		};
		
		for(Student student : studentList) {
			System.out.println(student);
		}
		
	}

}








