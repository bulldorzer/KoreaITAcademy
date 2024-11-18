package exam01;

public class Test05 {

	public static void main(String[] args) {
		// 반복문
		// 1) 짝수단만 출력
		// 2) 자신의 단수까지만 출력하고 종료
		// ex) 3단이면 3*3까지만 출력하고 종료
		
		/*
		for(int i = 2; i < 10; i++) {
				
			for(int j = 1; j <= i ; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j );	
			}
			System.out.printf("---------------\n");
			
		}
		
		*/
		
		// 변수 - 값 1개씩 저장 - 단독주택
		// 배열 - 여러개 값을 저장할 수 있는 메모리 공간 - 아파트
		// 자료형 [] 변수명 = {값1, 값2, 값3};
		// 배열의 개수를 알려주는 : 배열.length (배열 길이)
		/*
		int [] arr = {10, 20, 30, 40, 50, 60};
		System.out.println(arr[0]); // 변수명[인덱스]
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		// 문제 : 성적을 담는 배열 scores를 만들고
		// 100 이하의 임의의 점수로 초기화 하시오 - 5개
		// 반복문을 통해 성적을 출력하시오.
		// 점수가 80점 이상 - 합격, 80점 이하는 불합격 함께 출력
		// ex) 97 - A등급 - 합격 / 65 - D등급- 불합격
		// 등급 - switch~case문으로
		// 90~ A / 80~B / 70~C / 60~D / 나머지 F
		
		int [] scores = {97,65,85,87,77};

		for(int i = 0; i < scores.length; i++) {
			
			// 10으로 나눠주면 몫만 남기 때문에
			// 90점대 - 9, 80점대 - 8 ...
			
			String grade = switch(scores[i]/10) {
				case 9 -> "A";
				case 8 -> "B";
				case 7 -> "C";
				case 6 -> "D";
				default -> "F";				
			};
			
			if(scores[i] >=80) {
				System.out.println(scores[i] + "/" + grade +"/합격");	
			}else {
				System.out.println(scores[i] + "/" + grade +"/불합격");
			}
			
		}
		

	}

}









