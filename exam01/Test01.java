package exam01;

import java.util.Scanner;

public class Test01 {

	// 프로그램 시작점 메서드(함수)
	public static void main(String[] args) {
		
		// char - 문자 1개만 저장 - 홀따옴표 묶어주기
		// String - 문자열 - 쌍따옴표로 묶어주기
		
		// 문제 - 사칙연산 해주는 프로그램 - switch문으로 작성
		// 기호를 입력하면 해당 연산 수행
		// 숫자 2개도 입력 받음
		// + 입력 - 덧셈, - 뺄셈, * , 곱하기, / 나눗셈
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어떤 계산을 할까요? +, -, *, /");
		String operator = sc.next();
		
		System.out.println("숫자1 : ");
		int n1 = sc.nextInt();
		
		System.out.println("숫자2 : ");
		int n2 = sc.nextInt();
		
		
		// int 변수 = 값;
		int result = switch(operator) {
			case "+" -> n1 + n2; 
			case "-" -> n1 - n2;
			case "*" -> n1 * n2;
			case "/" -> n1 / n2;
			default -> -999;
		}; // 세미콜론 붙여야함
	
		System.out.println(result);
	}
}













