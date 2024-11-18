package exam02;

import java.util.Scanner;

public class test07 {
	public static void main(String[] args) {
//		switch~case
//		1번 고급형 2번 보급형 3번 저급형
		Scanner sc = new Scanner(System.in);
		
		int type;
		type = sc.nextInt();
		switch (type) {
		case 1: {
			System.out.println("고급형");
			break;
		}case 2:{
			System.out.println("보급형");
			break;
		}case 3:{
			System.out.println("저급형");
			break;
		}
		default:
			System.out.println("입력오류");
		}
		
		
	}
}