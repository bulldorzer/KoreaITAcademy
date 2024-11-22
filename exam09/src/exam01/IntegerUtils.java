package exam01;

public class IntegerUtils {
	// static 메서드 - 클래스.메서드()로 호출가능
	// 매개변수 갯수 동일 해야함
	public static int stringToint(String s) {
		// 문자열로 된 숫자를 반환
		return Integer.parseInt(s);
	}
	
	public static void main(String[] args) {
		// 기능 구현
		Converter<String, Integer> converter = IntegerUtils::stringToint;
		
		// 실행
		Integer result = converter.convert("123");
		System.out.println(result);
	}
}
