package exam02;

// 데이터를 담아 처리하는 클래스
// 설계도 - 새로운 자료형을 내가 만든것 - 이름? Menu = 자료형

//생성과 동시에 초기화 기능을 - 생성자 코드를 
// 생성자 - 외부에서 값을 받아오게 하고 싶다.
// new 클래스명() --> 생성자가 실행된다.
// 매개변수 = Prameter = param

// 값을 담는 역할을 하는 - 클래스(설계도) 
// - Value Object (VO)
// - Data Transfer Object( DTO )
// 클래스 이름 : MenuVO, StudentVO, ItemDTO, ProductDTO
// 
public class Menu {
	String name;
	int price;
	
	// 내가 가지고 있는 데이터가 무엇인지 알수 있게끔, 변수명 작명
	public Menu (String name, int price) {
		this.name = name;
		this.price = price;
	}
}





