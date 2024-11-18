package Test01;

	
public interface Tour {
	
//	상수 선언할때 접근제한자 생략하면 기본으로 public static으로 설정
//	인터페이스 구현 클래스로 구현하려면 public이여야만 접근이 가능하기에
//	public abstract를 생략해도 인터페이스에서는 자동으로 붙여줌
//	클래스 기본옵션 - default
//	인터페이스 메소드 기본옵션 - public abstract
//	따라서 final도 불가능하다
	void hotel() ;
	void meal();
	void course();
	
}
