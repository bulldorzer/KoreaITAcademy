package exam03;

public interface Calculator {

	default void description() {
		System.out.println("정수 계산기를 구현합니다");
		
	}
	static int total(int [] arr) {
		int total = 0;
		for(int i : arr) {
			total+=i;
		}
		mystaticMethod();
		return total;
	}
	
	// 인터페이스 내부에서만 사용 가능
	// default나 static 메서드에서 호출
	// static 호출할 경우 static 있어야만 호출가능
	
	private void myMethod() {
		System.out.println("private Method");
	}
	
	public static void mystaticMethod() {
		System.out.println("private static Method");
	}
}
