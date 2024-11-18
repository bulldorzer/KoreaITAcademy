package exam02;

public class test04 {
	public static void main(String[] args) {
//		중첩 if
//		10이상이면 숫자 중에서 
//		짝수면 장미꽃
//		홀수면 제비꽃을 증정하시오
//		10이하는 증정품 없음 출력
		
		int num = 13;
		
		if (num>=10) {
			if (num%2==0) {
				System.out.println("장미꽃");
			}else {
				System.out.println("제비꽃");
			}
		}else {
			System.out.println("증정품 없음");
		}
	}
}
