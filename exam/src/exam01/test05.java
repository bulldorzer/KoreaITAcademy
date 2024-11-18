package exam01;

import java.util.Scanner;

public class test05 {
	public static void main(String[] args) {
		/* 키의 몸무게를 입력받아 bmi수치를 계산하여 출력하시오 */
		
		Scanner sc = new Scanner(System.in);
		/*	double heigh,weight;
		
		System.out.println("키와몸무게를 입력해주세요");
		heigh = sc.nextDouble();
		weight = sc.nextDouble();
		
		System.out.println("키: "+heigh + "몸무게: "+weight);
		System.out.println("bmi수치는 "+(heigh+weight)/heigh);*/
		
		
		double heigh ,weight,bmi;
		
		
		System.out.println("키와몸무게를 입력해주세요");
		heigh = sc.nextDouble();
		weight = sc.nextDouble();
		
		bmi = weight/(heigh+heigh);
		
		System.out.println("키(m): "+heigh + "몸무게: "+weight);
		System.out.println("bmi수치는 "+bmi);
		
	}
}
