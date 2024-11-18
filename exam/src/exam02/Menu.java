package exam02;

//	데이터를 담아 처리하는 클래스
//	설계도 - 새로운 자료형을 내가 만드는것 - 데이터클래스 menu
public class Menu {
	
	String menuName,name;
	int price;
	
	public Menu() {
		
	}
//	생성과 동시에 초기화 기능을 
//	생성자 - 외부에서 값을 받아오게 하고싶다.
//	new 클래스명() --> 생성자가 실행된다.
//	생성자 안에 변수들을 매개변수라고 칭한다. => param prametter
	
//	매개변수는 내가 무슨 데이터를 받고있는지 변수명을 네이밍함
//	값을 담는 역할을 하는 - 클래스 (설계도)
//	Value Object (VO)
//	Data Transfer Object (DTO)
//	클래스 이름 : MemuVo , StudentVo, itemDTO, ProductDTO(예시)
	public Menu(String name, int price) {
//		this라는 예약어는 인스턴스라고도 불리우며
//		현재 할당하고있는 클래스의 고유멤버의 속성변수,생성자,메소드를 가리킬때 사용
		this.name = name;
		this.price = price;
	}

}

