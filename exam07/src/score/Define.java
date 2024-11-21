package score;

public class Define {

//	객체 생성안하고 값 사용하기 위한 static
//	상수로 만들면 코드대신 문자로 값을 쓰는 효과

	// 코드값을 정할 때 상수는 int형이 제일 좋으나 상황에 따라 자료형을 유연하게 써야함
	// String으로 표현 가능하나 메모리공간을 생각하면 int형이 더 효율적임 (반복문 사용할떄에도 편한)
	// 국어 1001 코드 수학 1002 방송댄스 1003
	public static final int KOREA = 1001;
	public static final int MATH = 1002;
	public static final int DANCE = 1003;

//	채점방식형 기반으로 A~F채점방식은 0 S~F채점방식은 1 PASS/FAIL 채점방식은3
	public static final int AB_TYPE = 0;
	public static final int SAB_TYPE = 1;
	public static final int PF_TYPE = 2;
}
