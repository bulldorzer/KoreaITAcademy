package exam02;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
//		미세먼지 수치를 입력 받고
//		상태 판정 해주세요
		
		Scanner sc = new Scanner(System.in);
		int dust;
		String result;
		
		
		System.out.println("미세먼지 수치 >>");
		dust =  sc.nextInt();
		if (dust<=30) {
			result = "좋음";
		}else if (dust>30 && dust<=80) {
			result = "보통";
		}else if (dust>80 && dust<=150) {
			result = "나쁨";
		}else {
			result = "매우 나쁨";
		}
		
		System.out.println("미세먼지 상태는 : "+result+" 입니다.");

	}

}