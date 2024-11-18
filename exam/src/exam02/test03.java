package exam02;

import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
//		BMI 계산 - 몸무게와 키로 입력받아 계산
//		BMI가 25이상이면 비만
//		23이상 이상 과체중
//		18이상 정상
//		나머지 저체중
		Scanner sc = new Scanner(System.in);
		double heigh,weight,bmi;
		
		System.out.println("");
		System.out.println("키(m)와 몸무게를 입력해주세요");
		heigh = sc.nextDouble();
		weight = sc.nextDouble();
		bmi = weight/(heigh*heigh);
		System.out.println(bmi);
		if (bmi>=25) {
			System.out.println("비만");
		}else if (bmi>=23) {
			System.out.println("과체중");
		}else if (bmi>=18) {
			System.out.println("정상");
		}else {
			System.out.println("저체중");
		}
	}
}