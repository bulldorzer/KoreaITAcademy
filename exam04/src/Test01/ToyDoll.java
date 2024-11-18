package Test01;

public class ToyDoll extends Toy{


	// 변수생성
	
	//기차장난감 추가변수
	private int eyes;
	private int legs;
	
//	getter setter
	public int getEyes() {
		return eyes;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	
	// 생성자
	public ToyDoll() {}
	
	public ToyDoll(String type) {
		super(type);
	}
	
	public ToyDoll(String name, int price,String type,int eyes,int legs) {
		super();
		this.eyes = eyes;
		this.legs = legs;
	}


	@Override
	public String toString() {
		return "ToyDoll [toString()=" + super.toString() +", eyes="+eyes +", legs="+legs +"]\n";
	}

}
