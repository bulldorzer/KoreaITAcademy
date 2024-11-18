package exam01;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// 반복문 - while
		Scanner sc = new Scanner(System.in);
		
		// 0이 들어오기 전까지 반복
		// return : 함수/메서드 종료, 
		// break : 반복문의 종료
		
		// 문제 : 0이 들어오기 전까지 성적을 입력 받음
		// 반복문 종료후, 성적의 합계와 평균 출력하시오 
		// ㄴ 입력을 몇번 받았는지 카운트 해야함.
		int total = 0; // 합계
		double avg = 0; // 평균
		int cnt = 0; // 건수
		
		while(true) {
			
			System.out.println("숫자 입력>>");
			int num = sc.nextInt();
			
			if(num == 0) {
				break; // 반복문 탈출, 종료
			}
			
			total += num;
			cnt++;	
		}
		
		avg = (double)total / cnt;
		
		System.out.printf("합계 : %d\n", total );
		System.out.printf("평균 : %.2f\n", avg );
		System.out.printf("건수 : %d\n", cnt );
		System.out.println("종료");
		

	}

}









