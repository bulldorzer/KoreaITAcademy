package exam02;

import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
//		조건문 : 조건이 참인지 거짓인지 따라 실행하는 코드를 달리해줌
//		정수 1개를 입력받아서 10보다 크면 "10보다 큰수"를 출력하도록
//		만약, 10보다 작은 수라면 아무것도 실행되지않음
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		
		System.out.println("정수를 입력해주세요");
		num1 = sc.nextInt();
		
		if (num1>10) {
			System.out.println("10보다큰수");
		}
	}
}