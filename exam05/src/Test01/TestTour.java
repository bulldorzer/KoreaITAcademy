package Test01;

import java.util.Scanner;

public class TestTour {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("원하는 여행지");
		System.out.println("1)한국 2)일본 3)대만");
		int pick = sc.nextInt();
		
		Tour tour = switch (pick) {
		case 1 -> new KoreaTour();
		case 2 -> new JapanTour();
		case 3 -> new TiwanTour();
		default -> null;
		};
		Guide guide = new Guide(tour);
		
		if (tour == null) {
			System.out.println("잘못된 선택지입니다.");
			return;
		}else {
			guide.showProgram();
		}

	}

}
