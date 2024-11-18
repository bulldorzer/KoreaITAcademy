package exam02;

import java.util.Scanner;

public class TestPhone {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		Phone apple = new Apple();
		
		Person P = new Person(apple);
		
		
		P.turnOn();
		P.watchUtube();
		P.watchUtube();
		P.charge();
		P.charge();
		P.turnOff();
		
		System.out.println("\n\n\n 폰 교체");
		System.out.println("어떤 폰을 구입하시겠습니까?");
		System.out.println("1)애플 2)갤럭시");
		
		int pick = sc.nextInt();
		if (pick ==1) {
			P.buyNewPhone(apple);
		}else if (pick ==2) {
			P.buyNewPhone(new Galaxy());
		}
		
		P.turnOn();
		P.watchUtube();
		P.watchUtube();
		P.charge();
		P.charge();
		P.turnOff();
	}

}
