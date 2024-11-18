package exam01;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// 반복문 - while
		// 메뉴 번호와 수량을 입력받아서,
		// ㄴ 1) 아메리카노 2) 카페라떼 3) 카페모카
		// 최종 계산 금액을 마지막에 출력
		// 메뉴 번호에서 0이 들어오면 종료
		
		Scanner sc = new Scanner(System.in);
		
		String[] menuList = {"아메리카노", "카페라떼", "카페모카"};
		int[] menuPrice = {3000, 3500, 4000};
		int total = 0;
		
		while(true) {
			System.out.print("메뉴를 선택하세요 (0: 종료): ");
			int pick = sc.nextInt();
			
			// 종료 로직
			if(pick == 0) {
				System.out.println("총 금액 : " + total + " 원");
				break;
			}
			
			// 값의 유효성을 검사하는 로직
			if(pick < 1 || pick > 3) { // 1~3사이값이 아니라면
				System.out.println("메뉴 번호 오류");
				continue; // 반복문의 처음으로 되돌어 가기
			}
			
			// 처리
			System.out.println(menuList[pick-1] + " 몇 잔 주문?");
			int qty = sc.nextInt();
			
			total += (menuPrice[pick-1] * qty);
		}
		
		
	}
}









