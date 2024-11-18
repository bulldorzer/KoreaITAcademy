package Test01;

public class KoreaTour implements Tour {
	
	
	String hotel = "";
	
	
//	구현 클래스에서 인터페이스보다 공개범위가 낮은 접근제한자를 설정불가능하다
	@Override
	public void hotel() {
		System.out.println("KoreaTour 숙소는 고려호텔입니다.");
		
	}

	@Override
	public void meal() {
		System.out.println("KoreaTour 식사는 불고기입니다");
	}

	@Override
	public void course() {
		System.out.println("KoreaTour는 경복궁,청계천 투어입니다.");
	}

}
