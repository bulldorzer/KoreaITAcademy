package exam01;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		문제 1 
		정수 2개의 입력을 받아서 사칙연산의 결과를 출력하시오
		덧셈 뺄셈	곰셈 나눗셈 - 소수점까지 출력되도록하시오
		*/
		
		/*
		 * int num1 = 0,num2 = 0;
		 * 
		 * Scanner sNum = new Scanner(System.in);
		 * 
		 * System.out.println("n1의 값을 출력하시오 (정수)"); sNum.nextInt(num1);
		 * System.out.println("n2의 값을 출력하시오 (정수)"); sNum.nextInt(num2);
		 * System.out.println(num1+num2); System.out.println(num1-num2);
		 * System.out.println(num1*num2); System.out.println((double)num1/num2);
		 */
		
		Scanner sNum = new Scanner(System.in);
		System.out.println("n1의 값을 출력하시오 (정수)");
		int num1 = sNum.nextInt();
		System.out.println("n2의 값을 출력하시오 (정수)");
		int num2 = sNum.nextInt();
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println((double)num1/num2);
		System.out.println(num1%num2);
	}

}