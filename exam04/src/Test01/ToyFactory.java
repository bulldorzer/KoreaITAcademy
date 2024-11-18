package Test01;

import java.util.Scanner;

public class ToyFactory {
	
	
	Scanner sc = new Scanner(System.in);
	
	private ToyFactory() {
		
	}
	
	public static ToyFactory instance() {
		ToyFactory instance = null;
		if (instance==null) {
			instance = new ToyFactory();
		}
		return instance;
				
	}
	
	public Toy createToy(int num) {
		Toy toy = new Toy();
		
//		System.out.println("어떤 장난감 생산 하시 겠습니까?");
//		System.out.println("1)기차 2)인형 3)슬라임");
		switch (num) {
		case 1 -> { // 기차 장난감 생산
			toy = new TrainToy("기차");
		}
		case 2 -> { // 인형 장난감 생산
			toy = new ToyDoll("인형");
		}
		case 3 -> { // 슬라임 장난감 생산
			toy = new Toyslime("슬라임");
		}
		default -> System.out.println("잘못된 입력입니다.");
		}
		return toy;
	}
	
	
}
