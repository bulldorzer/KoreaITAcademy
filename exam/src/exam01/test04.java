package exam01;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * sc.nextInt() 	정수형 입력
		 * sc.next()		문자열 입력
		 * sc.nextDouble()	실수형 입력
		 */
		Scanner sc = new Scanner(System.in);
		
		/*
		 * String str = "tiger"; 
		 * System.out.println(str);
		 */
		
		/*
		 * 주소록 이름 나이 키 입력받아서 변수에 저장하는 프로그램 작성
		 */
		String pName;
		int age;
		double height;
		
		System.out.println(" 성명 나이 키 입력해주세요");
		pName = sc.next();
		age = sc.nextInt();
		height = sc.nextDouble();
		
		System.out.println("성명 : "+pName);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height);
		System.out.println();
		System.out.printf("성명 : %s \n",pName);
		System.out.printf("나이 : %d \n",age);
		System.out.printf("키 : %.2f \n",height);
		
		
	}

}