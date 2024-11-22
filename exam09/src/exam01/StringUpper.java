package exam01;

public class StringUpper {
//	public static String sirName(String name) {
//		return name+"님";
//	}
	
	
	// static이 아닐경우
	public  String sirName(String name) {
		return name+"님";
	}
	
	public  String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	
	public static void main(String[] args) {
		
		StringUpper sUpper = new StringUpper();
		
		Converter<String, String> sirName = sUpper::sirName;
		
		// static이 적용 됐을 때 
//		Converter<String, String> sirName = StringUpper::sirName;
		
		// 인터페이스의 convert메소드가 StringUpper클래스의 sirName메소드를 참조하여 
		// 매개변수자료형과 리턴자료형이 같을 경우 sirName 메소드를 참조하여 기능을 수행하게 된다.
		String str = sirName.convert("홍길동");
		System.out.println(str);
		
		Converter<String, String> reverse = sUpper::reverse;
		System.out.println(reverse.convert("hello"));
		
	}
	
}
