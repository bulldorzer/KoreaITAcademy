package score;

public class Define {

//	객체 생성안하고 값 사용하기 위한 static
//	상수로 만들면 코드대신 문자로 값을 쓰는 효과
	public static final int KOREA = 1001; // <= String으로 표현 가능하나 메모리공간을 생각하면 int형이 더 효율적임 (반복문 사용할떄에도 편한)
	public static final int MATH = 1002;
	public static final int DANCE = 1003;

	public static final int AB_TYPE = 0; // 학점 A~F 정책
	public static final int SAB_TYPE = 1; // 학점 S~F 정책
	public static final int PF_TYPE = 2; // PASS/FAIL 정책
}
