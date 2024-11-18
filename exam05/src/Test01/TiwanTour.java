package Test01;

public class TiwanTour implements Tour {

	@Override
	public void hotel() {
		System.out.println("TiwanTour 숙소는 타이베이호텔입니다.");
	}

	@Override
	public void meal() {
		System.out.println("TiwanTour 식사는 팟타이입니다.");
	}

	@Override
	public void course() {
		System.out.println("TiwanTour 룽산사투어 입니다.");		
	}

}
