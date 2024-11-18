package exam05;

public class ManualCar extends Car{
	
	private int oil=0;
//	final static int MAX_OIL = 100;
	
	public int getOil() {
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	public ManualCar(String name, int year, String model, int oil) {
		super(name, year, model);
//		if (oil > Define.MAX_OIL) {
//			System.out.println("기름의 수치가 100이상 될수 없습니다");
//			return;
//		}else {
//			this.oil = oil;
//		}
		if (oil<0) {
			System.out.println("oil은 0보다 작을수 없습니다");
			return;
		}
		this.oil=(oil > Define.MAX_OIL)?this.oil=Define.MAX_OIL:oil;
	}
	@Override
	public String toString() {
		return "ManualCar [name=" + name + ", year=" + year + ", model=" + model +", oil=" + oil + "]";
	}
	@Override
	public void powerOn() {
		System.out.print(super.year+"년식 "+super.model+" "+super.name+" 시동을 직접 켭니다. 연료"+oil+"\n");
	}
	@Override
	public void powerOff() {
		System.out.print(super.year+"년식 "+super.model+" "+super.name+" 시동을 직접 끕니다.연료"+(oil-10)+"\n");
	}
}
