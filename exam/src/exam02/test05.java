package exam02;

import java.io.Console;
import java.util.Scanner;

public class test05 {
	public static void main(String[] args) {
//		윤년 계산하기
//		년도를 입력받고 올해가 윤년인지 아닌지 판정하기
		
		Scanner sc = new Scanner(System.in);
		int year,age,pos,passpay=0;
//		String pos;
		
//		System.out.println("연도를 입력해주세요");
//		year = sc.nextInt();
//		
//		if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
//			System.out.println(year+"년도는 윤년입니다.");
//		}else {
//			System.out.println("윤년이 아닙니다.");
//		}
		
//		경복궁 입장료 계산하기 (중첩 if)
//		내국인, 외국인, 종로구민, 나이기준
		System.out.println("-------------------------------------------------------");		
//		System.out.println("본인이 내국인 외국인 종로구민 인지 입력해주세요.");
//		pos = sc.next();
//		System.out.println(pos);
//		
//		
//		
//		if (pos.equals("내국인")) {
//			System.out.println("본인의 나이를 입력해주세요.");
//			age = sc.nextInt();
//			System.out.println("4");
//			if (age >= 20) {
//				passpay=3000;
//				System.out.println("1");
//			}else if (age >= 7 && age <= 19) {
//				passpay=1500;
//				System.out.println("2");
//			}else {
//				passpay=0;
//				System.out.println("3");
//			}
//		}else if (pos.equals("외국인")) {
//			System.out.println("본인의 나이를 입력해주세요.");
//			age = sc.nextInt();
//			if (age >= 20) {
//				passpay=6000;
//			}else if (age >= 7 && age <= 19) {
//				passpay=3000;
//			}else {
//				passpay=0;
//			}
//		}else if (pos.equals("종로구민")) {
//			System.out.println("본인의 나이를 입력해주세요.");
//			age = sc.nextInt();
//			if (age >= 20) {
//				passpay=1000;
//			}else if (age >=7 && age<= 19) {
//				passpay=500;
//			}else {
//				passpay=0;
//			}
//		}
//		System.out.println("경복궁 표값은 "+passpay+"입니다.");
		
		System.out.println("본인이 1)내국인 2)외국인 3)종로구민 인지 입력해주세요.");
		pos = sc.nextInt();
//		System.out.println(pos);
		
		
		
		if (pos == 1) {
			System.out.println("본인의 나이를 입력해주세요.");
			age = sc.nextInt();
			System.out.println("4");
			if (age >= 20) {
				passpay=3000;
			}else if (age >= 7 && age <= 19) {
				passpay=1500;
			}else {
				passpay=0;
			}
		}else if (pos == 2) {
			System.out.println("본인의 나이를 입력해주세요.");
			age = sc.nextInt();
			if (age >= 20) {
				passpay=6000;
			}else if (age >= 7 && age <= 19) {
				passpay=3000;
			}else {
				passpay=0;
			}
		}else if (pos == 3) {
			System.out.println("본인의 나이를 입력해주세요.");
			age = sc.nextInt();
			if (age >= 20) {
				passpay=1000;
			}else if (age >=7 && age<= 19) {
				passpay=500;
			}else {
				passpay=0;
			}
		}
		System.out.println("경복궁 표값은 "+passpay+"입니다.");
	}
}