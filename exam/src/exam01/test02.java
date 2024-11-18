
package exam01;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 10;
		double n2 = 3.14;
		char n3 = 'a';
		
		System.out.println(n1); // 줄바꿈 출력
		System.out.print(n2); // 줄바꿈 없음
		System.out.println();
		System.out.printf(" n1값 %d	n2값 %f",n1,n2); // 해당 값들이 메핑되어 표시 
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("menu 정수값 입력");
		int menu = sc.nextInt();
		System.out.println(menu);
		
		System.out.println("chice 정수값 입력");
		int chice = sc.nextInt();
		System.out.println(chice);
	}

}
