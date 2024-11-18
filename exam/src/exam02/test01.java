package exam02;

public class test01 {
	public static void main(String[] args) {
//		연산자
//		사칙연산 : + - * / %
//		비교연산자
//		복합연산자
//		증갑연산자
		
		int a = 10 , b=3;
		
		// 비교 연산자 - 결과 : true, false
//		System.out.println(a>b);	// 초과
//		System.out.println(a<b);	// 미만
//		System.out.println(a>=b);	// 이상
//		System.out.println(a<=b);	// 이하
//		System.out.println(a==b);	// 같다
//		System.out.println(a!=b);	// 같지않다 다르다
		
//		비교연산자 활용
//		조건 2개 이상일떄
//		- and 연산 : 조건이 모두 다 맞아야 true
//		- or 연산 : 조건이 하나라도 맞으면 true
		
//		숫자가 1~100사이인가? => &&(and연산,그리고) ||(or연상 또는)
		int num1 = 50;
		boolean result = num1>=50 && num1<=100;
		System.out.println("num1은 result조건에 맞는가?"+result);
		
//		숫자가 1~100 사이가 아니라면?
		int num2 = 20;
		result = num2<1 || num2>100;
		System.out.println("num2은 result조건에 맞는가?"+result);
	}
}