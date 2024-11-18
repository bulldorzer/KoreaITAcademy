package exam01;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// 반복문 - while
		Scanner sc = new Scanner(System.in);
		
		String[] menuList = {"아메리카노", "카페라떼", "카페모카"};
		int[] menuPrice = {3000, 3500, 4000};
		
		// 향상된 for문
		/*
		for(자료형 변수명 : 배열) {
			System.out.println(변수명);
		}
		*/

		// 배열1개를 순서대로 출력, 값을 꺼내 사용하거나
		// 배열 안에 내용 변동x
		for(String menu : menuList) {
			System.out.println(menu);
		}
		
		System.out.println("");
		
		// 여러개의 배열을 동시에 작업해야 하거나,
		// 배열 안에 있는 값을 변동시킬 때 사용 가능
		// 배열이름[인덱스] ---> 배열값에 직접 접근
		for(int i = 0; i< menuList.length ; i++) {
			
			// 변수명.equals("문자");
			// "문자".equals("문자");
			
			System.out.printf("%s : %d\n", menuList[i], menuPrice[i]);
			
			if( menuList[i].equals("카페라떼") ) {
				System.out.println("ㄴ쿠키증정 이벤트");
			}
			
		}

	}
}









