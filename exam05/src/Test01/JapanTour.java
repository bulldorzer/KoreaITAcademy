package Test01;

public class JapanTour implements Tour {

	@Override
	public void hotel() {
		System.out.println("JapanTour 숙소는 오사카호텔입니다.");
	}

	@Override
	public void meal() {
		System.out.println("JapanTour 식사는 라멘입니다.");
	}

	@Override
	public void course() {
		System.out.println("JapanTour 오사카성 여행코스입니다.");
	}

}
