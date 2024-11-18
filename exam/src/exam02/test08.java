package exam02;

import java.util.Scanner;

public class test08 {
	public static void main(String[] args) {
//		향상된 switch~ case구문
		Scanner sc = new Scanner(System.in);
		
//		int type;
//		type = sc.nextInt();
//		switch (type) {
//		case 1 -> System.out.println("고급형");
//		case 2 -> System.out.println("보급형");
//		case 3 -> {
//			System.out.println("저급형");
//			System.out.println("재고정리!!!");
//		}
//			
//		default-> System.out.println("입력오류");
//		}
		
		int months,year;
		
		System.out.println("월을 입력해주세요 >>");
		months = sc.nextInt();
		
		switch (months) {
		case 1,3,5,7,8,10,12 -> System.out.println("마지막일은 31일 입니다");
		case 4,6,9,11 -> System.out.println("마지막일은 30일 입니다");
		case 2 -> {
			System.out.println("연도를 입력해주세요");
			year = sc.nextInt();
			
			if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
				System.out.println(year+"년도는 윤년입니다. 윤년이 일땐 마지막일은 29일 입니다");
			}else {
				System.out.println(year+ "년도는 윤년이 아닙니다. 윤년이 아니면 마지막일은 28일 입니다");
			}
		}
		
		
		
		default ->
		throw new IllegalArgumentException("Unexpected value: " + months);
		}
		
		
	}
}