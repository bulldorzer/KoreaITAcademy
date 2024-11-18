package exam02;

public class Galaxy implements Phone{

	int battery = 40;
	boolean isOn = false;
	
	@Override
	public void powerOn() {
		
		if (battery>30) {
			System.out.println("-----전원 켜짐-----");
			isOn = true;
		}else {
			System.out.println("-----배터리 부족-----");
			
		}
	}

	@Override
	public void powerOff() {
		
		System.out.println("-----전원 끄기-----");
		isOn = false;
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return isOn;
	}

	@Override
	public void watchUtube() {
		if (battery>10) {
			System.out.println("-----유투브 보기-----");
			battery -=10;
			
			System.out.println("배터리 용량은...."+battery+"%");
		}else {
			System.out.println("-----배터리양이 적습니다-----");
			powerOff();
		}
	}

	@Override
	public void charge() {
		if (battery<Phone.MAX_BETTERY_CAPACITY-20) {
			System.out.println("-----충전중-----");
			battery +=5;
			System.out.println("충전중.."+battery+"%");
		}else {
			System.out.println("더이상 충전할 필요 없습니다");
			System.out.println("배터리 "+battery+"%");
		}
	}

}
