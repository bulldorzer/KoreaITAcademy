package exam02;

public class Apple implements Phone{

	int battery = 40;
	boolean isOn = false;
	
	@Override
	public void powerOn() {
		
		if (battery>30) {
			System.out.println("-----Power ON-----");
			isOn = true;
		}else {
			System.out.println("-----Low Battery-----");
			
		}
	}

	@Override
	public void powerOff() {
		
		System.out.println("-----Power OFF-----");
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
			System.out.println("-----Watching Utube-----");
			battery -=10;
			
			System.out.println("battery is...."+battery+"%");
		}else {
			System.out.println("-----Low Battery-----");
			powerOff();
		}
	}

	@Override
	public void charge() {
		if (battery<Phone.MAX_BETTERY_CAPACITY-20) {
			System.out.println("-----Charging-----");
			battery +=5;
			System.out.println("Charged.."+battery+"%");
		}else {
			System.out.println("You don't have to charge");
			System.out.println("It's enough"+battery+"%");
		}
	}

}
