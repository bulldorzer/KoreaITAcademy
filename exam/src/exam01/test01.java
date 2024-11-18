package exam01;

public class test01 {

	public static void main(String[] args) {

//		현재 작업 경로
		String path = System.getProperty("user.dir");
		System.out.println("현재작업경로"+path);
		
		int n1 = 10;
		int n2 = 3;
		double dNum1 = 10;
		double dNum2 = 3.14;
		
		// 콘솔창 출력
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(dNum1);
		System.out.println(dNum2);
//		정수로의 계산
		System.out.println(n1/n2);
		// 정수의 연산 - 강제형변환 -> 더블로 변환
		System.out.println((double)n1/n2);
		
		
		

	}
}
	