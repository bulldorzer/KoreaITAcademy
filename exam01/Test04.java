package exam01;

public class Test04 {

	public static void main(String[] args) {
		// 반복문
		
		// for(초기화; 종료조건; 증감조건) { }
		// 반복 횟수 알수 있거나, 정해져 있을때
//		for(int j = 0; j < 3; j++) { 
//			System.out.println(j);
//		}
		
		// 1번 - if조건 -  10번실행 - if문으로 검사
		for(int j = 1; j <= 10; j++) { 
			// 조건문 - 홀수만 --- 2로 나눴을때 나머지가 1이면
			if(j % 2 == 1) {
				System.out.println(j);
			}
			
		}
		System.out.println("");
		
		// 2번 - 증감조건 -  2씩 증가
		for(int j = 1; j <= 10; j+=2) { 
			System.out.println(j);
		}
		

	}

}
