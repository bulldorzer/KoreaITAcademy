package exam02;

import java.util.Scanner;

public class Test {
//	실행용클래스
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Calcurator calc = new Calcurator();
		
		double celsius		= calc.fahrenheitTocelsius(20);
		double fahrenheit	= calc.celsiusToFahrenheit(68);
		double result = 0;
		
		
		System.out.println("온도를 입력해주세요 >>");
		double temp = sc.nextDouble();
		System.out.println("temp>>"+temp+"");
		System.out.println("1) 섭씨변환 2)화씨 변환 그외엔 오류!");
		int choice = sc.nextInt();
		switch (choice) {
		case 1 -> {
			result =calc.fahrenheitTocelsius(temp);
		}
		case 2 -> {
			result =calc.celsiusToFahrenheit(temp);
		}
		default -> System.out.println("잘못된 입력입니다.");
				
		}
		System.out.println(result);
//		System.out.println(celsius);
//		System.out.println(fahrenheit);
		
	}

}
