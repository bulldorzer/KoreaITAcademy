package exam01;

public class Test03 {

	public static void main(String[] args) {
		// 반복문
		// while
		// 특정 조건이 만족되었을때만 반복 종료
		// ex) off 버튼 누르기 전까지 에어컨 작동
		int i = 0; // 초기화
		
		// i 값이 3보다 작다면 - 조건 true - 반복
		// = i 값이 3보다 커지면 - 조건 false - 종료 
		while(i < 3) { // 종료조건
			System.out.println(i);
			i++; // 증감조건
		}
		
		// for(초기화; 종료조건; 증감조건) { }
		// 반복 횟수 알수 있거나, 정해져 있을때
		for(int j = 0; j < 3; j++) { 
			System.out.println(j);
		}
		
		

	}

}
