package exam02;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자료형 이름?
		
		// 자료형 변수명;
		// 자료형 [] 배열명;
		
		// 선언과 동시에 초기화
		// ㄴ int [] a = {10, 20, 30};
		// ㄴ Menu [] m = {new Menu(), new Menu(), new Menu()};
		
		// 선언
		Menu [] menu = new Menu[3]; // 3개짜리 배열 선언해라. 초기화x
		// 초기화
		// menu의 형태로 메모리에 할당하고, 주소값을 menu[0]에 넣어라
		menu[0] = new Menu("아메리카노", 3000); 
		menu[1] = new Menu("카페라떼", 3500);
		menu[2] = new Menu("카페모카", 4000);
	
		// menu와 temp가 가리키는 대상이 같음
		// temp 이름으로 menu의 메모리 공간에 접근 가능
		Menu [] temp = menu;
		
		for(int i = 0; i < menu.length; i++)
			System.out.printf("%s : %d\n", temp[i].name, temp[i].price );
		
		
	}

}
