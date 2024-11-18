package exam03;

public class School {
//	내 객체를 담을 수 있는 변수 - private static 선언
	private static School instance = null;
	
//	생성자 - private
//	외부에서 new 클래스명(); 생성못함 - 생성자 호출 못함
//	외부에서 객체 생성못함
	private School() {}
	
//	객체 생성이 가능한 public static 메서드를 만듬
	public static School getInstance() {
		if (instance == null) {
			instance = new School();// null 일때만 생성
		}
		return instance;
	}
}
